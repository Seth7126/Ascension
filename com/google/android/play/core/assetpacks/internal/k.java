package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class k extends a implements IInterface {
    k(IBinder iBinder0) {
        super(iBinder0, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void c(Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a();
        c.c(parcel0, bundle0);
        this.b(4, parcel0);
    }

    public final void d(Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a();
        c.c(parcel0, bundle0);
        this.b(3, parcel0);
    }

    public final void e(Bundle bundle0, Bundle bundle1) throws RemoteException {
        Parcel parcel0 = this.a();
        c.c(parcel0, bundle0);
        c.c(parcel0, bundle1);
        this.b(2, parcel0);
    }
}

