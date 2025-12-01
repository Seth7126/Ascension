package com.google.android.play.core.appupdate.internal;

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
import com.google.android.play.core.appupdate.zzl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzx {
    private static final Map zza;
    private final Context zzb;
    private final zzm zzc;
    private final String zzd;
    private final List zze;
    private final Set zzf;
    private final Object zzg;
    private boolean zzh;
    private final Intent zzi;
    private final WeakReference zzj;
    private final IBinder.DeathRecipient zzk;
    private final AtomicInteger zzl;
    private ServiceConnection zzm;
    private IInterface zzn;
    private final zzl zzo;

    static {
        zzx.zza = new HashMap();
    }

    public zzx(Context context0, zzm zzm0, String s, Intent intent0, zzl zzl0, zzs zzs0) {
        this.zze = new ArrayList();
        this.zzf = new HashSet();
        this.zzg = new Object();
        this.zzk = () -> {
            this.zzc.zzd("reportBinderDeath", new Object[0]);
            zzs zzs0 = (zzs)this.zzj.get();
            if(zzs0 == null) {
                this.zzc.zzd("%s : Binder has died.", new Object[]{this.zzd});
                for(Object object0: this.zze) {
                    ((zzn)object0).zzc(this.zzv());
                }
                this.zze.clear();
            }
            else {
                this.zzc.zzd("calling onBinderDied", new Object[0]);
                zzs0.zza();
            }
            synchronized(this.zzg) {
                this.zzw();
            }
        };
        this.zzl = new AtomicInteger(0);
        this.zzb = context0;
        this.zzc = zzm0;
        this.zzd = "AppUpdateService";
        this.zzi = intent0;
        this.zzo = zzl0;
        this.zzj = new WeakReference(null);
    }

    static Context zza(zzx zzx0) {
        return zzx0.zzb;
    }

    static ServiceConnection zzb(zzx zzx0) {
        return zzx0.zzm;
    }

    public final Handler zzc() {
        Map map0 = zzx.zza;
        synchronized(map0) {
            if(!map0.containsKey(this.zzd)) {
                HandlerThread handlerThread0 = new HandlerThread(this.zzd, 10);
                handlerThread0.start();
                Handler handler0 = new Handler(handlerThread0.getLooper());
                map0.put(this.zzd, handler0);
            }
        }
        return (Handler)map0.get(this.zzd);
    }

    static IInterface zzd(zzx zzx0) {
        return zzx0.zzn;
    }

    public final IInterface zze() {
        return this.zzn;
    }

    static zzm zzf(zzx zzx0) {
        return zzx0.zzc;
    }

    static Object zzg(zzx zzx0) {
        return zzx0.zzg;
    }

    static List zzh(zzx zzx0) {
        return zzx0.zze;
    }

    static AtomicInteger zzi(zzx zzx0) {
        return zzx0.zzl;
    }

    // 检测为 Lambda 实现
    public static void zzj(zzx zzx0) [...]

    static void zzk(zzx zzx0, ServiceConnection serviceConnection0) {
        zzx0.zzm = null;
    }

    static void zzl(zzx zzx0, boolean z) {
        zzx0.zzh = false;
    }

    static void zzm(zzx zzx0, IInterface iInterface0) {
        zzx0.zzn = iInterface0;
    }

    static void zzn(zzx zzx0, TaskCompletionSource taskCompletionSource0) {
        zzx0.zzf.add(taskCompletionSource0);
        taskCompletionSource0.getTask().addOnCompleteListener((Task task0) -> synchronized(zzx0.zzg) {
            zzx0.zzf.remove(taskCompletionSource0);
        });
    }

    static void zzo(zzx zzx0) {
        zzx0.zzw();
    }

    static void zzp(zzx zzx0, zzn zzn0) {
        if(zzx0.zzn == null && !zzx0.zzh) {
            zzx0.zzc.zzd("Initiate binding to the service.", new Object[0]);
            zzx0.zze.add(zzn0);
            zzw zzw0 = new zzw(zzx0, null);
            zzx0.zzm = zzw0;
            zzx0.zzh = true;
            if(!zzx0.zzb.bindService(zzx0.zzi, zzw0, 1)) {
                zzx0.zzc.zzd("Failed to bind to the service.", new Object[0]);
                zzx0.zzh = false;
                for(Object object0: zzx0.zze) {
                    ((zzn)object0).zzc(new zzy());
                }
                zzx0.zze.clear();
            }
            return;
        }
        if(zzx0.zzh) {
            zzx0.zzc.zzd("Waiting to bind to the service.", new Object[0]);
            zzx0.zze.add(zzn0);
            return;
        }
        zzn0.run();
    }

    static void zzq(zzx zzx0) {
        zzx0.zzc.zzd("linkToDeath", new Object[0]);
        try {
            zzx0.zzn.asBinder().linkToDeath(zzx0.zzk, 0);
        }
        catch(RemoteException remoteException0) {
            zzx0.zzc.zzc(remoteException0, "linkToDeath failed", new Object[0]);
        }
    }

    static void zzr(zzx zzx0) {
        zzx0.zzc.zzd("unlinkToDeath", new Object[0]);
        zzx0.zzn.asBinder().unlinkToDeath(zzx0.zzk, 0);
    }

    public final void zzs(zzn zzn0, TaskCompletionSource taskCompletionSource0) {
        zzq zzq0 = new zzq(this, zzn0.zzb(), taskCompletionSource0, zzn0);
        this.zzc().post(zzq0);
    }

    // 检测为 Lambda 实现
    final void zzt(TaskCompletionSource taskCompletionSource0, Task task0) [...]

    public final void zzu(TaskCompletionSource taskCompletionSource0) {
        synchronized(this.zzg) {
            this.zzf.remove(taskCompletionSource0);
        }
        zzr zzr0 = new zzr(this);
        this.zzc().post(zzr0);
    }

    private final RemoteException zzv() {
        return new RemoteException(this.zzd + " : Binder has died.");
    }

    private final void zzw() {
        for(Object object0: this.zzf) {
            ((TaskCompletionSource)object0).trySetException(this.zzv());
        }
        this.zzf.clear();
    }
}

