package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

public abstract class g extends b implements h {
    public g() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override  // com.google.android.play.core.assetpacks.internal.b
    protected final boolean a(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 2: {
                int v2 = parcel0.readInt();
                Bundle bundle0 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                c.b(parcel0);
                this.n(v2, bundle0);
                return true;
            }
            case 3: {
                int v3 = parcel0.readInt();
                Bundle bundle1 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                c.b(parcel0);
                this.b(v3, bundle1);
                return true;
            }
            case 4: {
                int v4 = parcel0.readInt();
                Bundle bundle2 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                c.b(parcel0);
                this.f(v4, bundle2);
                return true;
            }
            case 5: {
                ArrayList arrayList0 = parcel0.createTypedArrayList(Bundle.CREATOR);
                c.b(parcel0);
                this.g(arrayList0);
                return true;
            }
            case 6: {
                Bundle bundle3 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                Bundle bundle4 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                c.b(parcel0);
                this.i(bundle3, bundle4);
                return true;
            }
            case 7: {
                Bundle bundle5 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                c.b(parcel0);
                this.d(bundle5);
                return true;
            }
            case 8: {
                Bundle bundle6 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                Bundle bundle7 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                c.b(parcel0);
                this.j(bundle6, bundle7);
                return true;
            }
            case 10: {
                Bundle bundle8 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                Bundle bundle9 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                c.b(parcel0);
                this.k(bundle8, bundle9);
                return true;
            }
            case 11: {
                Bundle bundle10 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                Bundle bundle11 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                c.b(parcel0);
                this.h(bundle10, bundle11);
                return true;
            }
            case 12: {
                Bundle bundle12 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                Bundle bundle13 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                c.b(parcel0);
                this.e(bundle12, bundle13);
                return true;
            }
            case 13: {
                Bundle bundle14 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                Bundle bundle15 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                c.b(parcel0);
                this.m(bundle14, bundle15);
                return true;
            }
            case 14: {
                Bundle bundle16 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                Bundle bundle17 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                c.b(parcel0);
                this.l(bundle16, bundle17);
                return true;
            }
            case 15: {
                Bundle bundle18 = (Bundle)c.a(parcel0, Bundle.CREATOR);
                c.b(parcel0);
                this.c(bundle18);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

