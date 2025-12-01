package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000E\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0003\u001A\u00020\u0004H\u0014J\u0012\u0010\u0017\u001A\u00020\u00152\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\u0018\u001A\u00020\u00152\u0006\u0010\u0012\u001A\u00020\u0013H\u0014J\u0010\u0010\u0019\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u0004H\u0002J\u0012\u0010\u001A\u001A\u00020\n2\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u001B\u001A\u00020\n2\u0006\u0010\u001C\u001A\u00020\u0013H\u0002J\b\u0010\u001D\u001A\u00020\u0011H\u0002J5\u0010\u001E\u001A\u00020\n*\u00020\t2\u0006\u0010\u001F\u001A\u00020\r2\b\b\u0002\u0010\u0003\u001A\u00020\u00042\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\f\u0010\"\u001A\u00020\n*\u00020\tH$R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u000E¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u001F\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000BX\u0082\u0004¢\u0006\u0002\n\u0000R\u001B\u0010\f\u001A\u00020\rX¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0011X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0012\u001A\u00020\u0013X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0014\u001A\u00020\u0015X\u0082\u000E¢\u0006\u0002\n\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/painter/Painter;", "", "()V", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "drawLambda", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "layerPaint", "Landroidx/compose/ui/graphics/Paint;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "useLayer", "", "applyAlpha", "applyColorFilter", "applyLayoutDirection", "configureAlpha", "configureColorFilter", "configureLayoutDirection", "rtl", "obtainPaint", "draw", "size", "draw-x_KDEd0", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/ui/graphics/ColorFilter;)V", "onDraw", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class Painter {
    private float alpha;
    private ColorFilter colorFilter;
    private final Function1 drawLambda;
    private Paint layerPaint;
    private LayoutDirection layoutDirection;
    private boolean useLayer;

    public Painter() {
        this.alpha = 1.0f;
        this.layoutDirection = LayoutDirection.Ltr;
        this.drawLambda = new Function1() {
            {
                Painter.this = painter0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((DrawScope)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(DrawScope drawScope0) {
                Intrinsics.checkNotNullParameter(drawScope0, "$this$null");
                Painter.this.onDraw(drawScope0);
            }
        };
    }

    protected boolean applyAlpha(float f) {
        return false;
    }

    protected boolean applyColorFilter(ColorFilter colorFilter0) {
        return false;
    }

    protected boolean applyLayoutDirection(LayoutDirection layoutDirection0) {
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        return false;
    }

    private final void configureAlpha(float f) {
        if(this.alpha != f) {
            if(!this.applyAlpha(f)) {
                if(f == 1.0f) {
                    Paint paint0 = this.layerPaint;
                    if(paint0 != null) {
                        paint0.setAlpha(1.0f);
                    }
                    this.useLayer = false;
                }
                else {
                    this.obtainPaint().setAlpha(f);
                    this.useLayer = true;
                }
            }
            this.alpha = f;
        }
    }

    private final void configureColorFilter(ColorFilter colorFilter0) {
        if(!Intrinsics.areEqual(this.colorFilter, colorFilter0)) {
            if(!this.applyColorFilter(colorFilter0)) {
                if(colorFilter0 == null) {
                    Paint paint0 = this.layerPaint;
                    if(paint0 != null) {
                        paint0.setColorFilter(null);
                    }
                    this.useLayer = false;
                }
                else {
                    this.obtainPaint().setColorFilter(colorFilter0);
                    this.useLayer = true;
                }
            }
            this.colorFilter = colorFilter0;
        }
    }

    private final void configureLayoutDirection(LayoutDirection layoutDirection0) {
        if(this.layoutDirection != layoutDirection0) {
            this.applyLayoutDirection(layoutDirection0);
            this.layoutDirection = layoutDirection0;
        }
    }

    public final void draw-x_KDEd0(DrawScope drawScope0, long v, float f, ColorFilter colorFilter0) {
        Intrinsics.checkNotNullParameter(drawScope0, "$receiver");
        this.configureAlpha(f);
        this.configureColorFilter(colorFilter0);
        this.configureLayoutDirection(drawScope0.getLayoutDirection());
        float f1 = Size.getWidth-impl(drawScope0.getSize-NH-jbRc()) - Size.getWidth-impl(v);
        float f2 = Size.getHeight-impl(drawScope0.getSize-NH-jbRc()) - Size.getHeight-impl(v);
        drawScope0.getDrawContext().getTransform().inset(0.0f, 0.0f, f1, f2);
        if(f > 0.0f && Size.getWidth-impl(v) > 0.0f && Size.getHeight-impl(v) > 0.0f) {
            if(this.useLayer) {
                Rect rect0 = RectKt.Rect-tz77jQw(0L, SizeKt.Size(Size.getWidth-impl(v), Size.getHeight-impl(v)));
                Canvas canvas0 = drawScope0.getDrawContext().getCanvas();
                Paint paint0 = this.obtainPaint();
                try {
                    canvas0.saveLayer(rect0, paint0);
                    this.onDraw(drawScope0);
                }
                finally {
                    canvas0.restore();
                }
            }
            else {
                this.onDraw(drawScope0);
            }
        }
        drawScope0.getDrawContext().getTransform().inset(-0.0f, -0.0f, -f1, -f2);
    }

    public static void draw-x_KDEd0$default(Painter painter0, DrawScope drawScope0, long v, float f, ColorFilter colorFilter0, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if((v1 & 4) != 0) {
            colorFilter0 = null;
        }
        painter0.draw-x_KDEd0(drawScope0, v, ((v1 & 2) == 0 ? f : 1.0f), colorFilter0);
    }

    public abstract long getIntrinsicSize-NH-jbRc();

    private final Paint obtainPaint() {
        Paint paint0 = this.layerPaint;
        if(paint0 == null) {
            paint0 = AndroidPaint_androidKt.Paint();
            this.layerPaint = paint0;
        }
        return paint0;
    }

    protected abstract void onDraw(DrawScope arg1);
}

