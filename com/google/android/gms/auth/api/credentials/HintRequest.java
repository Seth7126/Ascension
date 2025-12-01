package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final class Builder {
        private String[] zzab;
        private boolean zzae;
        private String zzaf;
        private String zzag;
        private CredentialPickerConfig zzai;
        private boolean zzaj;
        private boolean zzak;

        public Builder() {
            this.zzai = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder().build();
            this.zzae = false;
        }

        public final HintRequest build() {
            if(this.zzab == null) {
                this.zzab = new String[0];
            }
            if(!this.zzaj && !this.zzak && this.zzab.length == 0) {
                throw new IllegalStateException("At least one authentication method must be specified");
            }
            return new HintRequest(this, null);
        }

        public final Builder setAccountTypes(String[] arr_s) {
            if(arr_s == null) {
                arr_s = new String[0];
            }
            this.zzab = arr_s;
            return this;
        }

        public final Builder setEmailAddressIdentifierSupported(boolean z) {
            this.zzaj = z;
            return this;
        }

        public final Builder setHintPickerConfig(CredentialPickerConfig credentialPickerConfig0) {
            this.zzai = (CredentialPickerConfig)Preconditions.checkNotNull(credentialPickerConfig0);
            return this;
        }

        public final Builder setIdTokenNonce(String s) {
            this.zzag = s;
            return this;
        }

        public final Builder setIdTokenRequested(boolean z) {
            this.zzae = z;
            return this;
        }

        public final Builder setPhoneNumberIdentifierSupported(boolean z) {
            this.zzak = z;
            return this;
        }

        public final Builder setServerClientId(String s) {
            this.zzaf = s;
            return this;
        }

        static CredentialPickerConfig zzc(Builder hintRequest$Builder0) {
            return hintRequest$Builder0.zzai;
        }

        static boolean zzd(Builder hintRequest$Builder0) {
            return hintRequest$Builder0.zzaj;
        }

        static boolean zze(Builder hintRequest$Builder0) {
            return hintRequest$Builder0.zzak;
        }

        static String[] zzf(Builder hintRequest$Builder0) {
            return hintRequest$Builder0.zzab;
        }

        static boolean zzg(Builder hintRequest$Builder0) {
            return hintRequest$Builder0.zzae;
        }

        static String zzh(Builder hintRequest$Builder0) {
            return hintRequest$Builder0.zzaf;
        }

        static String zzi(Builder hintRequest$Builder0) {
            return hintRequest$Builder0.zzag;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final String[] zzab;
    private final boolean zzae;
    private final String zzaf;
    private final String zzag;
    private final CredentialPickerConfig zzai;
    private final boolean zzaj;
    private final boolean zzak;
    private final int zzv;

    static {
        HintRequest.CREATOR = new zzj();
    }

    HintRequest(int v, CredentialPickerConfig credentialPickerConfig0, boolean z, boolean z1, String[] arr_s, boolean z2, String s, String s1) {
        this.zzv = v;
        this.zzai = (CredentialPickerConfig)Preconditions.checkNotNull(credentialPickerConfig0);
        this.zzaj = z;
        this.zzak = z1;
        this.zzab = (String[])Preconditions.checkNotNull(arr_s);
        if(v < 2) {
            this.zzae = true;
            this.zzaf = null;
            this.zzag = null;
            return;
        }
        this.zzae = z2;
        this.zzaf = s;
        this.zzag = s1;
    }

    private HintRequest(Builder hintRequest$Builder0) {
        this(2, Builder.zzc(hintRequest$Builder0), Builder.zzd(hintRequest$Builder0), Builder.zze(hintRequest$Builder0), Builder.zzf(hintRequest$Builder0), Builder.zzg(hintRequest$Builder0), Builder.zzh(hintRequest$Builder0), Builder.zzi(hintRequest$Builder0));
    }

    HintRequest(Builder hintRequest$Builder0, zzi zzi0) {
        this(hintRequest$Builder0);
    }

    public final String[] getAccountTypes() {
        return this.zzab;
    }

    public final CredentialPickerConfig getHintPickerConfig() {
        return this.zzai;
    }

    public final String getIdTokenNonce() {
        return this.zzag;
    }

    public final String getServerClientId() {
        return this.zzaf;
    }

    public final boolean isEmailAddressIdentifierSupported() {
        return this.zzaj;
    }

    public final boolean isIdTokenRequested() {
        return this.zzae;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.getHintPickerConfig(), v, false);
        SafeParcelWriter.writeBoolean(parcel0, 2, this.isEmailAddressIdentifierSupported());
        SafeParcelWriter.writeBoolean(parcel0, 3, this.zzak);
        SafeParcelWriter.writeStringArray(parcel0, 4, this.getAccountTypes(), false);
        SafeParcelWriter.writeBoolean(parcel0, 5, this.isIdTokenRequested());
        SafeParcelWriter.writeString(parcel0, 6, this.getServerClientId(), false);
        SafeParcelWriter.writeString(parcel0, 7, this.getIdTokenNonce(), false);
        SafeParcelWriter.writeInt(parcel0, 1000, this.zzv);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

