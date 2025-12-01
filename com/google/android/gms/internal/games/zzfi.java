package com.google.android.gms.internal.games;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzb;

public final class zzfi extends zzb {
    public static final Parcelable.Creator CREATOR;
    private final IBinder zzjn;
    private final Bundle zzjp;

    static {
        zzfi.CREATOR = new zzfh();
    }

    zzfi(Bundle bundle0, IBinder iBinder0) {
        this.zzjp = bundle0;
        this.zzjn = iBinder0;
    }

    public zzfi(zzfg zzfg0) {
        this.zzjp = zzfg0.zzce();
        this.zzjn = zzfg0.zzjn;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBundle(parcel0, 1, this.zzjp, false);
        SafeParcelWriter.writeIBinder(parcel0, 2, this.zzjn, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

