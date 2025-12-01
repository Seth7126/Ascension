package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzdl implements RemoteCall {
    private final String zzew;
    private final boolean zzfn;
    private final int zzfo;
    private final boolean zzgb;

    zzdl(String s, boolean z, boolean z1, int v) {
        this.zzew = s;
        this.zzfn = z;
        this.zzgb = z1;
        this.zzfo = v;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((TaskCompletionSource)object1).setResult(((zzf)object0).zza(this.zzew, this.zzfn, this.zzgb, this.zzfo));
    }
}

