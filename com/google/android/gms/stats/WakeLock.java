package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.providers.PooledExecutorsProvider;
import com.google.android.gms.common.stats.StatsUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class WakeLock {
    public interface zza {
    }

    private final Object zza;
    private final PowerManager.WakeLock zzb;
    private WorkSource zzc;
    private final int zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final Context zzh;
    private boolean zzi;
    private final Map zzj;
    private final Set zzk;
    private int zzl;
    private AtomicInteger zzm;
    private static ScheduledExecutorService zzn;
    private static volatile zza zzo;

    static {
        WakeLock.zzo = new com.google.android.gms.stats.zza();
    }

    public WakeLock(Context context0, int v, String s) {
        this(context0, v, s, null, (context0 == null ? null : "com.playdekgames.android.Ascension"));
    }

    private WakeLock(Context context0, int v, String s, String s1, String s2) {
        this(context0, v, s, null, s2, null);
    }

    private WakeLock(Context context0, int v, String s, String s1, String s2, String s3) {
        this.zza = this;
        this.zzi = true;
        this.zzj = new HashMap();
        this.zzk = Collections.synchronizedSet(new HashSet());
        this.zzm = new AtomicInteger(0);
        Preconditions.checkNotNull(context0, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(s, "WakeLock: wakeLockName must not be empty");
        this.zzd = v;
        this.zzf = null;
        this.zzg = null;
        Context context1 = context0.getApplicationContext();
        this.zzh = context1;
        String s4 = String.valueOf(s);
        this.zze = s4.length() == 0 ? new String("*gcore*:") : "*gcore*:" + s4;
        PowerManager.WakeLock powerManager$WakeLock0 = ((PowerManager)context0.getSystemService("power")).newWakeLock(v, s);
        this.zzb = powerManager$WakeLock0;
        if(WorkSourceUtil.hasWorkSourcePermission(context0)) {
            if(Strings.isEmptyOrWhitespace(s2)) {
                s2 = "com.playdekgames.android.Ascension";
            }
            WorkSource workSource0 = WorkSourceUtil.fromPackage(context0, s2);
            this.zzc = workSource0;
            if(workSource0 != null && WorkSourceUtil.hasWorkSourcePermission(context1)) {
                WorkSource workSource1 = this.zzc;
                if(workSource1 == null) {
                    this.zzc = workSource0;
                }
                else {
                    workSource1.add(workSource0);
                }
                try {
                    powerManager$WakeLock0.setWorkSource(this.zzc);
                }
                catch(IllegalArgumentException | ArrayIndexOutOfBoundsException illegalArgumentException0) {
                    Log.wtf("WakeLock", illegalArgumentException0.toString());
                }
            }
        }
        if(WakeLock.zzn == null) {
            WakeLock.zzn = PooledExecutorsProvider.getInstance().newSingleThreadScheduledExecutor();
        }
    }

    public void acquire(long v) {
        boolean z = false;
        this.zzm.incrementAndGet();
        String s = this.zza(null);
        synchronized(this.zza) {
            if((!this.zzj.isEmpty() || this.zzl > 0) && !this.zzb.isHeld()) {
                this.zzj.clear();
                this.zzl = 0;
            }
            if(this.zzi) {
                Integer[] arr_integer = (Integer[])this.zzj.get(s);
                if(arr_integer == null) {
                    this.zzj.put(s, new Integer[]{1});
                    z = true;
                }
                else {
                    arr_integer[0] = (int)(((int)arr_integer[0]) + 1);
                }
                if(z) {
                    goto label_18;
                }
                else {
                    goto label_17;
                }
            }
            else {
            label_17:
                if(!this.zzi && this.zzl == 0) {
                label_18:
                    StatsUtils.getEventKey(this.zzb, s);
                    this.zza();
                    ++this.zzl;
                }
            }
        }
        this.zzb.acquire();
        if(v > 0L) {
            WakeLock.zzn.schedule(new zzb(this), v, TimeUnit.MILLISECONDS);
        }
    }

    public boolean isHeld() {
        return this.zzb.isHeld();
    }

    public void release() {
        boolean z;
        if(this.zzm.decrementAndGet() < 0) {
            Log.e("WakeLock", this.zze + " release without a matched acquire!");
        }
        String s = this.zza(null);
        synchronized(this.zza) {
            if(this.zzi) {
                Integer[] arr_integer = (Integer[])this.zzj.get(s);
                if(arr_integer == null) {
                    z = false;
                }
                else if(((int)arr_integer[0]) == 1) {
                    this.zzj.remove(s);
                    z = true;
                }
                else {
                    arr_integer[0] = (int)(((int)arr_integer[0]) - 1);
                    z = false;
                }
                if(z) {
                    goto label_19;
                }
                else {
                    goto label_18;
                }
            }
            else {
            label_18:
                if(!this.zzi && this.zzl == 1) {
                label_19:
                    StatsUtils.getEventKey(this.zzb, s);
                    this.zza();
                    --this.zzl;
                }
            }
        }
        this.zza(0);
    }

    public void setReferenceCounted(boolean z) {
        this.zzb.setReferenceCounted(z);
        this.zzi = z;
    }

    // 去混淆评级： 低(20)
    private final String zza(String s) {
        return !this.zzi || TextUtils.isEmpty(s) ? this.zzf : s;
    }

    private final List zza() {
        return WorkSourceUtil.getNames(this.zzc);
    }

    private final void zza(int v) {
        if(this.zzb.isHeld()) {
            try {
                this.zzb.release();
            }
            catch(RuntimeException runtimeException0) {
                if(!runtimeException0.getClass().equals(RuntimeException.class)) {
                    throw runtimeException0;
                }
                Log.e("WakeLock", this.zze + " was already released!", runtimeException0);
            }
            this.zzb.isHeld();
        }
    }

    static void zza(WakeLock wakeLock0, int v) {
        wakeLock0.zza(0);
    }
}

