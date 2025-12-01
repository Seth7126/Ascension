package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.Outline.Rectangle;
import androidx.compose.ui.graphics.Outline.Rounded;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001A8\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\bH\u0000\u001A4\u0010\n\u001A\u00020\u00012\u0006\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\b\u0010\u0007\u001A\u0004\u0018\u00010\b2\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0002\u001A \u0010\f\u001A\u00020\u00012\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0005H\u0002\u001A4\u0010\u000F\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00102\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\b\u0010\u0011\u001A\u0004\u0018\u00010\b2\b\u0010\u0012\u001A\u0004\u0018\u00010\bH\u0002\u001A=\u0010\u0013\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00052\u0006\u0010\u0017\u001A\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001A\f\u0010\u001A\u001A\u00020\u0001*\u00020\u001BH\u0002\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u001C"}, d2 = {"isInOutline", "", "outline", "Landroidx/compose/ui/graphics/Outline;", "x", "", "y", "tmpTouchPointPath", "Landroidx/compose/ui/graphics/Path;", "tmpOpPath", "isInPath", "path", "isInRectangle", "rect", "Landroidx/compose/ui/geometry/Rect;", "isInRoundedRect", "Landroidx/compose/ui/graphics/Outline$Rounded;", "touchPointPath", "opPath", "isWithinEllipse", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "centerX", "centerY", "isWithinEllipse-VE1yxkc", "(FFJFF)Z", "cornersFit", "Landroidx/compose/ui/geometry/RoundRect;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ShapeContainingUtilKt {
    private static final boolean cornersFit(RoundRect roundRect0) {
        return CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) + CornerRadius.getX-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) <= roundRect0.getWidth() && CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()) + CornerRadius.getX-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()) <= roundRect0.getWidth() && CornerRadius.getY-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) + CornerRadius.getY-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()) <= roundRect0.getHeight() && CornerRadius.getY-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) + CornerRadius.getY-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()) <= roundRect0.getHeight();
    }

    public static final boolean isInOutline(Outline outline0, float f, float f1, Path path0, Path path1) {
        Intrinsics.checkNotNullParameter(outline0, "outline");
        if(outline0 instanceof Rectangle) {
            return ShapeContainingUtilKt.isInRectangle(((Rectangle)outline0).getRect(), f, f1);
        }
        if(outline0 instanceof Rounded) {
            return ShapeContainingUtilKt.isInRoundedRect(((Rounded)outline0), f, f1, path0, path1);
        }
        if(!(outline0 instanceof Generic)) {
            throw new NoWhenBranchMatchedException();
        }
        return ShapeContainingUtilKt.isInPath(((Generic)outline0).getPath(), f, f1, path0, path1);
    }

    public static boolean isInOutline$default(Outline outline0, float f, float f1, Path path0, Path path1, int v, Object object0) {
        if((v & 8) != 0) {
            path0 = null;
        }
        if((v & 16) != 0) {
            path1 = null;
        }
        return ShapeContainingUtilKt.isInOutline(outline0, f, f1, path0, path1);
    }

    private static final boolean isInPath(Path path0, float f, float f1, Path path1, Path path2) {
        Rect rect0 = new Rect(f - 0.005f, f1 - 0.005f, f + 0.005f, f1 + 0.005f);
        if(path1 == null) {
            path1 = AndroidPath_androidKt.Path();
        }
        path1.addRect(rect0);
        if(path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        path2.op-N5in7k0(path0, path1, 1);
        path2.reset();
        path1.reset();
        return !path2.isEmpty();
    }

    private static final boolean isInRectangle(Rect rect0, float f, float f1) {
        return rect0.getLeft() <= f && f < rect0.getRight() && rect0.getTop() <= f1 && f1 < rect0.getBottom();
    }

    private static final boolean isInRoundedRect(Rounded outline$Rounded0, float f, float f1, Path path0, Path path1) {
        RoundRect roundRect0 = outline$Rounded0.getRoundRect();
        if(f >= roundRect0.getLeft() && f < roundRect0.getRight() && f1 >= roundRect0.getTop() && f1 < roundRect0.getBottom()) {
            if(!ShapeContainingUtilKt.cornersFit(roundRect0)) {
                Path path2 = path1 == null ? AndroidPath_androidKt.Path() : path1;
                path2.addRoundRect(roundRect0);
                return ShapeContainingUtilKt.isInPath(path2, f, f1, path0, path1);
            }
            float f2 = CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) + roundRect0.getLeft();
            float f3 = CornerRadius.getY-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) + roundRect0.getTop();
            float f4 = roundRect0.getRight() - CornerRadius.getX-impl(roundRect0.getTopRightCornerRadius-kKHJgLs());
            float f5 = CornerRadius.getY-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) + roundRect0.getTop();
            float f6 = roundRect0.getRight() - CornerRadius.getX-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs());
            float f7 = roundRect0.getBottom() - CornerRadius.getY-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs());
            float f8 = roundRect0.getBottom() - CornerRadius.getY-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs());
            float f9 = CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()) + roundRect0.getLeft();
            if(f < f2 && f1 < f3) {
                return ShapeContainingUtilKt.isWithinEllipse-VE1yxkc(f, f1, roundRect0.getTopLeftCornerRadius-kKHJgLs(), f2, f3);
            }
            if(f < f9 && f1 > f8) {
                return ShapeContainingUtilKt.isWithinEllipse-VE1yxkc(f, f1, roundRect0.getBottomLeftCornerRadius-kKHJgLs(), f9, f8);
            }
            if(f > f4 && f1 < f5) {
                return ShapeContainingUtilKt.isWithinEllipse-VE1yxkc(f, f1, roundRect0.getTopRightCornerRadius-kKHJgLs(), f4, f5);
            }
            return f <= f6 || f1 <= f7 ? true : ShapeContainingUtilKt.isWithinEllipse-VE1yxkc(f, f1, roundRect0.getBottomRightCornerRadius-kKHJgLs(), f6, f7);
        }
        return false;
    }

    private static final boolean isWithinEllipse-VE1yxkc(float f, float f1, long v, float f2, float f3) {
        float f4 = CornerRadius.getX-impl(v);
        float f5 = CornerRadius.getY-impl(v);
        return (f - f2) * (f - f2) / (f4 * f4) + (f1 - f3) * (f1 - f3) / (f5 * f5) <= 1.0f;
    }
}

