package com.google.android.gms.internal.games;

import android.view.View;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzas implements RemoteCall {
    private final View zzfj;

    zzas(View view0) {
        this.zzfj = view0;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((zzf)object0).zza(this.zzfj);
        ((TaskCompletionSource)object1).setResult(null);
    }
}

