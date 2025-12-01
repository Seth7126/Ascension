package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.zzf;

final class zzdd extends zzde {
    private final boolean zzfa;
    private final int zzgd;

    zzdd(zzcw zzcw0, GoogleApiClient googleApiClient0, int v, boolean z) {
        this.zzgd = v;
        this.zzfa = z;
        super(googleApiClient0);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    protected final void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        ((zzf)api$AnyClient0).zza(this, "played_with", this.zzgd, false, this.zzfa);
    }
}

