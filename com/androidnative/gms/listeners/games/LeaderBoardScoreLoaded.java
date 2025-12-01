package com.androidnative.gms.listeners.games;

import android.util.Log;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult;
import com.unity3d.player.UnityPlayer;
import java.util.Iterator;

public class LeaderBoardScoreLoaded implements ResultCallback {
    private int _leaderboardCollection;
    private String _leaderboardId;
    private int _span;

    public LeaderBoardScoreLoaded(int v, int v1, String s) {
        this._span = v;
        this._leaderboardId = s;
        this._leaderboardCollection = v1;
    }

    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((LoadScoresResult)result0));
    }

    public void onResult(LoadScoresResult leaderboards$LoadScoresResult0) {
        int v = leaderboards$LoadScoresResult0.getStatus().getStatusCode();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v);
        if(v == 0) {
            Log.d("AndroidNative", "loadScores  onResult");
            Log.d("AndroidNative", leaderboards$LoadScoresResult0.getLeaderboard().getDisplayName());
            stringBuilder0.append("|");
            stringBuilder0.append(this._span);
            stringBuilder0.append("|");
            stringBuilder0.append(this._leaderboardCollection);
            stringBuilder0.append("|");
            stringBuilder0.append(this._leaderboardId);
            stringBuilder0.append("|");
            stringBuilder0.append(leaderboards$LoadScoresResult0.getLeaderboard().getDisplayName());
            stringBuilder0.append("|");
            Iterator iterator0 = leaderboards$LoadScoresResult0.getScores().iterator();
            Log.d("AndroidNative", "Scores count: " + leaderboards$LoadScoresResult0.getScores().getCount());
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                LeaderboardScore leaderboardScore0 = (LeaderboardScore)object0;
                Log.d("AndroidNative", leaderboardScore0.getRank() + "/" + leaderboardScore0.getRawScore());
                stringBuilder0.append(leaderboardScore0.getRawScore());
                stringBuilder0.append("|");
                stringBuilder0.append(leaderboardScore0.getRank());
                stringBuilder0.append("|");
                stringBuilder0.append(leaderboardScore0.getScoreHolder().getPlayerId());
                stringBuilder0.append("|");
                stringBuilder0.append(leaderboardScore0.getScoreHolder().getDisplayName());
                stringBuilder0.append("|");
                stringBuilder0.append(leaderboardScore0.getScoreHolder().getHiResImageUrl());
                stringBuilder0.append("|");
                stringBuilder0.append(leaderboardScore0.getScoreHolder().getIconImageUrl());
                stringBuilder0.append("|");
                if(leaderboardScore0.getScoreHolder().hasIconImage()) {
                    stringBuilder0.append(1);
                }
                else {
                    stringBuilder0.append(0);
                }
                stringBuilder0.append("|");
                if(leaderboardScore0.getScoreHolder().hasHiResImage()) {
                    stringBuilder0.append(1);
                }
                else {
                    stringBuilder0.append(0);
                }
                stringBuilder0.append("|");
                stringBuilder0.append((leaderboardScore0.getScoreTag() == null ? "" : leaderboardScore0.getScoreTag()));
                stringBuilder0.append("|");
            }
            leaderboards$LoadScoresResult0.getScores().close();
            stringBuilder0.append("endofline");
        }
        else {
            Log.d("AndroidNative", "statusCode: " + v);
        }
        UnityPlayer.UnitySendMessage("GooglePlayManager", "OnScoreDataRecevied", stringBuilder0.toString());
    }
}

