package androidx.profileinstaller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

class Encoding {
    static final int SIZEOF_BYTE = 8;
    static final int UINT_16_SIZE = 2;
    static final int UINT_32_SIZE = 4;
    static final int UINT_8_SIZE = 1;

    static int bitsToBytes(int v) [...] // Inlined contents

    static RuntimeException error(String s) {
        return new IllegalStateException(s);
    }

    static byte[] read(InputStream inputStream0, int v) throws IOException {
        byte[] arr_b = new byte[v];
        for(int v1 = 0; v1 < v; v1 += v2) {
            int v2 = inputStream0.read(arr_b, v1, v - v1);
            if(v2 < 0) {
                throw Encoding.error(("Not enough bytes to read: " + v));
            }
        }
        return arr_b;
    }

    static byte[] readCompressed(InputStream inputStream0, int v, int v1) throws IOException {
        Inflater inflater0 = new Inflater();
        byte[] arr_b = new byte[v1];
        byte[] arr_b1 = new byte[0x800];
        int v2 = 0;
        int v3 = 0;
        while(!inflater0.finished() && !inflater0.needsDictionary() && v2 < v) {
            int v4 = inputStream0.read(arr_b1);
            if(v4 < 0) {
                throw Encoding.error(("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + v + " bytes"));
            }
            inflater0.setInput(arr_b1, 0, v4);
            try {
                v3 += inflater0.inflate(arr_b, v3, v1 - v3);
                v2 += v4;
            }
            catch(DataFormatException dataFormatException0) {
                throw Encoding.error(dataFormatException0.getMessage());
            }
        }
        if(v2 != v) {
            throw Encoding.error(("Didn\'t read enough bytes during decompression. expected=" + v + " actual=" + v2));
        }
        if(!inflater0.finished()) {
            throw Encoding.error("Inflater did not finish");
        }
        return arr_b;
    }

    static String readString(InputStream inputStream0, int v) throws IOException {
        return new String(Encoding.read(inputStream0, v), StandardCharsets.UTF_8);
    }

    static long readUInt(InputStream inputStream0, int v) throws IOException {
        byte[] arr_b = Encoding.read(inputStream0, v);
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 += ((long)(arr_b[v2] & 0xFF)) << v2 * 8;
        }
        return v1;
    }

    static int readUInt16(InputStream inputStream0) throws IOException {
        return (int)Encoding.readUInt(inputStream0, 2);
    }

    static long readUInt32(InputStream inputStream0) throws IOException {
        return Encoding.readUInt(inputStream0, 4);
    }

    static int readUInt8(InputStream inputStream0) throws IOException {
        return (int)Encoding.readUInt(inputStream0, 1);
    }

    static int utf8Length(String s) {
        return s.getBytes(StandardCharsets.UTF_8).length;
    }

    static void writeAll(InputStream inputStream0, OutputStream outputStream0) throws IOException {
        byte[] arr_b = new byte[0x200];
        int v;
        while((v = inputStream0.read(arr_b)) > 0) {
            outputStream0.write(arr_b, 0, v);
        }
    }

    static void writeString(OutputStream outputStream0, String s) throws IOException {
        outputStream0.write(s.getBytes(StandardCharsets.UTF_8));
    }

    static void writeUInt(OutputStream outputStream0, long v, int v1) throws IOException {
        byte[] arr_b = new byte[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_b[v2] = (byte)(((int)(v >> v2 * 8 & 0xFFL)));
        }
        outputStream0.write(arr_b);
    }

    static void writeUInt16(OutputStream outputStream0, int v) throws IOException {
        Encoding.writeUInt(outputStream0, ((long)v), 2);
    }

    static void writeUInt32(OutputStream outputStream0, long v) throws IOException {
        Encoding.writeUInt(outputStream0, v, 4);
    }

    static void writeUInt8(OutputStream outputStream0, int v) throws IOException {
        Encoding.writeUInt(outputStream0, ((long)v), 1);
    }
}

