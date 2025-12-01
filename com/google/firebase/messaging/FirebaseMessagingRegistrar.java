package com.google.firebase.messaging;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;

public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    static class DevNullTransport implements Transport {
        private DevNullTransport() {
        }

        DevNullTransport(com.google.firebase.messaging.FirebaseMessagingRegistrar.1 firebaseMessagingRegistrar$10) {
        }

        @Override  // com.google.android.datatransport.Transport
        public void schedule(Event event0, TransportScheduleCallback transportScheduleCallback0) {
            transportScheduleCallback0.onSchedule(null);
        }

        @Override  // com.google.android.datatransport.Transport
        public void send(Event event0) {
        }
    }

    public static class DevNullTransportFactory implements TransportFactory {
        @Override  // com.google.android.datatransport.TransportFactory
        public Transport getTransport(String s, Class class0, Encoding encoding0, Transformer transformer0) {
            return new DevNullTransport(null);
        }

        @Override  // com.google.android.datatransport.TransportFactory
        public Transport getTransport(String s, Class class0, Transformer transformer0) {
            return new DevNullTransport(null);
        }
    }

    static TransportFactory determineFactory(TransportFactory transportFactory0) {
        return transportFactory0 != null && CCTDestination.LEGACY_INSTANCE.getSupportedEncodings().contains(Encoding.of("json")) ? transportFactory0 : new DevNullTransportFactory();
    }

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(new Component[]{Component.builder(FirebaseMessaging.class).add(Dependency.required(FirebaseApp.class)).add(Dependency.required(FirebaseInstanceId.class)).add(Dependency.required(UserAgentPublisher.class)).add(Dependency.required(HeartBeatInfo.class)).add(Dependency.optional(TransportFactory.class)).add(Dependency.required(FirebaseInstallationsApi.class)).factory(FirebaseMessagingRegistrar..Lambda.0.$instance).alwaysEager().build(), LibraryVersionComponent.create("fire-fcm", "20.2.4")});
    }

    static final FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(ComponentContainer componentContainer0) {
        return new FirebaseMessaging(((FirebaseApp)componentContainer0.get(FirebaseApp.class)), ((FirebaseInstanceId)componentContainer0.get(FirebaseInstanceId.class)), ((UserAgentPublisher)componentContainer0.get(UserAgentPublisher.class)), ((HeartBeatInfo)componentContainer0.get(HeartBeatInfo.class)), ((FirebaseInstallationsApi)componentContainer0.get(FirebaseInstallationsApi.class)), FirebaseMessagingRegistrar.determineFactory(((TransportFactory)componentContainer0.get(TransportFactory.class))));
    }

    class com.google.firebase.messaging.FirebaseMessagingRegistrar.1 {
    }

}

