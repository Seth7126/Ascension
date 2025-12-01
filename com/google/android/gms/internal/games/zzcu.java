package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzcu implements RemoteCall {
    private final String zzew;
    private final int zzey;
    private final boolean zzgb;

    zzcu(String s, int v, boolean z) {
        this.zzew = s;
        this.zzey = v;
        this.zzgb = z;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((zzf)object0).zza(((TaskCompletionSource)object1), this.zzew, this.zzey, false, this.zzgb);
    }
}

