package com.google.android.play.core.assetpacks;

final class br {
    static int a(byte[] arr_b, int v) {
        return (arr_b[v + 1] & 0xFF) << 8 | arr_b[v] & 0xFF;
    }

    static int b(byte[] arr_b, int v) {
        return arr_b[v + 3] & 0xFF | ((arr_b[v] & 0xFF) << 24 | (arr_b[v + 1] & 0xFF) << 16 | (arr_b[v + 2] & 0xFF) << 8);
    }

    static long c(byte[] arr_b, int v) {
        return ((long)(br.a(arr_b, v + 2) << 16 | br.a(arr_b, v))) & 0xFFFFFFFFL;
    }
}

