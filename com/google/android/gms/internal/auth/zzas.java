package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;

final class zzas extends zzap {
    private final ProxyRequest zzce;

    zzas(zzar zzar0, GoogleApiClient googleApiClient0, ProxyRequest proxyRequest0) {
        this.zzce = proxyRequest0;
        super(googleApiClient0);
    }

    @Override  // com.google.android.gms.internal.auth.zzap
    protected final void zza(Context context0, zzan zzan0) throws RemoteException {
        zzan0.zza(new zzat(this), this.zzce);
    }
}

