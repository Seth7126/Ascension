package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class af extends p {
    final List a;
    final Map b;
    final TaskCompletionSource c;
    final be d;
    final aw e;

    af(aw aw0, TaskCompletionSource taskCompletionSource0, List list0, Map map0, TaskCompletionSource taskCompletionSource1, be be0) {
        this.e = aw0;
        this.a = list0;
        this.b = map0;
        this.c = taskCompletionSource1;
        this.d = be0;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        ArrayList arrayList0 = aw.v(this.a);
        try {
            Bundle bundle0 = aw.n(this.b);
            au au0 = new au(this.e, this.c, aw.p(this.e), aw.q(this.e), this.d);
            ((f)aw.s(this.e).e()).k(aw.u(this.e), arrayList0, bundle0, au0);
        }
        catch(RemoteException remoteException0) {
            aw.r().c(remoteException0, "getPackStates(%s)", new Object[]{this.a});
            RuntimeException runtimeException0 = new RuntimeException(remoteException0);
            this.c.trySetException(runtimeException0);
        }
    }
}

