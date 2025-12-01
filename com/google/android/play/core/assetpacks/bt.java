package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.aj;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.zip.ZipException;

final class bt {
    static AssetLocation a(String s, String s1) throws IOException {
        int v5;
        aj.b(s != null, "Attempted to get file location from a null apk path.");
        aj.b(s1 != null, String.format("Attempted to get file location in apk %s with a null file path.", s));
        RandomAccessFile randomAccessFile0 = new RandomAccessFile(s, "r");
        byte[] arr_b = new byte[22];
        randomAccessFile0.seek(randomAccessFile0.length() - 22L);
        randomAccessFile0.readFully(arr_b);
        bs bs0 = br.b(arr_b, 0) == 0x504B0506 ? bt.b(arr_b) : null;
        if(bs0 == null) {
            long v = randomAccessFile0.length();
            int v1 = (int)Math.min(0x400L, randomAccessFile0.length());
            byte[] arr_b1 = new byte[v1];
            byte[] arr_b2 = new byte[22];
            long v2 = v - 22L;
        alab1:
            while(true) {
                long v3 = v - 0x10016L >= 0L ? v - 0x10016L : 0L;
                v2 = Math.max(v2 - ((long)v1) + 3L, v3);
                randomAccessFile0.seek(v2);
                randomAccessFile0.readFully(arr_b1);
                for(int v4 = v1 - 4; v4 >= 0; v4 -= 4) {
                    switch(arr_b1[v4]) {
                        case 5: {
                            v5 = 2;
                            break;
                        }
                        case 6: {
                            v5 = 3;
                            break;
                        }
                        case 75: {
                            v5 = 1;
                            break;
                        }
                        case 80: {
                            v5 = 0;
                            break;
                        }
                        default: {
                            v5 = -1;
                        }
                    }
                    if(v5 >= 0 && v4 >= v5 && br.b(arr_b1, v4 - v5) == 0x504B0506) {
                        randomAccessFile0.seek(v2 + ((long)v4) - ((long)v5));
                        randomAccessFile0.readFully(arr_b2);
                        bs0 = bt.b(arr_b2);
                        break alab1;
                    }
                }
                if(v2 == v3) {
                    throw new ZipException(String.format("End Of Central Directory signature not found in APK %s", s));
                }
            }
        }
        Long long0 = null;
        long v6 = bs0.a;
        byte[] arr_b3 = s1.getBytes("UTF-8");
        byte[] arr_b4 = new byte[46];
        byte[] arr_b5 = new byte[s1.length()];
        for(int v7 = 0; v7 < bs0.b; ++v7) {
            randomAccessFile0.seek(v6);
            randomAccessFile0.readFully(arr_b4);
            int v8 = br.b(arr_b4, 0);
            if(v8 != 0x504B0102) {
                throw new ZipException(String.format("Missing central directory file header signature when looking for file %s in APK %s. Read %d entries out of %d. Found %d instead of the header signature %d.", s1, s, v7, bs0.b, v8, 0x504B0102));
            }
            randomAccessFile0.seek(v6 + 28L);
            int v9 = br.a(arr_b4, 28);
            if(v9 == s1.length()) {
                randomAccessFile0.seek(v6 + 46L);
                randomAccessFile0.read(arr_b5);
                if(Arrays.equals(arr_b5, arr_b3)) {
                    long0 = br.c(arr_b4, 42);
                    break;
                }
            }
            v6 += (long)(v9 + 46 + br.a(arr_b4, 30) + br.a(arr_b4, 0x20));
        }
        if(long0 == null) {
            return null;
        }
        long v10 = (long)long0;
        byte[] arr_b6 = new byte[8];
        randomAccessFile0.seek(v10 + 22L);
        randomAccessFile0.readFully(arr_b6);
        return new bl(s, v10 + 30L + ((long)br.a(arr_b6, 4)) + ((long)br.a(arr_b6, 6)), br.c(arr_b6, 0));
    }

    private static bs b(byte[] arr_b) {
        return new bs(br.c(arr_b, 16), br.c(arr_b, 12), br.a(arr_b, 10));
    }
}

