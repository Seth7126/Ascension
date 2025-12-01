package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

final class au extends al {
    private final co c;
    private final eb d;
    private final be e;

    au(aw aw0, TaskCompletionSource taskCompletionSource0, co co0, eb eb0, be be0) {
        super(aw0, taskCompletionSource0);
        this.c = co0;
        this.d = eb0;
        this.e = be0;
    }

    @Override  // com.google.android.play.core.assetpacks.al
    public final void m(Bundle bundle0, Bundle bundle1) {
        super.m(bundle0, bundle1);
        this.a.trySetResult(AssetPackStates.a(bundle0, this.c, this.d, this.e));
    }
}

