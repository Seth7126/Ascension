package com.androidnative.gms.listeners.savedgames;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult;
import com.unity3d.player.UnityPlayer;

public class DeleteSpapShotResultListner implements ResultCallback {
    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((DeleteSnapshotResult)result0));
    }

    public void onResult(DeleteSnapshotResult snapshots$DeleteSnapshotResult0) {
        int v = snapshots$DeleteSnapshotResult0.getStatus().getStatusCode();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v);
        if(v == 0) {
            stringBuilder0.append("|");
            stringBuilder0.append(snapshots$DeleteSnapshotResult0.getSnapshotId());
        }
        UnityPlayer.UnitySendMessage("GooglePlaySavedGamesManager", "OnDeleteResult", stringBuilder0.toString());
    }
}

