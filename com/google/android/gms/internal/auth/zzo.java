package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult;
import com.google.android.gms.common.api.Status;

final class zzo implements AddAccountResult {
    private final Status mStatus;
    private final Account zzk;

    public zzo(Status status0, Account account0) {
        this.mStatus = status0;
        this.zzk = account0;
    }

    @Override  // com.google.android.gms.auth.account.WorkAccountApi$AddAccountResult
    public final Account getAccount() {
        return this.zzk;
    }

    @Override  // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.mStatus;
    }
}

