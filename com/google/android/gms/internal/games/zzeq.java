package com.google.android.gms.internal.games;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.games.video.Videos.CaptureOverlayStateListener;
import com.google.android.gms.games.video.Videos;

public final class zzeq implements Videos {
    @Override  // com.google.android.gms.games.video.Videos
    public final PendingResult getCaptureCapabilities(GoogleApiClient googleApiClient0) {
        return googleApiClient0.enqueue(new zzet(this, googleApiClient0));
    }

    @Override  // com.google.android.gms.games.video.Videos
    public final Intent getCaptureOverlayIntent(GoogleApiClient googleApiClient0) {
        return Games.zza(googleApiClient0).zzay();
    }

    @Override  // com.google.android.gms.games.video.Videos
    public final PendingResult getCaptureState(GoogleApiClient googleApiClient0) {
        return googleApiClient0.enqueue(new zzes(this, googleApiClient0));
    }

    @Override  // com.google.android.gms.games.video.Videos
    public final PendingResult isCaptureAvailable(GoogleApiClient googleApiClient0, int v) {
        return googleApiClient0.enqueue(new zzev(this, googleApiClient0, v));
    }

    @Override  // com.google.android.gms.games.video.Videos
    public final boolean isCaptureSupported(GoogleApiClient googleApiClient0) {
        return Games.zza(googleApiClient0).zzba();
    }

    @Override  // com.google.android.gms.games.video.Videos
    public final void registerCaptureOverlayStateChangedListener(GoogleApiClient googleApiClient0, CaptureOverlayStateListener videos$CaptureOverlayStateListener0) {
        zzf zzf0 = Games.zza(googleApiClient0, false);
        if(zzf0 != null) {
            zzf0.zzb(googleApiClient0.registerListener(videos$CaptureOverlayStateListener0));
        }
    }

    @Override  // com.google.android.gms.games.video.Videos
    public final void unregisterCaptureOverlayStateChangedListener(GoogleApiClient googleApiClient0) {
        zzf zzf0 = Games.zza(googleApiClient0, false);
        if(zzf0 != null) {
            zzf0.zzbc();
        }
    }
}

