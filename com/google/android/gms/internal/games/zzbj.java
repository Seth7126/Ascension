package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.games.Games.GamesOptions;
import com.google.android.gms.games.LeaderboardsClient;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.tasks.Task;

public final class zzbj extends zzac implements LeaderboardsClient {
    public zzbj(Activity activity0, GamesOptions games$GamesOptions0) {
        super(activity0, games$GamesOptions0);
    }

    public zzbj(Context context0, GamesOptions games$GamesOptions0) {
        super(context0, games$GamesOptions0);
    }

    @Override  // com.google.android.gms.games.LeaderboardsClient
    public final Task getAllLeaderboardsIntent() {
        return this.zza(zzbi.zzev);
    }

    @Override  // com.google.android.gms.games.LeaderboardsClient
    public final Task getLeaderboardIntent(String s) {
        return this.getLeaderboardIntent(s, -1);
    }

    @Override  // com.google.android.gms.games.LeaderboardsClient
    public final Task getLeaderboardIntent(String s, int v) {
        return this.getLeaderboardIntent(s, v, -1);
    }

    @Override  // com.google.android.gms.games.LeaderboardsClient
    public final Task getLeaderboardIntent(String s, int v, int v1) {
        return this.zza(new zzbl(s, v, v1));
    }

    @Override  // com.google.android.gms.games.LeaderboardsClient
    public final Task loadCurrentPlayerLeaderboardScore(String s, int v, int v1) {
        return this.zza(new zzbo(s, v, v1));
    }

    @Override  // com.google.android.gms.games.LeaderboardsClient
    public final Task loadLeaderboardMetadata(String s, boolean z) {
        return this.zza(new zzbp(s, z));
    }

    @Override  // com.google.android.gms.games.LeaderboardsClient
    public final Task loadLeaderboardMetadata(boolean z) {
        return this.zza(new zzbm(z));
    }

    @Override  // com.google.android.gms.games.LeaderboardsClient
    public final Task loadMoreScores(LeaderboardScoreBuffer leaderboardScoreBuffer0, int v, int v1) {
        return this.zza(new zzbt(leaderboardScoreBuffer0, v, v1));
    }

    @Override  // com.google.android.gms.games.LeaderboardsClient
    public final Task loadPlayerCenteredScores(String s, int v, int v1, int v2) {
        return this.loadPlayerCenteredScores(s, v, v1, v2, false);
    }

    @Override  // com.google.android.gms.games.LeaderboardsClient
    public final Task loadPlayerCenteredScores(String s, int v, int v1, int v2, boolean z) {
        return this.zza(new zzbq(s, v, v1, v2, z));
    }

    @Override  // com.google.android.gms.games.LeaderboardsClient
    public final Task loadTopScores(String s, int v, int v1, int v2) {
        return this.loadTopScores(s, v, v1, v2, false);
    }

    @Override  // com.google.android.gms.games.LeaderboardsClient
    public final Task loadTopScores(String s, int v, int v1, int v2, boolean z) {
        return this.zza(new zzbr(s, v, v1, v2, z));
    }

    @Override  // com.google.android.gms.games.LeaderboardsClient
    public final void submitScore(String s, long v) {
        this.zzb(new zzbs(s, v));
    }

    @Override  // com.google.android.gms.games.LeaderboardsClient
    public final void submitScore(String s, long v, String s1) {
        this.zzb(new zzbv(s, v, s1));
    }

    @Override  // com.google.android.gms.games.LeaderboardsClient
    public final Task submitScoreImmediate(String s, long v) {
        return this.zzb(new zzbk(s, v));
    }

    @Override  // com.google.android.gms.games.LeaderboardsClient
    public final Task submitScoreImmediate(String s, long v, String s1) {
        return this.zzb(new zzbn(s, v, s1));
    }
}

