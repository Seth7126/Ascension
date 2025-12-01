package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public abstract class zzu extends zzc implements zzv {
    public zzu() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override  // com.google.android.gms.internal.auth-api.zzc
    protected final boolean zzc(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                this.zzc(((Status)zzf.zzc(parcel0, Status.CREATOR)), ((Credential)zzf.zzc(parcel0, Credential.CREATOR)));
                break;
            }
            case 2: {
                this.zzd(((Status)zzf.zzc(parcel0, Status.CREATOR)));
                break;
            }
            case 3: {
                this.zzc(((Status)zzf.zzc(parcel0, Status.CREATOR)), parcel0.readString());
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

