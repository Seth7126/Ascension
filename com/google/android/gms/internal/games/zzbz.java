package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.zzf;

final class zzbz extends zzce {
    private final String zzfr;
    private final int zzfs;
    private final int zzft;

    zzbz(zzbu zzbu0, GoogleApiClient googleApiClient0, String s, int v, int v1) {
        this.zzfr = s;
        this.zzfs = v;
        this.zzft = v1;
        super(googleApiClient0, null);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    protected final void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        ((zzf)api$AnyClient0).zza(this, null, this.zzfr, this.zzfs, this.zzft);
    }
}

