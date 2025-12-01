package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzdo implements RemoteCall {
    private final SnapshotMetadata zzgg;

    zzdo(SnapshotMetadata snapshotMetadata0) {
        this.zzgg = snapshotMetadata0;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((zzf)object0).zzc(((TaskCompletionSource)object1), this.zzgg.getSnapshotId());
    }
}

