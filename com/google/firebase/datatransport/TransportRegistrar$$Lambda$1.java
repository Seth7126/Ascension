package com.google.firebase.datatransport;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

final class TransportRegistrar..Lambda.1 implements ComponentFactory {
    private static final TransportRegistrar..Lambda.1 instance;

    static {
        TransportRegistrar..Lambda.1.instance = new TransportRegistrar..Lambda.1();
    }

    @Override  // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer0) {
        return TransportRegistrar.lambda$getComponents$0(componentContainer0);
    }

    public static ComponentFactory lambdaFactory$() {
        return TransportRegistrar..Lambda.1.instance;
    }
}

