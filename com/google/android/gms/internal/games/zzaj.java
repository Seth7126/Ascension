package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzaj implements RemoteCall {
    private final String zzew;
    private final int zzey;

    zzaj(String s, int v) {
        this.zzew = s;
        this.zzey = v;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        TaskCompletionSource taskCompletionSource0 = (TaskCompletionSource)object1;
        ((zzf)object0).zzb(this.zzew, this.zzey);
    }
}

