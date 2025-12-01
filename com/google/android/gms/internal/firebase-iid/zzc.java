package com.google.android.gms.internal.firebase-iid;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

final class zzc implements zzb {
    private zzc() {
    }

    zzc(zzd zzd0) {
    }

    @Override  // com.google.android.gms.internal.firebase-iid.zzb
    public final ScheduledExecutorService zza(int v, ThreadFactory threadFactory0, int v1) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory0));
    }
}

