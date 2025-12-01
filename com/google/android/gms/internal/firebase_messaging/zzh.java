package com.google.android.gms.internal.firebase_messaging;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;

public final class zzh {
    private static final OutputStream zza;

    static {
        zzh.zza = new zzg();
    }

    public static InputStream zza(InputStream inputStream0, long v) {
        return new zzj(inputStream0, 0x100001L);
    }

    public static byte[] zza(InputStream inputStream0) throws IOException {
        zze.zza(inputStream0);
        ArrayDeque arrayDeque0 = new ArrayDeque(20);
        int v1 = 0;
        for(int v = 0x2000; v1 < 0x7FFFFFF7; v = zzl.zza(v, 2)) {
            int v2 = Math.min(v, 0x7FFFFFF7 - v1);
            byte[] arr_b = new byte[v2];
            arrayDeque0.add(arr_b);
            int v3 = 0;
            while(v3 < v2) {
                int v4 = inputStream0.read(arr_b, v3, v2 - v3);
                if(v4 == -1) {
                    return zzh.zza(arrayDeque0, v1);
                }
                v3 += v4;
                v1 += v4;
            }
        }
        if(inputStream0.read() != -1) {
            throw new OutOfMemoryError("input is too large to fit in a byte array");
        }
        return zzh.zza(arrayDeque0, 0x7FFFFFF7);
    }

    private static byte[] zza(Queue queue0, int v) {
        byte[] arr_b = new byte[v];
        for(int v1 = v; v1 > 0; v1 -= v2) {
            byte[] arr_b1 = (byte[])queue0.remove();
            int v2 = Math.min(v1, arr_b1.length);
            System.arraycopy(arr_b1, 0, arr_b, v - v1, v2);
        }
        return arr_b;
    }
}

