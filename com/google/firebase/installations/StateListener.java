package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;

interface StateListener {
    boolean onException(PersistedInstallationEntry arg1, Exception arg2);

    boolean onStateReached(PersistedInstallationEntry arg1);
}

