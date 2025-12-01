package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AH\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00062\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b\n\u0010\u000B\u001Ah\u0010\f\u001A\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\u000E2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u000E2\b\b\u0002\u0010\u0005\u001A\u00020\u00062\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b\u0012\u0010\u0013\u001A$\u0010\u0014\u001A\u00020\u0001*\u00020\u00022\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\bH\u0086\b\u00F8\u0001\u0001\u001A1\u0010\u0016\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0016\u001A\u00020\u000E2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0001\u001A=\u0010\u0016\u001A\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0017\u001A\u00020\u000E2\b\b\u0002\u0010\u0018\u001A\u00020\u000E2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0001\u001AI\u0010\u0016\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u000E2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0001\u001AH\u0010\u0019\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u000E2\b\b\u0002\u0010\u001B\u001A\u00020\u001C2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001AH\u0010\u001F\u001A\u00020\u0001*\u00020\u00022\u0006\u0010 \u001A\u00020\u000E2\b\b\u0002\u0010\u001B\u001A\u00020\u001C2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b!\u0010\u001E\u001AH\u0010\"\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\"\u001A\u00020\u000E2\b\b\u0002\u0010\u001B\u001A\u00020\u001C2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b#\u0010\u001E\u001AP\u0010\"\u001A\u00020\u0001*\u00020\u00022\u0006\u0010$\u001A\u00020\u000E2\u0006\u0010%\u001A\u00020\u000E2\b\b\u0002\u0010\u001B\u001A\u00020\u001C2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b&\u0010\'\u001A=\u0010(\u001A\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\u000E2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0001\u001AB\u0010)\u001A\u00020\u0001*\u00020\u00022\u0017\u0010*\u001A\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\t2\u0017\u0010,\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b\u00A2\u0006\u0002\b\tH\u0086\b\u00F8\u0001\u0001\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006-"}, d2 = {"clipPath", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "clipPath-KD09W0M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;ILkotlin/jvm/functions/Function1;)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-rOu3jXo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFILkotlin/jvm/functions/Function1;)V", "drawIntoCanvas", "Landroidx/compose/ui/graphics/Canvas;", "inset", "horizontal", "vertical", "rotate", "degrees", "pivot", "Landroidx/compose/ui/geometry/Offset;", "rotate-Rg1IO4c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJLkotlin/jvm/functions/Function1;)V", "rotateRad", "radians", "rotateRad-Rg1IO4c", "scale", "scale-Rg1IO4c", "scaleX", "scaleY", "scale-Fgt4K4Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLkotlin/jvm/functions/Function1;)V", "translate", "withTransform", "transformBlock", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "drawBlock", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class DrawScopeKt {
    public static final void clipPath-KD09W0M(DrawScope drawScope0, Path path0, int v, Function1 function10) {
        Intrinsics.checkNotNullParameter(drawScope0, "$this$clipPath");
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(function10, "block");
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v1 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        drawContext0.getTransform().clipPath-mtrdD-E(path0, v);
        function10.invoke(drawScope0);
        drawContext0.getCanvas().restore();
        drawContext0.setSize-uvyYCjk(v1);
    }

    public static void clipPath-KD09W0M$default(DrawScope drawScope0, Path path0, int v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 1;
        }
        Intrinsics.checkNotNullParameter(drawScope0, "$this$clipPath");
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(function10, "block");
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v2 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        drawContext0.getTransform().clipPath-mtrdD-E(path0, v);
        function10.invoke(drawScope0);
        drawContext0.getCanvas().restore();
        drawContext0.setSize-uvyYCjk(v2);
    }

    public static final void clipRect-rOu3jXo(DrawScope drawScope0, float f, float f1, float f2, float f3, int v, Function1 function10) {
        Intrinsics.checkNotNullParameter(drawScope0, "$this$clipRect");
        Intrinsics.checkNotNullParameter(function10, "block");
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v1 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        drawContext0.getTransform().clipRect-N_I0leg(f, f1, f2, f3, v);
        function10.invoke(drawScope0);
        drawContext0.getCanvas().restore();
        drawContext0.setSize-uvyYCjk(v1);
    }

    public static void clipRect-rOu3jXo$default(DrawScope drawScope0, float f, float f1, float f2, float f3, int v, Function1 function10, int v1, Object object0) {
        if((v1 & 4) != 0) {
            f2 = Size.getWidth-impl(drawScope0.getSize-NH-jbRc());
        }
        if((v1 & 8) != 0) {
            f3 = Size.getHeight-impl(drawScope0.getSize-NH-jbRc());
        }
        if((v1 & 16) != 0) {
            v = 1;
        }
        Intrinsics.checkNotNullParameter(drawScope0, "$this$clipRect");
        Intrinsics.checkNotNullParameter(function10, "block");
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v2 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        drawContext0.getTransform().clipRect-N_I0leg(((v1 & 1) == 0 ? f : 0.0f), ((v1 & 2) == 0 ? f1 : 0.0f), f2, f3, v);
        function10.invoke(drawScope0);
        drawContext0.getCanvas().restore();
        drawContext0.setSize-uvyYCjk(v2);
    }

    public static final void drawIntoCanvas(DrawScope drawScope0, Function1 function10) {
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "block");
        function10.invoke(drawScope0.getDrawContext().getCanvas());
    }

    public static final void inset(DrawScope drawScope0, float f, float f1, float f2, float f3, Function1 function10) {
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "block");
        drawScope0.getDrawContext().getTransform().inset(f, f1, f2, f3);
        function10.invoke(drawScope0);
        drawScope0.getDrawContext().getTransform().inset(-f, -f1, -f2, -f3);
    }

    public static final void inset(DrawScope drawScope0, float f, float f1, Function1 function10) {
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "block");
        drawScope0.getDrawContext().getTransform().inset(f, f1, f, f1);
        function10.invoke(drawScope0);
        drawScope0.getDrawContext().getTransform().inset(-f, -f1, -f, -f1);
    }

    public static final void inset(DrawScope drawScope0, float f, Function1 function10) {
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "block");
        drawScope0.getDrawContext().getTransform().inset(f, f, f, f);
        function10.invoke(drawScope0);
        float f1 = -f;
        drawScope0.getDrawContext().getTransform().inset(f1, f1, f1, f1);
    }

    public static void inset$default(DrawScope drawScope0, float f, float f1, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "block");
        drawScope0.getDrawContext().getTransform().inset(f, f1, f, f1);
        function10.invoke(drawScope0);
        drawScope0.getDrawContext().getTransform().inset(-f, -f1, -f, -f1);
    }

    public static final void rotate-Rg1IO4c(DrawScope drawScope0, float f, long v, Function1 function10) {
        Intrinsics.checkNotNullParameter(drawScope0, "$this$rotate");
        Intrinsics.checkNotNullParameter(function10, "block");
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v1 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        drawContext0.getTransform().rotate-Uv8p0NA(f, v);
        function10.invoke(drawScope0);
        drawContext0.getCanvas().restore();
        drawContext0.setSize-uvyYCjk(v1);
    }

    public static void rotate-Rg1IO4c$default(DrawScope drawScope0, float f, long v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = drawScope0.getCenter-F1C5BW0();
        }
        Intrinsics.checkNotNullParameter(drawScope0, "$this$rotate");
        Intrinsics.checkNotNullParameter(function10, "block");
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v2 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        drawContext0.getTransform().rotate-Uv8p0NA(f, v);
        function10.invoke(drawScope0);
        drawContext0.getCanvas().restore();
        drawContext0.setSize-uvyYCjk(v2);
    }

    public static final void rotateRad-Rg1IO4c(DrawScope drawScope0, float f, long v, Function1 function10) {
        Intrinsics.checkNotNullParameter(drawScope0, "$this$rotateRad");
        Intrinsics.checkNotNullParameter(function10, "block");
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v1 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        drawContext0.getTransform().rotate-Uv8p0NA(f * 57.29578f, v);
        function10.invoke(drawScope0);
        drawContext0.getCanvas().restore();
        drawContext0.setSize-uvyYCjk(v1);
    }

    public static void rotateRad-Rg1IO4c$default(DrawScope drawScope0, float f, long v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = drawScope0.getCenter-F1C5BW0();
        }
        Intrinsics.checkNotNullParameter(drawScope0, "$this$rotateRad");
        Intrinsics.checkNotNullParameter(function10, "block");
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v2 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        drawContext0.getTransform().rotate-Uv8p0NA(f * 57.29578f, v);
        function10.invoke(drawScope0);
        drawContext0.getCanvas().restore();
        drawContext0.setSize-uvyYCjk(v2);
    }

    public static final void scale-Fgt4K4Q(DrawScope drawScope0, float f, float f1, long v, Function1 function10) {
        Intrinsics.checkNotNullParameter(drawScope0, "$this$scale");
        Intrinsics.checkNotNullParameter(function10, "block");
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v1 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        drawContext0.getTransform().scale-0AR0LA0(f, f1, v);
        function10.invoke(drawScope0);
        drawContext0.getCanvas().restore();
        drawContext0.setSize-uvyYCjk(v1);
    }

    public static void scale-Fgt4K4Q$default(DrawScope drawScope0, float f, float f1, long v, Function1 function10, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = drawScope0.getCenter-F1C5BW0();
        }
        Intrinsics.checkNotNullParameter(drawScope0, "$this$scale");
        Intrinsics.checkNotNullParameter(function10, "block");
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v2 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        drawContext0.getTransform().scale-0AR0LA0(f, f1, v);
        function10.invoke(drawScope0);
        drawContext0.getCanvas().restore();
        drawContext0.setSize-uvyYCjk(v2);
    }

    public static final void scale-Rg1IO4c(DrawScope drawScope0, float f, long v, Function1 function10) {
        Intrinsics.checkNotNullParameter(drawScope0, "$this$scale");
        Intrinsics.checkNotNullParameter(function10, "block");
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v1 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        drawContext0.getTransform().scale-0AR0LA0(f, f, v);
        function10.invoke(drawScope0);
        drawContext0.getCanvas().restore();
        drawContext0.setSize-uvyYCjk(v1);
    }

    public static void scale-Rg1IO4c$default(DrawScope drawScope0, float f, long v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = drawScope0.getCenter-F1C5BW0();
        }
        Intrinsics.checkNotNullParameter(drawScope0, "$this$scale");
        Intrinsics.checkNotNullParameter(function10, "block");
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v2 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        drawContext0.getTransform().scale-0AR0LA0(f, f, v);
        function10.invoke(drawScope0);
        drawContext0.getCanvas().restore();
        drawContext0.setSize-uvyYCjk(v2);
    }

    public static final void translate(DrawScope drawScope0, float f, float f1, Function1 function10) {
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "block");
        drawScope0.getDrawContext().getTransform().translate(f, f1);
        function10.invoke(drawScope0);
        drawScope0.getDrawContext().getTransform().translate(-f, -f1);
    }

    public static void translate$default(DrawScope drawScope0, float f, float f1, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "block");
        drawScope0.getDrawContext().getTransform().translate(f, f1);
        function10.invoke(drawScope0);
        drawScope0.getDrawContext().getTransform().translate(-f, -f1);
    }

    public static final void withTransform(DrawScope drawScope0, Function1 function10, Function1 function11) {
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transformBlock");
        Intrinsics.checkNotNullParameter(function11, "drawBlock");
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        function10.invoke(drawContext0.getTransform());
        function11.invoke(drawScope0);
        drawContext0.getCanvas().restore();
        drawContext0.setSize-uvyYCjk(v);
    }
}

