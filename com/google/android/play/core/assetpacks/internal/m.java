package com.google.android.play.core.assetpacks.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class m extends BroadcastReceiver {
    final n a;

    m(n n0, l l0) {
        this.a = n0;
        super();
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        this.a.c(context0, intent0);
    }
}

