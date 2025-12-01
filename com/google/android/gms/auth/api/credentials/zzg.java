package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        String[] arr_s = null;
        CredentialPickerConfig credentialPickerConfig0 = null;
        CredentialPickerConfig credentialPickerConfig1 = null;
        String s = null;
        String s1 = null;
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        while(parcel0.dataPosition() < v) {
            int v2 = SafeParcelReader.readHeader(parcel0);
            int v3 = (char)v2;
            if(v3 == 1000) {
                v1 = SafeParcelReader.readInt(parcel0, v2);
            }
            else {
                switch(v3) {
                    case 1: {
                        z = SafeParcelReader.readBoolean(parcel0, v2);
                        break;
                    }
                    case 2: {
                        arr_s = SafeParcelReader.createStringArray(parcel0, v2);
                        break;
                    }
                    case 3: {
                        credentialPickerConfig0 = (CredentialPickerConfig)SafeParcelReader.createParcelable(parcel0, v2, CredentialPickerConfig.CREATOR);
                        break;
                    }
                    case 4: {
                        credentialPickerConfig1 = (CredentialPickerConfig)SafeParcelReader.createParcelable(parcel0, v2, CredentialPickerConfig.CREATOR);
                        break;
                    }
                    case 5: {
                        z1 = SafeParcelReader.readBoolean(parcel0, v2);
                        break;
                    }
                    case 6: {
                        s = SafeParcelReader.createString(parcel0, v2);
                        break;
                    }
                    case 7: {
                        s1 = SafeParcelReader.createString(parcel0, v2);
                        break;
                    }
                    case 8: {
                        z2 = SafeParcelReader.readBoolean(parcel0, v2);
                        break;
                    }
                    default: {
                        SafeParcelReader.skipUnknownField(parcel0, v2);
                    }
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new CredentialRequest(v1, z, arr_s, credentialPickerConfig0, credentialPickerConfig1, z1, s, s1, z2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CredentialRequest[v];
    }
}

