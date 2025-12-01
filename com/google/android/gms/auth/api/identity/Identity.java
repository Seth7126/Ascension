package com.google.android.gms.auth.api.identity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth-api.zzaf;

public final class Identity {
    public static SignInClient getSignInClient(Activity activity0) {
        return new zzaf(((Activity)Preconditions.checkNotNull(activity0)), SignInOptions.builder().build());
    }

    public static SignInClient getSignInClient(Context context0) {
        return new zzaf(((Context)Preconditions.checkNotNull(context0)), SignInOptions.builder().build());
    }
}

