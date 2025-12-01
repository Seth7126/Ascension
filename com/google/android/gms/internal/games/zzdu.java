package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.games.snapshot.SnapshotMetadata;

final class zzdu extends zzdy {
    private final SnapshotMetadata zzgm;

    zzdu(zzdq zzdq0, GoogleApiClient googleApiClient0, SnapshotMetadata snapshotMetadata0) {
        this.zzgm = snapshotMetadata0;
        super(googleApiClient0, null);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    protected final void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        ((zzf)api$AnyClient0).zzc(this, this.zzgm.getSnapshotId());
    }
}

