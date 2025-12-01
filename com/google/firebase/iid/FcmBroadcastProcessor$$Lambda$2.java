package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final class FcmBroadcastProcessor..Lambda.2 implements Continuation {
    static final Continuation $instance;

    static {
        FcmBroadcastProcessor..Lambda.2.$instance = new FcmBroadcastProcessor..Lambda.2();
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return FcmBroadcastProcessor.lambda$bindToMessagingService$3$FcmBroadcastProcessor(task0);
    }
}

