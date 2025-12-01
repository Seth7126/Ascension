package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

final class EnhancedIntentService..Lambda.0 implements Runnable {
    private final EnhancedIntentService arg$1;
    private final Intent arg$2;
    private final TaskCompletionSource arg$3;

    EnhancedIntentService..Lambda.0(EnhancedIntentService enhancedIntentService0, Intent intent0, TaskCompletionSource taskCompletionSource0) {
        this.arg$1 = enhancedIntentService0;
        this.arg$2 = intent0;
        this.arg$3 = taskCompletionSource0;
    }

    @Override
    public final void run() {
        this.arg$1.lambda$processIntent$0$EnhancedIntentService(this.arg$2, this.arg$3);
    }
}

