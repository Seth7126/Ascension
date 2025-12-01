package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyResponse;

final class zzat extends zzaj {
    private final zzas zzcf;

    zzat(zzas zzas0) {
        this.zzcf = zzas0;
        super();
    }

    @Override  // com.google.android.gms.internal.auth.zzaj
    public final void zza(ProxyResponse proxyResponse0) {
        zzaw zzaw0 = new zzaw(proxyResponse0);
        this.zzcf.setResult(zzaw0);
    }
}

