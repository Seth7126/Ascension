package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzk extends zzo {
    private final Credential zzao;

    zzk(zzj zzj0, GoogleApiClient googleApiClient0, Credential credential0) {
        this.zzao = credential0;
        super(googleApiClient0);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    protected final Result createFailedResult(Status status0) {
        return status0;
    }

    @Override  // com.google.android.gms.internal.auth-api.zzo
    protected final void zzc(Context context0, zzx zzx0) throws RemoteException {
        zzx0.zzc(new zzp(this), new zzz(this.zzao));
    }
}

