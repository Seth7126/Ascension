package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult;

final class zzdz implements CommitSnapshotResult {
    private final Status zzfc;

    zzdz(zzdw zzdw0, Status status0) {
        this.zzfc = status0;
        super();
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshots$CommitSnapshotResult
    public final SnapshotMetadata getSnapshotMetadata() {
        return null;
    }

    @Override  // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzfc;
    }
}

