package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zza;

public final class zze extends zza implements zzc {
    zze(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override  // com.google.android.gms.auth.account.zzc
    public final void zza(com.google.android.gms.auth.account.zza zza0, Account account0) throws RemoteException {
        Parcel parcel0 = this.obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzc.zza(parcel0, zza0);
        com.google.android.gms.internal.auth.zzc.zza(parcel0, account0);
        this.transactAndReadExceptionReturnVoid(3, parcel0);
    }

    @Override  // com.google.android.gms.auth.account.zzc
    public final void zza(com.google.android.gms.auth.account.zza zza0, String s) throws RemoteException {
        Parcel parcel0 = this.obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzc.zza(parcel0, zza0);
        parcel0.writeString(s);
        this.transactAndReadExceptionReturnVoid(2, parcel0);
    }

    @Override  // com.google.android.gms.auth.account.zzc
    public final void zzb(boolean z) throws RemoteException {
        Parcel parcel0 = this.obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzc.writeBoolean(parcel0, z);
        this.transactAndReadExceptionReturnVoid(1, parcel0);
    }
}

