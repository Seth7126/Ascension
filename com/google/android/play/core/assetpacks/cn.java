package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class cn extends OutputStream {
    private final ds a;
    private final File b;
    private final eo c;
    private long d;
    private long e;
    private FileOutputStream f;
    private eu g;

    cn(File file0, eo eo0) {
        this.a = new ds();
        this.b = file0;
        this.c = eo0;
    }

    @Override
    public final void write(int v) throws IOException {
        this.write(new byte[]{((byte)v)}, 0, 1);
    }

    @Override
    public final void write(byte[] arr_b) throws IOException {
        this.write(arr_b, 0, arr_b.length);
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) throws IOException {
        int v3;
        while(v1 > 0) {
            if(this.d == 0L && this.e == 0L) {
                int v2 = this.a.b(arr_b, v, v1);
                if(v2 == -1) {
                    return;
                }
                v += v2;
                v1 -= v2;
                eu eu0 = this.a.c();
                this.g = eu0;
                if(eu0.d()) {
                    this.d = 0L;
                    byte[] arr_b1 = this.g.f();
                    byte[] arr_b2 = this.g.f();
                    this.c.l(arr_b1, 0, arr_b2.length);
                    this.e = (long)this.g.f().length;
                }
                else if(!this.g.h() || this.g.g()) {
                    byte[] arr_b4 = this.g.f();
                    this.c.l(arr_b4, 0, arr_b4.length);
                    this.d = this.g.b();
                }
                else {
                    byte[] arr_b3 = this.g.f();
                    this.c.j(arr_b3);
                    String s = this.g.c();
                    File file0 = new File(this.b, s);
                    file0.getParentFile().mkdirs();
                    this.d = this.g.b();
                    this.f = new FileOutputStream(file0);
                }
            }
            if(!this.g.g()) {
                if(this.g.d()) {
                    this.c.e(this.e, arr_b, v, v1);
                    this.e += (long)v1;
                    v3 = v1;
                }
                else if(this.g.h()) {
                    v3 = (int)Math.min(v1, this.d);
                    this.f.write(arr_b, v, v3);
                    long v4 = this.d - ((long)v3);
                    this.d = v4;
                    if(v4 == 0L) {
                        this.f.close();
                    }
                }
                else {
                    v3 = (int)Math.min(v1, this.d);
                    byte[] arr_b5 = this.g.f();
                    long v5 = this.g.b();
                    this.c.e(((long)arr_b5.length) + v5 - this.d, arr_b, v, v3);
                    this.d -= (long)v3;
                }
                v += v3;
                v1 -= v3;
            }
        }
    }
}

