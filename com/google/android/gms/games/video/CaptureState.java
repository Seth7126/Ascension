package com.google.android.gms.games.video;

import android.os.Bundle;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

public final class CaptureState {
    private final boolean zzmf;
    private final int zzmg;
    private final int zzmh;
    private final boolean zzmi;
    private final boolean zzmj;

    private CaptureState(boolean z, int v, int v1, boolean z1, boolean z2) {
        Preconditions.checkArgument(VideoConfiguration.isValidCaptureMode(v, true));
        Preconditions.checkArgument(VideoConfiguration.isValidQualityLevel(v1, true));
        this.zzmf = z;
        this.zzmg = v;
        this.zzmh = v1;
        this.zzmi = z1;
        this.zzmj = z2;
    }

    public final int getCaptureMode() {
        return this.zzmg;
    }

    public final int getCaptureQuality() {
        return this.zzmh;
    }

    public final boolean isCapturing() {
        return this.zzmf;
    }

    public final boolean isOverlayVisible() {
        return this.zzmi;
    }

    public final boolean isPaused() {
        return this.zzmj;
    }

    @Override
    public final String toString() {
        return Objects.toStringHelper(this).add("IsCapturing", Boolean.valueOf(this.zzmf)).add("CaptureMode", this.zzmg).add("CaptureQuality", this.zzmh).add("IsOverlayVisible", Boolean.valueOf(this.zzmi)).add("IsPaused", Boolean.valueOf(this.zzmj)).toString();
    }

    public static CaptureState zza(Bundle bundle0) {
        return bundle0 == null || bundle0.get("IsCapturing") == null ? null : new CaptureState(bundle0.getBoolean("IsCapturing", false), bundle0.getInt("CaptureMode", -1), bundle0.getInt("CaptureQuality", -1), bundle0.getBoolean("IsOverlayVisible", false), bundle0.getBoolean("IsPaused", false));
    }
}

