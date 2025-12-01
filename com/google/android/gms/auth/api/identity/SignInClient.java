package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

public interface SignInClient extends HasApiKey {
    Task beginSignIn(BeginSignInRequest arg1);

    SignInCredential getSignInCredentialFromIntent(Intent arg1) throws ApiException;

    Task signOut();
}

