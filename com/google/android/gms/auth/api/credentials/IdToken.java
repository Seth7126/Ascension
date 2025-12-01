package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zzal;
    private final String zzr;

    static {
        IdToken.CREATOR = new zzk();
    }

    public IdToken(String s, String s1) {
        Preconditions.checkArgument(!TextUtils.isEmpty(s), "account type string cannot be null or empty");
        Preconditions.checkArgument(!TextUtils.isEmpty(s1), "id token string cannot be null or empty");
        this.zzr = s;
        this.zzal = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof IdToken ? Objects.equal(this.zzr, ((IdToken)object0).zzr) && Objects.equal(this.zzal, ((IdToken)object0).zzal) : false;
    }

    public final String getAccountType() {
        return this.zzr;
    }

    public final String getIdToken() {
        return this.zzal;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.getAccountType(), false);
        SafeParcelWriter.writeString(parcel0, 2, this.getIdToken(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

