package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Status;

final class zzi extends zzd {
    private final zzj zzch;

    zzi(zzj zzj0) {
        this.zzch = zzj0;
        super();
    }

    @Override  // com.google.android.gms.auth.api.signin.internal.zzd
    public final void zzc(GoogleSignInAccount googleSignInAccount0, Status status0) throws RemoteException {
        if(googleSignInAccount0 != null) {
            zzo.zzd(this.zzch.val$context).zzc(this.zzch.zzci, googleSignInAccount0);
        }
        GoogleSignInResult googleSignInResult0 = new GoogleSignInResult(googleSignInAccount0, status0);
        this.zzch.setResult(googleSignInResult0);
    }
}

