package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

final class FcmBroadcastProcessor..Lambda.0 implements Callable {
    private final Context arg$1;
    private final Intent arg$2;

    FcmBroadcastProcessor..Lambda.0(Context context0, Intent intent0) {
        this.arg$1 = context0;
        this.arg$2 = intent0;
    }

    @Override
    public final Object call() {
        return FcmBroadcastProcessor.lambda$startMessagingService$0$FcmBroadcastProcessor(this.arg$1, this.arg$2);
    }
}

