package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

final class p {
    private final Context a;

    public p(Context context0) {
        this.a = context0;
    }

    final Context a() {
        return this.a;
    }

    static String b(Context context0) {
        try {
            Bundle bundle0 = context0.getPackageManager().getApplicationInfo("com.playdekgames.android.Ascension", 0x80).metaData;
            return bundle0 == null ? null : bundle0.getString("local_testing_dir");
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }
}

