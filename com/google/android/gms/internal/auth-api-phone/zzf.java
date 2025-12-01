package com.google.android.gms.internal.auth-api-phone;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzf extends zza implements zze {
    zzf(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    @Override  // com.google.android.gms.internal.auth-api-phone.zze
    public final void zza(zzg zzg0) throws RemoteException {
        Parcel parcel0 = this.obtainAndWriteInterfaceToken();
        zzc.zza(parcel0, zzg0);
        this.transactAndReadExceptionReturnVoid(1, parcel0);
    }
}

