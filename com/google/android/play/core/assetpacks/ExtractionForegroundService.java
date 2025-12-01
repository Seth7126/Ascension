package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ExtractionForegroundService extends Service {
    private final IBinder a;

    public ExtractionForegroundService() {
        this.a = new ch(this);
    }

    public final void a() {
        synchronized(this) {
            this.stopForeground(true);
            this.stopSelf();
        }
    }

    @Override  // android.app.Service
    public final IBinder onBind(Intent intent0) {
        return this.a;
    }
}

