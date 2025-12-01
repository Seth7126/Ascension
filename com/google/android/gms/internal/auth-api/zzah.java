package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.identity.SignInOptions;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzah implements RemoteCall {
    private final zzaf zzbk;

    zzah(zzaf zzaf0) {
        this.zzbk = zzaf0;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        zzai zzai0 = new zzai(this.zzbk, ((TaskCompletionSource)object1));
        ((zzad)((zzak)object0).getService()).zzc(zzai0, ((SignInOptions)this.zzbk.getApiOptions()).zzg());
    }
}

