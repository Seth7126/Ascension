package com.google.android.play.core.assetpacks;

import android.os.Bundle;

public final class az implements Runnable {
    public final bb a;
    public final Bundle b;
    public final AssetPackState c;

    public az(bb bb0, Bundle bundle0, AssetPackState assetPackState0) {
        this.a = bb0;
        this.b = bundle0;
        this.c = assetPackState0;
    }

    @Override
    public final void run() {
        this.a.b(this.b, this.c);
    }
}

