package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.zzf;

final class zzcb extends zzcg {
    private final boolean zzfa;
    private final String zzfr;
    private final int zzfs;
    private final int zzft;
    private final int zzfu;

    zzcb(zzbu zzbu0, GoogleApiClient googleApiClient0, String s, int v, int v1, int v2, boolean z) {
        this.zzfr = s;
        this.zzfs = v;
        this.zzft = v1;
        this.zzfu = v2;
        this.zzfa = z;
        super(googleApiClient0, null);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    protected final void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        ((zzf)api$AnyClient0).zzb(this, this.zzfr, this.zzfs, this.zzft, this.zzfu, this.zzfa);
    }
}

