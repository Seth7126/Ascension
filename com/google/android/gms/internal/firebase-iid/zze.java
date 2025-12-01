package com.google.android.gms.internal.firebase-iid;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class zze extends Handler {
    private static zzg propagator;

    static {
    }

    public zze() {
    }

    public zze(Looper looper0) {
        super(looper0);
    }

    public zze(Looper looper0, Handler.Callback handler$Callback0) {
        super(looper0, handler$Callback0);
    }

    @Override  // android.os.Handler
    public final void dispatchMessage(Message message0) {
        zzg zzg0 = zze.propagator;
        if(zzg0 == null) {
            this.dispatchMessageTraced(message0);
            return;
        }
        Object object0 = zzg0.zza(this, message0);
        try {
            this.dispatchMessageTraced(message0);
        }
        catch(Throwable throwable0) {
            try {
                zzg0.zza(this, throwable0, object0);
                throw throwable0;
            }
            catch(Throwable throwable1) {
                zzg0.zza(this, message0, object0);
                throw throwable1;
            }
        }
        zzg0.zza(this, message0, object0);
    }

    protected void dispatchMessageTraced(Message message0) {
        super.dispatchMessage(message0);
    }

    private void prepare(Message message0, long v) {
        zzg zzg0 = zze.propagator;
        if(zzg0 != null) {
            zzg0.zza(this, message0, v);
        }
    }

    @Override  // android.os.Handler
    public boolean sendMessageAtTime(Message message0, long v) {
        this.prepare(message0, v);
        return super.sendMessageAtTime(message0, v);
    }
}

