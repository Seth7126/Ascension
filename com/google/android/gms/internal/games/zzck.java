package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.games.Games.GamesOptions;
import com.google.android.gms.games.PlayerStatsClient;
import com.google.android.gms.tasks.Task;

public final class zzck extends zzac implements PlayerStatsClient {
    public zzck(Activity activity0, GamesOptions games$GamesOptions0) {
        super(activity0, games$GamesOptions0);
    }

    public zzck(Context context0, GamesOptions games$GamesOptions0) {
        super(context0, games$GamesOptions0);
    }

    @Override  // com.google.android.gms.games.PlayerStatsClient
    public final Task loadPlayerStats(boolean z) {
        return this.zza(new zzcn(z));
    }
}

