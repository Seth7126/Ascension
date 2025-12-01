package com.google.firebase.components;

import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public class ComponentRuntime extends AbstractComponentContainer {
    private static final Provider EMPTY_PROVIDER;
    private final Map components;
    private final EventBus eventBus;
    private final Map lazyInstanceMap;
    private final Map lazySetMap;

    static {
        ComponentRuntime.EMPTY_PROVIDER = ComponentRuntime..Lambda.5.lambdaFactory$();
    }

    public ComponentRuntime(Executor executor0, Iterable iterable0, Component[] arr_component) {
        this.components = new HashMap();
        this.lazyInstanceMap = new HashMap();
        this.lazySetMap = new HashMap();
        EventBus eventBus0 = new EventBus(executor0);
        this.eventBus = eventBus0;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(Component.of(eventBus0, EventBus.class, new Class[]{Subscriber.class, Publisher.class}));
        for(Object object0: iterable0) {
            arrayList0.addAll(((ComponentRegistrar)object0).getComponents());
        }
        for(int v = 0; v < arr_component.length; ++v) {
            Component component0 = arr_component[v];
            if(component0 != null) {
                arrayList0.add(component0);
            }
        }
        CycleDetector.detect(arrayList0);
        for(Object object1: arrayList0) {
            Lazy lazy0 = new Lazy(ComponentRuntime..Lambda.1.lambdaFactory$(this, ((Component)object1)));
            this.components.put(((Component)object1), lazy0);
        }
        this.processInstanceComponents();
        this.processSetComponents();
    }

    @Override  // com.google.firebase.components.AbstractComponentContainer
    public Object get(Class class0) {
        return super.get(class0);
    }

    @Override  // com.google.firebase.components.ComponentContainer
    public Provider getProvider(Class class0) {
        Preconditions.checkNotNull(class0, "Null interface requested.");
        return (Provider)this.lazyInstanceMap.get(class0);
    }

    public void initializeEagerComponents(boolean z) {
        for(Object object0: this.components.entrySet()) {
            Component component0 = (Component)((Map.Entry)object0).getKey();
            Lazy lazy0 = (Lazy)((Map.Entry)object0).getValue();
            if(component0.isAlwaysEager() || component0.isEagerInDefaultApp() && z) {
                lazy0.get();
            }
        }
        this.eventBus.enablePublishingAndFlushPending();
    }

    static Object lambda$new$0(ComponentRuntime componentRuntime0, Component component0) {
        return component0.getFactory().create(new RestrictedComponentContainer(component0, componentRuntime0));
    }

    static Set lambda$processSetComponents$1(Set set0) {
        HashSet hashSet0 = new HashSet();
        for(Object object0: set0) {
            hashSet0.add(((Lazy)object0).get());
        }
        return Collections.unmodifiableSet(hashSet0);
    }

    private void processInstanceComponents() {
        for(Object object0: this.components.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Component component0 = (Component)map$Entry0.getKey();
            if(component0.isValue()) {
                Lazy lazy0 = (Lazy)map$Entry0.getValue();
                for(Object object1: component0.getProvidedInterfaces()) {
                    this.lazyInstanceMap.put(((Class)object1), lazy0);
                }
            }
        }
        this.validateDependencies();
    }

    private void processSetComponents() {
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.components.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Component component0 = (Component)map$Entry0.getKey();
            if(!component0.isValue()) {
                Lazy lazy0 = (Lazy)map$Entry0.getValue();
                for(Object object1: component0.getProvidedInterfaces()) {
                    Class class0 = (Class)object1;
                    if(!hashMap0.containsKey(class0)) {
                        hashMap0.put(class0, new HashSet());
                    }
                    ((Set)hashMap0.get(class0)).add(lazy0);
                }
            }
        }
        for(Object object2: hashMap0.entrySet()) {
            Set set0 = (Set)((Map.Entry)object2).getValue();
            Class class1 = (Class)((Map.Entry)object2).getKey();
            Lazy lazy1 = new Lazy(ComponentRuntime..Lambda.4.lambdaFactory$(set0));
            this.lazySetMap.put(class1, lazy1);
        }
    }

    @Override  // com.google.firebase.components.AbstractComponentContainer
    public Set setOf(Class class0) {
        return super.setOf(class0);
    }

    @Override  // com.google.firebase.components.ComponentContainer
    public Provider setOfProvider(Class class0) {
        Provider provider0 = (Lazy)this.lazySetMap.get(class0);
        return provider0 == null ? ComponentRuntime.EMPTY_PROVIDER : provider0;
    }

    private void validateDependencies() {
        for(Object object0: this.components.keySet()) {
            Component component0 = (Component)object0;
            for(Object object1: component0.getDependencies()) {
                Dependency dependency0 = (Dependency)object1;
                if(dependency0.isRequired() && !this.lazyInstanceMap.containsKey(dependency0.getInterface())) {
                    throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", component0, dependency0.getInterface()));
                }
                if(false) {
                    break;
                }
            }
            if(false) {
                break;
            }
        }
    }
}

