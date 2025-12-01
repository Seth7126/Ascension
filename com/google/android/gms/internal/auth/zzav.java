package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult;
import com.google.android.gms.common.api.Status;

final class zzav extends zzaj {
    private final zzau zzcg;

    zzav(zzau zzau0) {
        this.zzcg = zzau0;
        super();
    }

    @Override  // com.google.android.gms.internal.auth.zzaj
    public final void zzb(String s) {
        if(s != null) {
            zzax zzax0 = new zzax(s);
            this.zzcg.setResult(zzax0);
            return;
        }
        SpatulaHeaderResult proxyApi$SpatulaHeaderResult0 = zzau.zzc(new Status(3006));
        this.zzcg.setResult(proxyApi$SpatulaHeaderResult0);
    }
}

