package com.google.android.gms.auth.api.accounttransfer;

final class zzf extends zza {
    private final zze zzaq;

    zzf(zze zze0, zzb accountTransferClient$zzb0) {
        this.zzaq = zze0;
        super(accountTransferClient$zzb0);
    }

    @Override  // com.google.android.gms.internal.auth.zzs
    public final void zza(byte[] arr_b) {
        this.zzaq.setResult(arr_b);
    }
}

