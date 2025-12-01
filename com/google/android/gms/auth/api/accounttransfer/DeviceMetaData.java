package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private boolean zzbs;
    private long zzbt;
    private final boolean zzbu;
    private final int zzv;

    static {
        DeviceMetaData.CREATOR = new zzv();
    }

    DeviceMetaData(int v, boolean z, long v1, boolean z1) {
        this.zzv = v;
        this.zzbs = z;
        this.zzbt = v1;
        this.zzbu = z1;
    }

    public long getMinAgeOfLockScreen() {
        return this.zzbt;
    }

    public boolean isChallengeAllowed() {
        return this.zzbu;
    }

    public boolean isLockScreenSolved() {
        return this.zzbs;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zzv);
        SafeParcelWriter.writeBoolean(parcel0, 2, this.isLockScreenSolved());
        SafeParcelWriter.writeLong(parcel0, 3, this.getMinAgeOfLockScreen());
        SafeParcelWriter.writeBoolean(parcel0, 4, this.isChallengeAllowed());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

