package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil.ResultConverter;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

public class GoogleSignInClient extends GoogleApi {
    static final class zzc implements ResultConverter {
        private zzc() {
        }

        zzc(com.google.android.gms.auth.api.signin.zzc zzc0) {
        }

        @Override  // com.google.android.gms.common.internal.PendingResultUtil$ResultConverter
        public final Object convert(Result result0) {
            return ((GoogleSignInResult)result0).getSignInAccount();
        }
    }

    static final class zzd {
        public static final enum int zzbt = 1;
        public static final enum int zzbu = 2;
        public static final enum int zzbv = 3;
        public static final enum int zzbw = 4;
        private static final int[] zzbx;

        static {
            zzd.zzbx = new int[]{1, 2, 3, 4};
        }

        public static int[] zzi() {
            return (int[])zzd.zzbx.clone();
        }
    }

    private static final zzc zzbp;
    private static int zzbq;

    static {
        GoogleSignInClient.zzbp = new zzc(null);
        GoogleSignInClient.zzbq = zzd.zzbt;
    }

    GoogleSignInClient(Activity activity0, GoogleSignInOptions googleSignInOptions0) {
        ApiExceptionMapper apiExceptionMapper0 = new ApiExceptionMapper();
        super(activity0, Auth.GOOGLE_SIGN_IN_API, googleSignInOptions0, apiExceptionMapper0);
    }

    GoogleSignInClient(Context context0, GoogleSignInOptions googleSignInOptions0) {
        ApiExceptionMapper apiExceptionMapper0 = new ApiExceptionMapper();
        super(context0, Auth.GOOGLE_SIGN_IN_API, googleSignInOptions0, apiExceptionMapper0);
    }

    public Intent getSignInIntent() {
        Context context0 = this.getApplicationContext();
        switch(com.google.android.gms.auth.api.signin.zzc.zzbr[this.zzh() - 1]) {
            case 1: {
                return zzg.zzd(context0, ((GoogleSignInOptions)this.getApiOptions()));
            }
            case 2: {
                return zzg.zzc(context0, ((GoogleSignInOptions)this.getApiOptions()));
            }
            default: {
                return zzg.zze(context0, ((GoogleSignInOptions)this.getApiOptions()));
            }
        }
    }

    public Task revokeAccess() {
        GoogleApiClient googleApiClient0 = this.asGoogleApiClient();
        Context context0 = this.getApplicationContext();
        return this.zzh() == zzd.zzbv ? PendingResultUtil.toVoidTask(zzg.zzd(googleApiClient0, context0, true)) : PendingResultUtil.toVoidTask(zzg.zzd(googleApiClient0, context0, false));
    }

    public Task signOut() {
        GoogleApiClient googleApiClient0 = this.asGoogleApiClient();
        Context context0 = this.getApplicationContext();
        return this.zzh() == zzd.zzbv ? PendingResultUtil.toVoidTask(zzg.zzc(googleApiClient0, context0, true)) : PendingResultUtil.toVoidTask(zzg.zzc(googleApiClient0, context0, false));
    }

    public Task silentSignIn() {
        GoogleApiClient googleApiClient0 = this.asGoogleApiClient();
        Context context0 = this.getApplicationContext();
        GoogleSignInOptions googleSignInOptions0 = (GoogleSignInOptions)this.getApiOptions();
        return this.zzh() == zzd.zzbv ? PendingResultUtil.toTask(zzg.zzc(googleApiClient0, context0, googleSignInOptions0, true), GoogleSignInClient.zzbp) : PendingResultUtil.toTask(zzg.zzc(googleApiClient0, context0, googleSignInOptions0, false), GoogleSignInClient.zzbp);
    }

    private final int zzh() {
        synchronized(this) {
            if(GoogleSignInClient.zzbq == zzd.zzbt) {
                Context context0 = this.getApplicationContext();
                GoogleApiAvailability googleApiAvailability0 = GoogleApiAvailability.getInstance();
                int v1 = googleApiAvailability0.isGooglePlayServicesAvailable(context0, 12451000);
                if(v1 == 0) {
                    GoogleSignInClient.zzbq = zzd.zzbw;
                }
                else if(googleApiAvailability0.getErrorResolutionIntent(context0, v1, null) != null || DynamiteModule.getLocalVersion(context0, "com.google.android.gms.auth.api.fallback") == 0) {
                    GoogleSignInClient.zzbq = zzd.zzbu;
                }
                else {
                    GoogleSignInClient.zzbq = zzd.zzbv;
                }
            }
            return GoogleSignInClient.zzbq;
        }
    }
}

