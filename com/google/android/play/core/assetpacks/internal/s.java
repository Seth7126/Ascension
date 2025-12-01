package com.google.android.play.core.assetpacks.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

final class s extends p {
    final TaskCompletionSource a;
    final p b;
    final z c;

    s(z z0, TaskCompletionSource taskCompletionSource0, TaskCompletionSource taskCompletionSource1, p p0) {
        this.c = z0;
        this.a = taskCompletionSource1;
        this.b = p0;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.p
    public final void a() {
        synchronized(z.g(this.c)) {
            z.n(this.c, this.a);
            if(z.i(this.c).getAndIncrement() > 0) {
                z.f(this.c).d("Already connected to the service.", new Object[0]);
            }
            z.p(this.c, this.b);
        }
    }
}

