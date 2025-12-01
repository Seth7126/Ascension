package com.google.android.play.core.assetpacks;

public final class ba implements Runnable {
    public final bb a;
    public final AssetPackState b;

    public ba(bb bb0, AssetPackState assetPackState0) {
        this.a = bb0;
        this.b = assetPackState0;
    }

    @Override
    public final void run() {
        this.a.i(this.b);
    }
}

