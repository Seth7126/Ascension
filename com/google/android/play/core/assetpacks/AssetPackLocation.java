package com.google.android.play.core.assetpacks;

public abstract class AssetPackLocation {
    private static final AssetPackLocation a;

    static {
        AssetPackLocation.a = new bm(1, null, null);
    }

    static AssetPackLocation a() {
        return AssetPackLocation.a;
    }

    public abstract String assetsPath();

    public abstract int packStorageMethod();

    public abstract String path();
}

