package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.zzb;

abstract class zzaa extends zzb {
    private final String zzfb;

    public zzaa(String s, GoogleApiClient googleApiClient0) {
        super(googleApiClient0);
        this.zzfb = s;
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    public Result createFailedResult(Status status0) {
        return new zzad(this, status0);
    }
}

