package com.google.android.play.core.assetpacks.internal;

import android.os.Process;
import android.util.Log;
import java.util.Locale;

public final class o {
    private final String a;

    public o(String s) {
        this.a = "UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] " + s;
    }

    // 去混淆评级： 低(20)
    public final int a(String s, Object[] arr_object) {
        return Log.isLoggable("PlayCore", 3) ? Log.d("PlayCore", o.f(this.a, s, arr_object)) : 0;
    }

    // 去混淆评级： 低(20)
    public final int b(String s, Object[] arr_object) {
        return Log.isLoggable("PlayCore", 6) ? Log.e("PlayCore", o.f(this.a, s, arr_object)) : 0;
    }

    // 去混淆评级： 低(20)
    public final int c(Throwable throwable0, String s, Object[] arr_object) {
        return Log.isLoggable("PlayCore", 6) ? Log.e("PlayCore", o.f(this.a, s, arr_object), throwable0) : 0;
    }

    // 去混淆评级： 低(20)
    public final int d(String s, Object[] arr_object) {
        return Log.isLoggable("PlayCore", 4) ? Log.i("PlayCore", o.f(this.a, s, arr_object)) : 0;
    }

    // 去混淆评级： 低(20)
    public final int e(String s, Object[] arr_object) {
        return Log.isLoggable("PlayCore", 5) ? Log.w("PlayCore", o.f(this.a, s, arr_object)) : 0;
    }

    private static String f(String s, String s1, Object[] arr_object) {
        if(arr_object.length > 0) {
            s1 = String.format(Locale.US, s1, arr_object);
        }
        return s + " : " + s1;
    }
}

