package com.androidnative.gms.listeners.tbm;

import android.util.Log;
import com.androidnative.gms.network.TurnBasedMultiplayerController;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult;
import com.unity3d.player.UnityPlayer;

public class AN_OnMatchInitiatedCallback implements ResultCallback {
    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((TurnBasedMultiplayer.InitiateMatchResult)result0));
    }

    public void onResult(TurnBasedMultiplayer.InitiateMatchResult turnBasedMultiplayer$InitiateMatchResult0) {
        int v = turnBasedMultiplayer$InitiateMatchResult0.getStatus().getStatusCode();
        Log.d("AndroidNative", "AN_OnMatchInitiatedCallback  statusCode:" + v);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v);
        if(v == 0) {
            stringBuilder0.append("|");
            stringBuilder0.append(TurnBasedMultiplayerController.GetMatchString(turnBasedMultiplayer$InitiateMatchResult0.getMatch()));
        }
        UnityPlayer.UnitySendMessage("GooglePlayTBM", "OnMatchInitiatedCallback", stringBuilder0.toString());
    }
}

