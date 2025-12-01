package com.google.android.play.core.assetpacks;

import android.content.Context;

public final class AssetPackManagerFactory {
    public static AssetPackManager getInstance(Context context0) {
        synchronized(AssetPackManagerFactory.class) {
            return d.a(context0).a();
        }
    }
}

