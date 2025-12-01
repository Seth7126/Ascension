package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

abstract class zzp extends ApiMethodImpl {
    public zzp(GoogleApiClient googleApiClient0) {
        super(Auth.GOOGLE_SIGN_IN_API, googleApiClient0);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    public void setResult(Object object0) {
        super.setResult(((Result)object0));
    }
}

