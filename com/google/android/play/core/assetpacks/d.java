package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.assetpacks.internal.ag;

public final class d {
    private static a a;

    static a a(Context context0) {
        synchronized(d.class) {
            if(d.a == null) {
                cd cd0 = new cd(null);
                cd0.b(new p(ag.a(context0)));
                d.a = cd0.a();
            }
            return d.a;
        }
    }
}

