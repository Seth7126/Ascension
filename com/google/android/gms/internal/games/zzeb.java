package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult;

final class zzeb implements DeleteSnapshotResult {
    private final Status zzfc;

    zzeb(zzdy zzdy0, Status status0) {
        this.zzfc = status0;
        super();
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshots$DeleteSnapshotResult
    public final String getSnapshotId() {
        return null;
    }

    @Override  // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzfc;
    }
}

