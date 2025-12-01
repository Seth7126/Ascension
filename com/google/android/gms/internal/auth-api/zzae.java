package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzae implements RemoteCall {
    private final zzaf zzbk;
    private final BeginSignInRequest zzbl;

    zzae(zzaf zzaf0, BeginSignInRequest beginSignInRequest0) {
        this.zzbk = zzaf0;
        this.zzbl = beginSignInRequest0;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        zzaj zzaj0 = new zzaj(this.zzbk, ((TaskCompletionSource)object1));
        ((zzad)((zzak)object0).getService()).zzc(zzaj0, ((BeginSignInRequest)Preconditions.checkNotNull(this.zzbl)));
    }
}

