package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final class Rpc..Lambda.0 implements Continuation {
    static final Continuation $instance;

    static {
        Rpc..Lambda.0.$instance = new Rpc..Lambda.0();
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return Rpc.lambda$registerRpc$0$Rpc(task0);
    }
}

