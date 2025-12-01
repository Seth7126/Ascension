package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.games.Games.GamesOptions;
import com.google.android.gms.games.SnapshotsClient;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.tasks.Task;

public final class zzdg extends zzac implements SnapshotsClient {
    public zzdg(Activity activity0, GamesOptions games$GamesOptions0) {
        super(activity0, games$GamesOptions0);
    }

    public zzdg(Context context0, GamesOptions games$GamesOptions0) {
        super(context0, games$GamesOptions0);
    }

    @Override  // com.google.android.gms.games.SnapshotsClient
    public final Task commitAndClose(Snapshot snapshot0, SnapshotMetadataChange snapshotMetadataChange0) {
        return this.zzb(new zzdm(snapshot0, snapshotMetadataChange0));
    }

    @Override  // com.google.android.gms.games.SnapshotsClient
    public final Task delete(SnapshotMetadata snapshotMetadata0) {
        return this.zzb(new zzdo(snapshotMetadata0));
    }

    @Override  // com.google.android.gms.games.SnapshotsClient
    public final Task discardAndClose(Snapshot snapshot0) {
        return this.zzb(new zzdp(snapshot0));
    }

    @Override  // com.google.android.gms.games.SnapshotsClient
    public final Task getMaxCoverImageSize() {
        return this.zza(zzdi.zzev);
    }

    @Override  // com.google.android.gms.games.SnapshotsClient
    public final Task getMaxDataSize() {
        return this.zza(zzdj.zzev);
    }

    @Override  // com.google.android.gms.games.SnapshotsClient
    public final Task getSelectSnapshotIntent(String s, boolean z, boolean z1, int v) {
        return this.zza(new zzdl(s, z, z1, v));
    }

    @Override  // com.google.android.gms.games.SnapshotsClient
    public final Task load(boolean z) {
        return this.zza(new zzdk(z));
    }

    @Override  // com.google.android.gms.games.SnapshotsClient
    public final Task open(SnapshotMetadata snapshotMetadata0) {
        return this.open(snapshotMetadata0, -1);
    }

    @Override  // com.google.android.gms.games.SnapshotsClient
    public final Task open(SnapshotMetadata snapshotMetadata0, int v) {
        return this.open(snapshotMetadata0.getUniqueName(), false, v);
    }

    @Override  // com.google.android.gms.games.SnapshotsClient
    public final Task open(String s, boolean z) {
        return this.open(s, z, -1);
    }

    @Override  // com.google.android.gms.games.SnapshotsClient
    public final Task open(String s, boolean z, int v) {
        return this.zzb(new zzdn(s, z, v));
    }

    @Override  // com.google.android.gms.games.SnapshotsClient
    public final Task resolveConflict(String s, Snapshot snapshot0) {
        SnapshotMetadata snapshotMetadata0 = snapshot0.getMetadata();
        SnapshotMetadataChange snapshotMetadataChange0 = new Builder().fromMetadata(snapshotMetadata0).build();
        return this.resolveConflict(s, snapshotMetadata0.getSnapshotId(), snapshotMetadataChange0, snapshot0.getSnapshotContents());
    }

    @Override  // com.google.android.gms.games.SnapshotsClient
    public final Task resolveConflict(String s, String s1, SnapshotMetadataChange snapshotMetadataChange0, SnapshotContents snapshotContents0) {
        return this.zzb(new zzdr(s, s1, snapshotMetadataChange0, snapshotContents0));
    }
}

