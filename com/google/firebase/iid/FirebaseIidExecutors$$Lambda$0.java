package com.google.firebase.iid;

import java.util.concurrent.Executor;

final class FirebaseIidExecutors..Lambda.0 implements Executor {
    static final Executor $instance;

    static {
        FirebaseIidExecutors..Lambda.0.$instance = new FirebaseIidExecutors..Lambda.0();
    }

    @Override
    public final void execute(Runnable runnable0) {
        runnable0.run();
    }
}

