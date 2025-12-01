package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzg;
import com.google.android.play.core.appupdate.internal.zzm;

class zzo extends zzg {
    final zzm zza;
    final TaskCompletionSource zzb;
    final zzr zzc;

    zzo(zzr zzr0, zzm zzm0, TaskCompletionSource taskCompletionSource0) {
        this.zzc = zzr0;
        super();
        this.zza = zzm0;
        this.zzb = taskCompletionSource0;
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzh
    public void zzb(Bundle bundle0) throws RemoteException {
        this.zzc.zza.zzu(this.zzb);
        this.zza.zzd("onCompleteUpdate", new Object[0]);
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzh
    public void zzc(Bundle bundle0) throws RemoteException {
        this.zzc.zza.zzu(this.zzb);
        this.zza.zzd("onRequestInfo", new Object[0]);
    }
}

