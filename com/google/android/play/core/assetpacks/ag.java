package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.p;

final class ag extends p {
    final int a;
    final String b;
    final String c;
    final int d;
    final TaskCompletionSource e;
    final aw f;

    ag(aw aw0, TaskCompletionSource taskCompletionSource0, int v, String s, String s1, int v1, TaskCompletionSource taskCompletionSource1) {
        this.f = aw0;
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = v1;
        this.e = taskCompletionSource1;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        try {
            Bundle bundle0 = aw.k(this.a, this.b, this.c, this.d);
            Bundle bundle1 = aw.m();
            aq aq0 = new aq(this.f, this.e);
            ((f)aw.s(this.f).e()).g(aw.u(this.f), bundle0, bundle1, aq0);
        }
        catch(RemoteException remoteException0) {
            aw.r().c(remoteException0, "notifyChunkTransferred", new Object[0]);
        }
    }
}

