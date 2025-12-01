package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.p;

final class ak extends p {
    final TaskCompletionSource a;
    final aw b;

    ak(aw aw0, TaskCompletionSource taskCompletionSource0, TaskCompletionSource taskCompletionSource1) {
        this.b = aw0;
        this.a = taskCompletionSource1;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        try {
            Bundle bundle0 = aw.m();
            ap ap0 = new ap(this.b, this.a);
            ((f)aw.t(this.b).e()).f(aw.u(this.b), bundle0, ap0);
        }
        catch(RemoteException remoteException0) {
            aw.r().c(remoteException0, "keepAlive", new Object[0]);
        }
    }
}

