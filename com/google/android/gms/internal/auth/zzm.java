package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

final class zzm extends zzn {
    private final zzl zzag;

    zzm(zzl zzl0) {
        this.zzag = zzl0;
        super();
    }

    @Override  // com.google.android.gms.internal.auth.zzn
    public final void zza(boolean z) {
        this.zzag.setResult(new zzq((z ? Status.RESULT_SUCCESS : zzh.zzad)));
    }
}

