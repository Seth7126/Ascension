package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.p;

final class ab extends p {
    final String a;
    final TaskCompletionSource b;
    final aw c;

    ab(aw aw0, TaskCompletionSource taskCompletionSource0, String s, TaskCompletionSource taskCompletionSource1) {
        this.c = aw0;
        this.a = s;
        this.b = taskCompletionSource1;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        try {
            ((f)aw.s(this.c).e()).j(aw.u(this.c), aw.l(0, this.a), aw.m(), new at(this.c, this.b));
        }
        catch(RemoteException remoteException0) {
            aw.r().c(remoteException0, "removePack(%s)", new Object[]{this.a});
        }
    }
}

