package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface IntrinsicMeasureScope extends Density {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static int roundToPx--R2X_6o(IntrinsicMeasureScope intrinsicMeasureScope0, long v) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.roundToPx--R2X_6o(intrinsicMeasureScope0, v);
        }

        public static int roundToPx-0680j_4(IntrinsicMeasureScope intrinsicMeasureScope0, float f) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.roundToPx-0680j_4(intrinsicMeasureScope0, f);
        }

        public static float toDp-GaN1DYA(IntrinsicMeasureScope intrinsicMeasureScope0, long v) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toDp-GaN1DYA(intrinsicMeasureScope0, v);
        }

        public static float toDp-u2uoSUM(IntrinsicMeasureScope intrinsicMeasureScope0, float f) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toDp-u2uoSUM(intrinsicMeasureScope0, f);
        }

        public static float toDp-u2uoSUM(IntrinsicMeasureScope intrinsicMeasureScope0, int v) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toDp-u2uoSUM(intrinsicMeasureScope0, v);
        }

        public static float toPx--R2X_6o(IntrinsicMeasureScope intrinsicMeasureScope0, long v) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toPx--R2X_6o(intrinsicMeasureScope0, v);
        }

        public static float toPx-0680j_4(IntrinsicMeasureScope intrinsicMeasureScope0, float f) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toPx-0680j_4(intrinsicMeasureScope0, f);
        }

        public static Rect toRect(IntrinsicMeasureScope intrinsicMeasureScope0, DpRect dpRect0) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "this");
            Intrinsics.checkNotNullParameter(dpRect0, "receiver");
            return androidx.compose.ui.unit.Density.DefaultImpls.toRect(intrinsicMeasureScope0, dpRect0);
        }

        public static long toSp-0xMU5do(IntrinsicMeasureScope intrinsicMeasureScope0, float f) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toSp-0xMU5do(intrinsicMeasureScope0, f);
        }

        public static long toSp-kPz2Gy4(IntrinsicMeasureScope intrinsicMeasureScope0, float f) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toSp-kPz2Gy4(intrinsicMeasureScope0, f);
        }

        public static long toSp-kPz2Gy4(IntrinsicMeasureScope intrinsicMeasureScope0, int v) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toSp-kPz2Gy4(intrinsicMeasureScope0, v);
        }
    }

    LayoutDirection getLayoutDirection();
}

