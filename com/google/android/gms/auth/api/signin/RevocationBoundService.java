package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.zzw;

public final class RevocationBoundService extends Service {
    @Override  // android.app.Service
    public final IBinder onBind(Intent intent0) {
        if(!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent0.getAction()) && !"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent0.getAction())) {
            String s = intent0.getAction();
            Log.w("RevocationService", (s.length() == 0 ? new String("Unknown action sent to RevocationBoundService: ") : "Unknown action sent to RevocationBoundService: " + s));
            return null;
        }
        if(Log.isLoggable("RevocationService", 2)) {
            String s1 = intent0.getAction();
            Log.v("RevocationService", (s1.length() == 0 ? new String("RevocationBoundService handling ") : "RevocationBoundService handling " + s1));
        }
        return new zzw(this);
    }
}

