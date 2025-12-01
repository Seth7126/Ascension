package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00A2\u0006\u0002\u0010\u0002J\b\u0010R\u001A\u00020\u0014H\u0016J\b\u0010S\u001A\u00020TH\u0002J\b\u0010U\u001A\u00020TH\u0002J\f\u0010V\u001A\u00020T*\u00020WH\u0016R(\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u0004@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\n@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u000E\u0010\u0010\u001A\u00020\u0011X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0012\u001A\u00020\u0011X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0013\u001A\u00020\u0011X\u0082\u000E\u00A2\u0006\u0002\n\u0000R$\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0003\u001A\u00020\u0014@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000E\u0010\u001A\u001A\u00020\u001BX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u001C\u001A\u00020\u001DX\u0082\u0004\u00A2\u0006\u0002\n\u0000R0\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001F0\u001E2\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u001F0\u001E@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$R/\u0010&\u001A\u00020%2\u0006\u0010\u0003\u001A\u00020%@FX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0010\n\u0002\u0010+\u001A\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001B\u0010,\u001A\u00020-8BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b.\u0010/R\u000E\u00102\u001A\u00020\u001DX\u0082\u0004\u00A2\u0006\u0002\n\u0000R(\u00103\u001A\u0004\u0018\u00010\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u0004@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR$\u00106\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\n@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b7\u0010\r\"\u0004\b8\u0010\u000FR/\u0010:\u001A\u0002092\u0006\u0010\u0003\u001A\u000209@FX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0010\n\u0002\u0010+\u001A\u0004\b;\u0010(\"\u0004\b<\u0010*R/\u0010>\u001A\u00020=2\u0006\u0010\u0003\u001A\u00020=@FX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0010\n\u0002\u0010+\u001A\u0004\b?\u0010(\"\u0004\b@\u0010*R$\u0010A\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\n@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bB\u0010\r\"\u0004\bC\u0010\u000FR$\u0010D\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\n@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bE\u0010\r\"\u0004\bF\u0010\u000FR\u0010\u0010G\u001A\u0004\u0018\u00010HX\u0082\u000E\u00A2\u0006\u0002\n\u0000R$\u0010I\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\n@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bJ\u0010\r\"\u0004\bK\u0010\u000FR$\u0010L\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\n@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bM\u0010\r\"\u0004\bN\u0010\u000FR$\u0010O\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\n@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bP\u0010\r\"\u0004\bQ\u0010\u000F\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006X"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "()V", "value", "Landroidx/compose/ui/graphics/Brush;", "fill", "getFill", "()Landroidx/compose/ui/graphics/Brush;", "setFill", "(Landroidx/compose/ui/graphics/Brush;)V", "", "fillAlpha", "getFillAlpha", "()F", "setFillAlpha", "(F)V", "isPathDirty", "", "isStrokeDirty", "isTrimPathDirty", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "parser", "Landroidx/compose/ui/graphics/vector/PathParser;", "path", "Landroidx/compose/ui/graphics/Path;", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "pathData", "getPathData", "()Ljava/util/List;", "setPathData", "(Ljava/util/List;)V", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "getPathFillType-Rg-k1Os", "()I", "setPathFillType-oQ8Xj4U", "(I)V", "I", "pathMeasure", "Landroidx/compose/ui/graphics/PathMeasure;", "getPathMeasure", "()Landroidx/compose/ui/graphics/PathMeasure;", "pathMeasure$delegate", "Lkotlin/Lazy;", "renderPath", "stroke", "getStroke", "setStroke", "strokeAlpha", "getStrokeAlpha", "setStrokeAlpha", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "getStrokeLineCap-KaPHkGw", "setStrokeLineCap-BeK7IIE", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "getStrokeLineJoin-LxFBmk8", "setStrokeLineJoin-Ww9F2mQ", "strokeLineMiter", "getStrokeLineMiter", "setStrokeLineMiter", "strokeLineWidth", "getStrokeLineWidth", "setStrokeLineWidth", "strokeStyle", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "trimPathEnd", "getTrimPathEnd", "setTrimPathEnd", "trimPathOffset", "getTrimPathOffset", "setTrimPathOffset", "trimPathStart", "getTrimPathStart", "setTrimPathStart", "toString", "updatePath", "", "updateRenderPath", "draw", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PathComponent extends VNode {
    private Brush fill;
    private float fillAlpha;
    private boolean isPathDirty;
    private boolean isStrokeDirty;
    private boolean isTrimPathDirty;
    private String name;
    private final PathParser parser;
    private final Path path;
    private List pathData;
    private int pathFillType;
    private final Lazy pathMeasure$delegate;
    private final Path renderPath;
    private Brush stroke;
    private float strokeAlpha;
    private int strokeLineCap;
    private int strokeLineJoin;
    private float strokeLineMiter;
    private float strokeLineWidth;
    private Stroke strokeStyle;
    private float trimPathEnd;
    private float trimPathOffset;
    private float trimPathStart;

    static {
    }

    public PathComponent() {
        super(null);
        this.name = "";
        this.fillAlpha = 1.0f;
        this.pathData = VectorKt.getEmptyPath();
        this.pathFillType = 0;
        this.strokeAlpha = 1.0f;
        this.strokeLineCap = 0;
        this.strokeLineJoin = 0;
        this.strokeLineMiter = 4.0f;
        this.trimPathEnd = 1.0f;
        this.isPathDirty = true;
        this.isStrokeDirty = true;
        this.isTrimPathDirty = true;
        this.path = AndroidPath_androidKt.Path();
        this.renderPath = AndroidPath_androidKt.Path();
        this.pathMeasure$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, androidx.compose.ui.graphics.vector.PathComponent.pathMeasure.2.INSTANCE);
        this.parser = new PathParser();

        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/graphics/PathMeasure;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.graphics.vector.PathComponent.pathMeasure.2 extends Lambda implements Function0 {
            public static final androidx.compose.ui.graphics.vector.PathComponent.pathMeasure.2 INSTANCE;

            static {
                androidx.compose.ui.graphics.vector.PathComponent.pathMeasure.2.INSTANCE = new androidx.compose.ui.graphics.vector.PathComponent.pathMeasure.2();
            }

            androidx.compose.ui.graphics.vector.PathComponent.pathMeasure.2() {
                super(0);
            }

            public final PathMeasure invoke() {
                return AndroidPathMeasure_androidKt.PathMeasure();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }

    }

    @Override  // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope0) {
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
        if(this.isPathDirty) {
            this.updatePath();
        }
        else if(this.isTrimPathDirty) {
            this.updateRenderPath();
        }
        this.isPathDirty = false;
        this.isTrimPathDirty = false;
        Brush brush0 = this.fill;
        if(brush0 != null) {
            DefaultImpls.drawPath-GBMwjPU$default(drawScope0, this.renderPath, brush0, this.getFillAlpha(), null, null, 0, 56, null);
        }
        Brush brush1 = this.stroke;
        if(brush1 != null) {
            Stroke stroke0 = this.strokeStyle;
            if(this.isStrokeDirty || stroke0 == null) {
                stroke0 = new Stroke(this.getStrokeLineWidth(), this.getStrokeLineMiter(), this.getStrokeLineCap-KaPHkGw(), this.getStrokeLineJoin-LxFBmk8(), null, 16, null);
                this.strokeStyle = stroke0;
                this.isStrokeDirty = false;
            }
            DefaultImpls.drawPath-GBMwjPU$default(drawScope0, this.renderPath, brush1, this.getStrokeAlpha(), stroke0, null, 0, 0x30, null);
        }
    }

    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    public final String getName() {
        return this.name;
    }

    public final List getPathData() {
        return this.pathData;
    }

    public final int getPathFillType-Rg-k1Os() {
        return this.pathFillType;
    }

    private final PathMeasure getPathMeasure() {
        return (PathMeasure)this.pathMeasure$delegate.getValue();
    }

    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    public final int getStrokeLineCap-KaPHkGw() {
        return this.strokeLineCap;
    }

    public final int getStrokeLineJoin-LxFBmk8() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public final void setFill(Brush brush0) {
        this.fill = brush0;
        this.invalidate();
    }

    public final void setFillAlpha(float f) {
        this.fillAlpha = f;
        this.invalidate();
    }

    public final void setName(String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.name = s;
        this.invalidate();
    }

    public final void setPathData(List list0) {
        Intrinsics.checkNotNullParameter(list0, "value");
        this.pathData = list0;
        this.isPathDirty = true;
        this.invalidate();
    }

    public final void setPathFillType-oQ8Xj4U(int v) {
        this.pathFillType = v;
        this.renderPath.setFillType-oQ8Xj4U(v);
        this.invalidate();
    }

    public final void setStroke(Brush brush0) {
        this.stroke = brush0;
        this.invalidate();
    }

    public final void setStrokeAlpha(float f) {
        this.strokeAlpha = f;
        this.invalidate();
    }

    public final void setStrokeLineCap-BeK7IIE(int v) {
        this.strokeLineCap = v;
        this.isStrokeDirty = true;
        this.invalidate();
    }

    public final void setStrokeLineJoin-Ww9F2mQ(int v) {
        this.strokeLineJoin = v;
        this.isStrokeDirty = true;
        this.invalidate();
    }

    public final void setStrokeLineMiter(float f) {
        this.strokeLineMiter = f;
        this.isStrokeDirty = true;
        this.invalidate();
    }

    public final void setStrokeLineWidth(float f) {
        this.strokeLineWidth = f;
        this.invalidate();
    }

    public final void setTrimPathEnd(float f) {
        if(this.trimPathEnd != f) {
            this.trimPathEnd = f;
            this.isTrimPathDirty = true;
            this.invalidate();
        }
    }

    public final void setTrimPathOffset(float f) {
        if(this.trimPathOffset != f) {
            this.trimPathOffset = f;
            this.isTrimPathDirty = true;
            this.invalidate();
        }
    }

    public final void setTrimPathStart(float f) {
        if(this.trimPathStart != f) {
            this.trimPathStart = f;
            this.isTrimPathDirty = true;
            this.invalidate();
        }
    }

    @Override
    public String toString() {
        return this.path.toString();
    }

    private final void updatePath() {
        this.parser.clear();
        this.path.reset();
        this.parser.addPathNodes(this.pathData).toPath(this.path);
        this.updateRenderPath();
    }

    private final void updateRenderPath() {
        this.renderPath.reset();
        if(this.trimPathStart == 0.0f && this.trimPathEnd == 1.0f) {
            androidx.compose.ui.graphics.Path.DefaultImpls.addPath-Uv8p0NA$default(this.renderPath, this.path, 0L, 2, null);
            return;
        }
        this.getPathMeasure().setPath(this.path, false);
        float f = this.getPathMeasure().getLength();
        float f1 = (this.trimPathStart + this.trimPathOffset) % 1.0f * f;
        float f2 = (this.trimPathEnd + this.trimPathOffset) % 1.0f * f;
        if(f1 > f2) {
            this.getPathMeasure().getSegment(f1, f, this.renderPath, true);
            this.getPathMeasure().getSegment(0.0f, f2, this.renderPath, true);
            return;
        }
        this.getPathMeasure().getSegment(f1, f2, this.renderPath, true);
    }
}

