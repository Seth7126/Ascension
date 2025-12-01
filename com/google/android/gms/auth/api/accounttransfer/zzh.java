package com.google.android.gms.auth.api.accounttransfer;

final class zzh extends zza {
    private final zzg zzas;

    zzh(zzg zzg0, zzb accountTransferClient$zzb0) {
        this.zzas = zzg0;
        super(accountTransferClient$zzb0);
    }

    @Override  // com.google.android.gms.internal.auth.zzs
    public final void zza(DeviceMetaData deviceMetaData0) {
        this.zzas.setResult(deviceMetaData0);
    }
}

