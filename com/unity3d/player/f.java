package com.unity3d.player;

import android.util.Log;

final class f {
    protected static boolean a;

    static {
    }

    protected static void Log(int v, String s) {
        if(f.a) {
            return;
        }
        if(v == 6) {
            Log.e("Unity", s);
        }
        if(v == 5) {
            Log.w("Unity", s);
        }
    }
}

