package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks;

final class zzx implements ResultHolder {
    private final SignOutCallbacks zzdu;

    zzx(SignOutCallbacks baseGmsClient$SignOutCallbacks0) {
        this.zzdu = baseGmsClient$SignOutCallbacks0;
        super();
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder
    public final void setFailedResult(Status status0) {
        this.zzdu.onSignOutComplete();
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder
    public final void setResult(Object object0) {
        Status status0 = (Status)object0;
        this.zzdu.onSignOutComplete();
    }
}

