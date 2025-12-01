package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;

final class zzca extends zzcg {
    private final int zzfu;
    private final LeaderboardScoreBuffer zzfv;
    private final int zzfw;

    zzca(zzbu zzbu0, GoogleApiClient googleApiClient0, LeaderboardScoreBuffer leaderboardScoreBuffer0, int v, int v1) {
        this.zzfv = leaderboardScoreBuffer0;
        this.zzfu = v;
        this.zzfw = v1;
        super(googleApiClient0, null);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    protected final void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        ((zzf)api$AnyClient0).zza(this, this.zzfv, this.zzfu, this.zzfw);
    }
}

