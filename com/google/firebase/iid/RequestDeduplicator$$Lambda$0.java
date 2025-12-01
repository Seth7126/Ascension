package com.google.firebase.iid;

import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final class RequestDeduplicator..Lambda.0 implements Continuation {
    private final RequestDeduplicator arg$1;
    private final Pair arg$2;

    RequestDeduplicator..Lambda.0(RequestDeduplicator requestDeduplicator0, Pair pair0) {
        this.arg$1 = requestDeduplicator0;
        this.arg$2 = pair0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return this.arg$1.lambda$getOrStartGetTokenRequest$0$RequestDeduplicator(this.arg$2, task0);
    }
}

