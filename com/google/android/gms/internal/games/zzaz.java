package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.games.Games.GamesOptions;
import com.google.android.gms.games.GamesMetadataClient;
import com.google.android.gms.tasks.Task;

public final class zzaz extends zzac implements GamesMetadataClient {
    public zzaz(Activity activity0, GamesOptions games$GamesOptions0) {
        super(activity0, games$GamesOptions0);
    }

    public zzaz(Context context0, GamesOptions games$GamesOptions0) {
        super(context0, games$GamesOptions0);
    }

    @Override  // com.google.android.gms.games.GamesMetadataClient
    public final Task getCurrentGame() {
        return this.zza(zzay.zzev);
    }

    @Override  // com.google.android.gms.games.GamesMetadataClient
    public final Task loadGame() {
        return this.zza(zzbb.zzev);
    }
}

