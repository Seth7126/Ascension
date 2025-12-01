package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class ac extends p {
    final List a;
    final Map b;
    final TaskCompletionSource c;
    final aw d;

    ac(aw aw0, TaskCompletionSource taskCompletionSource0, List list0, Map map0, TaskCompletionSource taskCompletionSource1) {
        this.d = aw0;
        this.a = list0;
        this.b = map0;
        this.c = taskCompletionSource1;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        ArrayList arrayList0 = aw.v(this.a);
        try {
            Bundle bundle0 = aw.n(this.b);
            ((f)aw.s(this.d).e()).l(aw.u(this.d), arrayList0, bundle0, new av(this.d, this.c, aw.p(this.d), aw.q(this.d)));
        }
        catch(RemoteException remoteException0) {
            aw.r().c(remoteException0, "startDownload(%s)", new Object[]{this.a});
            RuntimeException runtimeException0 = new RuntimeException(remoteException0);
            this.c.trySetException(runtimeException0);
        }
    }
}

