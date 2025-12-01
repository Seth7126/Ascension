package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

final class zzm extends zzd {
    private final zzn zzck;

    zzm(zzn zzn0) {
        this.zzck = zzn0;
        super();
    }

    @Override  // com.google.android.gms.auth.api.signin.internal.zzd
    public final void zzf(Status status0) throws RemoteException {
        this.zzck.setResult(status0);
    }
}

