package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final class FcmBroadcastProcessor..Lambda.1 implements Continuation {
    private final Context arg$1;
    private final Intent arg$2;

    FcmBroadcastProcessor..Lambda.1(Context context0, Intent intent0) {
        this.arg$1 = context0;
        this.arg$2 = intent0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return FcmBroadcastProcessor.lambda$startMessagingService$2$FcmBroadcastProcessor(this.arg$1, this.arg$2, task0);
    }
}

