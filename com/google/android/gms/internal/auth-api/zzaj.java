package com.google.android.gms.internal.auth-api;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzaj extends zzaa {
    private final TaskCompletionSource zzbn;

    zzaj(zzaf zzaf0, TaskCompletionSource taskCompletionSource0) {
        this.zzbn = taskCompletionSource0;
        super();
    }

    @Override  // com.google.android.gms.internal.auth-api.zzab
    public final void zzc(Status status0, BeginSignInResult beginSignInResult0) throws RemoteException {
        TaskUtil.setResultOrApiException(status0, beginSignInResult0, this.zzbn);
    }
}

