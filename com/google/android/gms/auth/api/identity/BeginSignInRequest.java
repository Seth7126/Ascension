package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final class Builder {
        private PasswordRequestOptions zzas;
        private GoogleIdTokenRequestOptions zzat;
        private String zzau;
        private boolean zzav;

        public Builder() {
            this.zzas = PasswordRequestOptions.builder().setSupported(false).build();
            this.zzat = GoogleIdTokenRequestOptions.builder().setSupported(false).build();
        }

        public final BeginSignInRequest build() {
            return new BeginSignInRequest(this.zzas, this.zzat, this.zzau, this.zzav);
        }

        public final Builder setAutoSelectEnabled(boolean z) {
            this.zzav = z;
            return this;
        }

        public final Builder setGoogleIdTokenRequestOptions(GoogleIdTokenRequestOptions beginSignInRequest$GoogleIdTokenRequestOptions0) {
            this.zzat = (GoogleIdTokenRequestOptions)Preconditions.checkNotNull(beginSignInRequest$GoogleIdTokenRequestOptions0);
            return this;
        }

        public final Builder setPasswordRequestOptions(PasswordRequestOptions beginSignInRequest$PasswordRequestOptions0) {
            this.zzas = (PasswordRequestOptions)Preconditions.checkNotNull(beginSignInRequest$PasswordRequestOptions0);
            return this;
        }

        public final Builder zzd(String s) {
            this.zzau = s;
            return this;
        }
    }

    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final class com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder {
            private boolean zzaw;
            private String zzax;
            private String zzay;
            private boolean zzaz;
            private String zzba;
            private List zzbb;

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder() {
                this.zzaw = false;
                this.zzax = null;
                this.zzay = null;
                this.zzaz = true;
                this.zzba = null;
                this.zzbb = null;
            }

            public final GoogleIdTokenRequestOptions build() {
                return new GoogleIdTokenRequestOptions(this.zzaw, this.zzax, this.zzay, this.zzaz, null, null);
            }

            public final com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setFilterByAuthorizedAccounts(boolean z) {
                this.zzaz = z;
                return this;
            }

            public final com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setNonce(String s) {
                this.zzay = s;
                return this;
            }

            public final com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setServerClientId(String s) {
                this.zzax = Preconditions.checkNotEmpty(s);
                return this;
            }

            public final com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setSupported(boolean z) {
                this.zzaw = z;
                return this;
            }
        }

        public static final Parcelable.Creator CREATOR;
        private final boolean zzaw;
        private final String zzax;
        private final String zzay;
        private final boolean zzaz;
        private final String zzba;
        private final List zzbb;

        static {
            GoogleIdTokenRequestOptions.CREATOR = new zzd();
        }

        GoogleIdTokenRequestOptions(boolean z, String s, String s1, boolean z1, String s2, List list0) {
            this.zzaw = z;
            if(z) {
                Preconditions.checkNotNull(s, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.zzax = s;
            this.zzay = s1;
            this.zzaz = z1;
            this.zzbb = BeginSignInRequest.zzc(list0);
            this.zzba = s2;
        }

        public static com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder builder() {
            return new com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder();
        }

        // 去混淆评级： 中等(50)
        @Override
        public final boolean equals(Object object0) {
            return object0 instanceof GoogleIdTokenRequestOptions ? this.zzaw == ((GoogleIdTokenRequestOptions)object0).zzaw && Objects.equal(this.zzax, ((GoogleIdTokenRequestOptions)object0).zzax) && Objects.equal(this.zzay, ((GoogleIdTokenRequestOptions)object0).zzay) && this.zzaz == ((GoogleIdTokenRequestOptions)object0).zzaz && Objects.equal(this.zzba, ((GoogleIdTokenRequestOptions)object0).zzba) && Objects.equal(this.zzbb, ((GoogleIdTokenRequestOptions)object0).zzbb) : false;
        }

        public final boolean filterByAuthorizedAccounts() {
            return this.zzaz;
        }

        public final List getIdTokenDepositionScopes() {
            return this.zzbb;
        }

        public final String getNonce() {
            return this.zzay;
        }

        public final String getServerClientId() {
            return this.zzax;
        }

        @Override
        public final int hashCode() {
            return Objects.hashCode(new Object[]{Boolean.valueOf(this.zzaw), this.zzax, this.zzay, Boolean.valueOf(this.zzaz), this.zzba, this.zzbb});
        }

        public final boolean isSupported() {
            return this.zzaw;
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeBoolean(parcel0, 1, this.isSupported());
            SafeParcelWriter.writeString(parcel0, 2, this.getServerClientId(), false);
            SafeParcelWriter.writeString(parcel0, 3, this.getNonce(), false);
            SafeParcelWriter.writeBoolean(parcel0, 4, this.filterByAuthorizedAccounts());
            SafeParcelWriter.writeString(parcel0, 5, this.zzba, false);
            SafeParcelWriter.writeStringList(parcel0, 6, this.getIdTokenDepositionScopes(), false);
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
        }
    }

    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final class com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.Builder {
            private boolean zzaw;

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.Builder() {
                this.zzaw = false;
            }

            public final PasswordRequestOptions build() {
                return new PasswordRequestOptions(this.zzaw);
            }

            public final com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.Builder setSupported(boolean z) {
                this.zzaw = z;
                return this;
            }
        }

        public static final Parcelable.Creator CREATOR;
        private final boolean zzaw;

        static {
            PasswordRequestOptions.CREATOR = new zzf();
        }

        PasswordRequestOptions(boolean z) {
            this.zzaw = z;
        }

        public static com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.Builder builder() {
            return new com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.Builder();
        }

        @Override
        public final boolean equals(Object object0) {
            return object0 instanceof PasswordRequestOptions ? this.zzaw == ((PasswordRequestOptions)object0).zzaw : false;
        }

        @Override
        public final int hashCode() {
            return Objects.hashCode(new Object[]{Boolean.valueOf(this.zzaw)});
        }

        public final boolean isSupported() {
            return this.zzaw;
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeBoolean(parcel0, 1, this.isSupported());
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final PasswordRequestOptions zzas;
    private final GoogleIdTokenRequestOptions zzat;
    private final String zzau;
    private final boolean zzav;

    static {
        BeginSignInRequest.CREATOR = new zzc();
    }

    BeginSignInRequest(PasswordRequestOptions beginSignInRequest$PasswordRequestOptions0, GoogleIdTokenRequestOptions beginSignInRequest$GoogleIdTokenRequestOptions0, String s, boolean z) {
        this.zzas = (PasswordRequestOptions)Preconditions.checkNotNull(beginSignInRequest$PasswordRequestOptions0);
        this.zzat = (GoogleIdTokenRequestOptions)Preconditions.checkNotNull(beginSignInRequest$GoogleIdTokenRequestOptions0);
        this.zzau = s;
        this.zzav = z;
    }

    public static Builder builder() {
        return new Builder();
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof BeginSignInRequest ? Objects.equal(this.zzas, ((BeginSignInRequest)object0).zzas) && Objects.equal(this.zzat, ((BeginSignInRequest)object0).zzat) && Objects.equal(this.zzau, ((BeginSignInRequest)object0).zzau) && this.zzav == ((BeginSignInRequest)object0).zzav : false;
    }

    public final GoogleIdTokenRequestOptions getGoogleIdTokenRequestOptions() {
        return this.zzat;
    }

    public final PasswordRequestOptions getPasswordRequestOptions() {
        return this.zzas;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zzas, this.zzat, this.zzau, Boolean.valueOf(this.zzav)});
    }

    public final boolean isAutoSelectEnabled() {
        return this.zzav;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.getPasswordRequestOptions(), v, false);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.getGoogleIdTokenRequestOptions(), v, false);
        SafeParcelWriter.writeString(parcel0, 3, this.zzau, false);
        SafeParcelWriter.writeBoolean(parcel0, 4, this.isAutoSelectEnabled());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static Builder zzc(BeginSignInRequest beginSignInRequest0) {
        Preconditions.checkNotNull(beginSignInRequest0);
        Builder beginSignInRequest$Builder0 = BeginSignInRequest.builder().setGoogleIdTokenRequestOptions(beginSignInRequest0.getGoogleIdTokenRequestOptions()).setPasswordRequestOptions(beginSignInRequest0.getPasswordRequestOptions()).setAutoSelectEnabled(beginSignInRequest0.zzav);
        String s = beginSignInRequest0.zzau;
        if(s != null) {
            beginSignInRequest$Builder0.zzd(s);
        }
        return beginSignInRequest$Builder0;
    }

    private static List zzc(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            List list1 = new ArrayList(list0);
            Collections.sort(list1);
            return list1;
        }
        return null;
    }
}

