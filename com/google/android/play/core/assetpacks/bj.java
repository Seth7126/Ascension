package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

final class bj extends InputStream {
    private final InputStream a;
    private long b;

    bj(InputStream inputStream0, long v) {
        this.a = inputStream0;
        this.b = v;
    }

    @Override
    public final void close() throws IOException {
        super.close();
        this.a.close();
        this.b = 0L;
    }

    @Override
    public final int read() throws IOException {
        long v = this.b;
        if(v <= 0L) {
            return -1;
        }
        this.b = v - 1L;
        return this.a.read();
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) throws IOException {
        long v2 = this.b;
        if(v2 <= 0L) {
            return -1;
        }
        int v3 = this.a.read(arr_b, v, ((int)Math.min(v1, v2)));
        if(v3 != -1) {
            this.b -= (long)v3;
        }
        return v3;
    }
}

