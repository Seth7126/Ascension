package com.google.android.play.core.assetpacks;

public final class dn implements Runnable {
    public final do a;
    public final int b;
    public final String c;

    public dn(do do0, int v, String s) {
        this.a = do0;
        this.b = v;
        this.c = s;
    }

    @Override
    public final void run() {
        this.a.n(this.b, this.c);
    }
}

