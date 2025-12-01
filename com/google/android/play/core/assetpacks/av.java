package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

final class av extends al {
    private final co c;
    private final eb d;

    av(aw aw0, TaskCompletionSource taskCompletionSource0, co co0, eb eb0) {
        super(aw0, taskCompletionSource0);
        this.c = co0;
        this.d = eb0;
    }

    @Override  // com.google.android.play.core.assetpacks.al
    public final void n(int v, Bundle bundle0) {
        super.n(v, bundle0);
        this.a.trySetResult(AssetPackStates.a(bundle0, this.c, this.d, bf.a));
    }
}

