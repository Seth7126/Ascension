package com.google.android.play.core.assetpacks.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class z {
    private static final Map a;
    private final Context b;
    private final o c;
    private final String d;
    private final List e;
    private final Set f;
    private final Object g;
    private boolean h;
    private final Intent i;
    private final WeakReference j;
    private final IBinder.DeathRecipient k;
    private final AtomicInteger l;
    private ServiceConnection m;
    private IInterface n;
    private final com.google.android.play.core.assetpacks.z o;

    static {
        z.a = new HashMap();
    }

    public z(Context context0, o o0, String s, Intent intent0, com.google.android.play.core.assetpacks.z z0, u u0) {
        this.e = new ArrayList();
        this.f = new HashSet();
        this.g = new Object();
        this.k = () -> {
            this.c.d("reportBinderDeath", new Object[0]);
            u u0 = (u)this.j.get();
            if(u0 == null) {
                this.c.d("%s : Binder has died.", new Object[]{this.d});
                for(Object object0: this.e) {
                    ((p)object0).c(this.v());
                }
                this.e.clear();
            }
            else {
                this.c.d("calling onBinderDied", new Object[0]);
                u0.a();
            }
            synchronized(this.g) {
                this.w();
            }
        };
        this.l = new AtomicInteger(0);
        this.b = context0;
        this.c = o0;
        this.d = s;
        this.i = intent0;
        this.o = z0;
        this.j = new WeakReference(null);
    }

    static Context a(z z0) {
        return z0.b;
    }

    static ServiceConnection b(z z0) {
        return z0.m;
    }

    public final Handler c() {
        Map map0 = z.a;
        synchronized(map0) {
            if(!map0.containsKey(this.d)) {
                HandlerThread handlerThread0 = new HandlerThread(this.d, 10);
                handlerThread0.start();
                Handler handler0 = new Handler(handlerThread0.getLooper());
                map0.put(this.d, handler0);
            }
        }
        return (Handler)map0.get(this.d);
    }

    static IInterface d(z z0) {
        return z0.n;
    }

    public final IInterface e() {
        return this.n;
    }

    static o f(z z0) {
        return z0.c;
    }

    static Object g(z z0) {
        return z0.g;
    }

    static List h(z z0) {
        return z0.e;
    }

    static AtomicInteger i(z z0) {
        return z0.l;
    }

    // 检测为 Lambda 实现
    public static void j(z z0) [...]

    static void k(z z0, ServiceConnection serviceConnection0) {
        z0.m = null;
    }

    static void l(z z0, boolean z1) {
        z0.h = false;
    }

    static void m(z z0, IInterface iInterface0) {
        z0.n = iInterface0;
    }

    static void n(z z0, TaskCompletionSource taskCompletionSource0) {
        z0.f.add(taskCompletionSource0);
        taskCompletionSource0.getTask().addOnCompleteListener((Task task0) -> synchronized(z0.g) {
            z0.f.remove(taskCompletionSource0);
        });
    }

    static void o(z z0) {
        z0.w();
    }

    static void p(z z0, p p0) {
        if(z0.n == null && !z0.h) {
            z0.c.d("Initiate binding to the service.", new Object[0]);
            z0.e.add(p0);
            y y0 = new y(z0, null);
            z0.m = y0;
            z0.h = true;
            if(!z0.b.bindService(z0.i, y0, 1)) {
                z0.c.d("Failed to bind to the service.", new Object[0]);
                z0.h = false;
                for(Object object0: z0.e) {
                    ((p)object0).c(new aa());
                }
                z0.e.clear();
            }
            return;
        }
        if(z0.h) {
            z0.c.d("Waiting to bind to the service.", new Object[0]);
            z0.e.add(p0);
            return;
        }
        p0.run();
    }

    static void q(z z0) {
        z0.c.d("linkToDeath", new Object[0]);
        try {
            z0.n.asBinder().linkToDeath(z0.k, 0);
        }
        catch(RemoteException remoteException0) {
            z0.c.c(remoteException0, "linkToDeath failed", new Object[0]);
        }
    }

    static void r(z z0) {
        z0.c.d("unlinkToDeath", new Object[0]);
        z0.n.asBinder().unlinkToDeath(z0.k, 0);
    }

    public final void s(p p0, TaskCompletionSource taskCompletionSource0) {
        s s0 = new s(this, p0.b(), taskCompletionSource0, p0);
        this.c().post(s0);
    }

    // 检测为 Lambda 实现
    final void t(TaskCompletionSource taskCompletionSource0, Task task0) [...]

    public final void u(TaskCompletionSource taskCompletionSource0) {
        synchronized(this.g) {
            this.f.remove(taskCompletionSource0);
        }
        t t0 = new t(this);
        this.c().post(t0);
    }

    private final RemoteException v() {
        return new RemoteException(this.d + " : Binder has died.");
    }

    private final void w() {
        for(Object object0: this.f) {
            ((TaskCompletionSource)object0).trySetException(this.v());
        }
        this.f.clear();
    }
}

