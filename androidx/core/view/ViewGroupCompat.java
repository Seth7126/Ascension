package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public final class ViewGroupCompat {
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;

    public static int getLayoutMode(ViewGroup viewGroup0) {
        return viewGroup0.getLayoutMode();
    }

    public static int getNestedScrollAxes(ViewGroup viewGroup0) {
        return viewGroup0.getNestedScrollAxes();
    }

    public static boolean isTransitionGroup(ViewGroup viewGroup0) {
        return viewGroup0.isTransitionGroup();
    }

    @Deprecated
    public static boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
        return viewGroup0.onRequestSendAccessibilityEvent(view0, accessibilityEvent0);
    }

    public static void setLayoutMode(ViewGroup viewGroup0, int v) {
        viewGroup0.setLayoutMode(v);
    }

    @Deprecated
    public static void setMotionEventSplittingEnabled(ViewGroup viewGroup0, boolean z) {
        viewGroup0.setMotionEventSplittingEnabled(z);
    }

    public static void setTransitionGroup(ViewGroup viewGroup0, boolean z) {
        viewGroup0.setTransitionGroup(z);
    }
}

