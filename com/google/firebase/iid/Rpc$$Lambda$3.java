package com.google.firebase.iid;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

final class Rpc..Lambda.3 implements OnCompleteListener {
    private final Rpc arg$1;
    private final String arg$2;
    private final ScheduledFuture arg$3;

    Rpc..Lambda.3(Rpc rpc0, String s, ScheduledFuture scheduledFuture0) {
        this.arg$1 = rpc0;
        this.arg$2 = s;
        this.arg$3 = scheduledFuture0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        this.arg$1.lambda$registerRpcInternal$4$Rpc(this.arg$2, this.arg$3, task0);
    }
}

