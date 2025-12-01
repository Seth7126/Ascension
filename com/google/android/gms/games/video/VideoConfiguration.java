package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class VideoConfiguration extends AbstractSafeParcelable {
    public static final class Builder {
        private int zzmg;
        private int zzmk;
        private boolean zzml;
        private boolean zzmm;
        private boolean zzmn;

        public Builder(int v, int v1) {
            this.zzmk = v;
            this.zzmg = v1;
            this.zzmm = true;
            this.zzmn = true;
            this.zzml = true;
        }

        public final VideoConfiguration build() {
            return new VideoConfiguration(this.zzmk, this.zzmg, this.zzml, this.zzmm, this.zzmn);
        }

        public final Builder setCameraEnabled(boolean z) {
            this.zzmm = z;
            return this;
        }

        public final Builder setCaptureMode(int v) {
            this.zzmg = v;
            return this;
        }

        public final Builder setMicEnabled(boolean z) {
            this.zzmn = z;
            return this;
        }

        public final Builder setQualityLevel(int v) {
            this.zzmk = v;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ValidCaptureModes {
    }

    public static final int CAPTURE_MODE_FILE = 0;
    public static final int CAPTURE_MODE_STREAM = 1;
    public static final int CAPTURE_MODE_UNKNOWN = -1;
    public static final Parcelable.Creator CREATOR = null;
    public static final int NUM_CAPTURE_MODE = 2;
    public static final int NUM_QUALITY_LEVEL = 4;
    public static final int QUALITY_LEVEL_FULLHD = 3;
    public static final int QUALITY_LEVEL_HD = 1;
    public static final int QUALITY_LEVEL_SD = 0;
    public static final int QUALITY_LEVEL_UNKNOWN = -1;
    public static final int QUALITY_LEVEL_XHD = 2;
    private final int zzmg;
    private final int zzmk;
    private final boolean zzml;
    private final boolean zzmm;
    private final boolean zzmn;

    static {
        VideoConfiguration.CREATOR = new zzb();
    }

    public VideoConfiguration(int v, int v1, boolean z, boolean z1, boolean z2) {
        Preconditions.checkArgument(VideoConfiguration.isValidQualityLevel(v, false));
        Preconditions.checkArgument(VideoConfiguration.isValidCaptureMode(v1, false));
        this.zzmk = v;
        this.zzmg = v1;
        this.zzml = z;
        this.zzmm = z1;
        this.zzmn = z2;
    }

    public final boolean getCameraEnabled() {
        return this.zzmm;
    }

    public final int getCaptureMode() {
        return this.zzmg;
    }

    public final boolean getMicEnabled() {
        return this.zzmn;
    }

    public final int getQualityLevel() {
        return this.zzmk;
    }

    public static boolean isValidCaptureMode(int v, boolean z) {
        if(v != -1) {
            switch(v) {
                case 0: {
                    return true;
                }
                case 1: {
                    break;
                }
                default: {
                    return false;
                }
            }
        }
        return z;
    }

    public static boolean isValidQualityLevel(int v, boolean z) {
        return v == -1 ? z : v == 0 || v == 1 || (v == 2 || v == 3);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.getQualityLevel());
        SafeParcelWriter.writeInt(parcel0, 2, this.getCaptureMode());
        SafeParcelWriter.writeBoolean(parcel0, 7, this.zzml);
        SafeParcelWriter.writeBoolean(parcel0, 8, this.getCameraEnabled());
        SafeParcelWriter.writeBoolean(parcel0, 9, this.getMicEnabled());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

