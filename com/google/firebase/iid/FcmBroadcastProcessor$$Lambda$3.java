package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final class FcmBroadcastProcessor..Lambda.3 implements Continuation {
    static final Continuation $instance;

    static {
        FcmBroadcastProcessor..Lambda.3.$instance = new FcmBroadcastProcessor..Lambda.3();
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return FcmBroadcastProcessor.lambda$startMessagingService$1$FcmBroadcastProcessor(task0);
    }
}

