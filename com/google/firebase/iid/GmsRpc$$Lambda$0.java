package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final class GmsRpc..Lambda.0 implements Continuation {
    private final GmsRpc arg$1;

    GmsRpc..Lambda.0(GmsRpc gmsRpc0) {
        this.arg$1 = gmsRpc0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return this.arg$1.lambda$extractResponseWhenComplete$0$GmsRpc(task0);
    }
}

