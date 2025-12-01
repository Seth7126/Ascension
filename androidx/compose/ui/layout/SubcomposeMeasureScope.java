package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.DpRect;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u0011\u0010\u0007\u001A\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH&¢\u0006\u0002\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "subcompose", "", "Landroidx/compose/ui/layout/Measurable;", "slotId", "", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface SubcomposeMeasureScope extends MeasureScope {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static MeasureResult layout(SubcomposeMeasureScope subcomposeMeasureScope0, int v, int v1, Map map0, Function1 function10) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope0, "this");
            Intrinsics.checkNotNullParameter(map0, "alignmentLines");
            Intrinsics.checkNotNullParameter(function10, "placementBlock");
            return androidx.compose.ui.layout.MeasureScope.DefaultImpls.layout(subcomposeMeasureScope0, v, v1, map0, function10);
        }

        public static int roundToPx--R2X_6o(SubcomposeMeasureScope subcomposeMeasureScope0, long v) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope0, "this");
            return androidx.compose.ui.layout.MeasureScope.DefaultImpls.roundToPx--R2X_6o(subcomposeMeasureScope0, v);
        }

        public static int roundToPx-0680j_4(SubcomposeMeasureScope subcomposeMeasureScope0, float f) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope0, "this");
            return androidx.compose.ui.layout.MeasureScope.DefaultImpls.roundToPx-0680j_4(subcomposeMeasureScope0, f);
        }

        public static float toDp-GaN1DYA(SubcomposeMeasureScope subcomposeMeasureScope0, long v) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope0, "this");
            return androidx.compose.ui.layout.MeasureScope.DefaultImpls.toDp-GaN1DYA(subcomposeMeasureScope0, v);
        }

        public static float toDp-u2uoSUM(SubcomposeMeasureScope subcomposeMeasureScope0, float f) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope0, "this");
            return androidx.compose.ui.layout.MeasureScope.DefaultImpls.toDp-u2uoSUM(subcomposeMeasureScope0, f);
        }

        public static float toDp-u2uoSUM(SubcomposeMeasureScope subcomposeMeasureScope0, int v) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope0, "this");
            return androidx.compose.ui.layout.MeasureScope.DefaultImpls.toDp-u2uoSUM(subcomposeMeasureScope0, v);
        }

        public static float toPx--R2X_6o(SubcomposeMeasureScope subcomposeMeasureScope0, long v) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope0, "this");
            return androidx.compose.ui.layout.MeasureScope.DefaultImpls.toPx--R2X_6o(subcomposeMeasureScope0, v);
        }

        public static float toPx-0680j_4(SubcomposeMeasureScope subcomposeMeasureScope0, float f) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope0, "this");
            return androidx.compose.ui.layout.MeasureScope.DefaultImpls.toPx-0680j_4(subcomposeMeasureScope0, f);
        }

        public static Rect toRect(SubcomposeMeasureScope subcomposeMeasureScope0, DpRect dpRect0) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope0, "this");
            Intrinsics.checkNotNullParameter(dpRect0, "receiver");
            return androidx.compose.ui.layout.MeasureScope.DefaultImpls.toRect(subcomposeMeasureScope0, dpRect0);
        }

        public static long toSp-0xMU5do(SubcomposeMeasureScope subcomposeMeasureScope0, float f) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope0, "this");
            return androidx.compose.ui.layout.MeasureScope.DefaultImpls.toSp-0xMU5do(subcomposeMeasureScope0, f);
        }

        public static long toSp-kPz2Gy4(SubcomposeMeasureScope subcomposeMeasureScope0, float f) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope0, "this");
            return androidx.compose.ui.layout.MeasureScope.DefaultImpls.toSp-kPz2Gy4(subcomposeMeasureScope0, f);
        }

        public static long toSp-kPz2Gy4(SubcomposeMeasureScope subcomposeMeasureScope0, int v) {
            Intrinsics.checkNotNullParameter(subcomposeMeasureScope0, "this");
            return androidx.compose.ui.layout.MeasureScope.DefaultImpls.toSp-kPz2Gy4(subcomposeMeasureScope0, v);
        }
    }

    List subcompose(Object arg1, Function2 arg2);
}

