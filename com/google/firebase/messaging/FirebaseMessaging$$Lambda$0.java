package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnSuccessListener;

final class FirebaseMessaging..Lambda.0 implements OnSuccessListener {
    private final FirebaseMessaging arg$1;

    FirebaseMessaging..Lambda.0(FirebaseMessaging firebaseMessaging0) {
        this.arg$1 = firebaseMessaging0;
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object object0) {
        this.arg$1.lambda$new$0$FirebaseMessaging(((TopicsSubscriber)object0));
    }
}

