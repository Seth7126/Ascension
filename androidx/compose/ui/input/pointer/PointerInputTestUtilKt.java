package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\u001A.\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0000\u001AG\u0010\b\u001A\u00020\t*\u001E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000E2\u0006\u0010\u000F\u001A\u00020\u000B2\b\b\u0002\u0010\u0010\u001A\u00020\rH\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001AO\u0010\u0013\u001A\u00020\t*\u001E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000E2\u0006\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\u0014\u001A\u00020\f2\b\b\u0002\u0010\u0010\u001A\u00020\rH\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A[\u0010\u0017\u001A\u00020\t*\u001E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000E2\u0006\u0010\u000F\u001A\u00020\u000B2\u0012\u0010\u0018\u001A\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0019\"\u00020\f2\b\b\u0002\u0010\u0010\u001A\u00020\rH\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001AU\u0010\u0017\u001A\u00020\t*\u001E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000E2\u0006\u0010\u000F\u001A\u00020\u000B2\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\f0\u001C2\b\b\u0002\u0010\u0010\u001A\u00020\rH\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001D\u001A(\u0010\u001E\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u001F\u001A\u00020\u00062\b\b\u0002\u0010 \u001A\u00020\u0006H\u0000\u001A(\u0010!\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0000\u001A\u0014\u0010\"\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0003H\u0000*<\b\u0000\u0010#\"\u001A\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\n2\u001A\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\n\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006$"}, d2 = {"down", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "id", "", "durationMillis", "x", "", "y", "invokeOverAllPasses", "", "Lkotlin/Function3;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/input/pointer/PointerInputHandler;", "pointerEvent", "size", "invokeOverAllPasses-H0pRuoY", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;J)V", "invokeOverPass", "pointerEventPass", "invokeOverPass-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "invokeOverPasses", "pointerEventPasses", "", "invokeOverPasses-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;[Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Ljava/util/List;J)V", "moveBy", "dx", "dy", "moveTo", "up", "PointerInputHandler", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class PointerInputTestUtilKt {
    public static final PointerInputChange down(long v, long v1, float f, float f1) {
        return new PointerInputChange(v, v1, OffsetKt.Offset(f, f1), true, v1, OffsetKt.Offset(f, f1), false, new ConsumedData(false, false, 3, null), 0, 0x100, null);
    }

    public static PointerInputChange down$default(long v, long v1, float f, float f1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0L;
        }
        float f2 = (v2 & 4) == 0 ? f : 0.0f;
        return (v2 & 8) == 0 ? PointerInputTestUtilKt.down(v, v1, f2, f1) : PointerInputTestUtilKt.down(v, v1, f2, 0.0f);
    }

    public static final void invokeOverAllPasses-H0pRuoY(Function3 function30, PointerEvent pointerEvent0, long v) {
        Intrinsics.checkNotNullParameter(function30, "$this$invokeOverAllPasses");
        Intrinsics.checkNotNullParameter(pointerEvent0, "pointerEvent");
        PointerInputTestUtilKt.invokeOverPasses-hUlJWOE(function30, pointerEvent0, CollectionsKt.listOf(new PointerEventPass[]{PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final}), v);
    }

    public static void invokeOverAllPasses-H0pRuoY$default(Function3 function30, PointerEvent pointerEvent0, long v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x7FFFFFFF7FFFFFFFL;
        }
        PointerInputTestUtilKt.invokeOverAllPasses-H0pRuoY(function30, pointerEvent0, v);
    }

    public static final void invokeOverPass-hUlJWOE(Function3 function30, PointerEvent pointerEvent0, PointerEventPass pointerEventPass0, long v) {
        Intrinsics.checkNotNullParameter(function30, "$this$invokeOverPass");
        Intrinsics.checkNotNullParameter(pointerEvent0, "pointerEvent");
        Intrinsics.checkNotNullParameter(pointerEventPass0, "pointerEventPass");
        PointerInputTestUtilKt.invokeOverPasses-hUlJWOE(function30, pointerEvent0, CollectionsKt.listOf(pointerEventPass0), v);
    }

    public static void invokeOverPass-hUlJWOE$default(Function3 function30, PointerEvent pointerEvent0, PointerEventPass pointerEventPass0, long v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0x7FFFFFFF7FFFFFFFL;
        }
        PointerInputTestUtilKt.invokeOverPass-hUlJWOE(function30, pointerEvent0, pointerEventPass0, v);
    }

    public static final void invokeOverPasses-hUlJWOE(Function3 function30, PointerEvent pointerEvent0, List list0, long v) {
        Intrinsics.checkNotNullParameter(function30, "$this$invokeOverPasses");
        Intrinsics.checkNotNullParameter(pointerEvent0, "pointerEvent");
        Intrinsics.checkNotNullParameter(list0, "pointerEventPasses");
        if(!pointerEvent0.getChanges().isEmpty() == 0 || !list0.isEmpty() == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int v1 = list0.size();
        if(v1 - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                function30.invoke(pointerEvent0, ((PointerEventPass)list0.get(v2)), IntSize.box-impl(v));
                if(v2 + 1 > v1 - 1) {
                    break;
                }
            }
        }
    }

    public static final void invokeOverPasses-hUlJWOE(Function3 function30, PointerEvent pointerEvent0, PointerEventPass[] arr_pointerEventPass, long v) {
        Intrinsics.checkNotNullParameter(function30, "$this$invokeOverPasses");
        Intrinsics.checkNotNullParameter(pointerEvent0, "pointerEvent");
        Intrinsics.checkNotNullParameter(arr_pointerEventPass, "pointerEventPasses");
        PointerInputTestUtilKt.invokeOverPasses-hUlJWOE(function30, pointerEvent0, ArraysKt.toList(arr_pointerEventPass), v);
    }

    public static void invokeOverPasses-hUlJWOE$default(Function3 function30, PointerEvent pointerEvent0, List list0, long v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0x7FFFFFFF7FFFFFFFL;
        }
        PointerInputTestUtilKt.invokeOverPasses-hUlJWOE(function30, pointerEvent0, list0, v);
    }

    public static void invokeOverPasses-hUlJWOE$default(Function3 function30, PointerEvent pointerEvent0, PointerEventPass[] arr_pointerEventPass, long v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0x7FFFFFFF7FFFFFFFL;
        }
        PointerInputTestUtilKt.invokeOverPasses-hUlJWOE(function30, pointerEvent0, arr_pointerEventPass, v);
    }

    public static final PointerInputChange moveBy(PointerInputChange pointerInputChange0, long v, float f, float f1) {
        Intrinsics.checkNotNullParameter(pointerInputChange0, "<this>");
        return PointerInputChange.copy-Ezr-O64$default(pointerInputChange0, 0L, pointerInputChange0.getUptimeMillis() + v, OffsetKt.Offset(Offset.getX-impl(pointerInputChange0.getPosition-F1C5BW0()) + f, Offset.getY-impl(pointerInputChange0.getPosition-F1C5BW0()) + f1), true, pointerInputChange0.getUptimeMillis(), pointerInputChange0.getPosition-F1C5BW0(), pointerInputChange0.getPressed(), new ConsumedData(false, false, 3, null), 0, 0x101, null);
    }

    public static PointerInputChange moveBy$default(PointerInputChange pointerInputChange0, long v, float f, float f1, int v1, Object object0) {
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        if((v1 & 4) != 0) {
            f1 = 0.0f;
        }
        return PointerInputTestUtilKt.moveBy(pointerInputChange0, v, f, f1);
    }

    public static final PointerInputChange moveTo(PointerInputChange pointerInputChange0, long v, float f, float f1) {
        Intrinsics.checkNotNullParameter(pointerInputChange0, "<this>");
        return PointerInputChange.copy-Ezr-O64$default(pointerInputChange0, 0L, v, OffsetKt.Offset(f, f1), true, pointerInputChange0.getUptimeMillis(), pointerInputChange0.getPosition-F1C5BW0(), pointerInputChange0.getPressed(), new ConsumedData(false, false, 3, null), 0, 0x101, null);
    }

    public static PointerInputChange moveTo$default(PointerInputChange pointerInputChange0, long v, float f, float f1, int v1, Object object0) {
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        if((v1 & 4) != 0) {
            f1 = 0.0f;
        }
        return PointerInputTestUtilKt.moveTo(pointerInputChange0, v, f, f1);
    }

    public static final PointerInputChange up(PointerInputChange pointerInputChange0, long v) {
        Intrinsics.checkNotNullParameter(pointerInputChange0, "<this>");
        return PointerInputChange.copy-Ezr-O64$default(pointerInputChange0, 0L, v, pointerInputChange0.getPosition-F1C5BW0(), false, pointerInputChange0.getUptimeMillis(), pointerInputChange0.getPosition-F1C5BW0(), pointerInputChange0.getPressed(), new ConsumedData(false, false, 3, null), 0, 0x101, null);
    }
}

