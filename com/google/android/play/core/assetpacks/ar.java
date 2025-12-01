package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

final class ar extends al {
    final int c;
    final String d;
    final int e;
    final aw f;

    ar(aw aw0, TaskCompletionSource taskCompletionSource0, int v, String s, int v1) {
        this.f = aw0;
        super(aw0, taskCompletionSource0);
        this.c = v;
        this.d = s;
        this.e = v1;
    }

    @Override  // com.google.android.play.core.assetpacks.al
    public final void d(Bundle bundle0) {
        aw.s(this.f).u(this.a);
        aw.r().b("onError(%d), retrying notifyModuleCompleted...", new Object[]{bundle0.getInt("error_code")});
        int v = this.e;
        if(v > 0) {
            aw.y(this.f, this.c, this.d, v - 1);
        }
    }
}

