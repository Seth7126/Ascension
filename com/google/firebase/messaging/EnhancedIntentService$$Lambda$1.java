package com.google.firebase.messaging;

import java.util.concurrent.Executor;

final class EnhancedIntentService..Lambda.1 implements Executor {
    static final Executor $instance;

    static {
        EnhancedIntentService..Lambda.1.$instance = new EnhancedIntentService..Lambda.1();
    }

    @Override
    public final void execute(Runnable runnable0) {
        runnable0.run();
    }
}

