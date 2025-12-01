package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.zzf;

final class zzal extends zzam {
    private final boolean zzfa;
    private final String[] zzfg;

    zzal(zzai zzai0, GoogleApiClient googleApiClient0, boolean z, String[] arr_s) {
        this.zzfa = z;
        this.zzfg = arr_s;
        super(googleApiClient0, null);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    public final void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        ((zzf)api$AnyClient0).zza(this, this.zzfa, this.zzfg);
    }
}

