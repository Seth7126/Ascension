package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbn implements RemoteCall {
    private final String zzew;
    private final long zzfk;
    private final String zzfm;

    zzbn(String s, long v, String s1) {
        this.zzew = s;
        this.zzfk = v;
        this.zzfm = s1;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((zzf)object0).zza(((TaskCompletionSource)object1), this.zzew, this.zzfk, this.zzfm);
    }
}

