package com.google.android.play.core.assetpacks;

public final class cy implements Runnable {
    public final de a;
    public final db b;

    public cy(de de0, db db0) {
        this.a = de0;
        this.b = db0;
    }

    @Override
    public final void run() {
        this.a.n(this.b.a);
    }
}

