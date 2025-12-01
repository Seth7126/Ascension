package com.google.android.gms.auth.api.signin;

import android.os.Bundle;
import java.util.List;

public interface GoogleSignInOptionsExtension {
    public static final int FITNESS = 3;
    public static final int GAMES = 1;

    int getExtensionType();

    List getImpliedScopes();

    Bundle toBundle();
}

