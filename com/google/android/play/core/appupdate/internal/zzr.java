package com.google.android.play.core.appupdate.internal;

final class zzr extends zzn {
    final zzx zza;

    zzr(zzx zzx0) {
        this.zza = zzx0;
        super();
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        synchronized(zzx.zzg(this.zza)) {
            if(zzx.zzi(this.zza).get() > 0 && zzx.zzi(this.zza).decrementAndGet() > 0) {
                zzx.zzf(this.zza).zzd("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            zzx zzx0 = this.zza;
            if(zzx.zzd(zzx0) != null) {
                zzx.zzf(zzx0).zzd("Unbind from service.", new Object[0]);
                zzx.zza(this.zza).unbindService(zzx.zzb(this.zza));
                zzx.zzl(this.zza, false);
                zzx.zzm(this.zza, null);
                zzx.zzk(this.zza, null);
            }
            zzx.zzo(this.zza);
        }
    }
}

