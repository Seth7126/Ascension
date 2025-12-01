package com.androidnative.gms.listeners.tbm;

import android.util.Log;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult;
import com.unity3d.player.UnityPlayer;

public class AN_OnLeaveMatchResult implements ResultCallback {
    private String _MatchId;

    public AN_OnLeaveMatchResult(String s) {
        this._MatchId = s;
    }

    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((TurnBasedMultiplayer.LeaveMatchResult)result0));
    }

    public void onResult(TurnBasedMultiplayer.LeaveMatchResult turnBasedMultiplayer$LeaveMatchResult0) {
        int v = turnBasedMultiplayer$LeaveMatchResult0.getStatus().getStatusCode();
        Log.d("AndroidNative", "AN_OnLeaveMatchResult  statusCode:" + v);
        UnityPlayer.UnitySendMessage("GooglePlayTBM", "OnLeaveMatchResult", v + "|" + this._MatchId);
    }
}

