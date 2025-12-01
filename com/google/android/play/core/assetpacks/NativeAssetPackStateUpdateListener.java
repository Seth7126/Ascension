package com.google.android.play.core.assetpacks;

public class NativeAssetPackStateUpdateListener implements AssetPackStateUpdateListener {
    public native void onStateUpdate(AssetPackState arg1) {
    }

    @Override  // com.google.android.play.core.listener.StateUpdatedListener
    public final void onStateUpdate(Object object0) {
        this.onStateUpdate(((AssetPackState)object0));
    }
}

