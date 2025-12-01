package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzv;
import com.google.android.gms.internal.auth.zzz;

final class zzg extends zzb {
    private final zzv zzar;

    zzg(AccountTransferClient accountTransferClient0, zzv zzv0) {
        this.zzar = zzv0;
        super(null);
    }

    @Override  // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient$zzb
    protected final void zza(zzz zzz0) throws RemoteException {
        zzz0.zza(new zzh(this, this), this.zzar);
    }
}

