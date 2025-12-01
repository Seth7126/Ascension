package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzar;

public final class AuthProxy {
    public static final Api API;
    public static final ProxyApi ProxyApi;
    private static final ClientKey zzah;
    private static final AbstractClientBuilder zzai;

    static {
        ClientKey api$ClientKey0 = new ClientKey();
        AuthProxy.zzah = api$ClientKey0;
        zza zza0 = new zza();
        AuthProxy.zzai = zza0;
        AuthProxy.API = new Api("Auth.PROXY_API", zza0, api$ClientKey0);
        AuthProxy.ProxyApi = new zzar();
    }
}

