package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbt implements RemoteCall {
    private final int zzey;
    private final int zzfl;
    private final LeaderboardScoreBuffer zzfq;

    zzbt(LeaderboardScoreBuffer leaderboardScoreBuffer0, int v, int v1) {
        this.zzfq = leaderboardScoreBuffer0;
        this.zzey = v;
        this.zzfl = v1;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((zzf)object0).zza(((TaskCompletionSource)object1), this.zzfq, this.zzey, this.zzfl);
    }
}

