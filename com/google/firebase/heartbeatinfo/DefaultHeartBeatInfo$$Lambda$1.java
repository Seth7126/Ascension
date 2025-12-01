package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

final class DefaultHeartBeatInfo..Lambda.1 implements ComponentFactory {
    private static final DefaultHeartBeatInfo..Lambda.1 instance;

    static {
        DefaultHeartBeatInfo..Lambda.1.instance = new DefaultHeartBeatInfo..Lambda.1();
    }

    @Override  // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer0) {
        return DefaultHeartBeatInfo.lambda$component$0(componentContainer0);
    }

    public static ComponentFactory lambdaFactory$() {
        return DefaultHeartBeatInfo..Lambda.1.instance;
    }
}

