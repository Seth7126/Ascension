package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.ClientSettings.Builder;
import com.google.android.gms.games.Games.GamesOptions;
import com.google.android.gms.games.Games;
import com.google.android.gms.tasks.Task;

public class zzac extends GoogleApi {
    public zzac(Activity activity0, GamesOptions games$GamesOptions0) {
        super(activity0, Games.API, games$GamesOptions0, Settings.DEFAULT_SETTINGS);
    }

    protected zzac(Context context0, GamesOptions games$GamesOptions0) {
        super(context0, Games.API, games$GamesOptions0, Settings.DEFAULT_SETTINGS);
    }

    @Override  // com.google.android.gms.common.api.GoogleApi
    protected Builder createClientSettingsBuilder() {
        Builder clientSettings$Builder0 = super.createClientSettingsBuilder();
        return this.getApiOptions() == null || ((GamesOptions)this.getApiOptions()).zzat == null ? clientSettings$Builder0 : clientSettings$Builder0.setRealClientPackageName(((GamesOptions)this.getApiOptions()).zzat);
    }

    protected final Task zza(RemoteCall remoteCall0) {
        return this.doRead(zzac.zzc(remoteCall0));
    }

    protected final Task zzb(RemoteCall remoteCall0) {
        return this.doWrite(zzac.zzc(remoteCall0));
    }

    private static TaskApiCall zzc(RemoteCall remoteCall0) {
        return TaskApiCall.builder().run(new zzaf(remoteCall0)).build();
    }
}

