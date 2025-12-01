package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0003\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0004\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0005\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0006\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0007\u001A\u00020\b*\u00020\u0002\u001A\n\u0010\t\u001A\u00020\b*\u00020\u0002\u001A\n\u0010\n\u001A\u00020\b*\u00020\u0002\u001A\u001F\u0010\u000B\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001A\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000F\u001A\u0012\u0010\u0010\u001A\u00020\u0011*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001A\n\u0010\u0013\u001A\u00020\u0001*\u00020\u0002\u001A\u0012\u0010\u0014\u001A\u00020\u0011*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001A\u001E\u0010\u0015\u001A\u00020\u0011*\u00020\u00022\b\b\u0002\u0010\u0016\u001A\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001A\n\u0010\u0018\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0019\u001A\u00020\u0001*\u00020\u0002\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u001A"}, d2 = {"anyChangeConsumed", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changedToDown", "changedToDownIgnoreConsumed", "changedToUp", "changedToUpIgnoreConsumed", "consumeAllChanges", "", "consumeDownChange", "consumePositionChange", "isOutOfBounds", "size", "Landroidx/compose/ui/unit/IntSize;", "isOutOfBounds-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Z", "positionChange", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)J", "positionChangeConsumed", "positionChangeIgnoreConsumed", "positionChangeInternal", "ignoreConsumed", "(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J", "positionChanged", "positionChangedIgnoreConsumed", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class PointerEventKt {
    public static final boolean anyChangeConsumed(PointerInputChange pointerInputChange0) {
        Intrinsics.checkNotNullParameter(pointerInputChange0, "<this>");
        return PointerEventKt.positionChangeConsumed(pointerInputChange0) || pointerInputChange0.getConsumed().getDownChange();
    }

    public static final boolean changedToDown(PointerInputChange pointerInputChange0) {
        Intrinsics.checkNotNullParameter(pointerInputChange0, "<this>");
        return !pointerInputChange0.getConsumed().getDownChange() && !pointerInputChange0.getPreviousPressed() && pointerInputChange0.getPressed();
    }

    public static final boolean changedToDownIgnoreConsumed(PointerInputChange pointerInputChange0) {
        Intrinsics.checkNotNullParameter(pointerInputChange0, "<this>");
        return !pointerInputChange0.getPreviousPressed() && pointerInputChange0.getPressed();
    }

    public static final boolean changedToUp(PointerInputChange pointerInputChange0) {
        Intrinsics.checkNotNullParameter(pointerInputChange0, "<this>");
        return !pointerInputChange0.getConsumed().getDownChange() && pointerInputChange0.getPreviousPressed() && !pointerInputChange0.getPressed();
    }

    public static final boolean changedToUpIgnoreConsumed(PointerInputChange pointerInputChange0) {
        Intrinsics.checkNotNullParameter(pointerInputChange0, "<this>");
        return pointerInputChange0.getPreviousPressed() && !pointerInputChange0.getPressed();
    }

    public static final void consumeAllChanges(PointerInputChange pointerInputChange0) {
        Intrinsics.checkNotNullParameter(pointerInputChange0, "<this>");
        PointerEventKt.consumeDownChange(pointerInputChange0);
        PointerEventKt.consumePositionChange(pointerInputChange0);
    }

    public static final void consumeDownChange(PointerInputChange pointerInputChange0) {
        Intrinsics.checkNotNullParameter(pointerInputChange0, "<this>");
        if(pointerInputChange0.getPressed() != pointerInputChange0.getPreviousPressed()) {
            pointerInputChange0.getConsumed().setDownChange(true);
        }
    }

    public static final void consumePositionChange(PointerInputChange pointerInputChange0) {
        Intrinsics.checkNotNullParameter(pointerInputChange0, "<this>");
        if(!Offset.equals-impl0(PointerEventKt.positionChange(pointerInputChange0), 0L)) {
            pointerInputChange0.getConsumed().setPositionChange(true);
        }
    }

    public static final boolean isOutOfBounds-O0kMr_c(PointerInputChange pointerInputChange0, long v) {
        Intrinsics.checkNotNullParameter(pointerInputChange0, "$this$isOutOfBounds");
        long v1 = pointerInputChange0.getPosition-F1C5BW0();
        float f = Offset.getX-impl(v1);
        float f1 = Offset.getY-impl(v1);
        return f < 0.0f || f > ((float)(((int)(v >> 0x20)))) || f1 < 0.0f || f1 > ((float)(((int)(v & 0xFFFFFFFFL))));
    }

    public static final long positionChange(PointerInputChange pointerInputChange0) {
        Intrinsics.checkNotNullParameter(pointerInputChange0, "<this>");
        return PointerEventKt.positionChangeInternal(pointerInputChange0, false);
    }

    public static final boolean positionChangeConsumed(PointerInputChange pointerInputChange0) {
        Intrinsics.checkNotNullParameter(pointerInputChange0, "<this>");
        return pointerInputChange0.getConsumed().getPositionChange();
    }

    public static final long positionChangeIgnoreConsumed(PointerInputChange pointerInputChange0) {
        Intrinsics.checkNotNullParameter(pointerInputChange0, "<this>");
        return PointerEventKt.positionChangeInternal(pointerInputChange0, true);
    }

    // 去混淆评级： 低(40)
    private static final long positionChangeInternal(PointerInputChange pointerInputChange0, boolean z) {
        return z || !pointerInputChange0.getConsumed().getPositionChange() ? Offset.minus-MK-Hz9U(pointerInputChange0.getPosition-F1C5BW0(), pointerInputChange0.getPreviousPosition-F1C5BW0()) : 0L;
    }

    static long positionChangeInternal$default(PointerInputChange pointerInputChange0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return PointerEventKt.positionChangeInternal(pointerInputChange0, z);
    }

    public static final boolean positionChanged(PointerInputChange pointerInputChange0) {
        Intrinsics.checkNotNullParameter(pointerInputChange0, "<this>");
        return !Offset.equals-impl0(PointerEventKt.positionChangeInternal(pointerInputChange0, false), 0L);
    }

    public static final boolean positionChangedIgnoreConsumed(PointerInputChange pointerInputChange0) {
        Intrinsics.checkNotNullParameter(pointerInputChange0, "<this>");
        return !Offset.equals-impl0(PointerEventKt.positionChangeInternal(pointerInputChange0, true), 0L);
    }
}

