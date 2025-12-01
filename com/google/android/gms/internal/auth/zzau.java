package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

final class zzau extends zzaq {
    zzau(zzar zzar0, GoogleApiClient googleApiClient0) {
        super(googleApiClient0);
    }

    @Override  // com.google.android.gms.internal.auth.zzaq
    protected final void zza(Context context0, zzan zzan0) throws RemoteException {
        zzan0.zza(new zzav(this));
    }
}

