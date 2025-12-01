package com.google.android.play.core.appupdate.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class zzk extends BroadcastReceiver {
    final zzl zza;

    zzk(zzl zzl0, zzj zzj0) {
        this.zza = zzl0;
        super();
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        this.zza.zza(context0, intent0);
    }
}

