package com.google.android.play.core.assetpacks;

import com.google.android.gms.tasks.TaskCompletionSource;

public final class e implements Runnable {
    public final l a;
    public final String b;
    public final TaskCompletionSource c;

    public e(l l0, String s, TaskCompletionSource taskCompletionSource0) {
        this.a = l0;
        this.b = s;
        this.c = taskCompletionSource0;
    }

    @Override
    public final void run() {
        this.a.d(this.b, this.c);
    }
}

