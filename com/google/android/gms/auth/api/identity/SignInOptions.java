package com.google.android.gms.auth.api.identity;

import android.os.Bundle;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

public final class SignInOptions implements Optional {
    public static class Builder {
        private String zzau;

        private Builder() {
        }

        Builder(zzh zzh0) {
        }

        public SignInOptions build() {
            return new SignInOptions(this.zzau);
        }

        public static Builder zzc(SignInOptions signInOptions0) {
            Builder signInOptions$Builder0 = new Builder();
            String s = signInOptions0.zzg();
            if(s != null) {
                signInOptions$Builder0.zze(s);
            }
            return signInOptions$Builder0;
        }

        public final Builder zze(String s) {
            this.zzau = Preconditions.checkNotEmpty(s);
            return this;
        }
    }

    private final String zzau;

    public SignInOptions(String s) {
        this.zzau = s;
    }

    public static Builder builder() {
        return new Builder(null);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof SignInOptions;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{SignInOptions.class});
    }

    public final Bundle toBundle() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("session_id", this.zzau);
        return bundle0;
    }

    public final String zzg() {
        return this.zzau;
    }
}

