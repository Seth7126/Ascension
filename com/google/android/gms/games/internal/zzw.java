package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.games.GamesStatusCodes;

final class zzw extends zzaq {
    zzw(ResultHolder baseImplementation$ResultHolder0) {
        super(baseImplementation$ResultHolder0);
    }

    @Override  // com.google.android.gms.games.internal.zza
    public final void onSignOutComplete() {
        this.setResult(GamesStatusCodes.zza(0));
    }
}

