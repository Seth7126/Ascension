package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.internal.auth.zzz;

final class zzd extends zzc {
    private final zzaf zzao;

    zzd(AccountTransferClient accountTransferClient0, zzaf zzaf0) {
        this.zzao = zzaf0;
        super(null);
    }

    @Override  // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient$zzb
    protected final void zza(zzz zzz0) throws RemoteException {
        zzz0.zza(this.zzax, this.zzao);
    }
}

