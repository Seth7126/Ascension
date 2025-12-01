package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth-api.zzc;

public abstract class zzq extends zzc implements zzr {
    public zzq() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override  // com.google.android.gms.internal.auth-api.zzc
    protected final boolean zzc(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                this.zzn();
                return true;
            }
            case 2: {
                this.zzo();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

