package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

final class zzl extends zzh {
    private final zzi zzap;

    zzl(zzi zzi0) {
        this.zzap = zzi0;
        super();
    }

    @Override  // com.google.android.gms.internal.auth-api.zzh
    public final void zzc(Status status0, Credential credential0) {
        zzg zzg0 = new zzg(status0, credential0);
        this.zzap.setResult(zzg0);
    }

    @Override  // com.google.android.gms.internal.auth-api.zzh
    public final void zzd(Status status0) {
        zzg zzg0 = zzg.zzc(status0);
        this.zzap.setResult(zzg0);
    }
}

