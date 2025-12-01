package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.p;

final class aj extends p {
    final int a;
    final String b;
    final String c;
    final int d;
    final TaskCompletionSource e;
    final aw f;

    aj(aw aw0, TaskCompletionSource taskCompletionSource0, int v, String s, String s1, int v1, TaskCompletionSource taskCompletionSource1) {
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
            an an0 = new an(this.f, this.e);
            ((f)aw.s(this.f).e()).d(aw.u(this.f), bundle0, bundle1, an0);
        }
        catch(RemoteException remoteException0) {
            aw.r().b("getChunkFileDescriptor(%s, %s, %d, session=%d)", new Object[]{this.b, this.c, this.d, this.a});
            RuntimeException runtimeException0 = new RuntimeException(remoteException0);
            this.e.trySetException(runtimeException0);
        }
    }
}

