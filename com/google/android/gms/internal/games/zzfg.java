package com.google.android.gms.internal.games;

import android.os.Bundle;
import android.os.IBinder;

public final class zzfg {
    public int bottom;
    public int gravity;
    public int left;
    public int right;
    public int top;
    public IBinder zzjn;
    public int zzjo;

    public zzfg(int v, IBinder iBinder0) {
        this.zzjo = -1;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.gravity = v;
        this.zzjn = null;
    }

    public final Bundle zzce() {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("popupLocationInfo.gravity", this.gravity);
        bundle0.putInt("popupLocationInfo.displayId", this.zzjo);
        bundle0.putInt("popupLocationInfo.left", this.left);
        bundle0.putInt("popupLocationInfo.top", this.top);
        bundle0.putInt("popupLocationInfo.right", this.right);
        bundle0.putInt("popupLocationInfo.bottom", this.bottom);
        return bundle0;
    }
}

