package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzdm implements RemoteCall {
    private final Snapshot zzge;
    private final SnapshotMetadataChange zzgf;

    zzdm(Snapshot snapshot0, SnapshotMetadataChange snapshotMetadataChange0) {
        this.zzge = snapshot0;
        this.zzgf = snapshotMetadataChange0;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((zzf)object0).zza(((TaskCompletionSource)object1), this.zzge, this.zzgf);
    }
}

