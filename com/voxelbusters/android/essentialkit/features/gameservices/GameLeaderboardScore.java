package com.voxelbusters.android.essentialkit.features.gameservices;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.LeaderboardsClient;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.voxelbusters.android.essentialkit.utilities.Logger;
import java.util.Date;

public class GameLeaderboardScore {
    public static class Builder {
        private Context context;
        private String leaderboardId;
        private LeaderboardScore score;

        public Builder(Context context0, String s) {
            this.context = context0;
            this.leaderboardId = s;
        }

        GameLeaderboardScore build() {
            return new GameLeaderboardScore(this.context, this.leaderboardId, this.score, null);
        }

        Builder withScore(LeaderboardScore leaderboardScore0) {
            this.score = leaderboardScore0;
            return this;
        }
    }

    Context context;
    String leaderboardId;
    LeaderboardScore score;

    private GameLeaderboardScore(Context context0, String s, LeaderboardScore leaderboardScore0) {
        this.context = context0;
        this.leaderboardId = s;
        this.score = leaderboardScore0;
    }

    GameLeaderboardScore(Context context0, String s, LeaderboardScore leaderboardScore0, com.voxelbusters.android.essentialkit.features.gameservices.GameLeaderboardScore.1 gameLeaderboardScore$10) {
        this(context0, s, leaderboardScore0);
    }

    public Date getLastReportedDate() {
        return new Date(this.score.getTimestampMillis());
    }

    public String getLeaderboardId() {
        return this.leaderboardId;
    }

    public GamePlayer getPlayer() {
        return new com.voxelbusters.android.essentialkit.features.gameservices.GamePlayer.Builder(this.context).withPlayer(this.score.getScoreHolder()).build();
    }

    public long getRank() {
        return this.score.getRank();
    }

    public long getRawScore() {
        return this.score.getRawScore();
    }

    public void reportScore(long v, ISubmitScoreListener iGameServices$ISubmitScoreListener0) {
        LeaderboardsClient leaderboardsClient0 = Games.getLeaderboardsClient(this.context, GoogleSignIn.getLastSignedInAccount(this.context));
        if(iGameServices$ISubmitScoreListener0 == null) {
            leaderboardsClient0.submitScore(this.leaderboardId, v);
            return;
        }
        leaderboardsClient0.submitScoreImmediate(this.leaderboardId, v).addOnCompleteListener(((Activity)this.context), new OnCompleteListener() {
            @Override  // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task task0) {
                if(task0.isSuccessful()) {
                    Logger.debug(("Score Submitted - " + ((ScoreSubmissionData)task0.getResult()).toString()));
                    iGameServices$ISubmitScoreListener0.onSuccess();
                    return;
                }
                String s = task0.getException().getMessage();
                Logger.error(("Error Submitting Score : " + s));
                iGameServices$ISubmitScoreListener0.onFailure(s);
            }
        });
    }
}

