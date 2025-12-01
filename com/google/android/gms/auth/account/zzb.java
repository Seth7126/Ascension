package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzc;

public abstract class zzb extends com.google.android.gms.internal.auth.zzb implements zza {
    public zzb() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override  // com.google.android.gms.internal.auth.zzb
    protected final boolean dispatchTransaction(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                this.zzc(((Account)zzc.zza(parcel0, Account.CREATOR)));
                return true;
            }
            case 2: {
                this.zza(zzc.zza(parcel0));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

