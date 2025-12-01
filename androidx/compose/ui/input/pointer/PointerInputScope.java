package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J@\u0010\n\u001A\u0002H\u000B\"\u0004\b\u0000\u0010\u000B2\'\u0010\f\u001A#\b\u0001\u0012\u0004\u0012\u00020\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000B0\u000F\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r¢\u0006\u0002\b\u0011H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u001B\u0010\u0002\u001A\u00020\u0003X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\t\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEventScope", "R", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface PointerInputScope extends Density {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static int roundToPx--R2X_6o(PointerInputScope pointerInputScope0, long v) {
            Intrinsics.checkNotNullParameter(pointerInputScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.roundToPx--R2X_6o(pointerInputScope0, v);
        }

        public static int roundToPx-0680j_4(PointerInputScope pointerInputScope0, float f) {
            Intrinsics.checkNotNullParameter(pointerInputScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.roundToPx-0680j_4(pointerInputScope0, f);
        }

        public static float toDp-GaN1DYA(PointerInputScope pointerInputScope0, long v) {
            Intrinsics.checkNotNullParameter(pointerInputScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toDp-GaN1DYA(pointerInputScope0, v);
        }

        public static float toDp-u2uoSUM(PointerInputScope pointerInputScope0, float f) {
            Intrinsics.checkNotNullParameter(pointerInputScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toDp-u2uoSUM(pointerInputScope0, f);
        }

        public static float toDp-u2uoSUM(PointerInputScope pointerInputScope0, int v) {
            Intrinsics.checkNotNullParameter(pointerInputScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toDp-u2uoSUM(pointerInputScope0, v);
        }

        public static float toPx--R2X_6o(PointerInputScope pointerInputScope0, long v) {
            Intrinsics.checkNotNullParameter(pointerInputScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toPx--R2X_6o(pointerInputScope0, v);
        }

        public static float toPx-0680j_4(PointerInputScope pointerInputScope0, float f) {
            Intrinsics.checkNotNullParameter(pointerInputScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toPx-0680j_4(pointerInputScope0, f);
        }

        public static Rect toRect(PointerInputScope pointerInputScope0, DpRect dpRect0) {
            Intrinsics.checkNotNullParameter(pointerInputScope0, "this");
            Intrinsics.checkNotNullParameter(dpRect0, "receiver");
            return androidx.compose.ui.unit.Density.DefaultImpls.toRect(pointerInputScope0, dpRect0);
        }

        public static long toSp-0xMU5do(PointerInputScope pointerInputScope0, float f) {
            Intrinsics.checkNotNullParameter(pointerInputScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toSp-0xMU5do(pointerInputScope0, f);
        }

        public static long toSp-kPz2Gy4(PointerInputScope pointerInputScope0, float f) {
            Intrinsics.checkNotNullParameter(pointerInputScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toSp-kPz2Gy4(pointerInputScope0, f);
        }

        public static long toSp-kPz2Gy4(PointerInputScope pointerInputScope0, int v) {
            Intrinsics.checkNotNullParameter(pointerInputScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toSp-kPz2Gy4(pointerInputScope0, v);
        }
    }

    Object awaitPointerEventScope(Function2 arg1, Continuation arg2);

    long getSize-YbymL2g();

    ViewConfiguration getViewConfiguration();
}

