package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzat implements RemoteCall {
    private final int zzdr;

    zzat(int v) {
        this.zzdr = v;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((zzf)object0).zzn(this.zzdr);
        ((TaskCompletionSource)object1).setResult(null);
    }
}

