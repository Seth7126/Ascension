package com.google.android.play.core.assetpacks.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class y implements ServiceConnection {
    final z a;

    y(z z0, x x0) {
        this.a = z0;
        super();
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        z.f(this.a).d("ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName0});
        v v0 = new v(this, iBinder0);
        this.a.c().post(v0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        z.f(this.a).d("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName0});
        w w0 = new w(this);
        this.a.c().post(w0);
    }
}

