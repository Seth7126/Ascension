package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final class Rpc..Lambda.1 implements Continuation {
    private final Rpc arg$1;
    private final Bundle arg$2;

    Rpc..Lambda.1(Rpc rpc0, Bundle bundle0) {
        this.arg$1 = rpc0;
        this.arg$2 = bundle0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return this.arg$1.lambda$registerRpcViaIntent$2$Rpc(this.arg$2, task0);
    }
}

