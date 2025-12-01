package com.androidnative.gms.listeners.savedgames;

import android.util.Log;
import com.androidnative.gms.core.GameClientManager;
import com.androidnative.gms.utils.Base64;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult;
import com.unity3d.player.UnityPlayer;
import java.io.IOException;

public class OpenSnapshotListner implements ResultCallback {
    private String _OpenEventName;

    public OpenSnapshotListner(String s) {
        this._OpenEventName = s;
    }

    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((OpenSnapshotResult)result0));
    }

    public void onResult(OpenSnapshotResult snapshots$OpenSnapshotResult0) {
        int v = snapshots$OpenSnapshotResult0.getStatus().getStatusCode();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v);
        if(v == 0) {
            try {
                Snapshot snapshot0 = snapshots$OpenSnapshotResult0.getSnapshot();
                stringBuilder0.append("|");
                stringBuilder0.append(snapshot0.getMetadata().getTitle());
                stringBuilder0.append("|");
                stringBuilder0.append(snapshot0.getMetadata().getLastModifiedTimestamp());
                stringBuilder0.append("|");
                stringBuilder0.append(snapshot0.getMetadata().getDescription());
                stringBuilder0.append("|");
                stringBuilder0.append(snapshot0.getMetadata().getCoverImageUrl());
                stringBuilder0.append("|");
                stringBuilder0.append(snapshot0.getMetadata().getPlayedTime());
                stringBuilder0.append("|");
                stringBuilder0.append(Base64.encode(snapshot0.getSnapshotContents().readFully()));
                UnityPlayer.UnitySendMessage("GooglePlaySavedGamesManager", this._OpenEventName, stringBuilder0.toString());
            }
            catch(IOException iOException0) {
                Log.d("AndroidNative", "GCM: OpenSnapshotListner onResult Exception:");
                iOException0.printStackTrace();
            }
        }
        if(v == 4004) {
            GameClientManager.GetInstance().snedConflict(snapshots$OpenSnapshotResult0);
        }
    }
}

