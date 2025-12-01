package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.zzf;

final class zzds extends zzec {
    private final String zzgj;
    private final boolean zzgk;
    private final int zzgl;

    zzds(zzdq zzdq0, GoogleApiClient googleApiClient0, String s, boolean z, int v) {
        this.zzgj = s;
        this.zzgk = z;
        this.zzgl = v;
        super(googleApiClient0, null);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    protected final void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        ((zzf)api$AnyClient0).zza(this, this.zzgj, this.zzgk, this.zzgl);
    }
}

