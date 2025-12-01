package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzer implements RemoteCall {
    static final RemoteCall zzev;

    static {
        zzer.zzev = new zzer();
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((zzf)object0).zzbb();
        ((TaskCompletionSource)object1).setResult(Boolean.TRUE);
    }
}

