package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

final class bw extends FilterInputStream {
    private final ds a;
    private byte[] b;
    private long c;
    private boolean d;
    private boolean e;

    bw(InputStream inputStream0) {
        super(inputStream0);
        this.a = new ds();
        this.b = new byte[0x1000];
        this.d = false;
        this.e = false;
    }

    final long a() {
        return this.c;
    }

    final eu b() throws IOException {
        if(this.c > 0L) {
            while(this.read(this.b, 0, this.b.length) != -1) {
            }
        }
        if(!this.d && !this.e) {
            if(!this.f(30)) {
                this.d = true;
                return this.a.c();
            }
            eu eu0 = this.a.c();
            if(eu0.d()) {
                this.e = true;
                return eu0;
            }
            if(eu0.b() == 0xFFFFFFFFL) {
                throw new ck("Files bigger than 4GiB are not supported.");
            }
            int v = this.a.a();
            int v1 = this.b.length;
            if(((long)(v - 30)) > ((long)v1)) {
                do {
                    v1 += v1;
                }
                while(((long)v1) < ((long)(v - 30)));
                this.b = Arrays.copyOf(this.b, v1);
            }
            if(!this.f(v - 30)) {
                this.d = true;
                return this.a.c();
            }
            eu eu1 = this.a.c();
            this.c = eu1.b();
            return eu1;
        }
        return new bq(null, -1L, -1, false, false, null);
    }

    final boolean c() {
        return this.e;
    }

    final boolean d() {
        return this.d;
    }

    private final int e(byte[] arr_b, int v, int v1) throws IOException {
        return Math.max(0, super.read(arr_b, v, v1));
    }

    private final boolean f(int v) throws IOException {
        int v1 = this.e(this.b, 0, v);
        if(v1 != v && this.e(this.b, v1, v - v1) != v - v1) {
            this.a.b(this.b, 0, v1);
            return false;
        }
        this.a.b(this.b, 0, v);
        return true;
    }

    @Override
    public final int read(byte[] arr_b) throws IOException {
        return this.read(arr_b, 0, arr_b.length);
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) throws IOException {
        long v2 = this.c;
        if(v2 > 0L && !this.d) {
            int v3 = this.e(arr_b, v, ((int)Math.min(v2, v1)));
            this.c -= (long)v3;
            if(v3 == 0) {
                this.d = true;
                return 0;
            }
            return v3;
        }
        return -1;
    }
}

