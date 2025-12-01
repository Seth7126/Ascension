package com.google.android.gms.internal.auth-api-phone;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zzm extends TaskApiCall {
    private TaskCompletionSource zzf;

    private zzm() {
    }

    zzm(zzk zzk0) {
    }

    @Override  // com.google.android.gms.common.api.internal.TaskApiCall
    protected void doExecute(AnyClient api$AnyClient0, TaskCompletionSource taskCompletionSource0) throws RemoteException {
        this.zzf = taskCompletionSource0;
        this.zza(((zze)((zzi)api$AnyClient0).getService()));
    }

    protected abstract void zza(zze arg1) throws RemoteException;

    protected final void zzb(Status status0) {
        TaskUtil.setResultOrApiException(status0, this.zzf);
    }
}

