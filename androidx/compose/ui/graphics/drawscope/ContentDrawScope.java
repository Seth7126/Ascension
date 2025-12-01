package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface ContentDrawScope extends DrawScope {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static long getCenter-F1C5BW0(ContentDrawScope contentDrawScope0) {
            Intrinsics.checkNotNullParameter(contentDrawScope0, "this");
            return androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls.getCenter-F1C5BW0(contentDrawScope0);
        }

        public static long getSize-NH-jbRc(ContentDrawScope contentDrawScope0) {
            Intrinsics.checkNotNullParameter(contentDrawScope0, "this");
            return androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls.getSize-NH-jbRc(contentDrawScope0);
        }

        public static int roundToPx--R2X_6o(ContentDrawScope contentDrawScope0, long v) {
            Intrinsics.checkNotNullParameter(contentDrawScope0, "this");
            return androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls.roundToPx--R2X_6o(contentDrawScope0, v);
        }

        public static int roundToPx-0680j_4(ContentDrawScope contentDrawScope0, float f) {
            Intrinsics.checkNotNullParameter(contentDrawScope0, "this");
            return androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls.roundToPx-0680j_4(contentDrawScope0, f);
        }

        public static float toDp-GaN1DYA(ContentDrawScope contentDrawScope0, long v) {
            Intrinsics.checkNotNullParameter(contentDrawScope0, "this");
            return androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls.toDp-GaN1DYA(contentDrawScope0, v);
        }

        public static float toDp-u2uoSUM(ContentDrawScope contentDrawScope0, float f) {
            Intrinsics.checkNotNullParameter(contentDrawScope0, "this");
            return androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls.toDp-u2uoSUM(contentDrawScope0, f);
        }

        public static float toDp-u2uoSUM(ContentDrawScope contentDrawScope0, int v) {
            Intrinsics.checkNotNullParameter(contentDrawScope0, "this");
            return androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls.toDp-u2uoSUM(contentDrawScope0, v);
        }

        public static float toPx--R2X_6o(ContentDrawScope contentDrawScope0, long v) {
            Intrinsics.checkNotNullParameter(contentDrawScope0, "this");
            return androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls.toPx--R2X_6o(contentDrawScope0, v);
        }

        public static float toPx-0680j_4(ContentDrawScope contentDrawScope0, float f) {
            Intrinsics.checkNotNullParameter(contentDrawScope0, "this");
            return androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls.toPx-0680j_4(contentDrawScope0, f);
        }

        public static Rect toRect(ContentDrawScope contentDrawScope0, DpRect dpRect0) {
            Intrinsics.checkNotNullParameter(contentDrawScope0, "this");
            Intrinsics.checkNotNullParameter(dpRect0, "receiver");
            return androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls.toRect(contentDrawScope0, dpRect0);
        }

        public static long toSp-0xMU5do(ContentDrawScope contentDrawScope0, float f) {
            Intrinsics.checkNotNullParameter(contentDrawScope0, "this");
            return androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls.toSp-0xMU5do(contentDrawScope0, f);
        }

        public static long toSp-kPz2Gy4(ContentDrawScope contentDrawScope0, float f) {
            Intrinsics.checkNotNullParameter(contentDrawScope0, "this");
            return androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls.toSp-kPz2Gy4(contentDrawScope0, f);
        }

        public static long toSp-kPz2Gy4(ContentDrawScope contentDrawScope0, int v) {
            Intrinsics.checkNotNullParameter(contentDrawScope0, "this");
            return androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls.toSp-kPz2Gy4(contentDrawScope0, v);
        }
    }

    void drawContent();
}

