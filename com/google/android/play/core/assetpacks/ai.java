package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.p;

final class ai extends p {
    final int a;
    final TaskCompletionSource b;
    final aw c;

    ai(aw aw0, TaskCompletionSource taskCompletionSource0, int v, TaskCompletionSource taskCompletionSource1) {
        this.c = aw0;
        this.a = v;
        this.b = taskCompletionSource1;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        try {
            Bundle bundle0 = aw.o(this.a);
            Bundle bundle1 = aw.m();
            as as0 = new as(this.c, this.b);
            ((f)aw.s(this.c).e()).i(aw.u(this.c), bundle0, bundle1, as0);
        }
        catch(RemoteException remoteException0) {
            aw.r().c(remoteException0, "notifySessionFailed", new Object[0]);
        }
    }
}

