package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build.VERSION;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000E2\u00020\u0001:\u0001\u000EB\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000BH\u0016R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "Landroidx/compose/ui/platform/AccessibilityManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "calculateRecommendedTimeoutMillis", "", "originalTimeoutMillis", "containsIcons", "", "containsText", "containsControls", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidAccessibilityManager implements AccessibilityManager {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/AndroidAccessibilityManager$Companion;", "", "()V", "FlagContentControls", "", "FlagContentIcons", "FlagContentText", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    private static final Companion Companion = null;
    @Deprecated
    public static final int FlagContentControls = 4;
    @Deprecated
    public static final int FlagContentIcons = 1;
    @Deprecated
    public static final int FlagContentText = 2;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;

    static {
        AndroidAccessibilityManager.Companion = new Companion(null);
    }

    public AndroidAccessibilityManager(Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        Object object0 = context0.getSystemService("accessibility");
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager)object0;
    }

    @Override  // androidx.compose.ui.platform.AccessibilityManager
    public long calculateRecommendedTimeoutMillis(long v, boolean z, boolean z1, boolean z2) {
        if(v >= 0x7FFFFFFFL) {
            return v;
        }
        if(z1) {
            z |= 2;
        }
        if(z2) {
            z |= 4;
        }
        if(Build.VERSION.SDK_INT >= 29) {
            int v1 = Api29Impl.INSTANCE.getRecommendedTimeoutMillis(this.accessibilityManager, ((int)v), ((int)z));
            return v1 == 0x7FFFFFFF ? 0x7FFFFFFFFFFFFFFFL : ((long)v1);
        }
        return z2 && this.accessibilityManager.isTouchExplorationEnabled() ? 0x7FFFFFFFFFFFFFFFL : v;
    }
}

