package com.google.firebase.platforminfo;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

final class DefaultUserAgentPublisher..Lambda.1 implements ComponentFactory {
    private static final DefaultUserAgentPublisher..Lambda.1 instance;

    static {
        DefaultUserAgentPublisher..Lambda.1.instance = new DefaultUserAgentPublisher..Lambda.1();
    }

    @Override  // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer0) {
        return DefaultUserAgentPublisher.lambda$component$0(componentContainer0);
    }

    public static ComponentFactory lambdaFactory$() {
        return DefaultUserAgentPublisher..Lambda.1.instance;
    }
}

