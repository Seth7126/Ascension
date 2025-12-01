package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;

final class zzdx extends zzec {
    private final SnapshotMetadataChange zzgo;
    private final String zzgp;
    private final String zzgq;
    private final SnapshotContents zzgr;

    zzdx(zzdq zzdq0, GoogleApiClient googleApiClient0, String s, String s1, SnapshotMetadataChange snapshotMetadataChange0, SnapshotContents snapshotContents0) {
        this.zzgp = s;
        this.zzgq = s1;
        this.zzgo = snapshotMetadataChange0;
        this.zzgr = snapshotContents0;
        super(googleApiClient0, null);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    protected final void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        ((zzf)api$AnyClient0).zza(this, this.zzgp, this.zzgq, this.zzgo, this.zzgr);
    }
}

