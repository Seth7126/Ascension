package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.gms.games.Games.GamesOptions;
import com.google.android.gms.games.GamesClient;
import com.google.android.gms.tasks.Task;

public final class zzaq extends zzac implements GamesClient {
    public zzaq(Activity activity0, GamesOptions games$GamesOptions0) {
        super(activity0, games$GamesOptions0);
    }

    public zzaq(Context context0, GamesOptions games$GamesOptions0) {
        super(context0, games$GamesOptions0);
    }

    @Override  // com.google.android.gms.games.GamesClient
    public final Task getActivationHint() {
        return this.doRead(new zzaw(this));
    }

    @Override  // com.google.android.gms.games.GamesClient
    public final Task getAppId() {
        return this.zza(zzau.zzev);
    }

    @Override  // com.google.android.gms.games.GamesClient
    public final Task getCurrentAccountName() {
        return this.zza(zzav.zzev);
    }

    @Override  // com.google.android.gms.games.GamesClient
    public final Task getSettingsIntent() {
        return this.zza(zzax.zzev);
    }

    @Override  // com.google.android.gms.games.GamesClient
    public final Task setGravityForPopups(int v) {
        return this.zzb(new zzat(v));
    }

    @Override  // com.google.android.gms.games.GamesClient
    public final Task setViewForPopups(View view0) {
        return this.zzb(new zzas(view0));
    }
}

