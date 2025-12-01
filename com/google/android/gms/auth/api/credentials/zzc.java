package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

public final class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        String s = null;
        String s1 = null;
        Uri uri0 = null;
        List list0 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v1)) {
                case 1: {
                    s = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 2: {
                    s1 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 3: {
                    uri0 = (Uri)SafeParcelReader.createParcelable(parcel0, v1, Uri.CREATOR);
                    break;
                }
                case 4: {
                    list0 = SafeParcelReader.createTypedList(parcel0, v1, IdToken.CREATOR);
                    break;
                }
                case 5: {
                    s2 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 6: {
                    s3 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 9: {
                    s4 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 10: {
                    s5 = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v1);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new Credential(s, s1, uri0, list0, s2, s3, s4, s5);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Credential[v];
    }
}

