package com.google.android.play.core.assetpacks.internal;

final class t extends p {
    final z a;

    t(z z0) {
        this.a = z0;
        super();
    }

    @Override  // com.google.android.play.core.assetpacks.internal.p
    public final void a() {
        synchronized(z.g(this.a)) {
            if(z.i(this.a).get() > 0 && z.i(this.a).decrementAndGet() > 0) {
                z.f(this.a).d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            z z0 = this.a;
            if(z.d(z0) != null) {
                z.f(z0).d("Unbind from service.", new Object[0]);
                z.a(this.a).unbindService(z.b(this.a));
                z.l(this.a, false);
                z.m(this.a, null);
                z.k(this.a, null);
            }
            z.o(this.a);
        }
    }
}

