package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.zzf;

final class zzak extends zzam {
    private final boolean zzfa;

    zzak(zzai zzai0, GoogleApiClient googleApiClient0, boolean z) {
        this.zzfa = z;
        super(googleApiClient0, null);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    public final void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        ((zzf)api$AnyClient0).zzd(this, this.zzfa);
    }
}

