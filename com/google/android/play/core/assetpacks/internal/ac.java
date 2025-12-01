package com.google.android.play.core.assetpacks.internal;

import java.util.concurrent.atomic.AtomicReference;

public final class ac {
    private static final AtomicReference a;

    static {
        ac.a = new AtomicReference(null);
    }

    static ab a() {
        return (ab)ac.a.get();
    }
}

