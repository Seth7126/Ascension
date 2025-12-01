package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions;

public final class CredentialsOptions extends AuthCredentialsOptions {
    public static final class Builder extends com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder {
        public final CredentialsOptions build() {
            return new CredentialsOptions(this, null);
        }

        @Override  // com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder
        public final com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder forceEnableSaveDialog() {
            return this.forceEnableSaveDialog();
        }

        public final Builder forceEnableSaveDialog() {
            this.zzu = Boolean.TRUE;
            return this;
        }

        @Override  // com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder
        public final com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder zzc(String s) {
            this.zzn = s;
            return this;
        }

        @Override  // com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder
        public final AuthCredentialsOptions zze() {
            return this.build();
        }
    }

    public static final CredentialsOptions DEFAULT;

    static {
        CredentialsOptions.DEFAULT = (CredentialsOptions)new Builder().zze();
    }

    private CredentialsOptions(Builder credentialsOptions$Builder0) {
        super(credentialsOptions$Builder0);
    }

    CredentialsOptions(Builder credentialsOptions$Builder0, zzh zzh0) {
        this(credentialsOptions$Builder0);
    }
}

