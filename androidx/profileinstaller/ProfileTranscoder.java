package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Map;

class ProfileTranscoder {
    private static final int HOT = 1;
    private static final int INLINE_CACHE_MEGAMORPHIC_ENCODING = 7;
    private static final int INLINE_CACHE_MISSING_TYPES_ENCODING = 6;
    static final byte[] MAGIC = null;
    private static final int POST_STARTUP = 4;
    private static final int STARTUP = 2;

    static {
        ProfileTranscoder.MAGIC = new byte[]{0x70, 0x72, 0x6F, 0};
    }

    private static int methodFlagBitmapIndex(int v, int v1, int v2) {
        switch(v) {
            case 1: {
                throw Encoding.error("HOT methods are not stored in the bitmap");
            }
            case 2: {
                return v1;
            }
            case 4: {
                return v1 + v2;
            }
            default: {
                throw Encoding.error(("Unexpected flag: " + v));
            }
        }
    }

    private static void readClasses(InputStream inputStream0, DexProfileData dexProfileData0) throws IOException {
        int v1 = 0;
        for(int v = 0; v < dexProfileData0.classSetSize; ++v) {
            v1 += Encoding.readUInt16(inputStream0);
            dexProfileData0.classes.add(v1);
        }
    }

    private static int readFlagsFromBitmap(BitSet bitSet0, int v, int v1) {
        int v2 = bitSet0.get(ProfileTranscoder.methodFlagBitmapIndex(2, v, v1)) ? 2 : 0;
        return bitSet0.get(ProfileTranscoder.methodFlagBitmapIndex(4, v, v1)) ? v2 | 4 : v2;
    }

    static byte[] readHeader(InputStream inputStream0) throws IOException {
        byte[] arr_b = Encoding.read(inputStream0, ProfileTranscoder.MAGIC.length);
        if(!Arrays.equals(ProfileTranscoder.MAGIC, arr_b)) {
            throw Encoding.error("Invalid magic");
        }
        return Encoding.read(inputStream0, ProfileVersion.V010_P.length);
    }

    private static void readHotMethodRegion(InputStream inputStream0, DexProfileData dexProfileData0) throws IOException {
        int v = inputStream0.available() - dexProfileData0.hotMethodRegionSize;
        int v1 = 0;
        while(inputStream0.available() > v) {
            v1 += Encoding.readUInt16(inputStream0);
            dexProfileData0.methods.put(v1, 1);
            for(int v2 = Encoding.readUInt16(inputStream0); v2 > 0; --v2) {
                ProfileTranscoder.skipInlineCache(inputStream0);
            }
        }
        if(inputStream0.available() != v) {
            throw Encoding.error("Read too much data during profile line parse");
        }
    }

    private static void readMethodBitmap(InputStream inputStream0, DexProfileData dexProfileData0) throws IOException {
        BitSet bitSet0 = BitSet.valueOf(Encoding.read(inputStream0, (dexProfileData0.numMethodIds * 2 + 7 & -8) / 8));
        for(int v = 0; v < dexProfileData0.numMethodIds; ++v) {
            int v1 = ProfileTranscoder.readFlagsFromBitmap(bitSet0, v, dexProfileData0.numMethodIds);
            if(v1 != 0) {
                Integer integer0 = (Integer)dexProfileData0.methods.get(v);
                if(integer0 == null) {
                    integer0 = 0;
                }
                dexProfileData0.methods.put(v, ((int)(v1 | ((int)integer0))));
            }
        }
    }

    static Map readProfile(InputStream inputStream0, byte[] arr_b) throws IOException {
        if(!Arrays.equals(arr_b, ProfileVersion.V010_P)) {
            throw Encoding.error("Unsupported version");
        }
        int v = Encoding.readUInt8(inputStream0);
        long v1 = Encoding.readUInt32(inputStream0);
        byte[] arr_b1 = Encoding.readCompressed(inputStream0, ((int)Encoding.readUInt32(inputStream0)), ((int)v1));
        if(inputStream0.read() <= 0) {
            try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b1)) {
                return ProfileTranscoder.readUncompressedBody(byteArrayInputStream0, v);
            }
        }
        throw Encoding.error("Content found after the end of file");
    }

    private static Map readUncompressedBody(InputStream inputStream0, int v) throws IOException {
        if(inputStream0.available() == 0) {
            return new HashMap();
        }
        DexProfileData[] arr_dexProfileData = new DexProfileData[v];
        for(int v2 = 0; v2 < v; ++v2) {
            int v3 = Encoding.readUInt16(inputStream0);
            int v4 = Encoding.readUInt16(inputStream0);
            long v5 = Encoding.readUInt32(inputStream0);
            long v6 = Encoding.readUInt32(inputStream0);
            long v7 = Encoding.readUInt32(inputStream0);
            arr_dexProfileData[v2] = new DexProfileData(Encoding.readString(inputStream0, v3), v6, v4, ((int)v5), ((int)v7), new LinkedHashSet(), new LinkedHashMap());
        }
        Map map0 = new HashMap(v);
        for(int v1 = 0; v1 < v; ++v1) {
            DexProfileData dexProfileData0 = arr_dexProfileData[v1];
            ProfileTranscoder.readHotMethodRegion(inputStream0, dexProfileData0);
            ProfileTranscoder.readClasses(inputStream0, dexProfileData0);
            ProfileTranscoder.readMethodBitmap(inputStream0, dexProfileData0);
            ((HashMap)map0).put(dexProfileData0.key, dexProfileData0);
        }
        return map0;
    }

    private static void skipInlineCache(InputStream inputStream0) throws IOException {
        Encoding.readUInt16(inputStream0);
        int v = Encoding.readUInt8(inputStream0);
        if(v == 6) {
            return;
        }
        if(v == 7) {
            return;
        }
        while(v > 0) {
            Encoding.readUInt8(inputStream0);
            for(int v1 = Encoding.readUInt8(inputStream0); v1 > 0; --v1) {
                Encoding.readUInt16(inputStream0);
            }
            --v;
        }
    }

    static boolean transcodeAndWriteBody(OutputStream outputStream0, byte[] arr_b, Map map0) throws IOException {
        if(Arrays.equals(arr_b, ProfileVersion.V005_O)) {
            ProfileTranscoder.writeProfileForO(outputStream0, map0);
            return true;
        }
        if(Arrays.equals(arr_b, ProfileVersion.V001_N)) {
            ProfileTranscoder.writeProfileForN(outputStream0, map0);
            return true;
        }
        return false;
    }

    static void writeHeader(OutputStream outputStream0, byte[] arr_b) throws IOException {
        outputStream0.write(ProfileTranscoder.MAGIC);
        outputStream0.write(arr_b);
    }

    private static void writeProfileForN(OutputStream outputStream0, Map map0) throws IOException {
        Encoding.writeUInt16(outputStream0, map0.size());
        for(Object object0: map0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            DexProfileData dexProfileData0 = (DexProfileData)((Map.Entry)object0).getValue();
            Encoding.writeUInt16(outputStream0, Encoding.utf8Length(s));
            Encoding.writeUInt16(outputStream0, dexProfileData0.methods.size());
            Encoding.writeUInt16(outputStream0, dexProfileData0.classes.size());
            Encoding.writeUInt32(outputStream0, dexProfileData0.dexChecksum);
            Encoding.writeString(outputStream0, s);
            for(Object object1: dexProfileData0.methods.keySet()) {
                Encoding.writeUInt16(outputStream0, ((int)(((Integer)object1))));
            }
            for(Object object2: dexProfileData0.classes) {
                Encoding.writeUInt16(outputStream0, ((int)(((Integer)object2))));
            }
        }
    }

    private static void writeProfileForO(OutputStream outputStream0, Map map0) throws IOException {
        Encoding.writeUInt8(outputStream0, map0.size());
        for(Object object0: map0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            DexProfileData dexProfileData0 = (DexProfileData)((Map.Entry)object0).getValue();
            Encoding.writeUInt16(outputStream0, Encoding.utf8Length(s));
            Encoding.writeUInt16(outputStream0, dexProfileData0.classes.size());
            Encoding.writeUInt32(outputStream0, ((long)(dexProfileData0.methods.size() * 4)));
            Encoding.writeUInt32(outputStream0, dexProfileData0.dexChecksum);
            Encoding.writeString(outputStream0, s);
            for(Object object1: dexProfileData0.methods.keySet()) {
                Encoding.writeUInt16(outputStream0, ((int)(((Integer)object1))));
                Encoding.writeUInt16(outputStream0, 0);
            }
            for(Object object2: dexProfileData0.classes) {
                Encoding.writeUInt16(outputStream0, ((int)(((Integer)object2))));
            }
        }
    }
}

