package com.google.android.play.core.appupdate.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class zzn implements Runnable {
    private final TaskCompletionSource zza;

    zzn() {
        this.zza = null;
    }

    public zzn(TaskCompletionSource taskCompletionSource0) {
        this.zza = taskCompletionSource0;
    }

    @Override
    public final void run() {
        try {
            this.zza();
        }
        catch(Exception exception0) {
            this.zzc(exception0);
        }
    }

    protected abstract void zza();

    final TaskCompletionSource zzb() {
        return this.zza;
    }

    public final void zzc(Exception exception0) {
        TaskCompletionSource taskCompletionSource0 = this.zza;
        if(taskCompletionSource0 != null) {
            taskCompletionSource0.trySetException(exception0);
        }
    }
}

