package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class CredentialRequest extends AbstractSafeParcelable {
    public static final class Builder {
        private boolean zzaa;
        private String[] zzab;
        private CredentialPickerConfig zzac;
        private CredentialPickerConfig zzad;
        private boolean zzae;
        private String zzaf;
        private String zzag;
        private boolean zzah;

        public Builder() {
            this.zzae = false;
            this.zzah = false;
            this.zzaf = null;
        }

        public final CredentialRequest build() {
            if(this.zzab == null) {
                this.zzab = new String[0];
            }
            if(!this.zzaa && this.zzab.length == 0) {
                throw new IllegalStateException("At least one authentication method must be specified");
            }
            return new CredentialRequest(this, null);
        }

        public final Builder setAccountTypes(String[] arr_s) {
            if(arr_s == null) {
                arr_s = new String[0];
            }
            this.zzab = arr_s;
            return this;
        }

        public final Builder setCredentialHintPickerConfig(CredentialPickerConfig credentialPickerConfig0) {
            this.zzad = credentialPickerConfig0;
            return this;
        }

        public final Builder setCredentialPickerConfig(CredentialPickerConfig credentialPickerConfig0) {
            this.zzac = credentialPickerConfig0;
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

        public final Builder setPasswordLoginSupported(boolean z) {
            this.zzaa = z;
            return this;
        }

        public final Builder setServerClientId(String s) {
            this.zzaf = s;
            return this;
        }

        @Deprecated
        public final Builder setSupportsPasswordLogin(boolean z) {
            return this.setPasswordLoginSupported(z);
        }

        static boolean zzc(Builder credentialRequest$Builder0) {
            return credentialRequest$Builder0.zzaa;
        }

        static String[] zzd(Builder credentialRequest$Builder0) {
            return credentialRequest$Builder0.zzab;
        }

        static CredentialPickerConfig zze(Builder credentialRequest$Builder0) {
            return credentialRequest$Builder0.zzac;
        }

        static CredentialPickerConfig zzf(Builder credentialRequest$Builder0) {
            return credentialRequest$Builder0.zzad;
        }

        static boolean zzg(Builder credentialRequest$Builder0) {
            return credentialRequest$Builder0.zzae;
        }

        static String zzh(Builder credentialRequest$Builder0) {
            return credentialRequest$Builder0.zzaf;
        }

        static String zzi(Builder credentialRequest$Builder0) {
            return credentialRequest$Builder0.zzag;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final boolean zzaa;
    private final String[] zzab;
    private final CredentialPickerConfig zzac;
    private final CredentialPickerConfig zzad;
    private final boolean zzae;
    private final String zzaf;
    private final String zzag;
    private final boolean zzah;
    private final int zzv;

    static {
        CredentialRequest.CREATOR = new zzg();
    }

    CredentialRequest(int v, boolean z, String[] arr_s, CredentialPickerConfig credentialPickerConfig0, CredentialPickerConfig credentialPickerConfig1, boolean z1, String s, String s1, boolean z2) {
        this.zzv = v;
        this.zzaa = z;
        this.zzab = (String[])Preconditions.checkNotNull(arr_s);
        if(credentialPickerConfig0 == null) {
            credentialPickerConfig0 = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder().build();
        }
        this.zzac = credentialPickerConfig0;
        if(credentialPickerConfig1 == null) {
            credentialPickerConfig1 = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder().build();
        }
        this.zzad = credentialPickerConfig1;
        if(v < 3) {
            this.zzae = true;
            this.zzaf = null;
            this.zzag = null;
        }
        else {
            this.zzae = z1;
            this.zzaf = s;
            this.zzag = s1;
        }
        this.zzah = z2;
    }

    private CredentialRequest(Builder credentialRequest$Builder0) {
        this(4, Builder.zzc(credentialRequest$Builder0), Builder.zzd(credentialRequest$Builder0), Builder.zze(credentialRequest$Builder0), Builder.zzf(credentialRequest$Builder0), Builder.zzg(credentialRequest$Builder0), Builder.zzh(credentialRequest$Builder0), Builder.zzi(credentialRequest$Builder0), false);
    }

    CredentialRequest(Builder credentialRequest$Builder0, zzf zzf0) {
        this(credentialRequest$Builder0);
    }

    public final String[] getAccountTypes() {
        return this.zzab;
    }

    public final Set getAccountTypesSet() {
        return new HashSet(Arrays.asList(this.zzab));
    }

    public final CredentialPickerConfig getCredentialHintPickerConfig() {
        return this.zzad;
    }

    public final CredentialPickerConfig getCredentialPickerConfig() {
        return this.zzac;
    }

    public final String getIdTokenNonce() {
        return this.zzag;
    }

    public final String getServerClientId() {
        return this.zzaf;
    }

    @Deprecated
    public final boolean getSupportsPasswordLogin() {
        return this.isPasswordLoginSupported();
    }

    public final boolean isIdTokenRequested() {
        return this.zzae;
    }

    public final boolean isPasswordLoginSupported() {
        return this.zzaa;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 1, this.isPasswordLoginSupported());
        SafeParcelWriter.writeStringArray(parcel0, 2, this.getAccountTypes(), false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.getCredentialPickerConfig(), v, false);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.getCredentialHintPickerConfig(), v, false);
        SafeParcelWriter.writeBoolean(parcel0, 5, this.isIdTokenRequested());
        SafeParcelWriter.writeString(parcel0, 6, this.getServerClientId(), false);
        SafeParcelWriter.writeString(parcel0, 7, this.getIdTokenNonce(), false);
        SafeParcelWriter.writeBoolean(parcel0, 8, this.zzah);
        SafeParcelWriter.writeInt(parcel0, 1000, this.zzv);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

