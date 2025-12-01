package androidx.compose.ui.input.pointer;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001A\u00020\u0012H&J-\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u000EH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001AR\u0014\u0010\u0003\u001A\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u001C\u0010\u0007\u001A\u0004\u0018\u00010\bX\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR\u001A\u0010\r\u001A\u00020\u000E8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputFilter;", "", "()V", "isAttached", "", "isAttached$ui_release", "()Z", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates$ui_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates$ui_release", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "onCancel", "", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class PointerInputFilter {
    public static final int $stable = 8;
    private LayoutCoordinates layoutCoordinates;

    static {
    }

    public final LayoutCoordinates getLayoutCoordinates$ui_release() {
        return this.layoutCoordinates;
    }

    // 去混淆评级： 低(20)
    public final long getSize-YbymL2g() {
        IntSize intSize0 = this.layoutCoordinates == null ? null : IntSize.box-impl(this.layoutCoordinates.getSize-YbymL2g());
        return intSize0 == null ? 0L : intSize0.unbox-impl();
    }

    public final boolean isAttached$ui_release() {
        return this.layoutCoordinates != null && this.layoutCoordinates.isAttached();
    }

    public abstract void onCancel();

    public abstract void onPointerEvent-H0pRuoY(PointerEvent arg1, PointerEventPass arg2, long arg3);

    public final void setLayoutCoordinates$ui_release(LayoutCoordinates layoutCoordinates0) {
        this.layoutCoordinates = layoutCoordinates0;
    }
}

