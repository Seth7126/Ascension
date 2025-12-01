package com.google.firebase.installations;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

final class FirebaseInstallationsRegistrar..Lambda.1 implements ComponentFactory {
    private static final FirebaseInstallationsRegistrar..Lambda.1 instance;

    static {
        FirebaseInstallationsRegistrar..Lambda.1.instance = new FirebaseInstallationsRegistrar..Lambda.1();
    }

    @Override  // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer0) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer0);
    }

    public static ComponentFactory lambdaFactory$() {
        return FirebaseInstallationsRegistrar..Lambda.1.instance;
    }
}

