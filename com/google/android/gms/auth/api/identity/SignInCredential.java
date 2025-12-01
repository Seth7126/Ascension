package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zzbd;
    private final String zzbe;
    private final String zzbf;
    private final String zzbg;
    private final Uri zzbh;
    private final String zzbi;
    private final String zzbj;

    static {
        SignInCredential.CREATOR = new zzg();
    }

    public SignInCredential(String s, String s1, String s2, String s3, Uri uri0, String s4, String s5) {
        this.zzbd = Preconditions.checkNotEmpty(s);
        this.zzbe = s1;
        this.zzbf = s2;
        this.zzbg = s3;
        this.zzbh = uri0;
        this.zzbi = s4;
        this.zzbj = s5;
    }

    // 去混淆评级： 中等(80)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof SignInCredential ? Objects.equal(this.zzbd, ((SignInCredential)object0).zzbd) && Objects.equal(this.zzbe, ((SignInCredential)object0).zzbe) && Objects.equal(this.zzbf, ((SignInCredential)object0).zzbf) && Objects.equal(this.zzbg, ((SignInCredential)object0).zzbg) && Objects.equal(this.zzbh, ((SignInCredential)object0).zzbh) && Objects.equal(this.zzbi, ((SignInCredential)object0).zzbi) && Objects.equal(this.zzbj, ((SignInCredential)object0).zzbj) : false;
    }

    public final String getDisplayName() {
        return this.zzbe;
    }

    public final String getFamilyName() {
        return this.zzbg;
    }

    public final String getGivenName() {
        return this.zzbf;
    }

    public final String getGoogleIdToken() {
        return this.zzbj;
    }

    public final String getId() {
        return this.zzbd;
    }

    public final String getPassword() {
        return this.zzbi;
    }

    public final Uri getProfilePictureUri() {
        return this.zzbh;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zzbd, this.zzbe, this.zzbf, this.zzbg, this.zzbh, this.zzbi, this.zzbj});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.getId(), false);
        SafeParcelWriter.writeString(parcel0, 2, this.getDisplayName(), false);
        SafeParcelWriter.writeString(parcel0, 3, this.getGivenName(), false);
        SafeParcelWriter.writeString(parcel0, 4, this.getFamilyName(), false);
        SafeParcelWriter.writeParcelable(parcel0, 5, this.getProfilePictureUri(), v, false);
        SafeParcelWriter.writeString(parcel0, 6, this.getPassword(), false);
        SafeParcelWriter.writeString(parcel0, 7, this.getGoogleIdToken(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

