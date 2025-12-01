package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001A\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\bR\u0014\u0010\u000B\u001A\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\bR\u0014\u0010\r\u001A\u00020\u000E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/AndroidViewConfiguration;", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroid/view/ViewConfiguration;", "(Landroid/view/ViewConfiguration;)V", "doubleTapMinTimeMillis", "", "getDoubleTapMinTimeMillis", "()J", "doubleTapTimeoutMillis", "getDoubleTapTimeoutMillis", "longPressTimeoutMillis", "getLongPressTimeoutMillis", "touchSlop", "", "getTouchSlop", "()F", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidViewConfiguration implements ViewConfiguration {
    public static final int $stable = 8;
    private final android.view.ViewConfiguration viewConfiguration;

    static {
    }

    public AndroidViewConfiguration(android.view.ViewConfiguration viewConfiguration0) {
        Intrinsics.checkNotNullParameter(viewConfiguration0, "viewConfiguration");
        super();
        this.viewConfiguration = viewConfiguration0;
    }

    @Override  // androidx.compose.ui.platform.ViewConfiguration
    public long getDoubleTapMinTimeMillis() {
        return 40L;
    }

    @Override  // androidx.compose.ui.platform.ViewConfiguration
    public long getDoubleTapTimeoutMillis() {
        return (long)android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    @Override  // androidx.compose.ui.platform.ViewConfiguration
    public long getLongPressTimeoutMillis() {
        return (long)android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override  // androidx.compose.ui.platform.ViewConfiguration
    public float getTouchSlop() {
        return (float)this.viewConfiguration.getScaledTouchSlop();
    }
}

