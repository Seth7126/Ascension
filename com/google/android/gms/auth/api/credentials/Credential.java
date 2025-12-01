package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;

public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static class Builder {
        private final String mId;
        private String mName;
        private Uri zzo;
        private List zzp;
        private String zzq;
        private String zzr;
        private String zzs;
        private String zzt;

        public Builder(Credential credential0) {
            this.mId = credential0.mId;
            this.mName = credential0.mName;
            this.zzo = credential0.zzo;
            this.zzp = credential0.zzp;
            this.zzq = credential0.zzq;
            this.zzr = credential0.zzr;
            this.zzs = credential0.zzs;
            this.zzt = credential0.zzt;
        }

        public Builder(String s) {
            this.mId = s;
        }

        public Credential build() {
            return new Credential(this.mId, this.mName, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt);
        }

        public Builder setAccountType(String s) {
            this.zzr = s;
            return this;
        }

        public Builder setName(String s) {
            this.mName = s;
            return this;
        }

        public Builder setPassword(String s) {
            this.zzq = s;
            return this;
        }

        public Builder setProfilePictureUri(Uri uri0) {
            this.zzo = uri0;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR = null;
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
    @Nonnull
    private final String mId;
    private final String mName;
    private final Uri zzo;
    @Nonnull
    private final List zzp;
    private final String zzq;
    private final String zzr;
    private final String zzs;
    private final String zzt;

    static {
        Credential.CREATOR = new zzc();
    }

    Credential(String s, String s1, Uri uri0, List list0, String s2, String s3, String s4, String s5) {
        boolean z = false;
        super();
        String s6 = ((String)Preconditions.checkNotNull(s, "credential identifier cannot be null")).trim();
        Preconditions.checkNotEmpty(s6, "credential identifier cannot be empty");
        if(s2 != null && TextUtils.isEmpty(s2)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if(s3 != null) {
            if(!TextUtils.isEmpty(s3)) {
                Uri uri1 = Uri.parse(s3);
                if(uri1.isAbsolute() && uri1.isHierarchical() && !TextUtils.isEmpty(uri1.getScheme()) && !TextUtils.isEmpty(uri1.getAuthority()) && ("http".equalsIgnoreCase(uri1.getScheme()) || "https".equalsIgnoreCase(uri1.getScheme()))) {
                    z = true;
                }
            }
            if(!z) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if(!TextUtils.isEmpty(s3) && !TextUtils.isEmpty(s2)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if(s1 != null && TextUtils.isEmpty(s1.trim())) {
            s1 = null;
        }
        this.mName = s1;
        this.zzo = uri0;
        this.zzp = list0 == null ? Collections.emptyList() : Collections.unmodifiableList(list0);
        this.mId = s6;
        this.zzq = s2;
        this.zzr = s3;
        this.zzs = s4;
        this.zzt = s5;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof Credential ? TextUtils.equals(this.mId, ((Credential)object0).mId) && TextUtils.equals(this.mName, ((Credential)object0).mName) && Objects.equal(this.zzo, ((Credential)object0).zzo) && TextUtils.equals(this.zzq, ((Credential)object0).zzq) && TextUtils.equals(this.zzr, ((Credential)object0).zzr) : false;
    }

    public String getAccountType() {
        return this.zzr;
    }

    public String getFamilyName() {
        return this.zzt;
    }

    public String getGivenName() {
        return this.zzs;
    }

    @Nonnull
    public String getId() {
        return this.mId;
    }

    @Nonnull
    public List getIdTokens() {
        return this.zzp;
    }

    public String getName() {
        return this.mName;
    }

    public String getPassword() {
        return this.zzq;
    }

    public Uri getProfilePictureUri() {
        return this.zzo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.mId, this.mName, this.zzo, this.zzq, this.zzr});
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.getId(), false);
        SafeParcelWriter.writeString(parcel0, 2, this.getName(), false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.getProfilePictureUri(), v, false);
        SafeParcelWriter.writeTypedList(parcel0, 4, this.getIdTokens(), false);
        SafeParcelWriter.writeString(parcel0, 5, this.getPassword(), false);
        SafeParcelWriter.writeString(parcel0, 6, this.getAccountType(), false);
        SafeParcelWriter.writeString(parcel0, 9, this.getGivenName(), false);
        SafeParcelWriter.writeString(parcel0, 10, this.getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

