package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Preconditions;

public final class zzj implements CredentialsApi {
    @Override  // com.google.android.gms.auth.api.credentials.CredentialsApi
    public final PendingResult delete(GoogleApiClient googleApiClient0, Credential credential0) {
        Preconditions.checkNotNull(googleApiClient0, "client must not be null");
        Preconditions.checkNotNull(credential0, "credential must not be null");
        return googleApiClient0.execute(new zzn(this, googleApiClient0, credential0));
    }

    @Override  // com.google.android.gms.auth.api.credentials.CredentialsApi
    public final PendingResult disableAutoSignIn(GoogleApiClient googleApiClient0) {
        Preconditions.checkNotNull(googleApiClient0, "client must not be null");
        return googleApiClient0.execute(new zzm(this, googleApiClient0));
    }

    @Override  // com.google.android.gms.auth.api.credentials.CredentialsApi
    public final PendingIntent getHintPickerIntent(GoogleApiClient googleApiClient0, HintRequest hintRequest0) {
        Preconditions.checkNotNull(googleApiClient0, "client must not be null");
        Preconditions.checkNotNull(hintRequest0, "request must not be null");
        AuthCredentialsOptions auth$AuthCredentialsOptions0 = ((zzq)googleApiClient0.getClient(Auth.zzg)).zzf();
        return zzr.zzc(googleApiClient0.getContext(), auth$AuthCredentialsOptions0, hintRequest0, auth$AuthCredentialsOptions0.getLogSessionId());
    }

    @Override  // com.google.android.gms.auth.api.credentials.CredentialsApi
    public final PendingResult request(GoogleApiClient googleApiClient0, CredentialRequest credentialRequest0) {
        Preconditions.checkNotNull(googleApiClient0, "client must not be null");
        Preconditions.checkNotNull(credentialRequest0, "request must not be null");
        return googleApiClient0.enqueue(new zzi(this, googleApiClient0, credentialRequest0));
    }

    @Override  // com.google.android.gms.auth.api.credentials.CredentialsApi
    public final PendingResult save(GoogleApiClient googleApiClient0, Credential credential0) {
        Preconditions.checkNotNull(googleApiClient0, "client must not be null");
        Preconditions.checkNotNull(credential0, "credential must not be null");
        return googleApiClient0.execute(new zzk(this, googleApiClient0, credential0));
    }
}

