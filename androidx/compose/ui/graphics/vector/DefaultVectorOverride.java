package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/DefaultVectorOverride;", "Landroidx/compose/ui/graphics/vector/VectorOverride;", "()V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class DefaultVectorOverride implements VectorOverride {
    public static final DefaultVectorOverride INSTANCE;

    static {
        DefaultVectorOverride.INSTANCE = new DefaultVectorOverride();
    }

    @Override  // androidx.compose.ui.graphics.vector.VectorOverride
    public Brush obtainFill(Brush brush0) {
        return DefaultImpls.obtainFill(this, brush0);
    }

    @Override  // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainFillAlpha(float f) {
        return DefaultImpls.obtainFillAlpha(this, f);
    }

    @Override  // androidx.compose.ui.graphics.vector.VectorOverride
    public List obtainPathData(List list0) {
        return DefaultImpls.obtainPathData(this, list0);
    }

    @Override  // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainPivotX(float f) {
        return DefaultImpls.obtainPivotX(this, f);
    }

    @Override  // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainPivotY(float f) {
        return DefaultImpls.obtainPivotY(this, f);
    }

    @Override  // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainRotation(float f) {
        return DefaultImpls.obtainRotation(this, f);
    }

    @Override  // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainScaleX(float f) {
        return DefaultImpls.obtainScaleX(this, f);
    }

    @Override  // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainScaleY(float f) {
        return DefaultImpls.obtainScaleY(this, f);
    }

    @Override  // androidx.compose.ui.graphics.vector.VectorOverride
    public Brush obtainStroke(Brush brush0) {
        return DefaultImpls.obtainStroke(this, brush0);
    }

    @Override  // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainStrokeAlpha(float f) {
        return DefaultImpls.obtainStrokeAlpha(this, f);
    }

    @Override  // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainStrokeWidth(float f) {
        return DefaultImpls.obtainStrokeWidth(this, f);
    }

    @Override  // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainTranslateX(float f) {
        return DefaultImpls.obtainTranslateX(this, f);
    }

    @Override  // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainTranslateY(float f) {
        return DefaultImpls.obtainTranslateY(this, f);
    }

    @Override  // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainTrimPathEnd(float f) {
        return DefaultImpls.obtainTrimPathEnd(this, f);
    }

    @Override  // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainTrimPathOffset(float f) {
        return DefaultImpls.obtainTrimPathOffset(this, f);
    }

    @Override  // androidx.compose.ui.graphics.vector.VectorOverride
    public float obtainTrimPathStart(float f) {
        return DefaultImpls.obtainTrimPathStart(this, f);
    }
}

