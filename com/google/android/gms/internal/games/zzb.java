package com.google.android.gms.internal.games;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zzb implements IInterface {
    private final IBinder zzb;
    private final String zzc;

    protected zzb(IBinder iBinder0, String s) {
        this.zzb = iBinder0;
        this.zzc = s;
    }

    @Override  // android.os.IInterface
    public IBinder asBinder() {
        return this.zzb;
    }

    protected final Parcel zza() {
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeInterfaceToken(this.zzc);
        return parcel0;
    }

    protected final Parcel zza(int v, Parcel parcel0) throws RemoteException {
        Parcel parcel1 = Parcel.obtain();
        try {
            this.zzb.transact(v, parcel0, parcel1, 0);
            parcel1.readException();
            return parcel1;
        }
        catch(RuntimeException runtimeException0) {
            parcel1.recycle();
            throw runtimeException0;
        }
        finally {
            parcel0.recycle();
        }
    }

    protected final void zzb(int v, Parcel parcel0) throws RemoteException {
        Parcel parcel1 = Parcel.obtain();
        try {
            this.zzb.transact(v, parcel0, parcel1, 0);
            parcel1.readException();
        }
        finally {
            parcel0.recycle();
            parcel1.recycle();
        }
    }
}

