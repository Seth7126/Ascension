package com.androidnative.gms.listeners.savedgames;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.androidnative.gms.core.GameClientManager;
import com.androidnative.gms.utils.Base64;
import com.androidnative.gms.utils.Base64DecoderException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult;
import com.unity3d.player.UnityPlayer;

public class SnapshotCreateListner implements ResultCallback {
    String _Data;
    String _ImageData;
    long _PlayedTime;
    String _description;
    String _name;

    public SnapshotCreateListner(String s, String s1, String s2, String s3, long v) {
        this._name = s;
        this._description = s1;
        this._ImageData = s2;
        this._Data = s3;
        this._PlayedTime = v;
    }

    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((OpenSnapshotResult)result0));
    }

    public void onResult(OpenSnapshotResult snapshots$OpenSnapshotResult0) {
        Snapshot snapshot0 = snapshots$OpenSnapshotResult0.getSnapshot();
        if(snapshots$OpenSnapshotResult0.getStatus().getStatusCode() == 0) {
            try {
                byte[] arr_b = Base64.decode(this._ImageData);
                Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
                snapshot0.getSnapshotContents().writeBytes(Base64.decode(this._Data));
                Builder snapshotMetadataChange$Builder0 = new Builder();
                snapshotMetadataChange$Builder0.setCoverImage(bitmap0).setDescription(this._description);
                long v = this._PlayedTime;
                if(v != 0L) {
                    snapshotMetadataChange$Builder0.setPlayedTimeMillis(v);
                }
                SnapshotMetadataChange snapshotMetadataChange0 = snapshotMetadataChange$Builder0.build();
                GoogleApiClient googleApiClient0 = GameClientManager.API();
                Games.Snapshots.commitAndClose(googleApiClient0, snapshot0, snapshotMetadataChange0).setResultCallback(new SnapshotMetadataChangeListner());
            }
            catch(Base64DecoderException base64DecoderException0) {
                base64DecoderException0.printStackTrace();
                Log.d("AndroidNative", "Failed to save snapshot: " + base64DecoderException0.getMessage());
                UnityPlayer.UnitySendMessage("GooglePlaySavedGamesManager", "OnSavedGameSaveResult", "1");
            }
            return;
        }
        if(snapshots$OpenSnapshotResult0.getStatus().getStatusCode() == 4004) {
            GameClientManager.GetInstance().snedConflict(snapshots$OpenSnapshotResult0);
            return;
        }
        int v1 = snapshots$OpenSnapshotResult0.getStatus().getStatusCode();
        UnityPlayer.UnitySendMessage("GooglePlaySavedGamesManager", "OnSavedGameSaveResult", v1);
    }
}

