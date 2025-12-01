package com.google.firebase.iid;

import com.google.android.gms.tasks.TaskCompletionSource;

final class Rpc..Lambda.2 implements Runnable {
    private final TaskCompletionSource arg$1;

    Rpc..Lambda.2(TaskCompletionSource taskCompletionSource0) {
        this.arg$1 = taskCompletionSource0;
    }

    @Override
    public final void run() {
        Rpc.lambda$registerRpcInternal$3$Rpc(this.arg$1);
    }
}

