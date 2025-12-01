package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbl implements RemoteCall {
    private final String zzew;
    private final int zzey;
    private final int zzfl;

    zzbl(String s, int v, int v1) {
        this.zzew = s;
        this.zzey = v;
        this.zzfl = v1;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((TaskCompletionSource)object1).setResult(((zzf)object0).zza(this.zzew, this.zzey, this.zzfl));
    }
}

