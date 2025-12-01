package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

final class ap extends al {
    final aw c;

    ap(aw aw0, TaskCompletionSource taskCompletionSource0) {
        this.c = aw0;
        super(aw0, taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.assetpacks.al
    public final void d(Bundle bundle0) {
        aw.t(this.c).u(this.a);
        int v = bundle0.getInt("error_code");
        aw.r().b("onError(%d)", new Object[]{v});
        this.a.trySetException(new AssetPackException(v));
    }

    @Override  // com.google.android.play.core.assetpacks.al
    public final void h(Bundle bundle0, Bundle bundle1) {
        super.h(bundle0, bundle1);
        if(!aw.x(this.c).compareAndSet(true, false)) {
            aw.r().e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if(bundle0.getBoolean("keep_alive")) {
            this.c.f();
        }
    }
}

