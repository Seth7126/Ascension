package com.google.android.play.core.assetpacks;

import java.util.Arrays;

final class bq extends eu {
    private final String a;
    private final long b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final byte[] f;

    bq(String s, long v, int v1, boolean z, boolean z1, byte[] arr_b) {
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = z;
        this.e = z1;
        this.f = arr_b;
    }

    @Override  // com.google.android.play.core.assetpacks.eu
    final int a() {
        return this.c;
    }

    @Override  // com.google.android.play.core.assetpacks.eu
    final long b() {
        return this.b;
    }

    @Override  // com.google.android.play.core.assetpacks.eu
    final String c() {
        return this.a;
    }

    @Override  // com.google.android.play.core.assetpacks.eu
    final boolean d() {
        return this.e;
    }

    @Override  // com.google.android.play.core.assetpacks.eu
    final boolean e() {
        return this.d;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof eu) {
            String s = this.a;
            if(s != null) {
                if(s.equals(((eu)object0).c())) {
                label_8:
                    long v = ((eu)object0).b();
                    if(this.b == v) {
                        int v1 = ((eu)object0).a();
                        if(this.c == v1) {
                            boolean z = ((eu)object0).e();
                            if(this.d == z) {
                                boolean z1 = ((eu)object0).d();
                                if(this.e == z1) {
                                    byte[] arr_b = ((eu)object0) instanceof bq ? ((bq)(((eu)object0))).f : ((eu)object0).f();
                                    return Arrays.equals(this.f, arr_b);
                                }
                            }
                        }
                    }
                }
            }
            else if(((eu)object0).c() == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override  // com.google.android.play.core.assetpacks.eu
    final byte[] f() {
        return this.f;
    }

    @Override
    public final int hashCode() {
        int v = (((this.a == null ? 0 : this.a.hashCode()) ^ 1000003) * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20))) * 1000003 ^ this.c;
        int v1 = 0x4D5;
        int v2 = this.d ? 0x4CF : 0x4D5;
        if(this.e) {
            v1 = 0x4CF;
        }
        return ((v * 1000003 ^ v2) * 1000003 ^ v1) * 1000003 ^ Arrays.hashCode(this.f);
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.f);
        return "ZipEntry{name=" + this.a + ", size=" + this.b + ", compressionMethod=" + this.c + ", isPartial=" + this.d + ", isEndOfArchive=" + this.e + ", headerBytes=" + s + "}";
    }
}

