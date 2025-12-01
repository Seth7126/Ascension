package com.google.firebase.iid;

import java.util.concurrent.Executor;

final class FirebaseInstanceId..Lambda.2 implements Executor {
    static final Executor $instance;

    static {
        FirebaseInstanceId..Lambda.2.$instance = new FirebaseInstanceId..Lambda.2();
    }

    @Override
    public final void execute(Runnable runnable0) {
        runnable0.run();
    }
}

