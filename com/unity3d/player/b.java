package com.unity3d.player;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings.System;

final class b {
    final class a extends ContentObserver {
        final b a;
        private final com.unity3d.player.b.b b;
        private final AudioManager c;
        private final int d;
        private int e;

        public a(Handler handler0, AudioManager audioManager0, int v, com.unity3d.player.b.b b$b0) {
            super(handler0);
            this.c = audioManager0;
            this.d = 3;
            this.b = b$b0;
            this.e = audioManager0.getStreamVolume(3);
        }

        @Override  // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return super.deliverSelfNotifications();
        }

        @Override  // android.database.ContentObserver
        public final void onChange(boolean z, Uri uri0) {
            AudioManager audioManager0 = this.c;
            if(audioManager0 != null && this.b != null) {
                int v = audioManager0.getStreamVolume(this.d);
                if(v != this.e) {
                    this.e = v;
                    this.b.onAudioVolumeChanged(v);
                }
            }
        }
    }

    public interface com.unity3d.player.b.b {
        void onAudioVolumeChanged(int arg1);
    }

    private final Context a;
    private final AudioManager b;
    private a c;

    public b(Context context0) {
        this.a = context0;
        this.b = (AudioManager)context0.getSystemService("audio");
    }

    public final void a() {
        if(this.c != null) {
            this.a.getContentResolver().unregisterContentObserver(this.c);
            this.c = null;
        }
    }

    public final void a(com.unity3d.player.b.b b$b0) {
        this.c = new a(this, new Handler(), this.b, 3, b$b0);
        this.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.c);
    }
}

