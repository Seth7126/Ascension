package com.google.android.play.core.assetpacks.internal;

import android.os.IBinder.DeathRecipient;

public final class r implements IBinder.DeathRecipient {
    public final z a;

    public r(z z0) {
        this.a = z0;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        z.j(this.a);
    }
}

