package com.androidnative.gms.listeners.tbm;

import android.util.Log;
import com.androidnative.gms.network.TurnBasedMultiplayerController;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult;
import com.unity3d.player.UnityPlayer;

public class AN_OnUpdateMatchResult implements ResultCallback {
    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((TurnBasedMultiplayer.UpdateMatchResult)result0));
    }

    public void onResult(TurnBasedMultiplayer.UpdateMatchResult turnBasedMultiplayer$UpdateMatchResult0) {
        int v = turnBasedMultiplayer$UpdateMatchResult0.getStatus().getStatusCode();
        Log.d("AndroidNative", "AN_OnUpdateMatchResult  statusCode:" + v);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v);
        if(v == 0) {
            stringBuilder0.append("|");
            stringBuilder0.append(TurnBasedMultiplayerController.GetMatchString(turnBasedMultiplayer$UpdateMatchResult0.getMatch()));
        }
        UnityPlayer.UnitySendMessage("GooglePlayTBM", "OnUpdateMatchResult", stringBuilder0.toString());
    }
}

