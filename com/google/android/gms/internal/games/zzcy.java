package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.zzf;

final class zzcy extends zzde {
    private final boolean zzfa;
    private final String zzgc;

    zzcy(zzcw zzcw0, GoogleApiClient googleApiClient0, String s, boolean z) {
        this.zzgc = s;
        this.zzfa = z;
        super(googleApiClient0);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    protected final void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        ((zzf)api$AnyClient0).zza(this, this.zzgc, this.zzfa);
    }
}

