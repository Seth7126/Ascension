package androidx.core.graphics;

import android.graphics.Bitmap;

public final class BitmapCompat {
    public static int getAllocationByteCount(Bitmap bitmap0) {
        return bitmap0.getAllocationByteCount();
    }

    public static boolean hasMipMap(Bitmap bitmap0) {
        return bitmap0.hasMipMap();
    }

    public static void setHasMipMap(Bitmap bitmap0, boolean z) {
        bitmap0.setHasMipMap(z);
    }
}

