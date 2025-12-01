package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A&\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0000\u001A5\u0010\u0007\u001A\u00020\u0001*\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\f\u001A5\u0010\r\u001A\u00020\u0001*\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\f\u001A=\u0010\r\u001A\u00020\u0001*\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u000F\u001A\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0013"}, d2 = {"emptyCancelMotionEventScope", "", "nowMillis", "", "block", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "toCancelMotionEventScope", "Landroidx/compose/ui/input/pointer/PointerEvent;", "offset", "Landroidx/compose/ui/geometry/Offset;", "toCancelMotionEventScope-d-4ec7I", "(Landroidx/compose/ui/input/pointer/PointerEvent;JLkotlin/jvm/functions/Function1;)V", "toMotionEventScope", "toMotionEventScope-d-4ec7I", "cancel", "", "toMotionEventScope-ubNVwUQ", "(Landroidx/compose/ui/input/pointer/PointerEvent;JLkotlin/jvm/functions/Function1;Z)V", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class PointerInteropUtils_androidKt {
    public static final void emptyCancelMotionEventScope(long v, Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0);
        motionEvent0.setSource(0);
        Intrinsics.checkNotNullExpressionValue(motionEvent0, "motionEvent");
        function10.invoke(motionEvent0);
        motionEvent0.recycle();
    }

    public static void emptyCancelMotionEventScope$default(long v, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = SystemClock.uptimeMillis();
        }
        PointerInteropUtils_androidKt.emptyCancelMotionEventScope(v, function10);
    }

    public static final void toCancelMotionEventScope-d-4ec7I(PointerEvent pointerEvent0, long v, Function1 function10) {
        Intrinsics.checkNotNullParameter(pointerEvent0, "$this$toCancelMotionEventScope");
        Intrinsics.checkNotNullParameter(function10, "block");
        PointerInteropUtils_androidKt.toMotionEventScope-ubNVwUQ(pointerEvent0, v, function10, true);
    }

    public static final void toMotionEventScope-d-4ec7I(PointerEvent pointerEvent0, long v, Function1 function10) {
        Intrinsics.checkNotNullParameter(pointerEvent0, "$this$toMotionEventScope");
        Intrinsics.checkNotNullParameter(function10, "block");
        PointerInteropUtils_androidKt.toMotionEventScope-ubNVwUQ(pointerEvent0, v, function10, false);
    }

    private static final void toMotionEventScope-ubNVwUQ(PointerEvent pointerEvent0, long v, Function1 function10, boolean z) {
        if(pointerEvent0.getMotionEvent$ui_release() == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        MotionEvent motionEvent0 = pointerEvent0.getMotionEvent$ui_release();
        int v1 = motionEvent0.getAction();
        if(z) {
            motionEvent0.setAction(3);
        }
        motionEvent0.offsetLocation(-Offset.getX-impl(v), -Offset.getY-impl(v));
        function10.invoke(motionEvent0);
        motionEvent0.offsetLocation(Offset.getX-impl(v), Offset.getY-impl(v));
        motionEvent0.setAction(v1);
    }
}

