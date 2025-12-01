package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.auth-api.zzd;
import com.google.android.gms.internal.auth-api.zzf;

public final class zzu extends zzd implements zzv {
    zzu(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override  // com.google.android.gms.auth.api.signin.internal.zzv
    public final void zzc(zzt zzt0, GoogleSignInOptions googleSignInOptions0) throws RemoteException {
        Parcel parcel0 = this.zzc();
        zzf.zzc(parcel0, zzt0);
        zzf.zzc(parcel0, googleSignInOptions0);
        this.zzc(101, parcel0);
    }

    @Override  // com.google.android.gms.auth.api.signin.internal.zzv
    public final void zzd(zzt zzt0, GoogleSignInOptions googleSignInOptions0) throws RemoteException {
        Parcel parcel0 = this.zzc();
        zzf.zzc(parcel0, zzt0);
        zzf.zzc(parcel0, googleSignInOptions0);
        this.zzc(102, parcel0);
    }

    @Override  // com.google.android.gms.auth.api.signin.internal.zzv
    public final void zze(zzt zzt0, GoogleSignInOptions googleSignInOptions0) throws RemoteException {
        Parcel parcel0 = this.zzc();
        zzf.zzc(parcel0, zzt0);
        zzf.zzc(parcel0, googleSignInOptions0);
        this.zzc(103, parcel0);
    }
}

