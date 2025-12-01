package com.unity3d.player;

import android.content.Context;
import android.provider.Settings.System;

public class OrientationLockListener implements a {
    private k a;
    private Context b;

    OrientationLockListener(Context context0) {
        this.b = context0;
        this.a = new k(context0);
        this.nativeUpdateOrientationLockState(Settings.System.getInt(this.b.getContentResolver(), "accelerometer_rotation", 0));
        this.a.a(this, "accelerometer_rotation");
    }

    public final void a() {
        this.a.a();
        this.a = null;
    }

    @Override  // com.unity3d.player.k$a
    public final void b() {
        this.nativeUpdateOrientationLockState(Settings.System.getInt(this.b.getContentResolver(), "accelerometer_rotation", 0));
    }

    public final native void nativeUpdateOrientationLockState(int arg1) {
    }
}

