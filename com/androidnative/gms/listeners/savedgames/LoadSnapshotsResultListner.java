package com.androidnative.gms.listeners.savedgames;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult;
import com.unity3d.player.UnityPlayer;

public class LoadSnapshotsResultListner implements ResultCallback {
    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((LoadSnapshotsResult)result0));
    }

    public void onResult(LoadSnapshotsResult snapshots$LoadSnapshotsResult0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(snapshots$LoadSnapshotsResult0.getStatus().getStatusCode());
        stringBuilder0.append("|");
        for(Object object0: snapshots$LoadSnapshotsResult0.getSnapshots()) {
            stringBuilder0.append(((SnapshotMetadata)object0).getTitle());
            stringBuilder0.append("|");
            stringBuilder0.append(((SnapshotMetadata)object0).getLastModifiedTimestamp());
            stringBuilder0.append("|");
            stringBuilder0.append(((SnapshotMetadata)object0).getDescription());
            stringBuilder0.append("|");
            stringBuilder0.append(((SnapshotMetadata)object0).getCoverImageUrl());
            stringBuilder0.append("|");
            stringBuilder0.append(((SnapshotMetadata)object0).getPlayedTime());
            stringBuilder0.append("|");
        }
        stringBuilder0.append("endofline");
        snapshots$LoadSnapshotsResult0.getSnapshots().release();
        UnityPlayer.UnitySendMessage("GooglePlaySavedGamesManager", "OnLoadSnapshotsResult", stringBuilder0.toString());
    }
}

