package androidx.core.content.pm;

import android.content.pm.PermissionInfo;
import android.os.Build.VERSION;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class PermissionInfoCompat {
    @Retention(RetentionPolicy.SOURCE)
    public @interface Protection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProtectionFlags {
    }

    public static int getProtection(PermissionInfo permissionInfo0) {
        return Build.VERSION.SDK_INT < 28 ? permissionInfo0.protectionLevel & 15 : permissionInfo0.getProtection();
    }

    public static int getProtectionFlags(PermissionInfo permissionInfo0) {
        return Build.VERSION.SDK_INT < 28 ? permissionInfo0.protectionLevel & -16 : permissionInfo0.getProtectionFlags();
    }
}

