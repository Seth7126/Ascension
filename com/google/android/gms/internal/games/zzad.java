package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult;

final class zzad implements UpdateAchievementResult {
    private final Status zzfc;
    private final zzaa zzfd;

    zzad(zzaa zzaa0, Status status0) {
        this.zzfd = zzaa0;
        this.zzfc = status0;
        super();
    }

    @Override  // com.google.android.gms.games.achievement.Achievements$UpdateAchievementResult
    public final String getAchievementId() {
        return this.zzfd.zzfb;
    }

    @Override  // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzfc;
    }
}

