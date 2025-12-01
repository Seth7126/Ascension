package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Set;

final class ComponentRuntime..Lambda.4 implements Provider {
    private final Set arg$1;

    private ComponentRuntime..Lambda.4(Set set0) {
        this.arg$1 = set0;
    }

    @Override  // com.google.firebase.inject.Provider
    public Object get() {
        return ComponentRuntime.lambda$processSetComponents$1(this.arg$1);
    }

    public static Provider lambdaFactory$(Set set0) {
        return new ComponentRuntime..Lambda.4(set0);
    }
}

