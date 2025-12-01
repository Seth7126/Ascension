package com.google.android.play.core.assetpacks.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class q implements OnCompleteListener {
    public final z a;
    public final TaskCompletionSource b;

    public q(z z0, TaskCompletionSource taskCompletionSource0) {
        this.a = z0;
        this.b = taskCompletionSource0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        this.a.t(this.b, task0);
    }
}

