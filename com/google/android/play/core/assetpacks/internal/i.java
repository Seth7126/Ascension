package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class i extends b implements j {
    public i() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override  // com.google.android.play.core.assetpacks.internal.b
    protected final boolean a(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        k k0 = null;
        switch(v) {
            case 2: {
                Bundle bundle0 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                    k0 = iInterface0 instanceof k ? ((k)iInterface0) : new k(iBinder0);
                }
                c.b(parcel0);
                this.c(bundle0, k0);
                return true;
            }
            case 3: {
                Bundle bundle1 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                    k0 = iInterface1 instanceof k ? ((k)iInterface1) : new k(iBinder1);
                }
                c.b(parcel0);
                this.b(bundle1, k0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

