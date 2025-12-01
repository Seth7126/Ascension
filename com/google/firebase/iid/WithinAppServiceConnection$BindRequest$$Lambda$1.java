package com.google.firebase.iid;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

final class WithinAppServiceConnection.BindRequest..Lambda.1 implements OnCompleteListener {
    private final ScheduledFuture arg$1;

    WithinAppServiceConnection.BindRequest..Lambda.1(ScheduledFuture scheduledFuture0) {
        this.arg$1 = scheduledFuture0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        BindRequest.lambda$arrangeTimeout$1$WithinAppServiceConnection$BindRequest(this.arg$1, task0);
    }
}

