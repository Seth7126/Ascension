package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;

final class zzdv extends zzdw {
    private final Snapshot zzgn;
    private final SnapshotMetadataChange zzgo;

    zzdv(zzdq zzdq0, GoogleApiClient googleApiClient0, Snapshot snapshot0, SnapshotMetadataChange snapshotMetadataChange0) {
        this.zzgn = snapshot0;
        this.zzgo = snapshotMetadataChange0;
        super(googleApiClient0, null);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    protected final void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        ((zzf)api$AnyClient0).zza(this, this.zzgn, this.zzgo);
    }
}

