package com.google.android.play.core.assetpacks.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public abstract class an implements Closeable {
    public abstract long a();

    protected abstract InputStream b(long arg1, long arg2) throws IOException;

    public final InputStream c() throws IOException {
        synchronized(this) {
            return this.b(0L, this.a());
        }
    }
}

