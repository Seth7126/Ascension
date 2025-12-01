package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

public final class WakeLockHolder {
    private static final long WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS;
    private static final Object syncObject;
    private static WakeLock wakeLock;

    static {
        WakeLockHolder.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS = TimeUnit.MINUTES.toMillis(1L);
        WakeLockHolder.syncObject = new Object();
    }

    public static void acquireWakeLock(Intent intent0, long v) {
        synchronized(WakeLockHolder.syncObject) {
            if(WakeLockHolder.wakeLock != null) {
                WakeLockHolder.setAsWakefulIntent(intent0, true);
                WakeLockHolder.wakeLock.acquire(v);
            }
        }
    }

    private static void checkAndInitWakeLock(Context context0) {
        if(WakeLockHolder.wakeLock == null) {
            WakeLock wakeLock0 = new WakeLock(context0, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            WakeLockHolder.wakeLock = wakeLock0;
            wakeLock0.setReferenceCounted(true);
        }
    }

    public static void completeWakefulIntent(Intent intent0) {
        synchronized(WakeLockHolder.syncObject) {
            if(WakeLockHolder.wakeLock != null && WakeLockHolder.isWakefulIntent(intent0)) {
                WakeLockHolder.setAsWakefulIntent(intent0, false);
                WakeLockHolder.wakeLock.release();
            }
        }
    }

    public static void initWakeLock(Context context0) {
        synchronized(WakeLockHolder.syncObject) {
            WakeLockHolder.checkAndInitWakeLock(context0);
        }
    }

    static boolean isWakefulIntent(Intent intent0) {
        return intent0.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    public static void reset() {
        synchronized(WakeLockHolder.syncObject) {
            WakeLockHolder.wakeLock = null;
        }
    }

    private static void setAsWakefulIntent(Intent intent0, boolean z) {
        intent0.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    public static ComponentName startWakefulService(Context context0, Intent intent0) {
        synchronized(WakeLockHolder.syncObject) {
            WakeLockHolder.checkAndInitWakeLock(context0);
            boolean z = WakeLockHolder.isWakefulIntent(intent0);
            WakeLockHolder.setAsWakefulIntent(intent0, true);
            ComponentName componentName0 = context0.startService(intent0);
            if(componentName0 == null) {
                return null;
            }
            if(!z) {
                WakeLockHolder.wakeLock.acquire(WakeLockHolder.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
            }
            return componentName0;
        }
    }
}

