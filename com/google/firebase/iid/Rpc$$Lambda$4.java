package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

final class Rpc..Lambda.4 implements SuccessContinuation {
    static final SuccessContinuation $instance;

    static {
        Rpc..Lambda.4.$instance = new Rpc..Lambda.4();
    }

    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object object0) {
        return Rpc.lambda$registerRpcViaIntent$1$Rpc(((Bundle)object0));
    }
}

