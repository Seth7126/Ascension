package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.zzf;

final class zzcz extends zzde {
    private final String zzgc;

    zzcz(zzcw zzcw0, GoogleApiClient googleApiClient0, String s) {
        this.zzgc = s;
        super(googleApiClient0);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    protected final void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        ((zzf)api$AnyClient0).zza(this, this.zzgc, false);
    }
}

