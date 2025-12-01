package com.google.firebase.iid;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;

public final class Registrar implements ComponentRegistrar {
    static class FIIDInternalAdapter implements FirebaseInstanceIdInternal {
        final FirebaseInstanceId fiid;

        public FIIDInternalAdapter(FirebaseInstanceId firebaseInstanceId0) {
            this.fiid = firebaseInstanceId0;
        }

        @Override  // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public String getId() {
            return this.fiid.getId();
        }

        @Override  // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public String getToken() {
            return this.fiid.getToken();
        }
    }

    @Override  // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return Arrays.asList(new Component[]{Component.builder(FirebaseInstanceId.class).add(Dependency.required(FirebaseApp.class)).add(Dependency.required(Subscriber.class)).add(Dependency.required(UserAgentPublisher.class)).add(Dependency.required(HeartBeatInfo.class)).add(Dependency.required(FirebaseInstallationsApi.class)).factory(Registrar..Lambda.0.$instance).alwaysEager().build(), Component.builder(FirebaseInstanceIdInternal.class).add(Dependency.required(FirebaseInstanceId.class)).factory(Registrar..Lambda.1.$instance).build(), LibraryVersionComponent.create("fire-iid", "20.2.3")});
    }

    static final FirebaseInstanceId lambda$getComponents$0$Registrar(ComponentContainer componentContainer0) {
        return new FirebaseInstanceId(((FirebaseApp)componentContainer0.get(FirebaseApp.class)), ((Subscriber)componentContainer0.get(Subscriber.class)), ((UserAgentPublisher)componentContainer0.get(UserAgentPublisher.class)), ((HeartBeatInfo)componentContainer0.get(HeartBeatInfo.class)), ((FirebaseInstallationsApi)componentContainer0.get(FirebaseInstallationsApi.class)));
    }

    static final FirebaseInstanceIdInternal lambda$getComponents$1$Registrar(ComponentContainer componentContainer0) {
        return new FIIDInternalAdapter(((FirebaseInstanceId)componentContainer0.get(FirebaseInstanceId.class)));
    }
}

