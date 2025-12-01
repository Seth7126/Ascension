package com.google.android.play.core.assetpacks.internal;

import android.os.IBinder;
import android.os.IInterface;

public abstract class e extends b implements f {
    public static f b(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return iInterface0 instanceof f ? ((f)iInterface0) : new d(iBinder0);
    }
}

