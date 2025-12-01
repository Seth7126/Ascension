package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.games.video.VideoCapabilities;

final class zzi extends zzaq {
    zzi(ResultHolder baseImplementation$ResultHolder0) {
        super(baseImplementation$ResultHolder0);
    }

    @Override  // com.google.android.gms.games.internal.zza
    public final void zza(int v, VideoCapabilities videoCapabilities0) {
        this.setResult(new zze(new Status(v), videoCapabilities0));
    }
}

