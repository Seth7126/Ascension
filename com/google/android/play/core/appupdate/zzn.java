package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzf;

final class zzn extends com.google.android.play.core.appupdate.internal.zzn {
    final TaskCompletionSource zza;
    final String zzb;
    final zzr zzc;

    zzn(zzr zzr0, TaskCompletionSource taskCompletionSource0, TaskCompletionSource taskCompletionSource1, String s) {
        this.zzc = zzr0;
        this.zza = taskCompletionSource1;
        this.zzb = s;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzn
    protected final void zza() {
        try {
            IInterface iInterface0 = this.zzc.zza.zze();
            Bundle bundle0 = zzr.zzc();
            zzp zzp0 = new zzp(this.zzc, this.zza);
            ((zzf)iInterface0).zzc(zzr.zzh(this.zzc), bundle0, zzp0);
        }
        catch(RemoteException remoteException0) {
            zzr.zzg().zzc(remoteException0, "completeUpdate(%s)", new Object[]{this.zzb});
            RuntimeException runtimeException0 = new RuntimeException(remoteException0);
            this.zza.trySetException(runtimeException0);
        }
    }
}

