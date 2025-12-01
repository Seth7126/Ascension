package com.google.android.gms.internal.auth-api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;

final class zzp extends zzh {
    private ResultHolder zzaq;

    zzp(ResultHolder baseImplementation$ResultHolder0) {
        this.zzaq = baseImplementation$ResultHolder0;
    }

    @Override  // com.google.android.gms.internal.auth-api.zzh
    public final void zzd(Status status0) {
        this.zzaq.setResult(status0);
    }
}

