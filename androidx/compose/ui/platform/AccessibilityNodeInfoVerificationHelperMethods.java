package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001E\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityNodeInfoVerificationHelperMethods;", "", "()V", "setAvailableExtraData", "", "node", "Landroid/view/accessibility/AccessibilityNodeInfo;", "data", "", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AccessibilityNodeInfoVerificationHelperMethods {
    public static final AccessibilityNodeInfoVerificationHelperMethods INSTANCE;

    static {
        AccessibilityNodeInfoVerificationHelperMethods.INSTANCE = new AccessibilityNodeInfoVerificationHelperMethods();
    }

    public final void setAvailableExtraData(AccessibilityNodeInfo accessibilityNodeInfo0, List list0) {
        Intrinsics.checkNotNullParameter(accessibilityNodeInfo0, "node");
        Intrinsics.checkNotNullParameter(list0, "data");
        accessibilityNodeInfo0.setAvailableExtraData(list0);
    }
}

