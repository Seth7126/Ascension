package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\f\u0010\u0002\u001A\u00020\u0003*\u00020\u0004H\u0002\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"DefaultDensity", "Landroidx/compose/ui/unit/Density;", "asDrawTransform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class CanvasDrawScopeKt {
    private static final Density DefaultDensity;

    static {
        CanvasDrawScopeKt.DefaultDensity = DensityKt.Density(1.0f, 1.0f);
    }

    private static final DrawTransform asDrawTransform(DrawContext drawContext0) {
        return new DrawTransform() {
            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void clipPath-mtrdD-E(Path path0, int v) {
                Intrinsics.checkNotNullParameter(path0, "path");
                drawContext0.getCanvas().clipPath-mtrdD-E(path0, v);
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void clipRect-N_I0leg(float f, float f1, float f2, float f3, int v) {
                drawContext0.getCanvas().clipRect-N_I0leg(f, f1, f2, f3, v);
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public long getCenter-F1C5BW0() {
                return SizeKt.getCenter-uvyYCjk(this.getSize-NH-jbRc());
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public long getSize-NH-jbRc() {
                return drawContext0.getSize-NH-jbRc();
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void inset(float f, float f1, float f2, float f3) {
                Canvas canvas0 = drawContext0.getCanvas();
                DrawContext drawContext0 = drawContext0;
                long v = SizeKt.Size(Size.getWidth-impl(this.getSize-NH-jbRc()) - (f2 + f), Size.getHeight-impl(this.getSize-NH-jbRc()) - (f3 + f1));
                if(Size.getWidth-impl(v) < 0.0f || Size.getHeight-impl(v) < 0.0f) {
                    throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
                }
                drawContext0.setSize-uvyYCjk(v);
                canvas0.translate(f, f1);
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void rotate-Uv8p0NA(float f, long v) {
                Canvas canvas0 = drawContext0.getCanvas();
                canvas0.translate(Offset.getX-impl(v), Offset.getY-impl(v));
                canvas0.rotate(f);
                canvas0.translate(-Offset.getX-impl(v), -Offset.getY-impl(v));
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void scale-0AR0LA0(float f, float f1, long v) {
                Canvas canvas0 = drawContext0.getCanvas();
                canvas0.translate(Offset.getX-impl(v), Offset.getY-impl(v));
                canvas0.scale(f, f1);
                canvas0.translate(-Offset.getX-impl(v), -Offset.getY-impl(v));
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void transform-58bKbWc(float[] arr_f) {
                Intrinsics.checkNotNullParameter(arr_f, "matrix");
                drawContext0.getCanvas().concat-58bKbWc(arr_f);
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void translate(float f, float f1) {
                drawContext0.getCanvas().translate(f, f1);
            }
        };
    }
}

