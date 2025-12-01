package com.google.android.play.core.appupdate.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

final class zzq extends zzn {
    final TaskCompletionSource zza;
    final zzn zzb;
    final zzx zzc;

    zzq(zzx zzx0, TaskCompletionSource taskCompletionSource0, TaskCompletionSource taskCompletionSource1, zzn zzn0) {
        this.zzc = zzx0;
        this.zza = taskCompletionSource1;
        this.zzb = zzn0;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        synchronized(zzx.zzg(this.zzc)) {
            zzx.zzn(this.zzc, this.zza);
            if(zzx.zzi(this.zzc).getAndIncrement() > 0) {
                zzx.zzf(this.zzc).zzd("Already connected to the service.", new Object[0]);
            }
            zzx.zzp(this.zzc, this.zzb);
        }
    }
}

