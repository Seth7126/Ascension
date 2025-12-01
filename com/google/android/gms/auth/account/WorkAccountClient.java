package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.tasks.Task;

public class WorkAccountClient extends GoogleApi {
    private final WorkAccountApi zzac;

    WorkAccountClient(Activity activity0) {
        super(activity0, WorkAccount.API, null, Settings.DEFAULT_SETTINGS);
        this.zzac = new zzh();
    }

    WorkAccountClient(Context context0) {
        super(context0, WorkAccount.API, null, Settings.DEFAULT_SETTINGS);
        this.zzac = new zzh();
    }

    public Task addWorkAccount(String s) {
        GoogleApiClient googleApiClient0 = this.asGoogleApiClient();
        return PendingResultUtil.toTask(this.zzac.addWorkAccount(googleApiClient0, s), new zzg(this));
    }

    public Task removeWorkAccount(Account account0) {
        GoogleApiClient googleApiClient0 = this.asGoogleApiClient();
        return PendingResultUtil.toVoidTask(this.zzac.removeWorkAccount(googleApiClient0, account0));
    }

    public Task setWorkAuthenticatorEnabled(boolean z) {
        GoogleApiClient googleApiClient0 = this.asGoogleApiClient();
        return PendingResultUtil.toVoidTask(this.zzac.setWorkAuthenticatorEnabledWithResult(googleApiClient0, z));
    }
}

