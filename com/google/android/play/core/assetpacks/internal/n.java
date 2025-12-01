package com.google.android.play.core.assetpacks.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Set;

public abstract class n {
    protected final o a;
    protected final Set b;
    private final IntentFilter c;
    private final Context d;
    private m e;
    private volatile boolean f;

    protected n(o o0, IntentFilter intentFilter0, Context context0) {
        this.b = new HashSet();
        this.e = null;
        this.f = false;
        this.a = o0;
        this.c = intentFilter0;
        this.d = ag.a(context0);
    }

    private final void a() {
        if((this.f || !this.b.isEmpty()) && this.e == null) {
            this.e = new m(this, null);
            if(Build.VERSION.SDK_INT >= 33) {
                this.d.registerReceiver(this.e, this.c, 2);
            }
            else {
                this.d.registerReceiver(this.e, this.c);
            }
        }
        if(!this.f && this.b.isEmpty()) {
            m m0 = this.e;
            if(m0 != null) {
                this.d.unregisterReceiver(m0);
                this.e = null;
            }
        }
    }

    protected abstract void c(Context arg1, Intent arg2);

    public final void e() {
        synchronized(this) {
            this.a.d("clearListeners", new Object[0]);
            this.b.clear();
            this.a();
        }
    }

    public final void f(StateUpdatedListener stateUpdatedListener0) {
        synchronized(this) {
            this.a.d("registerListener", new Object[0]);
            aj.a(stateUpdatedListener0, "Registered Play Core listener should not be null.");
            this.b.add(stateUpdatedListener0);
            this.a();
        }
    }

    public final void g(boolean z) {
        synchronized(this) {
            this.f = z;
            this.a();
        }
    }

    public final void h(StateUpdatedListener stateUpdatedListener0) {
        synchronized(this) {
            this.a.d("unregisterListener", new Object[0]);
            aj.a(stateUpdatedListener0, "Unregistered Play Core listener should not be null.");
            this.b.remove(stateUpdatedListener0);
            this.a();
        }
    }

    public final void i(Object object0) {
        synchronized(this) {
            for(Object object1: new HashSet(this.b)) {
                ((StateUpdatedListener)object1).onStateUpdate(object0);
            }
        }
    }

    public final boolean j() {
        synchronized(this) {
        }
        return this.e != null;
    }
}

