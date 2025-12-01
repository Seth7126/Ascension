package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.zzf;

final class zzbw extends zzcc {
    private final boolean zzfa;
    private final String zzfr;

    zzbw(zzbu zzbu0, GoogleApiClient googleApiClient0, String s, boolean z) {
        this.zzfr = s;
        this.zzfa = z;
        super(googleApiClient0, null);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    protected final void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        ((zzf)api$AnyClient0).zzb(this, this.zzfr, this.zzfa);
    }
}

