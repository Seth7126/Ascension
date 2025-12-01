package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004\u001A\u001A\u0010\u0005\u001A\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\b\u001AQ\u0010\u0005\u001A\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001A\u00020\u0013\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0015\u001AQ\u0010\u0005\u001A\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0016\u001A\u00020\u00172\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001A\u00020\u0013\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001A\u009F\u0001\u0010\u001A\u001A\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00042,\u0010\u001B\u001A(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00010\u001C\u00A2\u0006\u0002\b!2,\u0010\"\u001A(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110#\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\u001C\u00A2\u0006\u0002\b!2,\u0010%\u001A(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010\u001C\u00A2\u0006\u0002\b!H\u0082\b\u001A\f\u0010\'\u001A\u00020(*\u00020#H\u0002\u001A\u0014\u0010)\u001A\u00020**\u00020\u001DH\u0002\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010+\u001A\u0014\u0010)\u001A\u00020**\u00020#H\u0002\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010,\u001A\u0014\u0010-\u001A\u00020.*\u00020\u001DH\u0002\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010+\u001A\u0014\u0010-\u001A\u00020.*\u00020#H\u0002\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010,\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006/"}, d2 = {"addOutline", "", "Landroidx/compose/ui/graphics/Path;", "outline", "Landroidx/compose/ui/graphics/Outline;", "drawOutline", "Landroidx/compose/ui/graphics/Canvas;", "paint", "Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawOutline-hn5TExg", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawOutline-wDX37Ww", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOutlineHelper", "drawRectBlock", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Rect;", "Lkotlin/ParameterName;", "name", "rect", "Lkotlin/ExtensionFunctionType;", "drawRoundedRectBlock", "Landroidx/compose/ui/geometry/RoundRect;", "rrect", "drawPathBlock", "path", "hasSameCornerRadius", "", "size", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Rect;)J", "(Landroidx/compose/ui/geometry/RoundRect;)J", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class OutlineKt {
    public static final void addOutline(Path path0, Outline outline0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(outline0, "outline");
        if(outline0 instanceof Rectangle) {
            path0.addRect(((Rectangle)outline0).getRect());
            return;
        }
        if(outline0 instanceof Rounded) {
            path0.addRoundRect(((Rounded)outline0).getRoundRect());
            return;
        }
        if(!(outline0 instanceof Generic)) {
            throw new NoWhenBranchMatchedException();
        }
        DefaultImpls.addPath-Uv8p0NA$default(path0, ((Generic)outline0).getPath(), 0L, 2, null);
    }

    public static final void drawOutline(Canvas canvas0, Outline outline0, Paint paint0) {
        Intrinsics.checkNotNullParameter(canvas0, "<this>");
        Intrinsics.checkNotNullParameter(outline0, "outline");
        Intrinsics.checkNotNullParameter(paint0, "paint");
        if(outline0 instanceof Rectangle) {
            canvas0.drawRect(((Rectangle)outline0).getRect(), paint0);
            return;
        }
        if(outline0 instanceof Rounded) {
            Path path0 = ((Rounded)outline0).getRoundRectPath$ui_graphics_release();
            if(path0 != null) {
                canvas0.drawPath(path0, paint0);
                return;
            }
            canvas0.drawRoundRect(((Rounded)outline0).getRoundRect().getLeft(), ((Rounded)outline0).getRoundRect().getTop(), ((Rounded)outline0).getRoundRect().getRight(), ((Rounded)outline0).getRoundRect().getBottom(), CornerRadius.getX-impl(((Rounded)outline0).getRoundRect().getBottomLeftCornerRadius-kKHJgLs()), CornerRadius.getY-impl(((Rounded)outline0).getRoundRect().getBottomLeftCornerRadius-kKHJgLs()), paint0);
            return;
        }
        if(!(outline0 instanceof Generic)) {
            throw new NoWhenBranchMatchedException();
        }
        canvas0.drawPath(((Generic)outline0).getPath(), paint0);
    }

    public static final void drawOutline-hn5TExg(DrawScope drawScope0, Outline outline0, Brush brush0, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v) {
        Path path0;
        Intrinsics.checkNotNullParameter(drawScope0, "$this$drawOutline");
        Intrinsics.checkNotNullParameter(outline0, "outline");
        Intrinsics.checkNotNullParameter(brush0, "brush");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        if(outline0 instanceof Rectangle) {
            Rect rect0 = ((Rectangle)outline0).getRect();
            drawScope0.drawRect-AsUm42w(brush0, OutlineKt.topLeft(rect0), OutlineKt.size(rect0), f, drawStyle0, colorFilter0, v);
            return;
        }
        if(outline0 instanceof Rounded) {
            path0 = ((Rounded)outline0).getRoundRectPath$ui_graphics_release();
            if(path0 != null) {
                drawScope0.drawPath-GBMwjPU(path0, brush0, f, drawStyle0, colorFilter0, v);
                return;
            }
            RoundRect roundRect0 = ((Rounded)outline0).getRoundRect();
            drawScope0.drawRoundRect-ZuiqVtQ(brush0, OutlineKt.topLeft(roundRect0), OutlineKt.size(roundRect0), CornerRadiusKt.CornerRadius$default(CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()), 0.0f, 2, null), f, drawStyle0, colorFilter0, v);
            return;
        }
        if(!(outline0 instanceof Generic)) {
            throw new NoWhenBranchMatchedException();
        }
        path0 = ((Generic)outline0).getPath();
        drawScope0.drawPath-GBMwjPU(path0, brush0, f, drawStyle0, colorFilter0, v);
    }

    public static void drawOutline-hn5TExg$default(DrawScope drawScope0, Outline outline0, Brush brush0, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v, int v1, Object object0) {
        if((v1 & 8) != 0) {
            drawStyle0 = Fill.INSTANCE;
        }
        if((v1 & 16) != 0) {
            colorFilter0 = null;
        }
        if((v1 & 0x20) != 0) {
            v = 3;
        }
        OutlineKt.drawOutline-hn5TExg(drawScope0, outline0, brush0, ((v1 & 4) == 0 ? f : 1.0f), drawStyle0, colorFilter0, v);
    }

    public static final void drawOutline-wDX37Ww(DrawScope drawScope0, Outline outline0, long v, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1) {
        Path path0;
        Intrinsics.checkNotNullParameter(drawScope0, "$this$drawOutline");
        Intrinsics.checkNotNullParameter(outline0, "outline");
        Intrinsics.checkNotNullParameter(drawStyle0, "style");
        if(outline0 instanceof Rectangle) {
            Rect rect0 = ((Rectangle)outline0).getRect();
            drawScope0.drawRect-n-J9OG0(v, OutlineKt.topLeft(rect0), OutlineKt.size(rect0), f, drawStyle0, colorFilter0, v1);
            return;
        }
        if(outline0 instanceof Rounded) {
            path0 = ((Rounded)outline0).getRoundRectPath$ui_graphics_release();
            if(path0 != null) {
                drawScope0.drawPath-LG529CI(path0, v, f, drawStyle0, colorFilter0, v1);
                return;
            }
            RoundRect roundRect0 = ((Rounded)outline0).getRoundRect();
            drawScope0.drawRoundRect-u-Aw5IA(v, OutlineKt.topLeft(roundRect0), OutlineKt.size(roundRect0), CornerRadiusKt.CornerRadius$default(CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()), 0.0f, 2, null), drawStyle0, f, colorFilter0, v1);
            return;
        }
        if(!(outline0 instanceof Generic)) {
            throw new NoWhenBranchMatchedException();
        }
        path0 = ((Generic)outline0).getPath();
        drawScope0.drawPath-LG529CI(path0, v, f, drawStyle0, colorFilter0, v1);
    }

    public static void drawOutline-wDX37Ww$default(DrawScope drawScope0, Outline outline0, long v, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1, int v2, Object object0) {
        DrawStyle drawStyle1 = (v2 & 8) == 0 ? drawStyle0 : Fill.INSTANCE;
        OutlineKt.drawOutline-wDX37Ww(drawScope0, outline0, v, ((v2 & 4) == 0 ? f : 1.0f), drawStyle1, ((v2 & 16) == 0 ? colorFilter0 : null), ((v2 & 0x20) == 0 ? v1 : 3));
    }

    private static final void drawOutlineHelper(DrawScope drawScope0, Outline outline0, Function2 function20, Function2 function21, Function2 function22) {
        if(outline0 instanceof Rectangle) {
            function20.invoke(drawScope0, ((Rectangle)outline0).getRect());
            return;
        }
        if(outline0 instanceof Rounded) {
            Path path0 = ((Rounded)outline0).getRoundRectPath$ui_graphics_release();
            if(path0 != null) {
                function22.invoke(drawScope0, path0);
                return;
            }
            function21.invoke(drawScope0, ((Rounded)outline0).getRoundRect());
            return;
        }
        if(!(outline0 instanceof Generic)) {
            throw new NoWhenBranchMatchedException();
        }
        function22.invoke(drawScope0, ((Generic)outline0).getPath());
    }

    // 去混淆评级： 中等(90)
    private static final boolean hasSameCornerRadius(RoundRect roundRect0) {
        return CornerRadius.getY-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()) != CornerRadius.getY-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()) || CornerRadius.getY-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()) != CornerRadius.getY-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) || CornerRadius.getY-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) != CornerRadius.getY-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) ? false : CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()) == CornerRadius.getX-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()) && CornerRadius.getX-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()) == CornerRadius.getX-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) && CornerRadius.getX-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) == CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs());
    }

    private static final long size(Rect rect0) {
        return SizeKt.Size(rect0.getWidth(), rect0.getHeight());
    }

    private static final long size(RoundRect roundRect0) {
        return SizeKt.Size(roundRect0.getWidth(), roundRect0.getHeight());
    }

    private static final long topLeft(Rect rect0) {
        return OffsetKt.Offset(rect0.getLeft(), rect0.getTop());
    }

    private static final long topLeft(RoundRect roundRect0) {
        return OffsetKt.Offset(roundRect0.getLeft(), roundRect0.getTop());
    }
}

