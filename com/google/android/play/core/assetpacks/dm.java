package com.google.android.play.core.assetpacks;

import android.content.Intent;

public final class dm implements Runnable {
    public final do a;
    public final Intent b;

    public dm(do do0, Intent intent0) {
        this.a = do0;
        this.b = intent0;
    }

    @Override
    public final void run() {
        this.a.l(this.b);
    }
}

