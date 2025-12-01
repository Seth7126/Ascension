package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;

public final class zzac extends zzd implements zzad {
    zzac(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    @Override  // com.google.android.gms.internal.auth-api.zzad
    public final void zzc(IStatusCallback iStatusCallback0, String s) throws RemoteException {
        Parcel parcel0 = this.zzc();
        zzf.zzc(parcel0, iStatusCallback0);
        parcel0.writeString(s);
        this.zzc(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.auth-api.zzad
    public final void zzc(zzab zzab0, BeginSignInRequest beginSignInRequest0) throws RemoteException {
        Parcel parcel0 = this.zzc();
        zzf.zzc(parcel0, zzab0);
        zzf.zzc(parcel0, beginSignInRequest0);
        this.zzc(1, parcel0);
    }
}

