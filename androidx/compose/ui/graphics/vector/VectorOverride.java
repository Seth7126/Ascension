package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001C\b`\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0016J\u001C\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010\f\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\u0006H\u0016J\u0010\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u0006H\u0016J\u0010\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0011\u001A\u00020\u0006H\u0016J\u0010\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u0006H\u0016J\u0010\u0010\u0014\u001A\u00020\u00062\u0006\u0010\u0015\u001A\u00020\u0006H\u0016J\u0014\u0010\u0016\u001A\u0004\u0018\u00010\u00032\b\u0010\u0017\u001A\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0018\u001A\u00020\u00062\u0006\u0010\u0019\u001A\u00020\u0006H\u0016J\u0010\u0010\u001A\u001A\u00020\u00062\u0006\u0010\u001B\u001A\u00020\u0006H\u0016J\u0010\u0010\u001C\u001A\u00020\u00062\u0006\u0010\u001D\u001A\u00020\u0006H\u0016J\u0010\u0010\u001E\u001A\u00020\u00062\u0006\u0010\u001F\u001A\u00020\u0006H\u0016J\u0010\u0010 \u001A\u00020\u00062\u0006\u0010!\u001A\u00020\u0006H\u0016J\u0010\u0010\"\u001A\u00020\u00062\u0006\u0010#\u001A\u00020\u0006H\u0016J\u0010\u0010$\u001A\u00020\u00062\u0006\u0010%\u001A\u00020\u0006H\u0016¨\u0006&"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorOverride;", "", "obtainFill", "Landroidx/compose/ui/graphics/Brush;", "fill", "obtainFillAlpha", "", "fillAlpha", "obtainPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "pathData", "obtainPivotX", "pivotX", "obtainPivotY", "pivotY", "obtainRotation", "rotation", "obtainScaleX", "scaleX", "obtainScaleY", "scaleY", "obtainStroke", "stroke", "obtainStrokeAlpha", "strokeAlpha", "obtainStrokeWidth", "strokeWidth", "obtainTranslateX", "translateX", "obtainTranslateY", "translateY", "obtainTrimPathEnd", "trimPathEnd", "obtainTrimPathOffset", "trimPathOffset", "obtainTrimPathStart", "trimPathStart", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface VectorOverride {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static Brush obtainFill(VectorOverride vectorOverride0, Brush brush0) {
            Intrinsics.checkNotNullParameter(vectorOverride0, "this");
            return brush0;
        }

        public static float obtainFillAlpha(VectorOverride vectorOverride0, float f) {
            Intrinsics.checkNotNullParameter(vectorOverride0, "this");
            return f;
        }

        public static List obtainPathData(VectorOverride vectorOverride0, List list0) {
            Intrinsics.checkNotNullParameter(vectorOverride0, "this");
            Intrinsics.checkNotNullParameter(list0, "pathData");
            return list0;
        }

        public static float obtainPivotX(VectorOverride vectorOverride0, float f) {
            Intrinsics.checkNotNullParameter(vectorOverride0, "this");
            return f;
        }

        public static float obtainPivotY(VectorOverride vectorOverride0, float f) {
            Intrinsics.checkNotNullParameter(vectorOverride0, "this");
            return f;
        }

        public static float obtainRotation(VectorOverride vectorOverride0, float f) {
            Intrinsics.checkNotNullParameter(vectorOverride0, "this");
            return f;
        }

        public static float obtainScaleX(VectorOverride vectorOverride0, float f) {
            Intrinsics.checkNotNullParameter(vectorOverride0, "this");
            return f;
        }

        public static float obtainScaleY(VectorOverride vectorOverride0, float f) {
            Intrinsics.checkNotNullParameter(vectorOverride0, "this");
            return f;
        }

        public static Brush obtainStroke(VectorOverride vectorOverride0, Brush brush0) {
            Intrinsics.checkNotNullParameter(vectorOverride0, "this");
            return brush0;
        }

        public static float obtainStrokeAlpha(VectorOverride vectorOverride0, float f) {
            Intrinsics.checkNotNullParameter(vectorOverride0, "this");
            return f;
        }

        public static float obtainStrokeWidth(VectorOverride vectorOverride0, float f) {
            Intrinsics.checkNotNullParameter(vectorOverride0, "this");
            return f;
        }

        public static float obtainTranslateX(VectorOverride vectorOverride0, float f) {
            Intrinsics.checkNotNullParameter(vectorOverride0, "this");
            return f;
        }

        public static float obtainTranslateY(VectorOverride vectorOverride0, float f) {
            Intrinsics.checkNotNullParameter(vectorOverride0, "this");
            return f;
        }

        public static float obtainTrimPathEnd(VectorOverride vectorOverride0, float f) {
            Intrinsics.checkNotNullParameter(vectorOverride0, "this");
            return f;
        }

        public static float obtainTrimPathOffset(VectorOverride vectorOverride0, float f) {
            Intrinsics.checkNotNullParameter(vectorOverride0, "this");
            return f;
        }

        public static float obtainTrimPathStart(VectorOverride vectorOverride0, float f) {
            Intrinsics.checkNotNullParameter(vectorOverride0, "this");
            return f;
        }
    }

    Brush obtainFill(Brush arg1);

    float obtainFillAlpha(float arg1);

    List obtainPathData(List arg1);

    float obtainPivotX(float arg1);

    float obtainPivotY(float arg1);

    float obtainRotation(float arg1);

    float obtainScaleX(float arg1);

    float obtainScaleY(float arg1);

    Brush obtainStroke(Brush arg1);

    float obtainStrokeAlpha(float arg1);

    float obtainStrokeWidth(float arg1);

    float obtainTranslateX(float arg1);

    float obtainTranslateY(float arg1);

    float obtainTrimPathEnd(float arg1);

    float obtainTrimPathOffset(float arg1);

    float obtainTrimPathStart(float arg1);
}

