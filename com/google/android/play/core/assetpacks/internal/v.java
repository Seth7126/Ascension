package com.google.android.play.core.assetpacks.internal;

import android.os.IBinder;

final class v extends p {
    final IBinder a;
    final y b;

    v(y y0, IBinder iBinder0) {
        this.b = y0;
        this.a = iBinder0;
        super();
    }

    @Override  // com.google.android.play.core.assetpacks.internal.p
    public final void a() {
        f f0 = e.b(this.a);
        z.m(this.b.a, f0);
        z.q(this.b.a);
        z.l(this.b.a, false);
        for(Object object0: z.h(this.b.a)) {
            ((Runnable)object0).run();
        }
        z.h(this.b.a).clear();
    }
}

