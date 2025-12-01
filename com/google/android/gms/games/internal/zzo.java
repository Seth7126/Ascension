package com.google.android.gms.games.internal;

import com.google.android.gms.games.video.Videos.CaptureOverlayStateListener;

final class zzo implements zzar {
    private final int zzdr;

    zzo(int v) {
        this.zzdr = v;
    }

    @Override  // com.google.android.gms.games.internal.zzf$zzar
    public final void accept(Object object0) {
        ((CaptureOverlayStateListener)object0).onCaptureOverlayStateChanged(this.zzdr);
    }
}

