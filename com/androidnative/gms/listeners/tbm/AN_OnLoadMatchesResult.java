package com.androidnative.gms.listeners.tbm;

import android.util.Log;
import com.androidnative.gms.network.TurnBasedMultiplayerController;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult;
import com.unity3d.player.UnityPlayer;

public class AN_OnLoadMatchesResult implements ResultCallback {
    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((TurnBasedMultiplayer.LoadMatchesResult)result0));
    }

    public void onResult(TurnBasedMultiplayer.LoadMatchesResult turnBasedMultiplayer$LoadMatchesResult0) {
        int v = turnBasedMultiplayer$LoadMatchesResult0.getStatus().getStatusCode();
        Log.d("AndroidNative", "AN_OnLoadMatchesResult  statusCode:" + v);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v);
        if(v == 0) {
            stringBuilder0.append("|%|");
            if(turnBasedMultiplayer$LoadMatchesResult0.getMatches().getCompletedMatches() != null) {
                for(Object object0: turnBasedMultiplayer$LoadMatchesResult0.getMatches().getCompletedMatches()) {
                    stringBuilder0.append(TurnBasedMultiplayerController.GetMatchString(((TurnBasedMatch)object0)));
                    stringBuilder0.append("|%|");
                }
                turnBasedMultiplayer$LoadMatchesResult0.getMatches().getCompletedMatches().close();
            }
            if(turnBasedMultiplayer$LoadMatchesResult0.getMatches().getMyTurnMatches() != null) {
                for(Object object1: turnBasedMultiplayer$LoadMatchesResult0.getMatches().getMyTurnMatches()) {
                    stringBuilder0.append(TurnBasedMultiplayerController.GetMatchString(((TurnBasedMatch)object1)));
                    stringBuilder0.append("|%|");
                }
                turnBasedMultiplayer$LoadMatchesResult0.getMatches().getMyTurnMatches().close();
            }
            if(turnBasedMultiplayer$LoadMatchesResult0.getMatches().getTheirTurnMatches() != null) {
                for(Object object2: turnBasedMultiplayer$LoadMatchesResult0.getMatches().getTheirTurnMatches()) {
                    stringBuilder0.append(TurnBasedMultiplayerController.GetMatchString(((TurnBasedMatch)object2)));
                    stringBuilder0.append("|%|");
                }
                turnBasedMultiplayer$LoadMatchesResult0.getMatches().getTheirTurnMatches().close();
            }
            stringBuilder0.append("endofline");
        }
        UnityPlayer.UnitySendMessage("GooglePlayTBM", "OnLoadMatchesResult", stringBuilder0.toString());
    }
}

