package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbk implements RemoteCall {
    private final String zzew;
    private final long zzfk;

    zzbk(String s, long v) {
        this.zzew = s;
        this.zzfk = v;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((zzf)object0).zza(((TaskCompletionSource)object1), this.zzew, this.zzfk, null);
    }
}

