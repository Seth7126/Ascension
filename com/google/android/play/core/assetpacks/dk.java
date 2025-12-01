package com.google.android.play.core.assetpacks;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

public final class dk implements Runnable {
    public final do a;
    public final List b;
    public final be c;
    public final TaskCompletionSource d;

    public dk(do do0, List list0, be be0, TaskCompletionSource taskCompletionSource0) {
        this.a = do0;
        this.b = list0;
        this.c = be0;
        this.d = taskCompletionSource0;
    }

    @Override
    public final void run() {
        this.a.m(this.b, this.c, this.d);
    }
}

