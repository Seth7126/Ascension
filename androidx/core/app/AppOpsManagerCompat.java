package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;

public final class AppOpsManagerCompat {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    public static int noteOp(Context context0, String s, int v, String s1) {
        return ((AppOpsManager)context0.getSystemService("appops")).noteOp(s, v, s1);
    }

    public static int noteOpNoThrow(Context context0, String s, int v, String s1) {
        return ((AppOpsManager)context0.getSystemService("appops")).noteOpNoThrow(s, v, s1);
    }

    public static int noteProxyOp(Context context0, String s, String s1) {
        return Build.VERSION.SDK_INT < 23 ? 1 : ((AppOpsManager)context0.getSystemService(AppOpsManager.class)).noteProxyOp(s, s1);
    }

    public static int noteProxyOpNoThrow(Context context0, String s, String s1) {
        return Build.VERSION.SDK_INT < 23 ? 1 : ((AppOpsManager)context0.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(s, s1);
    }

    public static String permissionToOp(String s) {
        return Build.VERSION.SDK_INT < 23 ? null : AppOpsManager.permissionToOp(s);
    }
}

