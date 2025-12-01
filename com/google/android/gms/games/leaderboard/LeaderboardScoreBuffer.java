package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public class LeaderboardScoreBuffer extends AbstractDataBuffer {
    private final zza zzjv;

    public LeaderboardScoreBuffer(DataHolder dataHolder0) {
        super(dataHolder0);
        this.zzjv = new zza(dataHolder0.getMetadata());
    }

    public LeaderboardScore get(int v) {
        return new LeaderboardScoreRef(this.mDataHolder, v);
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public Object get(int v) {
        return this.get(v);
    }

    public final zza zzcf() {
        return this.zzjv;
    }
}

