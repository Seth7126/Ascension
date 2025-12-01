package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.games.EventsClient;
import com.google.android.gms.games.Games.GamesOptions;
import com.google.android.gms.tasks.Task;

public final class zzae extends zzac implements EventsClient {
    public zzae(Activity activity0, GamesOptions games$GamesOptions0) {
        super(activity0, games$GamesOptions0);
    }

    public zzae(Context context0, GamesOptions games$GamesOptions0) {
        super(context0, games$GamesOptions0);
    }

    @Override  // com.google.android.gms.games.EventsClient
    public final void increment(String s, int v) {
        this.zzb(new zzaj(s, v));
    }

    @Override  // com.google.android.gms.games.EventsClient
    public final Task load(boolean z) {
        return this.zza(new zzah(z));
    }

    @Override  // com.google.android.gms.games.EventsClient
    public final Task loadByIds(boolean z, String[] arr_s) {
        return this.zza(new zzag(z, arr_s));
    }
}

