package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;

public final class zze implements GoogleSignInApi {
    @Override  // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final Intent getSignInIntent(GoogleApiClient googleApiClient0) {
        return zzg.zzc(googleApiClient0.getContext(), zze.zzc(googleApiClient0));
    }

    @Override  // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final GoogleSignInResult getSignInResultFromIntent(Intent intent0) {
        return zzg.getSignInResultFromIntent(intent0);
    }

    @Override  // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final PendingResult revokeAccess(GoogleApiClient googleApiClient0) {
        return zzg.zzd(googleApiClient0, googleApiClient0.getContext(), false);
    }

    @Override  // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final PendingResult signOut(GoogleApiClient googleApiClient0) {
        return zzg.zzc(googleApiClient0, googleApiClient0.getContext(), false);
    }

    @Override  // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final OptionalPendingResult silentSignIn(GoogleApiClient googleApiClient0) {
        return zzg.zzc(googleApiClient0, googleApiClient0.getContext(), zze.zzc(googleApiClient0), false);
    }

    private static GoogleSignInOptions zzc(GoogleApiClient googleApiClient0) {
        return ((zzh)googleApiClient0.getClient(Auth.zzh)).zzk();
    }
}

