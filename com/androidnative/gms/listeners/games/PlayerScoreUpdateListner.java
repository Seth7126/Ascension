package com.androidnative.gms.listeners.games;

import android.util.Log;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult;
import com.unity3d.player.UnityPlayer;

public class PlayerScoreUpdateListner implements ResultCallback {
    private int _leaderboardCollection;
    private String _leaderboardId;
    private int _requestId;
    private int _span;

    public PlayerScoreUpdateListner(int v, int v1, String s, int v2) {
        this._span = v;
        this._leaderboardId = s;
        this._requestId = v2;
        this._leaderboardCollection = v1;
    }

    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((LoadPlayerScoreResult)result0));
    }

    public void onResult(LoadPlayerScoreResult leaderboards$LoadPlayerScoreResult0) {
        int v = leaderboards$LoadPlayerScoreResult0.getStatus().getStatusCode();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v);
        stringBuilder0.append("|");
        stringBuilder0.append(this._leaderboardId);
        stringBuilder0.append("|");
        stringBuilder0.append(this._requestId);
        if(v == 0) {
            stringBuilder0.append("|");
            stringBuilder0.append(this._span);
            stringBuilder0.append("|");
            stringBuilder0.append(this._leaderboardCollection);
            stringBuilder0.append("|");
            if(leaderboards$LoadPlayerScoreResult0.getScore() == null) {
                Log.d("AndroidNative", "No score: ");
                stringBuilder0.append("-1|-1|");
            }
            else {
                stringBuilder0.append(leaderboards$LoadPlayerScoreResult0.getScore().getRawScore());
                stringBuilder0.append("|");
                stringBuilder0.append(leaderboards$LoadPlayerScoreResult0.getScore().getRank());
                stringBuilder0.append("|");
                stringBuilder0.append((leaderboards$LoadPlayerScoreResult0.getScore().getScoreTag() == null ? "" : leaderboards$LoadPlayerScoreResult0.getScore().getScoreTag()));
            }
        }
        UnityPlayer.UnitySendMessage("GooglePlayManager", "OnPlayerScoreUpdated", stringBuilder0.toString());
    }
}

