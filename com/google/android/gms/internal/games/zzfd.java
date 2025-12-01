package com.google.android.gms.internal.games;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class zzfd {
    private final Object zzgv;
    private Handler zzgw;
    private boolean zzgx;
    private HashMap zzgy;
    private int zzgz;

    public zzfd(Looper looper0, int v) {
        this.zzgv = new Object();
        this.zzgw = new zzfk(looper0);
        this.zzgy = new HashMap();
        this.zzgz = 1000;
    }

    public final void flush() {
        synchronized(this.zzgv) {
            for(Object object1: this.zzgy.entrySet()) {
                this.zzc(((String)((Map.Entry)object1).getKey()), ((AtomicInteger)((Map.Entry)object1).getValue()).get());
            }
            this.zzgy.clear();
        }
    }

    private final void zzbp() {
        synchronized(this.zzgv) {
            this.zzgx = false;
            this.flush();
        }
    }

    protected abstract void zzc(String arg1, int arg2);

    public final void zze(String s, int v) {
        synchronized(this.zzgv) {
            if(!this.zzgx) {
                this.zzgx = true;
                this.zzgw.postDelayed(new zzfc(this), ((long)this.zzgz));
            }
            AtomicInteger atomicInteger0 = (AtomicInteger)this.zzgy.get(s);
            if(atomicInteger0 == null) {
                atomicInteger0 = new AtomicInteger();
                this.zzgy.put(s, atomicInteger0);
            }
            atomicInteger0.addAndGet(v);
        }
    }
}

