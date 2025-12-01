package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzeo implements RemoteCall {
    private final ListenerHolder zzgs;

    zzeo(ListenerHolder listenerHolder0) {
        this.zzgs = listenerHolder0;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((zzf)object0).zza(this.zzgs);
        ((TaskCompletionSource)object1).setResult(null);
    }
}

