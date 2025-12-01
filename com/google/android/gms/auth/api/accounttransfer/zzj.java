package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzz;

final class zzj extends zzc {
    private final zzab zzau;

    zzj(AccountTransferClient accountTransferClient0, zzab zzab0) {
        this.zzau = zzab0;
        super(null);
    }

    @Override  // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient$zzb
    protected final void zza(zzz zzz0) throws RemoteException {
        zzz0.zza(this.zzax, this.zzau);
    }
}

