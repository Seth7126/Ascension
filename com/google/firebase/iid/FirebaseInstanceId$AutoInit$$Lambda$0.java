package com.google.firebase.iid;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;

final class FirebaseInstanceId.AutoInit..Lambda.0 implements EventHandler {
    private final AutoInit arg$1;

    FirebaseInstanceId.AutoInit..Lambda.0(AutoInit firebaseInstanceId$AutoInit0) {
        this.arg$1 = firebaseInstanceId$AutoInit0;
    }

    @Override  // com.google.firebase.events.EventHandler
    public final void handle(Event event0) {
        this.arg$1.lambda$initialize$0$FirebaseInstanceId$AutoInit(event0);
    }
}

