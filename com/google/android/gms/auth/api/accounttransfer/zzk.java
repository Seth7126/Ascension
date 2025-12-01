package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzs;

final class zzk extends zzs {
    private final zzc zzay;

    zzk(zzc accountTransferClient$zzc0) {
        this.zzay = accountTransferClient$zzc0;
        super();
    }

    @Override  // com.google.android.gms.internal.auth.zzs
    public final void onFailure(Status status0) {
        this.zzay.zza(status0);
    }

    @Override  // com.google.android.gms.internal.auth.zzs
    public final void zzd() {
        this.zzay.setResult(null);
    }
}

