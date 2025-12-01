package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.DpRect;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JG\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\u0014\b\u0002\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0017\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000B¢\u0006\u0002\b\u000EH\u0016¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "layout", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "placementBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface MeasureScope extends IntrinsicMeasureScope {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static MeasureResult layout(MeasureScope measureScope0, int v, int v1, Map map0, Function1 function10) {
            Intrinsics.checkNotNullParameter(measureScope0, "this");
            Intrinsics.checkNotNullParameter(map0, "alignmentLines");
            Intrinsics.checkNotNullParameter(function10, "placementBlock");
            return new MeasureScope.layout.1(v, v1, map0, measureScope0, function10);
        }

        public static MeasureResult layout$default(MeasureScope measureScope0, int v, int v1, Map map0, Function1 function10, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
            }
            if((v2 & 4) != 0) {
                map0 = MapsKt.emptyMap();
            }
            return measureScope0.layout(v, v1, map0, function10);
        }

        public static int roundToPx--R2X_6o(MeasureScope measureScope0, long v) {
            Intrinsics.checkNotNullParameter(measureScope0, "this");
            return androidx.compose.ui.layout.IntrinsicMeasureScope.DefaultImpls.roundToPx--R2X_6o(measureScope0, v);
        }

        public static int roundToPx-0680j_4(MeasureScope measureScope0, float f) {
            Intrinsics.checkNotNullParameter(measureScope0, "this");
            return androidx.compose.ui.layout.IntrinsicMeasureScope.DefaultImpls.roundToPx-0680j_4(measureScope0, f);
        }

        public static float toDp-GaN1DYA(MeasureScope measureScope0, long v) {
            Intrinsics.checkNotNullParameter(measureScope0, "this");
            return androidx.compose.ui.layout.IntrinsicMeasureScope.DefaultImpls.toDp-GaN1DYA(measureScope0, v);
        }

        public static float toDp-u2uoSUM(MeasureScope measureScope0, float f) {
            Intrinsics.checkNotNullParameter(measureScope0, "this");
            return androidx.compose.ui.layout.IntrinsicMeasureScope.DefaultImpls.toDp-u2uoSUM(measureScope0, f);
        }

        public static float toDp-u2uoSUM(MeasureScope measureScope0, int v) {
            Intrinsics.checkNotNullParameter(measureScope0, "this");
            return androidx.compose.ui.layout.IntrinsicMeasureScope.DefaultImpls.toDp-u2uoSUM(measureScope0, v);
        }

        public static float toPx--R2X_6o(MeasureScope measureScope0, long v) {
            Intrinsics.checkNotNullParameter(measureScope0, "this");
            return androidx.compose.ui.layout.IntrinsicMeasureScope.DefaultImpls.toPx--R2X_6o(measureScope0, v);
        }

        public static float toPx-0680j_4(MeasureScope measureScope0, float f) {
            Intrinsics.checkNotNullParameter(measureScope0, "this");
            return androidx.compose.ui.layout.IntrinsicMeasureScope.DefaultImpls.toPx-0680j_4(measureScope0, f);
        }

        public static Rect toRect(MeasureScope measureScope0, DpRect dpRect0) {
            Intrinsics.checkNotNullParameter(measureScope0, "this");
            Intrinsics.checkNotNullParameter(dpRect0, "receiver");
            return androidx.compose.ui.layout.IntrinsicMeasureScope.DefaultImpls.toRect(measureScope0, dpRect0);
        }

        public static long toSp-0xMU5do(MeasureScope measureScope0, float f) {
            Intrinsics.checkNotNullParameter(measureScope0, "this");
            return androidx.compose.ui.layout.IntrinsicMeasureScope.DefaultImpls.toSp-0xMU5do(measureScope0, f);
        }

        public static long toSp-kPz2Gy4(MeasureScope measureScope0, float f) {
            Intrinsics.checkNotNullParameter(measureScope0, "this");
            return androidx.compose.ui.layout.IntrinsicMeasureScope.DefaultImpls.toSp-kPz2Gy4(measureScope0, f);
        }

        public static long toSp-kPz2Gy4(MeasureScope measureScope0, int v) {
            Intrinsics.checkNotNullParameter(measureScope0, "this");
            return androidx.compose.ui.layout.IntrinsicMeasureScope.DefaultImpls.toSp-kPz2Gy4(measureScope0, v);
        }
    }

    MeasureResult layout(int arg1, int arg2, Map arg3, Function1 arg4);
}

