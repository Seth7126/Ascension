package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzbf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        long v1 = 3600000L;
        long v2 = 600000L;
        long v3 = 0x7FFFFFFFFFFFFFFFL;
        long v4 = 0L;
        int v5 = 102;
        boolean z = false;
        int v6 = 0x7FFFFFFF;
        float f = 0.0f;
        boolean z1 = false;
        while(parcel0.dataPosition() < v) {
            int v7 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v7)) {
                case 1: {
                    v5 = SafeParcelReader.readInt(parcel0, v7);
                    break;
                }
                case 2: {
                    v1 = SafeParcelReader.readLong(parcel0, v7);
                    break;
                }
                case 3: {
                    v2 = SafeParcelReader.readLong(parcel0, v7);
                    break;
                }
                case 4: {
                    z = SafeParcelReader.readBoolean(parcel0, v7);
                    break;
                }
                case 5: {
                    v3 = SafeParcelReader.readLong(parcel0, v7);
                    break;
                }
                case 6: {
                    v6 = SafeParcelReader.readInt(parcel0, v7);
                    break;
                }
                case 7: {
                    f = SafeParcelReader.readFloat(parcel0, v7);
                    break;
                }
                case 8: {
                    v4 = SafeParcelReader.readLong(parcel0, v7);
                    break;
                }
                case 9: {
                    z1 = SafeParcelReader.readBoolean(parcel0, v7);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v7);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new LocationRequest(v5, v1, v2, z, v3, v6, f, v4, z1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LocationRequest[v];
    }
}

