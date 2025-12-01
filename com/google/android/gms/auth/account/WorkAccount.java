package com.google.android.gms.auth.account;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzh;

public class WorkAccount {
    public static final Api API;
    private static final AbstractClientBuilder CLIENT_BUILDER;
    private static final ClientKey CLIENT_KEY;
    @Deprecated
    public static final WorkAccountApi WorkAccountApi;

    static {
        ClientKey api$ClientKey0 = new ClientKey();
        WorkAccount.CLIENT_KEY = api$ClientKey0;
        zzf zzf0 = new zzf();
        WorkAccount.CLIENT_BUILDER = zzf0;
        WorkAccount.API = new Api("WorkAccount.API", zzf0, api$ClientKey0);
        WorkAccount.WorkAccountApi = new zzh();
    }

    public static WorkAccountClient getClient(Activity activity0) {
        return new WorkAccountClient(activity0);
    }

    public static WorkAccountClient getClient(Context context0) {
        return new WorkAccountClient(context0);
    }
}

