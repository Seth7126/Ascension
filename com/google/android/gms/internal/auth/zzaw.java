package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

final class zzaw implements ProxyResult {
    private Status mStatus;
    private ProxyResponse zzch;

    public zzaw(ProxyResponse proxyResponse0) {
        this.zzch = proxyResponse0;
        this.mStatus = Status.RESULT_SUCCESS;
    }

    public zzaw(Status status0) {
        this.mStatus = status0;
    }

    @Override  // com.google.android.gms.auth.api.proxy.ProxyApi$ProxyResult
    public final ProxyResponse getResponse() {
        return this.zzch;
    }

    @Override  // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.mStatus;
    }
}

