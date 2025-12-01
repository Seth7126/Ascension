package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzbf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        String s = null;
        double f = 0.0;
        double f1 = 0.0;
        long v1 = 0L;
        int v2 = 0;
        int v3 = 0;
        float f2 = 0.0f;
        int v4 = 0;
        int v5 = -1;
        while(parcel0.dataPosition() < v) {
            int v6 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v6)) {
                case 1: {
                    s = SafeParcelReader.createString(parcel0, v6);
                    break;
                }
                case 2: {
                    v1 = SafeParcelReader.readLong(parcel0, v6);
                    break;
                }
                case 3: {
                    v3 = SafeParcelReader.readShort(parcel0, v6);
                    break;
                }
                case 4: {
                    f = SafeParcelReader.readDouble(parcel0, v6);
                    break;
                }
                case 5: {
                    f1 = SafeParcelReader.readDouble(parcel0, v6);
                    break;
                }
                case 6: {
                    f2 = SafeParcelReader.readFloat(parcel0, v6);
                    break;
                }
                case 7: {
                    v2 = SafeParcelReader.readInt(parcel0, v6);
                    break;
                }
                case 8: {
                    v4 = SafeParcelReader.readInt(parcel0, v6);
                    break;
                }
                case 9: {
                    v5 = SafeParcelReader.readInt(parcel0, v6);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v6);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzbe(s, v2, ((short)v3), f, f1, f2, v1, v4, v5);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzbe[v];
    }
}

