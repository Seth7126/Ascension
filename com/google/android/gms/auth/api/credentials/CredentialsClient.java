package com.google.android.gms.auth.api.credentials;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.internal.auth-api.zzr;
import com.google.android.gms.tasks.Task;

public class CredentialsClient extends GoogleApi {
    CredentialsClient(Activity activity0, AuthCredentialsOptions auth$AuthCredentialsOptions0) {
        ApiExceptionMapper apiExceptionMapper0 = new ApiExceptionMapper();
        super(activity0, Auth.CREDENTIALS_API, auth$AuthCredentialsOptions0, apiExceptionMapper0);
    }

    CredentialsClient(Context context0, AuthCredentialsOptions auth$AuthCredentialsOptions0) {
        ApiExceptionMapper apiExceptionMapper0 = new ApiExceptionMapper();
        super(context0, Auth.CREDENTIALS_API, auth$AuthCredentialsOptions0, apiExceptionMapper0);
    }

    public Task delete(Credential credential0) {
        GoogleApiClient googleApiClient0 = this.asGoogleApiClient();
        return PendingResultUtil.toVoidTask(Auth.CredentialsApi.delete(googleApiClient0, credential0));
    }

    public Task disableAutoSignIn() {
        GoogleApiClient googleApiClient0 = this.asGoogleApiClient();
        return PendingResultUtil.toVoidTask(Auth.CredentialsApi.disableAutoSignIn(googleApiClient0));
    }

    public PendingIntent getHintPickerIntent(HintRequest hintRequest0) {
        return zzr.zzc(this.getApplicationContext(), ((AuthCredentialsOptions)this.getApiOptions()), hintRequest0, ((AuthCredentialsOptions)this.getApiOptions()).getLogSessionId());
    }

    public Task request(CredentialRequest credentialRequest0) {
        GoogleApiClient googleApiClient0 = this.asGoogleApiClient();
        return PendingResultUtil.toResponseTask(Auth.CredentialsApi.request(googleApiClient0, credentialRequest0), new CredentialRequestResponse());
    }

    public Task save(Credential credential0) {
        GoogleApiClient googleApiClient0 = this.asGoogleApiClient();
        return PendingResultUtil.toVoidTask(Auth.CredentialsApi.save(googleApiClient0, credential0));
    }
}

