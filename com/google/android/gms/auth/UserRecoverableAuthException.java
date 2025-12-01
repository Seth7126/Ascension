package com.google.android.gms.auth;

import android.content.Intent;

public class UserRecoverableAuthException extends GoogleAuthException {
    private final Intent mIntent;

    public UserRecoverableAuthException(String s, Intent intent0) {
        super(s);
        this.mIntent = intent0;
    }

    public Intent getIntent() {
        return this.mIntent == null ? null : new Intent(this.mIntent);
    }
}

