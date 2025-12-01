package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.play.core.assetpacks.internal.o;

final class ed {
    private static final o a;
    private final Context b;
    private int c;

    static {
        ed.a = new o("PackageStateCache");
    }

    ed(Context context0) {
        this.c = -1;
        this.b = context0;
    }

    public final int a() {
        synchronized(this) {
            if(this.c == -1) {
                try {
                    this.c = this.b.getPackageManager().getPackageInfo("com.playdekgames.android.Ascension", 0).versionCode;
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    ed.a.b("The current version of the app could not be retrieved", new Object[0]);
                }
            }
            return this.c;
        }
    }
}

