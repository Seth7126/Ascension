package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/Api29Impl;", "", "()V", "getRecommendedTimeoutMillis", "", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "originalTimeout", "uiContentFlags", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Api29Impl {
    public static final Api29Impl INSTANCE;

    static {
        Api29Impl.INSTANCE = new Api29Impl();
    }

    public final int getRecommendedTimeoutMillis(AccessibilityManager accessibilityManager0, int v, int v1) {
        Intrinsics.checkNotNullParameter(accessibilityManager0, "accessibilityManager");
        return accessibilityManager0.getRecommendedTimeoutMillis(v, v1);
    }
}

