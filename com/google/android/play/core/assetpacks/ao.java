package com.google.android.play.core.assetpacks;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

final class ao extends al {
    final aw c;

    ao(aw aw0, TaskCompletionSource taskCompletionSource0) {
        this.c = aw0;
        super(aw0, taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.assetpacks.al
    public final void g(List list0) {
        super.g(list0);
        List list1 = aw.w(this.c, list0);
        this.a.trySetResult(list1);
    }
}

