package com.google.android.play.core.assetpacks.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class p implements Runnable {
    private final TaskCompletionSource a;

    p() {
        this.a = null;
    }

    public p(TaskCompletionSource taskCompletionSource0) {
        this.a = taskCompletionSource0;
    }

    protected abstract void a();

    final TaskCompletionSource b() {
        return this.a;
    }

    public final void c(Exception exception0) {
        TaskCompletionSource taskCompletionSource0 = this.a;
        if(taskCompletionSource0 != null) {
            taskCompletionSource0.trySetException(exception0);
        }
    }

    @Override
    public final void run() {
        try {
            this.a();
        }
        catch(Exception exception0) {
            this.c(exception0);
        }
    }
}

