package com.androidnative.gms.listeners.savedgames;

import com.androidnative.gms.core.GameClientManager;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult;
import com.unity3d.player.UnityPlayer;

public class SnapshotMetadataChangeListner implements ResultCallback {
    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((CommitSnapshotResult)result0));
    }

    public void onResult(CommitSnapshotResult snapshots$CommitSnapshotResult0) {
        SnapshotMetadata snapshotMetadata0 = snapshots$CommitSnapshotResult0.getSnapshotMetadata();
        if(snapshotMetadata0 != null) {
            GoogleApiClient googleApiClient0 = GameClientManager.API();
            Games.Snapshots.open(googleApiClient0, snapshotMetadata0).setResultCallback(new OpenSnapshotListner("OnSavedGameSaveResult"));
            return;
        }
        int v = snapshots$CommitSnapshotResult0.getStatus().getStatusCode();
        UnityPlayer.UnitySendMessage("GooglePlaySavedGamesManager", "OnSavedGameSaveResult", v);
    }
}

