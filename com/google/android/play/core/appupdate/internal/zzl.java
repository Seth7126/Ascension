package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Set;

public abstract class zzl {
    protected final zzm zza;
    protected final Set zzb;
    private final IntentFilter zzc;
    private final Context zzd;
    private zzk zze;
    private volatile boolean zzf;

    protected zzl(zzm zzm0, IntentFilter intentFilter0, Context context0) {
        this.zzb = new HashSet();
        this.zze = null;
        this.zzf = false;
        this.zza = zzm0;
        this.zzc = intentFilter0;
        this.zzd = zzz.zza(context0);
    }

    protected abstract void zza(Context arg1, Intent arg2);

    public final void zzb(StateUpdatedListener stateUpdatedListener0) {
        synchronized(this) {
            this.zza.zzd("registerListener", new Object[0]);
            zzac.zza(stateUpdatedListener0, "Registered Play Core listener should not be null.");
            this.zzb.add(stateUpdatedListener0);
            this.zze();
        }
    }

    public final void zzc(StateUpdatedListener stateUpdatedListener0) {
        synchronized(this) {
            this.zza.zzd("unregisterListener", new Object[0]);
            zzac.zza(stateUpdatedListener0, "Unregistered Play Core listener should not be null.");
            this.zzb.remove(stateUpdatedListener0);
            this.zze();
        }
    }

    public final void zzd(Object object0) {
        synchronized(this) {
            for(Object object1: new HashSet(this.zzb)) {
                ((StateUpdatedListener)object1).onStateUpdate(object0);
            }
        }
    }

    private final void zze() {
        if(!this.zzb.isEmpty() && this.zze == null) {
            this.zze = new zzk(this, null);
            if(Build.VERSION.SDK_INT >= 33) {
                this.zzd.registerReceiver(this.zze, this.zzc, 2);
            }
            else {
                this.zzd.registerReceiver(this.zze, this.zzc);
            }
        }
        if(this.zzb.isEmpty()) {
            zzk zzk0 = this.zze;
            if(zzk0 != null) {
                this.zzd.unregisterReceiver(zzk0);
                this.zze = null;
            }
        }
    }
}

