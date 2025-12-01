package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AssetPackExtractionService extends Service {
    b a;

    @Override  // android.app.Service
    public final IBinder onBind(Intent intent0) {
        return this.a;
    }

    @Override  // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d.a(this.getApplicationContext()).b(this);
    }
}

