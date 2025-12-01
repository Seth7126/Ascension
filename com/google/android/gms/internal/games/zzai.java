package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.zzf;

public final class zzai implements Events {
    @Override  // com.google.android.gms.games.event.Events
    public final void increment(GoogleApiClient googleApiClient0, String s, int v) {
        zzf zzf0 = Games.zzb(googleApiClient0, false);
        if(zzf0 == null) {
            return;
        }
        if(zzf0.isConnected()) {
            zzf0.zzb(s, v);
            return;
        }
        googleApiClient0.execute(new zzan(this, googleApiClient0, s, v));
    }

    @Override  // com.google.android.gms.games.event.Events
    public final PendingResult load(GoogleApiClient googleApiClient0, boolean z) {
        return googleApiClient0.enqueue(new zzak(this, googleApiClient0, z));
    }

    @Override  // com.google.android.gms.games.event.Events
    public final PendingResult loadByIds(GoogleApiClient googleApiClient0, boolean z, String[] arr_s) {
        return googleApiClient0.enqueue(new zzal(this, googleApiClient0, z, arr_s));
    }
}

