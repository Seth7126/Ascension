package com.google.android.gms.stats;

final class zzb implements Runnable {
    private final WakeLock zzp;

    zzb(WakeLock wakeLock0) {
        this.zzp = wakeLock0;
        super();
    }

    @Override
    public final void run() {
        WakeLock.zza(this.zzp, 0);
    }
}

