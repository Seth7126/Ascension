package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Set;

public interface ComponentContainer {
    Object get(Class arg1);

    Provider getProvider(Class arg1);

    Set setOf(Class arg1);

    Provider setOfProvider(Class arg1);
}

