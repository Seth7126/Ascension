package com.google.firebase.components;

final class Component..Lambda.1 implements ComponentFactory {
    private final Object arg$1;

    private Component..Lambda.1(Object object0) {
        this.arg$1 = object0;
    }

    @Override  // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer0) {
        return this.arg$1;
    }

    public static ComponentFactory lambdaFactory$(Object object0) {
        return new Component..Lambda.1(object0);
    }
}

