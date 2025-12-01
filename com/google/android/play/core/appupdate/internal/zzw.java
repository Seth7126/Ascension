package com.google.android.play.core.appupdate.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class zzw implements ServiceConnection {
    final zzx zza;

    zzw(zzx zzx0, zzv zzv0) {
        this.zza = zzx0;
        super();
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        zzx.zzf(this.zza).zzd("ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName0});
        zzt zzt0 = new zzt(this, iBinder0);
        this.zza.zzc().post(zzt0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        zzx.zzf(this.zza).zzd("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName0});
        zzu zzu0 = new zzu(this);
        this.zza.zzc().post(zzu0);
    }
}

