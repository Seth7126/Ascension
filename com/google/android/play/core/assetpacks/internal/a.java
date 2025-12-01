package com.google.android.play.core.assetpacks.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class a implements IInterface {
    private final IBinder a;
    private final String b;

    protected a(IBinder iBinder0, String s) {
        this.a = iBinder0;
        this.b = s;
    }

    protected final Parcel a() {
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeInterfaceToken(this.b);
        return parcel0;
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    protected final void b(int v, Parcel parcel0) throws RemoteException {
        try {
            this.a.transact(v, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }
}

