package com.androidnative.gms.listeners.tbm;

import android.util.Log;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult;
import com.unity3d.player.UnityPlayer;

public class AN_OnCancelMatchResult implements ResultCallback {
    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((TurnBasedMultiplayer.CancelMatchResult)result0));
    }

    public void onResult(TurnBasedMultiplayer.CancelMatchResult turnBasedMultiplayer$CancelMatchResult0) {
        int v = turnBasedMultiplayer$CancelMatchResult0.getStatus().getStatusCode();
        Log.d("AndroidNative", "AN_OnCancelMatchResult  statusCode:" + v);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v);
        if(v == 0) {
            stringBuilder0.append("|");
            stringBuilder0.append(turnBasedMultiplayer$CancelMatchResult0.getMatchId());
        }
        UnityPlayer.UnitySendMessage("GooglePlayTBM", "OnCancelMatchResult", stringBuilder0.toString());
    }
}

