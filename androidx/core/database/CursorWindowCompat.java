package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build.VERSION;

public final class CursorWindowCompat {
    public static CursorWindow create(String s, long v) {
        return Build.VERSION.SDK_INT < 28 ? new CursorWindow(s) : new CursorWindow(s, v);
    }
}

