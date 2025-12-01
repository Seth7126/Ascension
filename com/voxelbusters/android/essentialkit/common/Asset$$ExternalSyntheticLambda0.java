package com.voxelbusters.android.essentialkit.common;

import com.voxelbusters.android.essentialkit.common.interfaces.ILoadAssetListener;

public final class Asset..ExternalSyntheticLambda0 implements Runnable {
    public final Asset f$0;
    public final ILoadAssetListener f$1;

    public Asset..ExternalSyntheticLambda0(Asset asset0, ILoadAssetListener iLoadAssetListener0) {
        this.f$0 = asset0;
        this.f$1 = iLoadAssetListener0;
    }

    @Override
    public final void run() {
        this.f$0.lambda$load$0$com-voxelbusters-android-essentialkit-common-Asset(this.f$1);
    }
}

