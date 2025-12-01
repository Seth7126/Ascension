package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zzd implements IInterface {
    private final IBinder zzd;
    private final String zze;

    protected zzd(IBinder iBinder0, String s) {
        this.zzd = iBinder0;
        this.zze = s;
    }

    @Override  // android.os.IInterface
    public IBinder asBinder() {
        return this.zzd;
    }

    protected final Parcel zzc() {
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeInterfaceToken(this.zze);
        return parcel0;
    }

    protected final void zzc(int v, Parcel parcel0) throws RemoteException {
        Parcel parcel1 = Parcel.obtain();
        try {
            this.zzd.transact(v, parcel0, parcel1, 0);
            parcel1.readException();
        }
        finally {
            parcel0.recycle();
            parcel1.recycle();
        }
    }
}

