package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static class Builder {
        private boolean mShowCancelButton;
        private boolean zzw;
        private int zzz;

        public Builder() {
            this.zzw = false;
            this.mShowCancelButton = true;
            this.zzz = 1;
        }

        public CredentialPickerConfig build() {
            return new CredentialPickerConfig(this, null);
        }

        @Deprecated
        public Builder setForNewAccount(boolean z) {
            this.zzz = z ? 3 : 1;
            return this;
        }

        public Builder setPrompt(int v) {
            this.zzz = v;
            return this;
        }

        public Builder setShowAddAccountButton(boolean z) {
            this.zzw = z;
            return this;
        }

        public Builder setShowCancelButton(boolean z) {
            this.mShowCancelButton = z;
            return this;
        }

        static boolean zzc(Builder credentialPickerConfig$Builder0) {
            return credentialPickerConfig$Builder0.zzw;
        }

        static boolean zzd(Builder credentialPickerConfig$Builder0) {
            return credentialPickerConfig$Builder0.mShowCancelButton;
        }

        static int zze(Builder credentialPickerConfig$Builder0) {
            return credentialPickerConfig$Builder0.zzz;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Prompt {
        public static final int CONTINUE = 1;
        public static final int SIGN_IN = 2;
        public static final int SIGN_UP = 3;

    }

    public static final Parcelable.Creator CREATOR;
    private final boolean mShowCancelButton;
    private final int zzv;
    private final boolean zzw;
    @Deprecated
    private final boolean zzx;
    private final int zzy;

    static {
        CredentialPickerConfig.CREATOR = new zze();
    }

    CredentialPickerConfig(int v, boolean z, boolean z1, boolean z2, int v1) {
        this.zzv = v;
        this.zzw = z;
        this.mShowCancelButton = z1;
        int v2 = 1;
        if(v < 2) {
            this.zzx = z2;
            if(z2) {
                v2 = 3;
            }
            this.zzy = v2;
            return;
        }
        if(v1 != 3) {
            v2 = 0;
        }
        this.zzx = v2;
        this.zzy = v1;
    }

    private CredentialPickerConfig(Builder credentialPickerConfig$Builder0) {
        this(2, Builder.zzc(credentialPickerConfig$Builder0), Builder.zzd(credentialPickerConfig$Builder0), false, Builder.zze(credentialPickerConfig$Builder0));
    }

    CredentialPickerConfig(Builder credentialPickerConfig$Builder0, zzd zzd0) {
        this(credentialPickerConfig$Builder0);
    }

    @Deprecated
    public final boolean isForNewAccount() {
        return this.zzy == 3;
    }

    public final boolean shouldShowAddAccountButton() {
        return this.zzw;
    }

    public final boolean shouldShowCancelButton() {
        return this.mShowCancelButton;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 1, this.shouldShowAddAccountButton());
        SafeParcelWriter.writeBoolean(parcel0, 2, this.shouldShowCancelButton());
        SafeParcelWriter.writeBoolean(parcel0, 3, this.isForNewAccount());
        SafeParcelWriter.writeInt(parcel0, 4, this.zzy);
        SafeParcelWriter.writeInt(parcel0, 1000, this.zzv);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

