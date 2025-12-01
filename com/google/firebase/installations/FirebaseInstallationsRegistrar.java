package com.google.firebase.installations;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;

public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(new Component[]{Component.builder(FirebaseInstallationsApi.class).add(Dependency.required(FirebaseApp.class)).add(Dependency.required(HeartBeatInfo.class)).add(Dependency.required(UserAgentPublisher.class)).factory(FirebaseInstallationsRegistrar..Lambda.1.lambdaFactory$()).build(), LibraryVersionComponent.create("fire-installations", "16.3.3")});
    }

    static FirebaseInstallationsApi lambda$getComponents$0(ComponentContainer componentContainer0) {
        return new FirebaseInstallations(((FirebaseApp)componentContainer0.get(FirebaseApp.class)), ((UserAgentPublisher)componentContainer0.get(UserAgentPublisher.class)), ((HeartBeatInfo)componentContainer0.get(HeartBeatInfo.class)));
    }
}

