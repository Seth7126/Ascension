package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.drive.DriveId;

public final class zzi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        DriveId driveId0 = null;
        long v1 = 0L;
        long v2 = 0L;
        int v3 = 0;
        int v4 = 0;
        while(parcel0.dataPosition() < v) {
            int v5 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v5)) {
                case 2: {
                    v3 = SafeParcelReader.readInt(parcel0, v5);
                    break;
                }
                case 3: {
                    driveId0 = (DriveId)SafeParcelReader.createParcelable(parcel0, v5, DriveId.CREATOR);
                    break;
                }
                case 4: {
                    v4 = SafeParcelReader.readInt(parcel0, v5);
                    break;
                }
                case 5: {
                    v1 = SafeParcelReader.readLong(parcel0, v5);
                    break;
                }
                case 6: {
                    v2 = SafeParcelReader.readLong(parcel0, v5);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v5);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzh(v3, driveId0, v4, v1, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzh[v];
    }
}

