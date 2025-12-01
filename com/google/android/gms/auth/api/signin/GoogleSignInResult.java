package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public class GoogleSignInResult implements Result {
    private Status mStatus;
    private GoogleSignInAccount zzbs;

    public GoogleSignInResult(GoogleSignInAccount googleSignInAccount0, Status status0) {
        this.zzbs = googleSignInAccount0;
        this.mStatus = status0;
    }

    public GoogleSignInAccount getSignInAccount() {
        return this.zzbs;
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.mStatus;
    }

    public boolean isSuccess() {
        return this.mStatus.isSuccess();
    }
}

