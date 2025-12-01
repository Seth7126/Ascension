package com.google.android.play.core.assetpacks;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

public final class dj implements Runnable {
    public final do a;
    public final List b;
    public final TaskCompletionSource c;

    public dj(do do0, List list0, TaskCompletionSource taskCompletionSource0) {
        this.a = do0;
        this.b = list0;
        this.c = taskCompletionSource0;
    }

    @Override
    public final void run() {
        this.a.o(this.b, this.c);
    }
}

