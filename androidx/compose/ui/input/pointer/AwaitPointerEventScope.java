package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001B\u0010\u000E\u001A\u00020\u00032\b\b\u0002\u0010\u000F\u001A\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u001B\u0010\u0006\u001A\u00020\u0007X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0012\u0010\n\u001A\u00020\u000BX¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\r\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "currentEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEvent", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface AwaitPointerEventScope extends Density {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope0, PointerEventPass pointerEventPass0, Continuation continuation0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
            }
            if((v & 1) != 0) {
                pointerEventPass0 = PointerEventPass.Main;
            }
            return awaitPointerEventScope0.awaitPointerEvent(pointerEventPass0, continuation0);
        }

        public static int roundToPx--R2X_6o(AwaitPointerEventScope awaitPointerEventScope0, long v) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.roundToPx--R2X_6o(awaitPointerEventScope0, v);
        }

        public static int roundToPx-0680j_4(AwaitPointerEventScope awaitPointerEventScope0, float f) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.roundToPx-0680j_4(awaitPointerEventScope0, f);
        }

        public static float toDp-GaN1DYA(AwaitPointerEventScope awaitPointerEventScope0, long v) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toDp-GaN1DYA(awaitPointerEventScope0, v);
        }

        public static float toDp-u2uoSUM(AwaitPointerEventScope awaitPointerEventScope0, float f) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toDp-u2uoSUM(awaitPointerEventScope0, f);
        }

        public static float toDp-u2uoSUM(AwaitPointerEventScope awaitPointerEventScope0, int v) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toDp-u2uoSUM(awaitPointerEventScope0, v);
        }

        public static float toPx--R2X_6o(AwaitPointerEventScope awaitPointerEventScope0, long v) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toPx--R2X_6o(awaitPointerEventScope0, v);
        }

        public static float toPx-0680j_4(AwaitPointerEventScope awaitPointerEventScope0, float f) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toPx-0680j_4(awaitPointerEventScope0, f);
        }

        public static Rect toRect(AwaitPointerEventScope awaitPointerEventScope0, DpRect dpRect0) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope0, "this");
            Intrinsics.checkNotNullParameter(dpRect0, "receiver");
            return androidx.compose.ui.unit.Density.DefaultImpls.toRect(awaitPointerEventScope0, dpRect0);
        }

        public static long toSp-0xMU5do(AwaitPointerEventScope awaitPointerEventScope0, float f) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toSp-0xMU5do(awaitPointerEventScope0, f);
        }

        public static long toSp-kPz2Gy4(AwaitPointerEventScope awaitPointerEventScope0, float f) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toSp-kPz2Gy4(awaitPointerEventScope0, f);
        }

        public static long toSp-kPz2Gy4(AwaitPointerEventScope awaitPointerEventScope0, int v) {
            Intrinsics.checkNotNullParameter(awaitPointerEventScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toSp-kPz2Gy4(awaitPointerEventScope0, v);
        }
    }

    Object awaitPointerEvent(PointerEventPass arg1, Continuation arg2);

    PointerEvent getCurrentEvent();

    long getSize-YbymL2g();

    ViewConfiguration getViewConfiguration();
}

