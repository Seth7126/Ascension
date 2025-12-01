package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Games.GamesOptions;
import com.google.android.gms.games.VideosClient.OnCaptureOverlayStateListener;
import com.google.android.gms.games.VideosClient;
import com.google.android.gms.tasks.Task;

public final class zzei extends zzac implements VideosClient {
    public zzei(Activity activity0, GamesOptions games$GamesOptions0) {
        super(activity0, games$GamesOptions0);
    }

    public zzei(Context context0, GamesOptions games$GamesOptions0) {
        super(context0, games$GamesOptions0);
    }

    @Override  // com.google.android.gms.games.VideosClient
    public final Task getCaptureCapabilities() {
        return this.zza(zzel.zzev);
    }

    @Override  // com.google.android.gms.games.VideosClient
    public final Task getCaptureOverlayIntent() {
        return this.zza(zzek.zzev);
    }

    @Override  // com.google.android.gms.games.VideosClient
    public final Task getCaptureState() {
        return this.zza(zzen.zzev);
    }

    @Override  // com.google.android.gms.games.VideosClient
    public final Task isCaptureAvailable(int v) {
        return this.zza(new zzem(v));
    }

    @Override  // com.google.android.gms.games.VideosClient
    public final Task isCaptureSupported() {
        return this.zza(zzep.zzev);
    }

    @Override  // com.google.android.gms.games.VideosClient
    public final Task registerOnCaptureOverlayStateChangedListener(OnCaptureOverlayStateListener videosClient$OnCaptureOverlayStateListener0) {
        ListenerHolder listenerHolder0 = this.registerListener(videosClient$OnCaptureOverlayStateListener0, OnCaptureOverlayStateListener.class.getSimpleName());
        Preconditions.checkNotNull(listenerHolder0.getListenerKey(), "Key must not be null");
        zzeo zzeo0 = new zzeo(listenerHolder0);
        return this.doRegisterEventListener(RegistrationMethods.builder().register(zzeo0).unregister(zzer.zzev).withHolder(listenerHolder0).build());
    }

    @Override  // com.google.android.gms.games.VideosClient
    public final Task unregisterOnCaptureOverlayStateChangedListener(OnCaptureOverlayStateListener videosClient$OnCaptureOverlayStateListener0) {
        return this.doUnregisterEventListener(ListenerHolders.createListenerKey(videosClient$OnCaptureOverlayStateListener0, OnCaptureOverlayStateListener.class.getSimpleName()));
    }
}

