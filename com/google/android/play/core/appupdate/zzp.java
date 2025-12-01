package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.install.InstallException;

final class zzp extends zzo {
    zzp(zzr zzr0, TaskCompletionSource taskCompletionSource0) {
        super(zzr0, new zzm("OnCompleteUpdateCallback"), taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.appupdate.zzo
    public final void zzb(Bundle bundle0) throws RemoteException {
        super.zzb(bundle0);
        if(zzr.zza(bundle0) != 0) {
            this.zzb.trySetException(new InstallException(zzr.zza(bundle0)));
            return;
        }
        this.zzb.trySetResult(null);
    }
}

