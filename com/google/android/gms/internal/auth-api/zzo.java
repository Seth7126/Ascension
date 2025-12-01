package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

abstract class zzo extends ApiMethodImpl {
    zzo(GoogleApiClient googleApiClient0) {
        super(Auth.CREDENTIALS_API, googleApiClient0);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    protected void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        this.zzc(((zzq)api$AnyClient0).getContext(), ((zzx)((zzq)api$AnyClient0).getService()));
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    public void setResult(Object object0) {
        super.setResult(((Result)object0));
    }

    protected abstract void zzc(Context arg1, zzx arg2) throws DeadObjectException, RemoteException;
}

