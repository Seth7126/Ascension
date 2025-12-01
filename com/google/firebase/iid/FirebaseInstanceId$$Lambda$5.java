package com.google.firebase.iid;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

final class FirebaseInstanceId..Lambda.5 implements SuccessContinuation {
    private final FirebaseInstanceId arg$1;
    private final String arg$2;
    private final String arg$3;
    private final String arg$4;

    FirebaseInstanceId..Lambda.5(FirebaseInstanceId firebaseInstanceId0, String s, String s1, String s2) {
        this.arg$1 = firebaseInstanceId0;
        this.arg$2 = s;
        this.arg$3 = s1;
        this.arg$4 = s2;
    }

    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object object0) {
        return this.arg$1.lambda$getInstanceId$1$FirebaseInstanceId(this.arg$2, this.arg$3, this.arg$4, ((String)object0));
    }
}

