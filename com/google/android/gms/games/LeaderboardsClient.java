package com.google.android.gms.games;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.tasks.Task;

public interface LeaderboardsClient {
    public static class LeaderboardScores implements Releasable {
        private final Leaderboard zzay;
        private final LeaderboardScoreBuffer zzaz;

        public LeaderboardScores(Leaderboard leaderboard0, LeaderboardScoreBuffer leaderboardScoreBuffer0) {
            this.zzay = leaderboard0;
            this.zzaz = leaderboardScoreBuffer0;
        }

        public Leaderboard getLeaderboard() {
            return this.zzay;
        }

        public LeaderboardScoreBuffer getScores() {
            return this.zzaz;
        }

        @Override  // com.google.android.gms.common.api.Releasable
        public void release() {
            LeaderboardScoreBuffer leaderboardScoreBuffer0 = this.zzaz;
            if(leaderboardScoreBuffer0 != null) {
                leaderboardScoreBuffer0.release();
            }
        }
    }

    Task getAllLeaderboardsIntent();

    Task getLeaderboardIntent(String arg1);

    Task getLeaderboardIntent(String arg1, int arg2);

    Task getLeaderboardIntent(String arg1, int arg2, int arg3);

    Task loadCurrentPlayerLeaderboardScore(String arg1, int arg2, int arg3);

    Task loadLeaderboardMetadata(String arg1, boolean arg2);

    Task loadLeaderboardMetadata(boolean arg1);

    Task loadMoreScores(LeaderboardScoreBuffer arg1, int arg2, int arg3);

    Task loadPlayerCenteredScores(String arg1, int arg2, int arg3, int arg4);

    Task loadPlayerCenteredScores(String arg1, int arg2, int arg3, int arg4, boolean arg5);

    Task loadTopScores(String arg1, int arg2, int arg3, int arg4);

    Task loadTopScores(String arg1, int arg2, int arg3, int arg4, boolean arg5);

    void submitScore(String arg1, long arg2);

    void submitScore(String arg1, long arg2, String arg3);

    Task submitScoreImmediate(String arg1, long arg2);

    Task submitScoreImmediate(String arg1, long arg2, String arg3);
}

