package com.google.android.gms.games.internal;

import com.google.android.gms.games.VideosClient.OnCaptureOverlayStateListener;

final class zzm implements zzar {
    private final int zzdr;

    zzm(int v) {
        this.zzdr = v;
    }

    @Override  // com.google.android.gms.games.internal.zzf$zzar
    public final void accept(Object object0) {
        ((OnCaptureOverlayStateListener)object0).onCaptureOverlayStateChanged(this.zzdr);
    }
}

