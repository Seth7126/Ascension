package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzdr implements RemoteCall {
    private final String zzew;
    private final String zzfz;
    private final SnapshotMetadataChange zzgh;
    private final SnapshotContents zzgi;

    zzdr(String s, String s1, SnapshotMetadataChange snapshotMetadataChange0, SnapshotContents snapshotContents0) {
        this.zzew = s;
        this.zzfz = s1;
        this.zzgh = snapshotMetadataChange0;
        this.zzgi = snapshotContents0;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((zzf)object0).zza(((TaskCompletionSource)object1), this.zzew, this.zzfz, this.zzgh, this.zzgi);
    }
}

