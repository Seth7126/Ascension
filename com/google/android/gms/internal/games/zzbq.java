package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbq implements RemoteCall {
    private final String zzew;
    private final int zzey;
    private final int zzfl;
    private final int zzfo;
    private final boolean zzfp;

    zzbq(String s, int v, int v1, int v2, boolean z) {
        this.zzew = s;
        this.zzey = v;
        this.zzfl = v1;
        this.zzfo = v2;
        this.zzfp = z;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((zzf)object0).zzb(((TaskCompletionSource)object1), this.zzew, this.zzey, this.zzfl, this.zzfo, this.zzfp);
    }
}

