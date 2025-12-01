package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final class FirebaseInstanceId..Lambda.1 implements Continuation {
    private final FirebaseInstanceId arg$1;
    private final String arg$2;
    private final String arg$3;

    FirebaseInstanceId..Lambda.1(FirebaseInstanceId firebaseInstanceId0, String s, String s1) {
        this.arg$1 = firebaseInstanceId0;
        this.arg$2 = s;
        this.arg$3 = s1;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return this.arg$1.lambda$getInstanceId$3$FirebaseInstanceId(this.arg$2, this.arg$3, task0);
    }
}

