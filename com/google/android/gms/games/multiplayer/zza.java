package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel parcel0) {
        return this.zze(parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int v) {
        return new ParticipantEntity[v];
    }

    public ParticipantEntity zze(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        while(parcel0.dataPosition() < v) {
            SafeParcelReader.skipUnknownField(parcel0, SafeParcelReader.readHeader(parcel0));
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new ParticipantEntity();
    }
}

