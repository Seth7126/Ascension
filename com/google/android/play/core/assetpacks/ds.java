package com.google.android.play.core.assetpacks;

import java.util.Arrays;

final class ds {
    private byte[] a;
    private int b;
    private long c;
    private long d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private String i;

    public ds() {
        this.a = new byte[0x1000];
        this.d();
    }

    public final int a() {
        return this.f;
    }

    public final int b(byte[] arr_b, int v, int v1) {
        int v2 = this.e(30, arr_b, v, v1);
        if(v2 != -1) {
            if(this.c == -1L) {
                long v3 = br.c(this.a, 0);
                this.c = v3;
                if(v3 == 0x4034B50L) {
                    this.h = false;
                    this.d = br.c(this.a, 18);
                    this.g = br.a(this.a, 8);
                    this.e = br.a(this.a, 26);
                    int v4 = br.a(this.a, 28);
                    int v5 = this.e + 30 + v4;
                    this.f = v5;
                    int v6 = this.a.length;
                    if(v6 < v5) {
                        do {
                            v6 += v6;
                        }
                        while(v6 < v5);
                        this.a = Arrays.copyOf(this.a, v6);
                    }
                }
                else {
                    this.h = true;
                }
            }
            int v7 = this.e(this.f, arr_b, v + v2, v1 - v2);
            if(v7 == -1) {
                return -1;
            }
            if(!this.h && this.i == null) {
                this.i = new String(this.a, 30, this.e);
            }
            return v2 + v7;
        }
        return -1;
    }

    public final eu c() {
        int v = this.b;
        int v1 = this.f;
        if(v < v1) {
            String s = this.i;
            long v2 = this.d;
            int v3 = this.g;
            byte[] arr_b = Arrays.copyOf(this.a, v);
            return new bq(s, v2, v3, true, this.h, arr_b);
        }
        String s1 = this.i;
        long v4 = this.d;
        int v5 = this.g;
        byte[] arr_b1 = Arrays.copyOf(this.a, v1);
        eu eu0 = new bq(s1, v4, v5, false, this.h, arr_b1);
        this.d();
        return eu0;
    }

    public final void d() {
        this.b = 0;
        this.e = -1;
        this.c = -1L;
        this.h = false;
        this.f = 30;
        this.d = -1L;
        this.g = -1;
        this.i = null;
    }

    private final int e(int v, byte[] arr_b, int v1, int v2) {
        int v3 = this.b;
        if(v3 < v) {
            int v4 = Math.min(v2, v - v3);
            System.arraycopy(arr_b, v1, this.a, this.b, v4);
            int v5 = this.b + v4;
            this.b = v5;
            return v5 >= v ? v4 : -1;
        }
        return 0;
    }
}

