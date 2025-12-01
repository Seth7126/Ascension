package com.google.android.play.core.assetpacks.internal;

import java.io.IOException;
import java.io.InputStream;

public final class ao extends an {
    private final an a;
    private final long b;
    private final long c;

    public ao(an an0, long v, long v1) {
        this.a = an0;
        long v2 = this.d(v);
        this.b = v2;
        this.c = this.d(v2 + v1);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.an
    public final long a() {
        return this.c - this.b;
    }

    @Override  // com.google.android.play.core.assetpacks.internal.an
    protected final InputStream b(long v, long v1) throws IOException {
        long v2 = this.d(this.b);
        long v3 = this.d(v1 + v2);
        return this.a.b(v2, v3 - v2);
    }

    @Override
    public final void close() throws IOException {
    }

    private final long d(long v) {
        if(v < 0L) {
            return 0L;
        }
        return v <= this.a.a() ? v : this.a.a();
    }
}

