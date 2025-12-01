package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.zzf;

final class zzcd extends zzci {
    private final String zzfr;
    private final long zzfx;
    private final String zzfy;

    zzcd(zzbu zzbu0, GoogleApiClient googleApiClient0, String s, long v, String s1) {
        this.zzfr = s;
        this.zzfx = v;
        this.zzfy = s1;
        super(googleApiClient0);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    protected final void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        ((zzf)api$AnyClient0).zza(this, this.zzfr, this.zzfx, this.zzfy);
    }
}

