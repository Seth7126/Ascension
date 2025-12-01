package com.google.firebase.components;

import com.google.firebase.inject.Provider;

final class ComponentRuntime..Lambda.1 implements Provider {
    private final ComponentRuntime arg$1;
    private final Component arg$2;

    private ComponentRuntime..Lambda.1(ComponentRuntime componentRuntime0, Component component0) {
        this.arg$1 = componentRuntime0;
        this.arg$2 = component0;
    }

    @Override  // com.google.firebase.inject.Provider
    public Object get() {
        return ComponentRuntime.lambda$new$0(this.arg$1, this.arg$2);
    }

    public static Provider lambdaFactory$(ComponentRuntime componentRuntime0, Component component0) {
        return new ComponentRuntime..Lambda.1(componentRuntime0, component0);
    }
}

