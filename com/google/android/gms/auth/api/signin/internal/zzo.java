package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class zzo {
    private static zzo zzcl;
    private Storage zzcm;
    private GoogleSignInAccount zzcn;
    private GoogleSignInOptions zzco;

    static {
    }

    private zzo(Context context0) {
        Storage storage0 = Storage.getInstance(context0);
        this.zzcm = storage0;
        this.zzcn = storage0.getSavedDefaultGoogleSignInAccount();
        this.zzco = this.zzcm.getSavedDefaultGoogleSignInOptions();
    }

    public final void clear() {
        synchronized(this) {
            this.zzcm.clear();
            this.zzcn = null;
            this.zzco = null;
        }
    }

    public final void zzc(GoogleSignInOptions googleSignInOptions0, GoogleSignInAccount googleSignInAccount0) {
        synchronized(this) {
            this.zzcm.saveDefaultGoogleSignInAccount(googleSignInAccount0, googleSignInOptions0);
            this.zzcn = googleSignInAccount0;
            this.zzco = googleSignInOptions0;
        }
    }

    public static zzo zzd(Context context0) {
        synchronized(zzo.class) {
            return zzo.zze(context0.getApplicationContext());
        }
    }

    private static zzo zze(Context context0) {
        synchronized(zzo.class) {
            zzo zzo0 = zzo.zzcl;
            if(zzo0 != null) {
                return zzo0;
            }
            zzo zzo1 = new zzo(context0);
            zzo.zzcl = zzo1;
            return zzo1;
        }
    }

    public final GoogleSignInAccount zzl() {
        synchronized(this) {
        }
        return this.zzcn;
    }

    public final GoogleSignInOptions zzm() {
        synchronized(this) {
        }
        return this.zzco;
    }
}

