package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.zzc;
import com.google.android.gms.internal.auth-api.zzf;

public abstract class zzs extends zzc implements zzt {
    public zzs() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override  // com.google.android.gms.internal.auth-api.zzc
    protected final boolean zzc(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 101: {
                this.zzc(((GoogleSignInAccount)zzf.zzc(parcel0, GoogleSignInAccount.CREATOR)), ((Status)zzf.zzc(parcel0, Status.CREATOR)));
                break;
            }
            case 102: {
                this.zze(((Status)zzf.zzc(parcel0, Status.CREATOR)));
                break;
            }
            case 103: {
                this.zzf(((Status)zzf.zzc(parcel0, Status.CREATOR)));
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

