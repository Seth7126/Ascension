package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String accountType;
    private final int zzbw;
    private final int zzv;

    static {
        zzab.CREATOR = new zzac();
    }

    zzab(int v, String s, int v1) {
        this.zzv = 1;
        this.accountType = (String)Preconditions.checkNotNull(s);
        this.zzbw = v1;
    }

    public zzab(String s, int v) {
        this(1, s, v);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zzv);
        SafeParcelWriter.writeString(parcel0, 2, this.accountType, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzbw);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

