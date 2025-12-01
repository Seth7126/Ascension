package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000B\u001A\u00020\fX¦\u000E¢\u0006\f\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u0018\u0010\u0011\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u0018\u0010\u0014\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R\u0018\u0010\u0017\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0018\u0010\u0005\"\u0004\b\u0019\u0010\u0007R\u0018\u0010\u001A\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u001B\u0010\u0005\"\u0004\b\u001C\u0010\u0007R\u0018\u0010\u001D\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u001E\u0010\u0005\"\u0004\b\u001F\u0010\u0007R\u0018\u0010 \u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b!\u0010\u0005\"\u0004\b\"\u0010\u0007R\u0018\u0010#\u001A\u00020$X¦\u000E¢\u0006\f\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(R!\u0010)\u001A\u00020*X¦\u000Eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001A\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0018\u0010/\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b0\u0010\u0005\"\u0004\b1\u0010\u0007R\u0018\u00102\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b3\u0010\u0005\"\u0004\b4\u0010\u0007\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Landroidx/compose/ui/unit/Density;", "alpha", "", "getAlpha", "()F", "setAlpha", "(F)V", "cameraDistance", "getCameraDistance", "setCameraDistance", "clip", "", "getClip", "()Z", "setClip", "(Z)V", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "shadowElevation", "getShadowElevation", "setShadowElevation", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "getTransformOrigin-SzJe1aQ", "()J", "setTransformOrigin-__ExYCQ", "(J)V", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface GraphicsLayerScope extends Density {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static int roundToPx--R2X_6o(GraphicsLayerScope graphicsLayerScope0, long v) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.roundToPx--R2X_6o(graphicsLayerScope0, v);
        }

        public static int roundToPx-0680j_4(GraphicsLayerScope graphicsLayerScope0, float f) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.roundToPx-0680j_4(graphicsLayerScope0, f);
        }

        public static float toDp-GaN1DYA(GraphicsLayerScope graphicsLayerScope0, long v) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toDp-GaN1DYA(graphicsLayerScope0, v);
        }

        public static float toDp-u2uoSUM(GraphicsLayerScope graphicsLayerScope0, float f) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toDp-u2uoSUM(graphicsLayerScope0, f);
        }

        public static float toDp-u2uoSUM(GraphicsLayerScope graphicsLayerScope0, int v) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toDp-u2uoSUM(graphicsLayerScope0, v);
        }

        public static float toPx--R2X_6o(GraphicsLayerScope graphicsLayerScope0, long v) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toPx--R2X_6o(graphicsLayerScope0, v);
        }

        public static float toPx-0680j_4(GraphicsLayerScope graphicsLayerScope0, float f) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toPx-0680j_4(graphicsLayerScope0, f);
        }

        public static Rect toRect(GraphicsLayerScope graphicsLayerScope0, DpRect dpRect0) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope0, "this");
            Intrinsics.checkNotNullParameter(dpRect0, "receiver");
            return androidx.compose.ui.unit.Density.DefaultImpls.toRect(graphicsLayerScope0, dpRect0);
        }

        public static long toSp-0xMU5do(GraphicsLayerScope graphicsLayerScope0, float f) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toSp-0xMU5do(graphicsLayerScope0, f);
        }

        public static long toSp-kPz2Gy4(GraphicsLayerScope graphicsLayerScope0, float f) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toSp-kPz2Gy4(graphicsLayerScope0, f);
        }

        public static long toSp-kPz2Gy4(GraphicsLayerScope graphicsLayerScope0, int v) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope0, "this");
            return androidx.compose.ui.unit.Density.DefaultImpls.toSp-kPz2Gy4(graphicsLayerScope0, v);
        }
    }

    float getAlpha();

    float getCameraDistance();

    boolean getClip();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    Shape getShape();

    long getTransformOrigin-SzJe1aQ();

    float getTranslationX();

    float getTranslationY();

    void setAlpha(float arg1);

    void setCameraDistance(float arg1);

    void setClip(boolean arg1);

    void setRotationX(float arg1);

    void setRotationY(float arg1);

    void setRotationZ(float arg1);

    void setScaleX(float arg1);

    void setScaleY(float arg1);

    void setShadowElevation(float arg1);

    void setShape(Shape arg1);

    void setTransformOrigin-__ExYCQ(long arg1);

    void setTranslationX(float arg1);

    void setTranslationY(float arg1);
}

