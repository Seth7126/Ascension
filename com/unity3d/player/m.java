package com.unity3d.player;

final class m {
    private static boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;

    static {
    }

    m() {
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = false;
    }

    static void a() {
        m.a = true;
    }

    final void a(boolean z) {
        this.b = z;
    }

    static void b() {
        m.a = false;
    }

    final void b(boolean z) {
        this.d = z;
    }

    static boolean c() [...] // 潜在的解密器

    final void c(boolean z) {
        this.e = z;
    }

    final void d(boolean z) {
        this.c = z;
    }

    final boolean d() {
        return this.d;
    }

    final boolean e() {
        return this.e;
    }

    // 去混淆评级： 中等(50)
    final boolean e(boolean z) {
        return m.a && (z || this.b) && !this.d && !this.c;
    }

    final boolean f() {
        return this.c;
    }

    @Override
    public final String toString() {
        return super.toString();
    }
}

