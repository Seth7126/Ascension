package androidx.compose.ui.input.pointer;

import android.os.Build.VERSION;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001AG\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000E\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u000F"}, d2 = {"createPointerInputEventData", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "timestamp", "", "motionEvent", "Landroid/view/MotionEvent;", "index", "", "upIndex", "createPointerInputEventData-VnAYq1g", "(Landroidx/compose/ui/input/pointer/PositionCalculator;JJLandroid/view/MotionEvent;ILjava/lang/Integer;)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class MotionEventAdapter_androidKt {
    private static final PointerInputEventData createPointerInputEventData-VnAYq1g(PositionCalculator positionCalculator0, long v, long v1, MotionEvent motionEvent0, int v2, Integer integer0) {
        long v6;
        long v5;
        long v3 = OffsetKt.Offset(motionEvent0.getX(v2), motionEvent0.getY(v2));
        if(v2 == 0) {
            long v4 = OffsetKt.Offset(motionEvent0.getRawX(), motionEvent0.getRawY());
            v5 = v4;
            v6 = positionCalculator0.screenToLocal-MK-Hz9U(v4);
        }
        else if(Build.VERSION.SDK_INT >= 29) {
            long v7 = MotionEventHelper.INSTANCE.toRawOffset-dBAh8RU(motionEvent0, v2);
            v5 = v7;
            v6 = positionCalculator0.screenToLocal-MK-Hz9U(v7);
        }
        else {
            v6 = v3;
            v5 = positionCalculator0.localToScreen-MK-Hz9U(v3);
        }
        switch(motionEvent0.getToolType(v2)) {
            case 0: {
                return integer0 != null && v2 == ((int)integer0) ? new PointerInputEventData(v, v1, v5, v6, false, 0, null) : new PointerInputEventData(v, v1, v5, v6, true, 0, null);
            }
            case 1: {
                return integer0 != null && v2 == ((int)integer0) ? new PointerInputEventData(v, v1, v5, v6, false, 1, null) : new PointerInputEventData(v, v1, v5, v6, true, 1, null);
            }
            case 2: {
                return integer0 != null && v2 == ((int)integer0) ? new PointerInputEventData(v, v1, v5, v6, false, 3, null) : new PointerInputEventData(v, v1, v5, v6, true, 3, null);
            }
            case 3: {
                return integer0 != null && v2 == ((int)integer0) ? new PointerInputEventData(v, v1, v5, v6, false, 2, null) : new PointerInputEventData(v, v1, v5, v6, true, 2, null);
            }
            case 4: {
                return integer0 != null && v2 == ((int)integer0) ? new PointerInputEventData(v, v1, v5, v6, false, 4, null) : new PointerInputEventData(v, v1, v5, v6, true, 4, null);
            }
            default: {
                return integer0 != null && v2 == ((int)integer0) ? new PointerInputEventData(v, v1, v5, v6, false, 0, null) : new PointerInputEventData(v, v1, v5, v6, true, 0, null);
            }
        }
    }
}

