package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class zzax implements SpatulaHeaderResult {
    private Status mStatus;
    private String zzci;

    public zzax(@Nonnull Status status0) {
        this.mStatus = (Status)Preconditions.checkNotNull(status0);
    }

    public zzax(@Nonnull String s) {
        this.zzci = (String)Preconditions.checkNotNull(s);
        this.mStatus = Status.RESULT_SUCCESS;
    }

    @Override  // com.google.android.gms.auth.api.proxy.ProxyApi$SpatulaHeaderResult
    @Nullable
    public final String getSpatulaHeader() {
        return this.zzci;
    }

    @Override  // com.google.android.gms.common.api.Result
    @Nullable
    public final Status getStatus() {
        return this.mStatus;
    }
}

