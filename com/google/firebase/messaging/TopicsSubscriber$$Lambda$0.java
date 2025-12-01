package com.google.firebase.messaging;

import android.content.Context;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.GmsRpc;
import com.google.firebase.iid.Metadata;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

final class TopicsSubscriber..Lambda.0 implements Callable {
    private final Context arg$1;
    private final ScheduledExecutorService arg$2;
    private final FirebaseInstanceId arg$3;
    private final Metadata arg$4;
    private final GmsRpc arg$5;

    TopicsSubscriber..Lambda.0(Context context0, ScheduledExecutorService scheduledExecutorService0, FirebaseInstanceId firebaseInstanceId0, Metadata metadata0, GmsRpc gmsRpc0) {
        this.arg$1 = context0;
        this.arg$2 = scheduledExecutorService0;
        this.arg$3 = firebaseInstanceId0;
        this.arg$4 = metadata0;
        this.arg$5 = gmsRpc0;
    }

    @Override
    public final Object call() {
        return TopicsSubscriber.lambda$createInstance$0$TopicsSubscriber(this.arg$1, this.arg$2, this.arg$3, this.arg$4, this.arg$5);
    }
}

