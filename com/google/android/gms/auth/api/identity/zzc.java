package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        PasswordRequestOptions beginSignInRequest$PasswordRequestOptions0 = null;
        GoogleIdTokenRequestOptions beginSignInRequest$GoogleIdTokenRequestOptions0 = null;
        String s = null;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v1 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v1)) {
                case 1: {
                    beginSignInRequest$PasswordRequestOptions0 = (PasswordRequestOptions)SafeParcelReader.createParcelable(parcel0, v1, PasswordRequestOptions.CREATOR);
                    break;
                }
                case 2: {
                    beginSignInRequest$GoogleIdTokenRequestOptions0 = (GoogleIdTokenRequestOptions)SafeParcelReader.createParcelable(parcel0, v1, GoogleIdTokenRequestOptions.CREATOR);
                    break;
                }
                case 3: {
                    s = SafeParcelReader.createString(parcel0, v1);
                    break;
                }
                case 4: {
                    z = SafeParcelReader.readBoolean(parcel0, v1);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v1);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new BeginSignInRequest(beginSignInRequest$PasswordRequestOptions0, beginSignInRequest$GoogleIdTokenRequestOptions0, s, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BeginSignInRequest[v];
    }
}

