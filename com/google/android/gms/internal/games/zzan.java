package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.zzf;

final class zzan extends zzao {
    private final String zzfh;
    private final int zzfi;

    zzan(zzai zzai0, GoogleApiClient googleApiClient0, String s, int v) {
        this.zzfh = s;
        this.zzfi = v;
        super(googleApiClient0, null);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    public final void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        ((zzf)api$AnyClient0).zzb(this.zzfh, this.zzfi);
    }
}

