package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzag implements RemoteCall {
    private final boolean zzex;
    private final String[] zzff;

    zzag(boolean z, String[] arr_s) {
        this.zzex = z;
        this.zzff = arr_s;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((zzf)object0).zza(((TaskCompletionSource)object1), this.zzex, this.zzff);
    }
}

