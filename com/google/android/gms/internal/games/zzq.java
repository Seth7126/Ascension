package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.zzf;

final class zzq extends zzaa {
    private final String val$id;
    private final int zzez;

    zzq(zzo zzo0, String s, GoogleApiClient googleApiClient0, String s1, int v) {
        this.val$id = s1;
        this.zzez = v;
        super(s, googleApiClient0);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    public final void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        ((zzf)api$AnyClient0).zzb(this, this.val$id, this.zzez);
    }
}

