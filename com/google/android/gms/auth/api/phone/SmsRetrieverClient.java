package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.tasks.Task;

public abstract class SmsRetrieverClient extends GoogleApi implements SmsRetrieverApi {
    private static final Api API;
    private static final AbstractClientBuilder CLIENT_BUILDER;
    private static final ClientKey CLIENT_KEY;

    static {
        ClientKey api$ClientKey0 = new ClientKey();
        SmsRetrieverClient.CLIENT_KEY = api$ClientKey0;
        zza zza0 = new zza();
        SmsRetrieverClient.CLIENT_BUILDER = zza0;
        SmsRetrieverClient.API = new Api("SmsRetriever.API", zza0, api$ClientKey0);
    }

    public SmsRetrieverClient(Activity activity0) {
        ApiExceptionMapper apiExceptionMapper0 = new ApiExceptionMapper();
        super(activity0, SmsRetrieverClient.API, null, apiExceptionMapper0);
    }

    public SmsRetrieverClient(Context context0) {
        ApiExceptionMapper apiExceptionMapper0 = new ApiExceptionMapper();
        super(context0, SmsRetrieverClient.API, null, apiExceptionMapper0);
    }

    @Override  // com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public abstract Task startSmsRetriever();
}

