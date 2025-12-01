package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.install.InstallException;

final class zzq extends zzo {
    final zzr zzd;
    private final String zze;

    zzq(zzr zzr0, TaskCompletionSource taskCompletionSource0, String s) {
        this.zzd = zzr0;
        super(zzr0, new zzm("OnRequestInstallCallback"), taskCompletionSource0);
        this.zze = s;
    }

    @Override  // com.google.android.play.core.appupdate.zzo
    public final void zzc(Bundle bundle0) throws RemoteException {
        super.zzc(bundle0);
        if(zzr.zza(bundle0) != 0) {
            this.zzb.trySetException(new InstallException(zzr.zza(bundle0)));
            return;
        }
        this.zzb.trySetResult(zzr.zzf(this.zzd, bundle0, this.zze));
    }
}

