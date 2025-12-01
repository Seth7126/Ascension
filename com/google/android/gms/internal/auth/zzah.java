package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String accountType;
    private final PendingIntent zzbx;
    private final int zzv;

    static {
        zzah.CREATOR = new zzai();
    }

    zzah(int v, String s, PendingIntent pendingIntent0) {
        this.zzv = 1;
        this.accountType = (String)Preconditions.checkNotNull(s);
        this.zzbx = (PendingIntent)Preconditions.checkNotNull(pendingIntent0);
    }

    public zzah(String s, PendingIntent pendingIntent0) {
        this(1, s, pendingIntent0);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zzv);
        SafeParcelWriter.writeString(parcel0, 2, this.accountType, false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.zzbx, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

