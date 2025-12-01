package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    @Deprecated
    private String zzby;
    private GoogleSignInAccount zzbz;
    @Deprecated
    private String zzca;

    static {
        SignInAccount.CREATOR = new zzd();
    }

    SignInAccount(String s, GoogleSignInAccount googleSignInAccount0, String s1) {
        this.zzbz = googleSignInAccount0;
        this.zzby = Preconditions.checkNotEmpty(s, "8.3 and 8.4 SDKs require non-null email");
        this.zzca = Preconditions.checkNotEmpty(s1, "8.3 and 8.4 SDKs require non-null userId");
    }

    @Nullable
    public final GoogleSignInAccount getGoogleSignInAccount() {
        return this.zzbz;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 4, this.zzby, false);
        SafeParcelWriter.writeParcelable(parcel0, 7, this.zzbz, v, false);
        SafeParcelWriter.writeString(parcel0, 8, this.zzca, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

