package com.google.android.gms.internal.auth-api-phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.tasks.Task;

public final class zzj extends SmsRetrieverClient {
    public zzj(Activity activity0) {
        super(activity0);
    }

    public zzj(Context context0) {
        super(context0);
    }

    @Override  // com.google.android.gms.auth.api.phone.SmsRetrieverClient
    public final Task startSmsRetriever() {
        return this.doWrite(new zzk(this));
    }
}

