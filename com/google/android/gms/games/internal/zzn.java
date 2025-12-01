package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;

final class zzn extends zzw {
    zzn(ListenerHolder listenerHolder0) {
        super(listenerHolder0);
    }

    @Override  // com.google.android.gms.games.internal.zza
    public final void onCaptureOverlayStateChanged(int v) {
        this.zzc(new zzm(v));
    }
}

