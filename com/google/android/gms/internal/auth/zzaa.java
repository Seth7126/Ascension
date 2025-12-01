package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzaa extends zza implements zzz {
    zzaa(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
    }

    @Override  // com.google.android.gms.internal.auth.zzz
    public final void zza(zzx zzx0, zzab zzab0) throws RemoteException {
        Parcel parcel0 = this.obtainAndWriteInterfaceToken();
        zzc.zza(parcel0, zzx0);
        zzc.zza(parcel0, zzab0);
        this.transactAndReadExceptionReturnVoid(9, parcel0);
    }

    @Override  // com.google.android.gms.internal.auth.zzz
    public final void zza(zzx zzx0, zzad zzad0) throws RemoteException {
        Parcel parcel0 = this.obtainAndWriteInterfaceToken();
        zzc.zza(parcel0, zzx0);
        zzc.zza(parcel0, zzad0);
        this.transactAndReadExceptionReturnVoid(6, parcel0);
    }

    @Override  // com.google.android.gms.internal.auth.zzz
    public final void zza(zzx zzx0, zzaf zzaf0) throws RemoteException {
        Parcel parcel0 = this.obtainAndWriteInterfaceToken();
        zzc.zza(parcel0, zzx0);
        zzc.zza(parcel0, zzaf0);
        this.transactAndReadExceptionReturnVoid(5, parcel0);
    }

    @Override  // com.google.android.gms.internal.auth.zzz
    public final void zza(zzx zzx0, zzah zzah0) throws RemoteException {
        Parcel parcel0 = this.obtainAndWriteInterfaceToken();
        zzc.zza(parcel0, zzx0);
        zzc.zza(parcel0, zzah0);
        this.transactAndReadExceptionReturnVoid(8, parcel0);
    }

    @Override  // com.google.android.gms.internal.auth.zzz
    public final void zza(zzx zzx0, zzv zzv0) throws RemoteException {
        Parcel parcel0 = this.obtainAndWriteInterfaceToken();
        zzc.zza(parcel0, zzx0);
        zzc.zza(parcel0, zzv0);
        this.transactAndReadExceptionReturnVoid(7, parcel0);
    }
}

