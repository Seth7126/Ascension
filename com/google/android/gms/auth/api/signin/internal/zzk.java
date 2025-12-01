package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

final class zzk extends zzd {
    private final zzl zzcj;

    zzk(zzl zzl0) {
        this.zzcj = zzl0;
        super();
    }

    @Override  // com.google.android.gms.auth.api.signin.internal.zzd
    public final void zze(Status status0) throws RemoteException {
        this.zzcj.setResult(status0);
    }
}

