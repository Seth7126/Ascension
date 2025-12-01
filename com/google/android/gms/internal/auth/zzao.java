package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

public final class zzao extends zza implements zzan {
    zzao(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    @Override  // com.google.android.gms.internal.auth.zzan
    public final void zza(zzal zzal0) throws RemoteException {
        Parcel parcel0 = this.obtainAndWriteInterfaceToken();
        zzc.zza(parcel0, zzal0);
        this.transactAndReadExceptionReturnVoid(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.auth.zzan
    public final void zza(zzal zzal0, ProxyRequest proxyRequest0) throws RemoteException {
        Parcel parcel0 = this.obtainAndWriteInterfaceToken();
        zzc.zza(parcel0, zzal0);
        zzc.zza(parcel0, proxyRequest0);
        this.transactAndReadExceptionReturnVoid(1, parcel0);
    }
}

