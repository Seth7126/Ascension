package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzdp implements RemoteCall {
    private final Snapshot zzge;

    zzdp(Snapshot snapshot0) {
        this.zzge = snapshot0;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((zzf)object0).zza(this.zzge);
        ((TaskCompletionSource)object1).setResult(null);
    }
}

