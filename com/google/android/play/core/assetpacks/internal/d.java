package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public final class d extends a implements f {
    d(IBinder iBinder0) {
        super(iBinder0, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override  // com.google.android.play.core.assetpacks.internal.f
    public final void c(String s, List list0, Bundle bundle0, h h0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeTypedList(list0);
        c.c(parcel0, bundle0);
        parcel0.writeStrongBinder(((IBinder)h0));
        this.b(14, parcel0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.f
    public final void d(String s, Bundle bundle0, Bundle bundle1, h h0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        c.c(parcel0, bundle0);
        c.c(parcel0, bundle1);
        parcel0.writeStrongBinder(((IBinder)h0));
        this.b(11, parcel0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.f
    public final void e(String s, Bundle bundle0, h h0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        c.c(parcel0, bundle0);
        parcel0.writeStrongBinder(((IBinder)h0));
        this.b(5, parcel0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.f
    public final void f(String s, Bundle bundle0, h h0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        c.c(parcel0, bundle0);
        parcel0.writeStrongBinder(((IBinder)h0));
        this.b(10, parcel0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.f
    public final void g(String s, Bundle bundle0, Bundle bundle1, h h0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        c.c(parcel0, bundle0);
        c.c(parcel0, bundle1);
        parcel0.writeStrongBinder(((IBinder)h0));
        this.b(6, parcel0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.f
    public final void h(String s, Bundle bundle0, Bundle bundle1, h h0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        c.c(parcel0, bundle0);
        c.c(parcel0, bundle1);
        parcel0.writeStrongBinder(((IBinder)h0));
        this.b(7, parcel0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.f
    public final void i(String s, Bundle bundle0, Bundle bundle1, h h0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        c.c(parcel0, bundle0);
        c.c(parcel0, bundle1);
        parcel0.writeStrongBinder(((IBinder)h0));
        this.b(9, parcel0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.f
    public final void j(String s, Bundle bundle0, Bundle bundle1, h h0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        c.c(parcel0, bundle0);
        c.c(parcel0, bundle1);
        parcel0.writeStrongBinder(((IBinder)h0));
        this.b(13, parcel0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.f
    public final void k(String s, List list0, Bundle bundle0, h h0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeTypedList(list0);
        c.c(parcel0, bundle0);
        parcel0.writeStrongBinder(((IBinder)h0));
        this.b(12, parcel0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.f
    public final void l(String s, List list0, Bundle bundle0, h h0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeTypedList(list0);
        c.c(parcel0, bundle0);
        parcel0.writeStrongBinder(((IBinder)h0));
        this.b(2, parcel0);
    }
}

