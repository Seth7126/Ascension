package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;

final class zzcl implements SubmitScoreResult {
    private final Status zzfc;

    zzcl(zzci zzci0, Status status0) {
        this.zzfc = status0;
        super();
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards$SubmitScoreResult
    public final ScoreSubmissionData getScoreData() {
        return new ScoreSubmissionData(DataHolder.empty(14));
    }

    @Override  // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzfc;
    }

    @Override  // com.google.android.gms.common.api.Releasable
    public final void release() {
    }
}

