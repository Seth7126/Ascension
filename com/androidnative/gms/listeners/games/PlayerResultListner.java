package com.androidnative.gms.listeners.games;

import android.util.Log;
import com.androidnative.gms.core.GameClientManager;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.Players.LoadPlayersResult;
import com.unity3d.player.UnityPlayer;

public class PlayerResultListner implements ResultCallback {
    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((LoadPlayersResult)result0));
    }

    public void onResult(LoadPlayersResult players$LoadPlayersResult0) {
        int v = players$LoadPlayersResult0.getStatus().getStatusCode();
        Log.d("AndroidNative", "[PlayerResultListner] onResult " + v);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v);
        if(v == 0) {
            stringBuilder0.append("|");
            for(Object object0: players$LoadPlayersResult0.getPlayers()) {
                GameClientManager.addLoadedPlayerId(((Player)object0).getPlayerId());
                stringBuilder0.append(((Player)object0).getPlayerId());
                stringBuilder0.append("|");
                stringBuilder0.append(((Player)object0).getDisplayName());
                stringBuilder0.append("|");
                stringBuilder0.append(((Player)object0).getIconImageUrl());
                stringBuilder0.append("|");
                stringBuilder0.append(((Player)object0).getHiResImageUrl());
                stringBuilder0.append("|");
                if(((Player)object0).hasIconImage()) {
                    stringBuilder0.append(1);
                }
                else {
                    stringBuilder0.append(0);
                }
                stringBuilder0.append("|");
                if(((Player)object0).hasHiResImage()) {
                    stringBuilder0.append(1);
                }
                else {
                    stringBuilder0.append(0);
                }
                stringBuilder0.append("|");
            }
            players$LoadPlayersResult0.getPlayers().close();
            stringBuilder0.append("endofline");
        }
        UnityPlayer.UnitySendMessage("GooglePlayManager", "OnPlayersLoaded", stringBuilder0.toString());
    }
}

