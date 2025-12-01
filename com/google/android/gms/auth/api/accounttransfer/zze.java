package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzad;
import com.google.android.gms.internal.auth.zzz;

final class zze extends zzb {
    private final zzad zzap;

    zze(AccountTransferClient accountTransferClient0, zzad zzad0) {
        this.zzap = zzad0;
        super(null);
    }

    @Override  // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient$zzb
    protected final void zza(zzz zzz0) throws RemoteException {
        zzz0.zza(new zzf(this, this), this.zzap);
    }
}

