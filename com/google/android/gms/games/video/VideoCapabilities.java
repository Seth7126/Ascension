package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzb;

public final class VideoCapabilities extends zzb {
    public static final Parcelable.Creator CREATOR;
    private final boolean zzma;
    private final boolean zzmb;
    private final boolean zzmc;
    private final boolean[] zzmd;
    private final boolean[] zzme;

    static {
        VideoCapabilities.CREATOR = new zza();
    }

    public VideoCapabilities(boolean z, boolean z1, boolean z2, boolean[] arr_z, boolean[] arr_z1) {
        this.zzma = z;
        this.zzmb = z1;
        this.zzmc = z2;
        this.zzmd = arr_z;
        this.zzme = arr_z1;
    }

    // 去混淆评级： 低(23)
    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof VideoCapabilities)) {
            return false;
        }
        return this == object0 ? true : Objects.equal(((VideoCapabilities)object0).getSupportedCaptureModes(), this.getSupportedCaptureModes()) && Objects.equal(((VideoCapabilities)object0).getSupportedQualityLevels(), this.getSupportedQualityLevels()) && Objects.equal(Boolean.valueOf(((VideoCapabilities)object0).isCameraSupported()), Boolean.valueOf(this.isCameraSupported())) && Objects.equal(Boolean.valueOf(((VideoCapabilities)object0).isMicSupported()), Boolean.valueOf(this.isMicSupported())) && Objects.equal(Boolean.valueOf(((VideoCapabilities)object0).isWriteStorageSupported()), Boolean.valueOf(this.isWriteStorageSupported()));
    }

    public final boolean[] getSupportedCaptureModes() {
        return this.zzmd;
    }

    public final boolean[] getSupportedQualityLevels() {
        return this.zzme;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.getSupportedCaptureModes(), this.getSupportedQualityLevels(), Boolean.valueOf(this.isCameraSupported()), Boolean.valueOf(this.isMicSupported()), Boolean.valueOf(this.isWriteStorageSupported())});
    }

    public final boolean isCameraSupported() {
        return this.zzma;
    }

    // 去混淆评级： 中等(50)
    public final boolean isFullySupported(int v, int v1) {
        return this.zzma && this.zzmb && this.zzmc && this.supportsCaptureMode(v) && this.supportsQualityLevel(v1);
    }

    public final boolean isMicSupported() {
        return this.zzmb;
    }

    public final boolean isWriteStorageSupported() {
        return this.zzmc;
    }

    public final boolean supportsCaptureMode(int v) {
        Preconditions.checkState(VideoConfiguration.isValidCaptureMode(v, false));
        return this.zzmd[v];
    }

    public final boolean supportsQualityLevel(int v) {
        Preconditions.checkState(VideoConfiguration.isValidQualityLevel(v, false));
        return this.zzme[v];
    }

    @Override
    public final String toString() {
        return Objects.toStringHelper(this).add("SupportedCaptureModes", this.getSupportedCaptureModes()).add("SupportedQualityLevels", this.getSupportedQualityLevels()).add("CameraSupported", Boolean.valueOf(this.isCameraSupported())).add("MicSupported", Boolean.valueOf(this.isMicSupported())).add("StorageWriteSupported", Boolean.valueOf(this.isWriteStorageSupported())).toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 1, this.isCameraSupported());
        SafeParcelWriter.writeBoolean(parcel0, 2, this.isMicSupported());
        SafeParcelWriter.writeBoolean(parcel0, 3, this.isWriteStorageSupported());
        SafeParcelWriter.writeBooleanArray(parcel0, 4, this.getSupportedCaptureModes(), false);
        SafeParcelWriter.writeBooleanArray(parcel0, 5, this.getSupportedQualityLevels(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

