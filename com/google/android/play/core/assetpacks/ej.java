package com.google.android.play.core.assetpacks;

public final class ej implements Runnable {
    public final ek a;
    public final ei b;

    public ej(ek ek0, ei ei0) {
        this.a = ek0;
        this.b = ei0;
    }

    @Override
    public final void run() {
        this.a.b(this.b);
    }
}

