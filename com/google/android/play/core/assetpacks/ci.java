package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.internal.k;
import com.google.android.play.core.assetpacks.internal.o;
import java.util.ArrayList;
import java.util.List;

final class ci implements ServiceConnection {
    private final o a;
    private final List b;
    private final Context c;
    private ExtractionForegroundService d;
    private Notification e;

    ci(Context context0) {
        this.a = new o("ExtractionForegroundServiceConnection");
        this.b = new ArrayList();
        this.c = context0;
    }

    final void a(Notification notification0) {
        this.e = notification0;
    }

    final void b() {
        this.a.a("Stopping foreground installation service.", new Object[0]);
        this.c.unbindService(this);
        ExtractionForegroundService extractionForegroundService0 = this.d;
        if(extractionForegroundService0 != null) {
            extractionForegroundService0.a();
        }
        this.d();
    }

    final void c(k k0) {
        synchronized(this.b) {
            this.b.add(k0);
        }
    }

    private final void d() {
        ArrayList arrayList0;
        synchronized(this.b) {
            arrayList0 = new ArrayList(this.b);
            this.b.clear();
        }
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            k k0 = (k)arrayList0.get(v2);
            try {
                k0.e(new Bundle(), new Bundle());
            }
            catch(RemoteException unused_ex) {
                this.a.b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        this.a.a("Starting foreground installation service.", new Object[0]);
        this.d = ((ch)iBinder0).a;
        ((ch)iBinder0).a.startForeground(0x8FB6D96C, this.e);
        this.d();
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
    }
}

