package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

public final class zzg implements CredentialRequestResult {
    private final Status mStatus;
    private final Credential zzam;

    public zzg(Status status0, Credential credential0) {
        this.mStatus = status0;
        this.zzam = credential0;
    }

    @Override  // com.google.android.gms.auth.api.credentials.CredentialRequestResult
    public final Credential getCredential() {
        return this.zzam;
    }

    @Override  // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.mStatus;
    }

    public static zzg zzc(Status status0) {
        return new zzg(status0, null);
    }
}

