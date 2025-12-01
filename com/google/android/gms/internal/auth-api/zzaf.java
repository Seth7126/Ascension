package com.google.android.gms.internal.auth-api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.SignInOptions.Builder;
import com.google.android.gms.auth.api.identity.SignInOptions;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.tasks.Task;

public final class zzaf extends GoogleApi implements SignInClient {
    private static final Api API;
    private static final ClientKey CLIENT_KEY;
    private static final AbstractClientBuilder zzbm;

    static {
        ClientKey api$ClientKey0 = new ClientKey();
        zzaf.CLIENT_KEY = api$ClientKey0;
        zzag zzag0 = new zzag();
        zzaf.zzbm = zzag0;
        zzaf.API = new Api("Auth.Api.Identity.SignIn.API", zzag0, api$ClientKey0);
    }

    public zzaf(Activity activity0, SignInOptions signInOptions0) {
        SignInOptions signInOptions1 = Builder.zzc(signInOptions0).zze("9qbApC1rA9uQdEJ4YE3iDQ").build();
        super(activity0, zzaf.API, signInOptions1, Settings.DEFAULT_SETTINGS);
    }

    public zzaf(Context context0, SignInOptions signInOptions0) {
        SignInOptions signInOptions1 = Builder.zzc(signInOptions0).zze("F0APOVowrPACun04ECzXAQ").build();
        super(context0, zzaf.API, signInOptions1, Settings.DEFAULT_SETTINGS);
    }

    @Override  // com.google.android.gms.auth.api.identity.SignInClient
    public final Task beginSignIn(BeginSignInRequest beginSignInRequest0) {
        BeginSignInRequest beginSignInRequest1 = BeginSignInRequest.zzc(beginSignInRequest0).zzd(((SignInOptions)this.getApiOptions()).zzg()).build();
        return this.doRead(TaskApiCall.builder().setFeatures(new Feature[]{zzam.zzcz}).run(new zzae(this, beginSignInRequest1)).setAutoResolveMissingFeatures(false).build());
    }

    @Override  // com.google.android.gms.auth.api.identity.SignInClient
    public final SignInCredential getSignInCredentialFromIntent(Intent intent0) throws ApiException {
        if(intent0 == null) {
            throw new ApiException(Status.RESULT_INTERNAL_ERROR);
        }
        Status status0 = (Status)SafeParcelableSerializer.deserializeFromIntentExtra(intent0, "status", Status.CREATOR);
        if(status0 == null) {
            throw new ApiException(Status.RESULT_CANCELED);
        }
        if(!status0.isSuccess()) {
            throw new ApiException(status0);
        }
        SignInCredential signInCredential0 = (SignInCredential)SafeParcelableSerializer.deserializeFromIntentExtra(intent0, "sign_in_credential", SignInCredential.CREATOR);
        if(signInCredential0 == null) {
            throw new ApiException(Status.RESULT_INTERNAL_ERROR);
        }
        return signInCredential0;
    }

    @Override  // com.google.android.gms.auth.api.identity.SignInClient
    public final Task signOut() {
        this.getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        for(Object object0: GoogleApiClient.getAllClients()) {
            ((GoogleApiClient)object0).maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
        return this.doRead(TaskApiCall.builder().setFeatures(new Feature[]{zzam.zzda}).run(new zzah(this)).setAutoResolveMissingFeatures(false).build());
    }
}

