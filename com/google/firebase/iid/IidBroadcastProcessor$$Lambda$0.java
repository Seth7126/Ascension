package com.google.firebase.iid;

import android.content.Intent;
import java.util.concurrent.Callable;

final class IidBroadcastProcessor..Lambda.0 implements Callable {
    private final Intent arg$1;

    IidBroadcastProcessor..Lambda.0(Intent intent0) {
        this.arg$1 = intent0;
    }

    @Override
    public final Object call() {
        return IidBroadcastProcessor.lambda$process$0$IidBroadcastProcessor(this.arg$1);
    }
}

