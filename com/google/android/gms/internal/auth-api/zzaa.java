package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

public abstract class zzaa extends zzc implements zzab {
    public zzaa() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override  // com.google.android.gms.internal.auth-api.zzc
    protected final boolean zzc(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        if(v == 1) {
            this.zzc(((Status)zzf.zzc(parcel0, Status.CREATOR)), ((BeginSignInResult)zzf.zzc(parcel0, BeginSignInResult.CREATOR)));
            return true;
        }
        return false;
    }
}

