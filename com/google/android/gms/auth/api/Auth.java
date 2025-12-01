package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.internal.zze;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.auth-api.zzj;

public final class Auth {
    @Deprecated
    public static class AuthCredentialsOptions implements Optional {
        @Deprecated
        public static class Builder {
            protected String zzl;
            protected String zzn;
            protected Boolean zzu;

            public Builder() {
                this.zzu = Boolean.FALSE;
            }

            public Builder(AuthCredentialsOptions auth$AuthCredentialsOptions0) {
                this.zzl = auth$AuthCredentialsOptions0.zzl;
                this.zzu = Boolean.valueOf(auth$AuthCredentialsOptions0.zzm);
                this.zzn = auth$AuthCredentialsOptions0.zzn;
            }

            public Builder forceEnableSaveDialog() {
                this.zzu = Boolean.TRUE;
                return this;
            }

            public Builder zzc(String s) {
                this.zzn = s;
                return this;
            }

            public AuthCredentialsOptions zze() {
                return new AuthCredentialsOptions(this);
            }
        }

        public static final AuthCredentialsOptions zzk;
        private final String zzl;
        private final boolean zzm;
        private final String zzn;

        static {
            AuthCredentialsOptions.zzk = new Builder().zze();
        }

        public AuthCredentialsOptions(Builder auth$AuthCredentialsOptions$Builder0) {
            this.zzl = auth$AuthCredentialsOptions$Builder0.zzl;
            this.zzm = auth$AuthCredentialsOptions$Builder0.zzu.booleanValue();
            this.zzn = auth$AuthCredentialsOptions$Builder0.zzn;
        }

        @Override
        public boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            return object0 instanceof AuthCredentialsOptions ? Objects.equal(this.zzl, ((AuthCredentialsOptions)object0).zzl) && this.zzm == ((AuthCredentialsOptions)object0).zzm && Objects.equal(this.zzn, ((AuthCredentialsOptions)object0).zzn) : false;
        }

        public final String getLogSessionId() {
            return this.zzn;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(new Object[]{this.zzl, Boolean.valueOf(this.zzm), this.zzn});
        }

        public final Bundle toBundle() {
            Bundle bundle0 = new Bundle();
            bundle0.putString("consumer_package", this.zzl);
            bundle0.putBoolean("force_save_dialog", this.zzm);
            bundle0.putString("log_session_id", this.zzn);
            return bundle0;
        }

        public final String zzd() {
            return this.zzl;
        }
    }

    public static final Api CREDENTIALS_API;
    public static final CredentialsApi CredentialsApi;
    public static final Api GOOGLE_SIGN_IN_API;
    public static final GoogleSignInApi GoogleSignInApi;
    @Deprecated
    public static final Api PROXY_API;
    @Deprecated
    public static final ProxyApi ProxyApi;
    public static final ClientKey zzg;
    public static final ClientKey zzh;
    private static final AbstractClientBuilder zzi;
    private static final AbstractClientBuilder zzj;

    static {
        ClientKey api$ClientKey0 = new ClientKey();
        Auth.zzg = api$ClientKey0;
        ClientKey api$ClientKey1 = new ClientKey();
        Auth.zzh = api$ClientKey1;
        zzc zzc0 = new zzc();
        Auth.zzi = zzc0;
        zzd zzd0 = new zzd();
        Auth.zzj = zzd0;
        Auth.PROXY_API = AuthProxy.API;
        Auth.CREDENTIALS_API = new Api("Auth.CREDENTIALS_API", zzc0, api$ClientKey0);
        Auth.GOOGLE_SIGN_IN_API = new Api("Auth.GOOGLE_SIGN_IN_API", zzd0, api$ClientKey1);
        Auth.ProxyApi = AuthProxy.ProxyApi;
        Auth.CredentialsApi = new zzj();
        Auth.GoogleSignInApi = new zze();
    }
}

