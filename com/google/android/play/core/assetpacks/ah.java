package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.p;

final class ah extends p {
    final int a;
    final String b;
    final TaskCompletionSource c;
    final int d;
    final aw e;

    ah(aw aw0, TaskCompletionSource taskCompletionSource0, int v, String s, TaskCompletionSource taskCompletionSource1, int v1) {
        this.e = aw0;
        this.a = v;
        this.b = s;
        this.c = taskCompletionSource1;
        this.d = v1;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        try {
            Bundle bundle0 = aw.l(this.a, this.b);
            Bundle bundle1 = aw.m();
            ar ar0 = new ar(this.e, this.c, this.a, this.b, this.d);
            ((f)aw.s(this.e).e()).h(aw.u(this.e), bundle0, bundle1, ar0);
        }
        catch(RemoteException remoteException0) {
            aw.r().c(remoteException0, "notifyModuleCompleted", new Object[0]);
        }
    }
}

