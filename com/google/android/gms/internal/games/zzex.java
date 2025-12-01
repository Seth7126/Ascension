package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.video.Videos.CaptureAvailableResult;

final class zzex implements CaptureAvailableResult {
    private final Status zzfc;

    zzex(zzeu zzeu0, Status status0) {
        this.zzfc = status0;
        super();
    }

    @Override  // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzfc;
    }

    @Override  // com.google.android.gms.games.video.Videos$CaptureAvailableResult
    public final boolean isAvailable() {
        return false;
    }
}

