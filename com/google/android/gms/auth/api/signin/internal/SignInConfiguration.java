package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zzcp;
    private GoogleSignInOptions zzcq;

    static {
        SignInConfiguration.CREATOR = new zzx();
    }

    public SignInConfiguration(String s, GoogleSignInOptions googleSignInOptions0) {
        this.zzcp = Preconditions.checkNotEmpty(s);
        this.zzcq = googleSignInOptions0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof SignInConfiguration)) {
            return false;
        }
        if(this.zzcp.equals(((SignInConfiguration)object0).zzcp)) {
            return this.zzcq == null ? ((SignInConfiguration)object0).zzcq == null : this.zzcq.equals(((SignInConfiguration)object0).zzcq);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return new HashAccumulator().addObject(this.zzcp).addObject(this.zzcq).hash();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.zzcp, false);
        SafeParcelWriter.writeParcelable(parcel0, 5, this.zzcq, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final GoogleSignInOptions zzp() {
        return this.zzcq;
    }
}

