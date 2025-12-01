package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

final class FirebaseMessaging..Lambda.1 implements SuccessContinuation {
    private final String arg$1;

    FirebaseMessaging..Lambda.1(String s) {
        this.arg$1 = s;
    }

    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object object0) {
        return FirebaseMessaging.lambda$subscribeToTopic$1$FirebaseMessaging(this.arg$1, ((TopicsSubscriber)object0));
    }
}

