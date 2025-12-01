package com.androidnative.gms.listeners.games;

import android.util.Log;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult;
import com.unity3d.player.UnityPlayer;

public class ScoreSubmitedListner implements ResultCallback {
    private String _leaderboardId;

    public ScoreSubmitedListner(String s) {
        this._leaderboardId = s;
    }

    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((SubmitScoreResult)result0));
    }

    public void onResult(SubmitScoreResult leaderboards$SubmitScoreResult0) {
        int v = leaderboards$SubmitScoreResult0.getStatus().getStatusCode();
        Log.d("AndroidNative", "Status: " + v + " leaderboardId: " + this._leaderboardId);
        if(v == 0) {
            Log.d("AndroidNative", "New Score TIME_SPAN_ALL_TIME: " + leaderboards$SubmitScoreResult0.getScoreData().getScoreResult(2).rawScore);
            Log.d("AndroidNative", "New Score TIME_SPAN_WEEKLY: " + leaderboards$SubmitScoreResult0.getScoreData().getScoreResult(1).rawScore);
            Log.d("AndroidNative", "New Score TIME_SPAN_DAILY: " + leaderboards$SubmitScoreResult0.getScoreData().getScoreResult(0).rawScore);
        }
        UnityPlayer.UnitySendMessage("GooglePlayManager", "OnScoreSubmitted", v + "|" + this._leaderboardId);
    }
}

