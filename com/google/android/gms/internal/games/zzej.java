package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.stats.PlayerStats;
import com.google.android.gms.games.stats.Stats.LoadPlayerStatsResult;

final class zzej implements LoadPlayerStatsResult {
    private final Status zzfc;

    zzej(zzeg zzeg0, Status status0) {
        this.zzfc = status0;
        super();
    }

    @Override  // com.google.android.gms.games.stats.Stats$LoadPlayerStatsResult
    public final PlayerStats getPlayerStats() {
        return null;
    }

    @Override  // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzfc;
    }

    @Override  // com.google.android.gms.common.api.Releasable
    public final void release() {
    }
}

