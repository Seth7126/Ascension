package com.androidnative.gms.listeners.savedgames;

import com.androidnative.gms.core.GameClientManager;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult;
import com.unity3d.player.UnityPlayer;

public class DeleteSnapShotListner implements ResultCallback {
    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((OpenSnapshotResult)result0));
    }

    public void onResult(OpenSnapshotResult snapshots$OpenSnapshotResult0) {
        int v = snapshots$OpenSnapshotResult0.getStatus().getStatusCode();
        if(v == 0) {
            GoogleApiClient googleApiClient0 = GameClientManager.API();
            SnapshotMetadata snapshotMetadata0 = snapshots$OpenSnapshotResult0.getSnapshot().getMetadata();
            Games.Snapshots.delete(googleApiClient0, snapshotMetadata0).setResultCallback(new DeleteSpapShotResultListner());
            return;
        }
        UnityPlayer.UnitySendMessage("GooglePlaySavedGamesManager", "OnDeleteResult", v);
    }
}

