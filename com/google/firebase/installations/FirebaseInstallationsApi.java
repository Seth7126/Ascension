package com.google.firebase.installations;

import com.google.android.gms.tasks.Task;

public interface FirebaseInstallationsApi {
    Task delete();

    Task getId();

    Task getToken(boolean arg1);
}

