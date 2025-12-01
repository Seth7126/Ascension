package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final Credential zzam;

    static {
        zzz.CREATOR = new zzy();
    }

    public zzz(Credential credential0) {
        this.zzam = credential0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.zzam, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

