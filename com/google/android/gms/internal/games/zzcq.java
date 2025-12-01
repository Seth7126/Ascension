package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzcq implements RemoteCall {
    private final String zzew;
    private final boolean zzfn;

    zzcq(String s, boolean z) {
        this.zzew = s;
        this.zzfn = z;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((zzf)object0).zza(((TaskCompletionSource)object1), this.zzew, this.zzfn);
    }
}

