package com.google.android.play.core.assetpacks;

public final class dx implements Runnable {
    public final dy a;
    public final dw b;

    public dx(dy dy0, dw dw0) {
        this.a = dy0;
        this.b = dw0;
    }

    @Override
    public final void run() {
        this.a.b(this.b);
    }
}

