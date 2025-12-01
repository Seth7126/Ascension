package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzar implements Result {
    private final Status zzfc;

    zzar(zzao zzao0, Status status0) {
        this.zzfc = status0;
        super();
    }

    @Override  // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzfc;
    }
}

