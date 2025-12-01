package com.unity3d.player;

import android.content.Context;

public class AudioVolumeHandler implements b {
    private com.unity3d.player.b a;

    AudioVolumeHandler(Context context0) {
        com.unity3d.player.b b0 = new com.unity3d.player.b(context0);
        this.a = b0;
        b0.a(this);
    }

    public final void a() {
        this.a.a();
        this.a = null;
    }

    @Override  // com.unity3d.player.b$b
    public final native void onAudioVolumeChanged(int arg1) {
    }
}

