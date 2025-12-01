package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00A2\u0006\u0002\u0010\u0002J\u0006\u0010A\u001A\u00020BR\u001A\u0010\u0003\u001A\u00020\u0004X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001A\u0010\t\u001A\u00020\u0004X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u0006\"\u0004\b\u000B\u0010\bR\u001A\u0010\f\u001A\u00020\rX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001A\u00020\u00048VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001A\u00020\u00048VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0015\u0010\u0006R\u001A\u0010\u0016\u001A\u00020\u0017X\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR\u001A\u0010\u001C\u001A\u00020\u0004X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001D\u0010\u0006\"\u0004\b\u001E\u0010\bR\u001A\u0010\u001F\u001A\u00020\u0004X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001A\u0010\"\u001A\u00020\u0004X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001A\u0010%\u001A\u00020\u0004X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b&\u0010\u0006\"\u0004\b\'\u0010\bR\u001A\u0010(\u001A\u00020\u0004X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001A\u0010+\u001A\u00020\u0004X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR\u001A\u0010.\u001A\u00020/X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b0\u00101\"\u0004\b2\u00103R%\u00104\u001A\u000205X\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0010\n\u0002\u0010:\u001A\u0004\b6\u00107\"\u0004\b8\u00109R\u001A\u0010;\u001A\u00020\u0004X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b<\u0010\u0006\"\u0004\b=\u0010\bR\u001A\u0010>\u001A\u00020\u0004X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b?\u0010\u0006\"\u0004\b@\u0010\b\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006C"}, d2 = {"Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "()V", "alpha", "", "getAlpha", "()F", "setAlpha", "(F)V", "cameraDistance", "getCameraDistance", "setCameraDistance", "clip", "", "getClip", "()Z", "setClip", "(Z)V", "density", "getDensity", "fontScale", "getFontScale", "graphicsDensity", "Landroidx/compose/ui/unit/Density;", "getGraphicsDensity$ui_release", "()Landroidx/compose/ui/unit/Density;", "setGraphicsDensity$ui_release", "(Landroidx/compose/ui/unit/Density;)V", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "shadowElevation", "getShadowElevation", "setShadowElevation", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "getTransformOrigin-SzJe1aQ", "()J", "setTransformOrigin-__ExYCQ", "(J)V", "J", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "reset", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {
    private float alpha;
    private float cameraDistance;
    private boolean clip;
    private Density graphicsDensity;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private Shape shape;
    private long transformOrigin;
    private float translationX;
    private float translationY;

    public ReusableGraphicsLayerScope() {
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.alpha = 1.0f;
        this.cameraDistance = 8.0f;
        this.transformOrigin = 0x3F0000003F000000L;
        this.shape = RectangleShapeKt.getRectangleShape();
        this.graphicsDensity = DensityKt.Density$default(1.0f, 0.0f, 2, null);
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getAlpha() {
        return this.alpha;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public boolean getClip() {
        return this.clip;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    public final Density getGraphicsDensity$ui_release() {
        return this.graphicsDensity;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationX() {
        return this.rotationX;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationY() {
        return this.rotationY;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getScaleX() {
        return this.scaleX;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getScaleY() {
        return this.scaleY;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public Shape getShape() {
        return this.shape;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public long getTransformOrigin-SzJe1aQ() {
        return this.transformOrigin;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getTranslationX() {
        return this.translationX;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getTranslationY() {
        return this.translationY;
    }

    public final void reset() {
        this.setScaleX(1.0f);
        this.setScaleY(1.0f);
        this.setAlpha(1.0f);
        this.setTranslationX(0.0f);
        this.setTranslationY(0.0f);
        this.setShadowElevation(0.0f);
        this.setRotationX(0.0f);
        this.setRotationY(0.0f);
        this.setRotationZ(0.0f);
        this.setCameraDistance(8.0f);
        this.setTransformOrigin-__ExYCQ(0x3F0000003F000000L);
        this.setShape(RectangleShapeKt.getRectangleShape());
        this.setClip(false);
    }

    @Override  // androidx.compose.ui.unit.Density
    public int roundToPx--R2X_6o(long v) {
        return DefaultImpls.roundToPx--R2X_6o(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public int roundToPx-0680j_4(float f) {
        return DefaultImpls.roundToPx-0680j_4(this, f);
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setAlpha(float f) {
        this.alpha = f;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setCameraDistance(float f) {
        this.cameraDistance = f;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setClip(boolean z) {
        this.clip = z;
    }

    public final void setGraphicsDensity$ui_release(Density density0) {
        Intrinsics.checkNotNullParameter(density0, "<set-?>");
        this.graphicsDensity = density0;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationX(float f) {
        this.rotationX = f;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationY(float f) {
        this.rotationY = f;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationZ(float f) {
        this.rotationZ = f;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setScaleX(float f) {
        this.scaleX = f;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setScaleY(float f) {
        this.scaleY = f;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setShadowElevation(float f) {
        this.shadowElevation = f;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setShape(Shape shape0) {
        Intrinsics.checkNotNullParameter(shape0, "<set-?>");
        this.shape = shape0;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTransformOrigin-__ExYCQ(long v) {
        this.transformOrigin = v;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTranslationX(float f) {
        this.translationX = f;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTranslationY(float f) {
        this.translationY = f;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-GaN1DYA(long v) {
        return DefaultImpls.toDp-GaN1DYA(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-u2uoSUM(float f) {
        return DefaultImpls.toDp-u2uoSUM(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-u2uoSUM(int v) {
        return DefaultImpls.toDp-u2uoSUM(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toPx--R2X_6o(long v) {
        return DefaultImpls.toPx--R2X_6o(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toPx-0680j_4(float f) {
        return DefaultImpls.toPx-0680j_4(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect0) {
        return DefaultImpls.toRect(this, dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-0xMU5do(float f) {
        return DefaultImpls.toSp-0xMU5do(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-kPz2Gy4(float f) {
        return DefaultImpls.toSp-kPz2Gy4(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-kPz2Gy4(int v) {
        return DefaultImpls.toSp-kPz2Gy4(this, v);
    }
}

