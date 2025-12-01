package com.google.firebase.messaging;

import com.google.android.datatransport.Transformer;

final class FirebaseMessagingService..Lambda.0 implements Transformer {
    static final Transformer $instance;

    static {
        FirebaseMessagingService..Lambda.0.$instance = new FirebaseMessagingService..Lambda.0();
    }

    @Override  // com.google.android.datatransport.Transformer
    public final Object apply(Object object0) {
        return ((String)object0).getBytes();
    }
}

