package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

public final class WindowCompat {
    static class Impl16 {
        static void setDecorFitsSystemWindows(Window window0, boolean z) {
            View view0 = window0.getDecorView();
            int v = view0.getSystemUiVisibility();
            view0.setSystemUiVisibility((z ? v & 0xFFFFF8FF : v | 0x700));
        }
    }

    static class Impl30 {
        static WindowInsetsControllerCompat getInsetsController(Window window0) {
            WindowInsetsController windowInsetsController0 = window0.getInsetsController();
            return windowInsetsController0 == null ? null : WindowInsetsControllerCompat.toWindowInsetsControllerCompat(windowInsetsController0);
        }

        static void setDecorFitsSystemWindows(Window window0, boolean z) {
            window0.setDecorFitsSystemWindows(z);
        }
    }

    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    public static WindowInsetsControllerCompat getInsetsController(Window window0, View view0) {
        return Build.VERSION.SDK_INT < 30 ? new WindowInsetsControllerCompat(window0, view0) : Impl30.getInsetsController(window0);
    }

    public static View requireViewById(Window window0, int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            return window0.requireViewById(v);
        }
        View view0 = window0.findViewById(v);
        if(view0 == null) {
            throw new IllegalArgumentException("ID does not reference a View inside this Window");
        }
        return view0;
    }

    public static void setDecorFitsSystemWindows(Window window0, boolean z) {
        if(Build.VERSION.SDK_INT >= 30) {
            Impl30.setDecorFitsSystemWindows(window0, z);
            return;
        }
        Impl16.setDecorFitsSystemWindows(window0, z);
    }
}

