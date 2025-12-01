package com.google.android.play.core.assetpacks;

abstract class eu {
    abstract int a();

    abstract long b();

    abstract String c();

    abstract boolean d();

    abstract boolean e();

    abstract byte[] f();

    final boolean g() {
        return this.c() == null ? false : this.c().endsWith("/");
    }

    final boolean h() {
        return this.a() == 0;
    }
}

