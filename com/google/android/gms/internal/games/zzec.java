package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.zzb;

abstract class zzec extends zzb {
    private zzec(GoogleApiClient googleApiClient0) {
        super(googleApiClient0);
    }

    zzec(GoogleApiClient googleApiClient0, zzdt zzdt0) {
        this(googleApiClient0);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    public Result createFailedResult(Status status0) {
        return new zzef(this, status0);
    }
}

