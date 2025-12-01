package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.util.HashSet;

public final class zzg {
    private static Logger zzcb;

    static {
        zzg.zzcb = new Logger("GoogleSignInCommon", new String[0]);
    }

    public static GoogleSignInResult getSignInResultFromIntent(Intent intent0) {
        if(intent0 == null) {
            return new GoogleSignInResult(null, Status.RESULT_INTERNAL_ERROR);
        }
        Status status0 = (Status)intent0.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount0 = (GoogleSignInAccount)intent0.getParcelableExtra("googleSignInAccount");
        if(googleSignInAccount0 == null) {
            if(status0 == null) {
                status0 = Status.RESULT_INTERNAL_ERROR;
            }
            return new GoogleSignInResult(null, status0);
        }
        return new GoogleSignInResult(googleSignInAccount0, Status.RESULT_SUCCESS);
    }

    public static Intent zzc(Context context0, GoogleSignInOptions googleSignInOptions0) {
        zzg.zzcb.d("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration0 = new SignInConfiguration("com.playdekgames.android.Ascension", googleSignInOptions0);
        Intent intent0 = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent0.setPackage("com.playdekgames.android.Ascension");
        intent0.setClass(context0, SignInHubActivity.class);
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("config", signInConfiguration0);
        intent0.putExtra("config", bundle0);
        return intent0;
    }

    public static OptionalPendingResult zzc(GoogleApiClient googleApiClient0, Context context0, GoogleSignInOptions googleSignInOptions0, boolean z) {
        Result result0;
        boolean z1;
        zzg.zzcb.d("silentSignIn()", new Object[0]);
        zzg.zzcb.d("getEligibleSavedSignInResult()", new Object[0]);
        Preconditions.checkNotNull(googleSignInOptions0);
        GoogleSignInOptions googleSignInOptions1 = zzo.zzd(context0).zzm();
        if(googleSignInOptions1 == null) {
            result0 = null;
        }
        else {
            Account account0 = googleSignInOptions1.getAccount();
            Account account1 = googleSignInOptions0.getAccount();
            if(account0 != null) {
                z1 = account0.equals(account1);
            }
            else if(account1 == null) {
                z1 = true;
            }
            else {
                z1 = false;
            }
            if(!z1 || googleSignInOptions0.isServerAuthCodeRequested() || googleSignInOptions0.isIdTokenRequested() && (!googleSignInOptions1.isIdTokenRequested() || !Objects.equal(googleSignInOptions0.getServerClientId(), googleSignInOptions1.getServerClientId())) || !new HashSet(googleSignInOptions1.getScopes()).containsAll(new HashSet(googleSignInOptions0.getScopes()))) {
                result0 = null;
            }
            else {
                GoogleSignInAccount googleSignInAccount0 = zzo.zzd(context0).zzl();
                result0 = googleSignInAccount0 == null || googleSignInAccount0.isExpired() ? null : new GoogleSignInResult(googleSignInAccount0, Status.RESULT_SUCCESS);
            }
        }
        if(result0 != null) {
            zzg.zzcb.d("Eligible saved sign in result found", new Object[0]);
            return PendingResults.immediatePendingResult(result0, googleApiClient0);
        }
        if(z) {
            return PendingResults.immediatePendingResult(new GoogleSignInResult(null, new Status(4)), googleApiClient0);
        }
        zzg.zzcb.d("trySilentSignIn()", new Object[0]);
        return new OptionalPendingResultImpl(googleApiClient0.enqueue(new zzj(googleApiClient0, context0, googleSignInOptions0)));
    }

    public static PendingResult zzc(GoogleApiClient googleApiClient0, Context context0, boolean z) {
        zzg.zzcb.d("Signing out", new Object[0]);
        zzg.zzc(context0);
        return z ? PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, googleApiClient0) : googleApiClient0.execute(new zzl(googleApiClient0));
    }

    private static void zzc(Context context0) {
        zzo.zzd(context0).clear();
        for(Object object0: GoogleApiClient.getAllClients()) {
            ((GoogleApiClient)object0).maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
    }

    public static Intent zzd(Context context0, GoogleSignInOptions googleSignInOptions0) {
        zzg.zzcb.d("getFallbackSignInIntent()", new Object[0]);
        Intent intent0 = zzg.zzc(context0, googleSignInOptions0);
        intent0.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return intent0;
    }

    public static PendingResult zzd(GoogleApiClient googleApiClient0, Context context0, boolean z) {
        zzg.zzcb.d("Revoking access", new Object[0]);
        String s = Storage.getInstance(context0).getSavedRefreshToken();
        zzg.zzc(context0);
        return z ? zzc.zzf(s) : googleApiClient0.execute(new zzn(googleApiClient0));
    }

    public static Intent zze(Context context0, GoogleSignInOptions googleSignInOptions0) {
        zzg.zzcb.d("getNoImplementationSignInIntent()", new Object[0]);
        Intent intent0 = zzg.zzc(context0, googleSignInOptions0);
        intent0.setAction("com.google.android.gms.auth.NO_IMPL");
        return intent0;
    }
}

