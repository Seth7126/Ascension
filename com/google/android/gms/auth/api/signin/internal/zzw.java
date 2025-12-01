package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.UidVerifier;

public final class zzw extends zzq {
    private final Context mContext;

    public zzw(Context context0) {
        this.mContext = context0;
    }

    @Override  // com.google.android.gms.auth.api.signin.internal.zzr
    public final void zzn() {
        this.zzq();
        Storage storage0 = Storage.getInstance(this.mContext);
        GoogleSignInAccount googleSignInAccount0 = storage0.getSavedDefaultGoogleSignInAccount();
        GoogleSignInOptions googleSignInOptions0 = googleSignInAccount0 == null ? GoogleSignInOptions.DEFAULT_SIGN_IN : storage0.getSavedDefaultGoogleSignInOptions();
        GoogleSignInClient googleSignInClient0 = GoogleSignIn.getClient(this.mContext, googleSignInOptions0);
        if(googleSignInAccount0 != null) {
            googleSignInClient0.revokeAccess();
            return;
        }
        googleSignInClient0.signOut();
    }

    @Override  // com.google.android.gms.auth.api.signin.internal.zzr
    public final void zzo() {
        this.zzq();
        zzo.zzd(this.mContext).clear();
    }

    private final void zzq() {
        int v = Binder.getCallingUid();
        if(!UidVerifier.isGooglePlayServicesUid(this.mContext, v)) {
            throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
        }
    }
}

