package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

abstract class zzap extends ApiMethodImpl {
    public zzap(GoogleApiClient googleApiClient0) {
        super(AuthProxy.API, googleApiClient0);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    protected Result createFailedResult(Status status0) {
        return new zzaw(status0);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    protected void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        this.zza(((zzak)api$AnyClient0).getContext(), ((zzan)((zzak)api$AnyClient0).getService()));
    }

    protected abstract void zza(Context arg1, zzan arg2) throws RemoteException;
}

