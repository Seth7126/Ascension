package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.appupdate.internal.zzl;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.install.InstallState;

public final class zzc extends zzl {
    public zzc(Context context0) {
        super(new zzm("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context0);
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzl
    protected final void zza(Context context0, Intent intent0) {
        if(!"com.playdekgames.android.Ascension".equals(intent0.getStringExtra("package.name"))) {
            this.zza.zza("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", new Object[]{intent0.getStringExtra("package.name")});
            return;
        }
        this.zza.zza("List of extras in received intent:", new Object[0]);
        for(Object object0: intent0.getExtras().keySet()) {
            this.zza.zza("Key: %s; value: %s", new Object[]{((String)object0), intent0.getExtras().get(((String)object0))});
        }
        InstallState installState0 = InstallState.zzb(intent0, this.zza);
        this.zza.zza("ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[]{installState0});
        this.zzd(installState0);
    }
}

