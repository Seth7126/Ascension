package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;

public class DefaultHeartBeatInfo implements HeartBeatInfo {
    private HeartBeatInfoStorage storage;

    private DefaultHeartBeatInfo(Context context0) {
        this.storage = HeartBeatInfoStorage.getInstance(context0);
    }

    DefaultHeartBeatInfo(HeartBeatInfoStorage heartBeatInfoStorage0) {
        this.storage = heartBeatInfoStorage0;
    }

    public static Component component() {
        return Component.builder(HeartBeatInfo.class).add(Dependency.required(Context.class)).factory(DefaultHeartBeatInfo..Lambda.1.lambdaFactory$()).build();
    }

    @Override  // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public HeartBeat getHeartBeatCode(String s) {
        long v = System.currentTimeMillis();
        boolean z = this.storage.shouldSendSdkHeartBeat(s, v);
        boolean z1 = this.storage.shouldSendGlobalHeartBeat(v);
        if(z && z1) {
            return HeartBeat.COMBINED;
        }
        if(z1) {
            return HeartBeat.GLOBAL;
        }
        return z ? HeartBeat.SDK : HeartBeat.NONE;
    }

    static HeartBeatInfo lambda$component$0(ComponentContainer componentContainer0) {
        return new DefaultHeartBeatInfo(((Context)componentContainer0.get(Context.class)));
    }
}

