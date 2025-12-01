package com.google.firebase.iid;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

final class FirebaseInstanceId..Lambda.3 implements OnCompleteListener {
    private final CountDownLatch arg$1;

    FirebaseInstanceId..Lambda.3(CountDownLatch countDownLatch0) {
        this.arg$1 = countDownLatch0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        FirebaseInstanceId.lambda$awaitTaskAllowOnMainThread$4$FirebaseInstanceId(this.arg$1, task0);
    }
}

