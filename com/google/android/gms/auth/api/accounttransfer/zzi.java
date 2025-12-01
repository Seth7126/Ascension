package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzah;
import com.google.android.gms.internal.auth.zzz;

final class zzi extends zzc {
    private final zzah zzat;

    zzi(AccountTransferClient accountTransferClient0, zzah zzah0) {
        this.zzat = zzah0;
        super(null);
    }

    @Override  // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient$zzb
    protected final void zza(zzz zzz0) throws RemoteException {
        zzz0.zza(this.zzax, this.zzat);
    }
}

