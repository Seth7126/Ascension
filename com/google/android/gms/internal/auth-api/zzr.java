package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

public final class zzr {
    public static PendingIntent zzc(Context context0, AuthCredentialsOptions auth$AuthCredentialsOptions0, HintRequest hintRequest0, String s) {
        Preconditions.checkNotNull(context0, "context must not be null");
        Preconditions.checkNotNull(hintRequest0, "request must not be null");
        String s1 = TextUtils.isEmpty(s) ? "Bl-uYxquu_Y96PtxTcJjVQ" : ((String)Preconditions.checkNotNull(s));
        Intent intent0 = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", (auth$AuthCredentialsOptions0 == null ? null : auth$AuthCredentialsOptions0.zzd()));
        intent0.putExtra("logSessionId", s1);
        SafeParcelableSerializer.serializeToIntentExtra(hintRequest0, intent0, "com.google.android.gms.credentials.HintRequest");
        return PendingIntent.getActivity(context0, 2000, intent0, 0x8000000);
    }
}

