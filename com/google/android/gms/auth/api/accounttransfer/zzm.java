package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;

public final class zzm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        HashSet hashSet0 = new HashSet();
        ArrayList arrayList0 = null;
        zzo zzo0 = null;
        int v1 = 0;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v3)) {
                case 1: {
                    v1 = SafeParcelReader.readInt(parcel0, v3);
                    hashSet0.add(1);
                    break;
                }
                case 2: {
                    arrayList0 = SafeParcelReader.createTypedList(parcel0, v3, zzr.CREATOR);
                    hashSet0.add(2);
                    break;
                }
                case 3: {
                    v2 = SafeParcelReader.readInt(parcel0, v3);
                    hashSet0.add(3);
                    break;
                }
                case 4: {
                    zzo0 = (zzo)SafeParcelReader.createParcelable(parcel0, v3, zzo.CREATOR);
                    hashSet0.add(4);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new ParseException("Overread allowed size end=" + v, parcel0);
        }
        return new zzl(hashSet0, v1, arrayList0, v2, zzo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzl[v];
    }
}

