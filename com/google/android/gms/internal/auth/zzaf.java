package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String accountType;
    private final byte[] zzbp;
    private final int zzv;

    static {
        zzaf.CREATOR = new zzag();
    }

    zzaf(int v, String s, byte[] arr_b) {
        this.zzv = 1;
        this.accountType = (String)Preconditions.checkNotNull(s);
        this.zzbp = (byte[])Preconditions.checkNotNull(arr_b);
    }

    public zzaf(String s, byte[] arr_b) {
        this(1, s, arr_b);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zzv);
        SafeParcelWriter.writeString(parcel0, 2, this.accountType, false);
        SafeParcelWriter.writeByteArray(parcel0, 3, this.zzbp, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

