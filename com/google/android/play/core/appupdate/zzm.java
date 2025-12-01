package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzf;
import com.google.android.play.core.appupdate.internal.zzn;

final class zzm extends zzn {
    final String zza;
    final TaskCompletionSource zzb;
    final zzr zzc;

    zzm(zzr zzr0, TaskCompletionSource taskCompletionSource0, String s, TaskCompletionSource taskCompletionSource1) {
        this.zzc = zzr0;
        this.zza = s;
        this.zzb = taskCompletionSource1;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzn
    protected final void zza() {
        try {
            ((zzf)this.zzc.zza.zze()).zzd(zzr.zzh(this.zzc), zzr.zzb(this.zzc, this.zza), new zzq(this.zzc, this.zzb, this.zza));
        }
        catch(RemoteException remoteException0) {
            zzr.zzg().zzc(remoteException0, "requestUpdateInfo(%s)", new Object[]{this.zza});
            RuntimeException runtimeException0 = new RuntimeException(remoteException0);
            this.zzb.trySetException(runtimeException0);
        }
    }
}

