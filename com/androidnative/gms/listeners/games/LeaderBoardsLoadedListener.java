package com.androidnative.gms.listeners.games;

import android.util.Log;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardVariant;
import com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult;
import com.unity3d.player.UnityPlayer;

public class LeaderBoardsLoadedListener implements ResultCallback {
    @Override  // com.google.android.gms.common.api.ResultCallback
    public void onResult(Result result0) {
        this.onResult(((LeaderboardMetadataResult)result0));
    }

    public void onResult(LeaderboardMetadataResult leaderboards$LeaderboardMetadataResult0) {
        int v = leaderboards$LeaderboardMetadataResult0.getStatus().getStatusCode();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v);
        Log.d("AndroidNative", "Leaderboards loaded");
        if(v == 0) {
            stringBuilder0.append("|");
            for(Object object0: leaderboards$LeaderboardMetadataResult0.getLeaderboards()) {
                stringBuilder0.append(((Leaderboard)object0).getLeaderboardId());
                stringBuilder0.append("|");
                stringBuilder0.append(((Leaderboard)object0).getDisplayName());
                stringBuilder0.append("|");
                Log.d("AndroidNative", "Leaderbaed info: " + ((Leaderboard)object0).getDisplayName());
                for(Object object1: ((Leaderboard)object0).getVariants()) {
                    LeaderboardVariant leaderboardVariant0 = (LeaderboardVariant)object1;
                    stringBuilder0.append(leaderboardVariant0.getRawPlayerScore());
                    stringBuilder0.append("|");
                    stringBuilder0.append(leaderboardVariant0.getPlayerRank());
                    stringBuilder0.append("|");
                    stringBuilder0.append(leaderboardVariant0.getTimeSpan());
                    stringBuilder0.append("|");
                    stringBuilder0.append(leaderboardVariant0.getCollection());
                    stringBuilder0.append("|");
                    stringBuilder0.append((leaderboardVariant0.getPlayerScoreTag() == null ? "" : leaderboardVariant0.getPlayerScoreTag()));
                    stringBuilder0.append("|");
                    Log.d("AndroidNative", "Time span: " + leaderboardVariant0.getTimeSpan() + " Collection:" + leaderboardVariant0.getCollection() + " Score: " + leaderboardVariant0.getRawPlayerScore());
                }
            }
            leaderboards$LeaderboardMetadataResult0.getLeaderboards().close();
            stringBuilder0.append("endofline");
        }
        UnityPlayer.UnitySendMessage("GooglePlayManager", "OnLeaderboardDataLoaded", stringBuilder0.toString());
    }
}

