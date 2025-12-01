package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class zzbe extends TaskApiCall {
    @Override  // com.google.android.gms.common.api.internal.TaskApiCall
    protected void doExecute(AnyClient api$AnyClient0, TaskCompletionSource taskCompletionSource0) throws RemoteException {
        zzf zzf0 = (zzf)api$AnyClient0;
        try {
            this.zzb(zzf0, taskCompletionSource0);
        }
        catch(RemoteException | SecurityException remoteException0) {
            taskCompletionSource0.trySetException(remoteException0);
        }
    }

    protected abstract void zzb(zzf arg1, TaskCompletionSource arg2) throws RemoteException;
}

