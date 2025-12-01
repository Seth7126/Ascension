package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbs implements RemoteCall {
    private final String zzew;
    private final long zzfk;

    zzbs(String s, long v) {
        this.zzew = s;
        this.zzfk = v;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        TaskCompletionSource taskCompletionSource0 = (TaskCompletionSource)object1;
        ((zzf)object0).submitScore(this.zzew, this.zzfk, null);
    }
}

