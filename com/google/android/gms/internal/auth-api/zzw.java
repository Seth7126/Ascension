package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

public final class zzw extends zzd implements zzx {
    zzw(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    @Override  // com.google.android.gms.internal.auth-api.zzx
    public final void zzc(zzv zzv0) throws RemoteException {
        Parcel parcel0 = this.zzc();
        zzf.zzc(parcel0, zzv0);
        this.zzc(4, parcel0);
    }

    @Override  // com.google.android.gms.internal.auth-api.zzx
    public final void zzc(zzv zzv0, CredentialRequest credentialRequest0) throws RemoteException {
        Parcel parcel0 = this.zzc();
        zzf.zzc(parcel0, zzv0);
        zzf.zzc(parcel0, credentialRequest0);
        this.zzc(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.auth-api.zzx
    public final void zzc(zzv zzv0, zzt zzt0) throws RemoteException {
        Parcel parcel0 = this.zzc();
        zzf.zzc(parcel0, zzv0);
        zzf.zzc(parcel0, zzt0);
        this.zzc(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.auth-api.zzx
    public final void zzc(zzv zzv0, zzz zzz0) throws RemoteException {
        Parcel parcel0 = this.zzc();
        zzf.zzc(parcel0, zzv0);
        zzf.zzc(parcel0, zzz0);
        this.zzc(2, parcel0);
    }
}

