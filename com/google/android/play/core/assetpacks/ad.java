package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.f;
import com.google.android.play.core.assetpacks.internal.p;
import java.util.ArrayList;
import java.util.List;

final class ad extends p {
    final List a;
    final TaskCompletionSource b;
    final aw c;

    ad(aw aw0, TaskCompletionSource taskCompletionSource0, List list0, TaskCompletionSource taskCompletionSource1) {
        this.c = aw0;
        this.a = list0;
        this.b = taskCompletionSource1;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.p
    protected final void a() {
        ArrayList arrayList0 = aw.v(this.a);
        try {
            Bundle bundle0 = aw.m();
            am am0 = new am(this.c, this.b);
            ((f)aw.s(this.c).e()).c(aw.u(this.c), arrayList0, bundle0, am0);
        }
        catch(RemoteException remoteException0) {
            aw.r().c(remoteException0, "cancelDownloads(%s)", new Object[]{this.a});
        }
    }
}

