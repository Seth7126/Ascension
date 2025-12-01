package com.google.android.gms.internal.games;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.games.internal.zzz;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards;

public final class zzbu implements Leaderboards {
    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public final Intent getAllLeaderboardsIntent(GoogleApiClient googleApiClient0) {
        return Games.zza(googleApiClient0).zzap();
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public final Intent getLeaderboardIntent(GoogleApiClient googleApiClient0, String s) {
        return this.getLeaderboardIntent(googleApiClient0, s, -1);
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public final Intent getLeaderboardIntent(GoogleApiClient googleApiClient0, String s, int v) {
        return this.getLeaderboardIntent(googleApiClient0, s, v, -1);
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public final Intent getLeaderboardIntent(GoogleApiClient googleApiClient0, String s, int v, int v1) {
        return Games.zza(googleApiClient0).zza(s, v, v1);
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult loadCurrentPlayerLeaderboardScore(GoogleApiClient googleApiClient0, String s, int v, int v1) {
        return googleApiClient0.enqueue(new zzbz(this, googleApiClient0, s, v, v1));
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult loadLeaderboardMetadata(GoogleApiClient googleApiClient0, String s, boolean z) {
        return googleApiClient0.enqueue(new zzbw(this, googleApiClient0, s, z));
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult loadLeaderboardMetadata(GoogleApiClient googleApiClient0, boolean z) {
        return googleApiClient0.enqueue(new zzbx(this, googleApiClient0, z));
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult loadMoreScores(GoogleApiClient googleApiClient0, LeaderboardScoreBuffer leaderboardScoreBuffer0, int v, int v1) {
        return googleApiClient0.enqueue(new zzca(this, googleApiClient0, leaderboardScoreBuffer0, v, v1));
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult loadPlayerCenteredScores(GoogleApiClient googleApiClient0, String s, int v, int v1, int v2) {
        return this.loadPlayerCenteredScores(googleApiClient0, s, v, v1, v2, false);
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult loadPlayerCenteredScores(GoogleApiClient googleApiClient0, String s, int v, int v1, int v2, boolean z) {
        return googleApiClient0.enqueue(new zzcb(this, googleApiClient0, s, v, v1, v2, z));
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult loadTopScores(GoogleApiClient googleApiClient0, String s, int v, int v1, int v2) {
        return this.loadTopScores(googleApiClient0, s, v, v1, v2, false);
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult loadTopScores(GoogleApiClient googleApiClient0, String s, int v, int v1, int v2, boolean z) {
        return googleApiClient0.enqueue(new zzby(this, googleApiClient0, s, v, v1, v2, z));
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public final void submitScore(GoogleApiClient googleApiClient0, String s, long v) {
        this.submitScore(googleApiClient0, s, v, null);
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public final void submitScore(GoogleApiClient googleApiClient0, String s, long v, String s1) {
        zzf zzf0 = Games.zza(googleApiClient0, false);
        if(zzf0 != null) {
            try {
                zzf0.zza(null, s, v, s1);
            }
            catch(RemoteException unused_ex) {
                zzz.w("LeaderboardsImpl", "service died");
            }
        }
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult submitScoreImmediate(GoogleApiClient googleApiClient0, String s, long v) {
        return this.submitScoreImmediate(googleApiClient0, s, v, null);
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult submitScoreImmediate(GoogleApiClient googleApiClient0, String s, long v, String s1) {
        return googleApiClient0.execute(new zzcd(this, googleApiClient0, s, v, s1));
    }
}

