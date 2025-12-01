package com.google.android.gms.auth.api.credentials;

import android.app.Activity;
import android.content.Context;

public class Credentials {
    public static CredentialsClient getClient(Activity activity0) {
        return new CredentialsClient(activity0, CredentialsOptions.DEFAULT);
    }

    public static CredentialsClient getClient(Activity activity0, CredentialsOptions credentialsOptions0) {
        return new CredentialsClient(activity0, credentialsOptions0);
    }

    public static CredentialsClient getClient(Context context0) {
        return new CredentialsClient(context0, CredentialsOptions.DEFAULT);
    }

    public static CredentialsClient getClient(Context context0, CredentialsOptions credentialsOptions0) {
        return new CredentialsClient(context0, credentialsOptions0);
    }
}

