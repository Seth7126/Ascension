package com.androidnative.gms.listeners.requests;

import android.util.Log;
import com.androidnative.gms.core.GameClientManager;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.Requests.UpdateRequestsResult;
import com.unity3d.player.UnityPlayer;
import java.io.UnsupportedEncodingException;

public class AN_UpdateRequestsResultListner implements ResultCallback {
    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((Requests.UpdateRequestsResult)result0));
    }

    public void onResult(Requests.UpdateRequestsResult requests$UpdateRequestsResult0) {
        String s1;
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: requests$UpdateRequestsResult0.getRequestIds()) {
            String s = (String)object0;
            if(GameClientManager.gameRequestMap.containsKey(s) && requests$UpdateRequestsResult0.getRequestOutcome(s) == 0) {
                Log.d("AndroidNative", "accepted " + s);
                GameRequest gameRequest0 = (GameRequest)GameClientManager.gameRequestMap.get(s);
                stringBuilder0.append(gameRequest0.getRequestId());
                stringBuilder0.append("|");
                try {
                    s1 = new String(gameRequest0.getData(), "UTF-8");
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    unsupportedEncodingException0.printStackTrace();
                    s1 = "";
                }
                stringBuilder0.append(s1);
                stringBuilder0.append("|");
                stringBuilder0.append(gameRequest0.getExpirationTimestamp());
                stringBuilder0.append("|");
                stringBuilder0.append(gameRequest0.getCreationTimestamp());
                stringBuilder0.append("|");
                stringBuilder0.append(gameRequest0.getSender().getPlayerId());
                stringBuilder0.append("|");
                stringBuilder0.append(gameRequest0.getType());
                stringBuilder0.append("|");
            }
        }
        stringBuilder0.append("endofline");
        UnityPlayer.UnitySendMessage("GooglePlayManager", "OnGameRequestsAccepted", stringBuilder0.toString());
        Log.d("AndroidNative", "OnGameRequestsAccepted sent");
    }
}

