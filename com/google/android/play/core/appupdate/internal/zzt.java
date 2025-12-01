package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;

final class zzt extends zzn {
    final IBinder zza;
    final zzw zzb;

    zzt(zzw zzw0, IBinder iBinder0) {
        this.zzb = zzw0;
        this.zza = iBinder0;
        super();
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        zzf zzf0 = zze.zzb(this.zza);
        zzx.zzm(this.zzb.zza, zzf0);
        zzx.zzq(this.zzb.zza);
        zzx.zzl(this.zzb.zza, false);
        for(Object object0: zzx.zzh(this.zzb.zza)) {
            ((Runnable)object0).run();
        }
        zzx.zzh(this.zzb.zza).clear();
    }
}

