package com.google.firebase.iid;

import com.google.android.gms.tasks.Task;

final class FirebaseInstanceId..Lambda.4 implements GetTokenRequest {
    private final FirebaseInstanceId arg$1;
    private final String arg$2;
    private final String arg$3;
    private final String arg$4;

    FirebaseInstanceId..Lambda.4(FirebaseInstanceId firebaseInstanceId0, String s, String s1, String s2) {
        this.arg$1 = firebaseInstanceId0;
        this.arg$2 = s;
        this.arg$3 = s1;
        this.arg$4 = s2;
    }

    @Override  // com.google.firebase.iid.RequestDeduplicator$GetTokenRequest
    public final Task start() {
        return this.arg$1.lambda$getInstanceId$2$FirebaseInstanceId(this.arg$2, this.arg$3, this.arg$4);
    }
}

