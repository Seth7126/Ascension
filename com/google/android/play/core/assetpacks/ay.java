package com.google.android.play.core.assetpacks;

import android.os.Bundle;

public final class ay implements Runnable {
    public final bb a;
    public final Bundle b;

    public ay(bb bb0, Bundle bundle0) {
        this.a = bb0;
        this.b = bundle0;
    }

    @Override
    public final void run() {
        this.a.a(this.b);
    }
}

