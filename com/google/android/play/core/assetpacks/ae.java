package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.p;
import java.util.Map;

final class ae extends p {
    final Map a;
    final TaskCompletionSource b;
    final aw c;

    ae(aw aw0, TaskCompletionSource taskCompletionSource0, Map map0, TaskCompletionSource taskCompletionSource1) {
        this.c = aw0;
        this.a = map0;
        this.b = taskCompletionSource1;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        try {
            Bundle bundle0 = aw.n(this.a);
            ao ao0 = new ao(this.c, this.b);
            ((f)aw.s(this.c).e()).e(aw.u(this.c), bundle0, ao0);
        }
        catch(RemoteException remoteException0) {
            aw.r().c(remoteException0, "syncPacks", new Object[0]);
            RuntimeException runtimeException0 = new RuntimeException(remoteException0);
            this.b.trySetException(runtimeException0);
        }
    }
}

