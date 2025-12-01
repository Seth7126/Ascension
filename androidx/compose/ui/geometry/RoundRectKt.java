package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\u001A#\u0010\u0019\u001A\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u00012\u0006\u0010\u001B\u001A\u00020\u001C\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001AC\u0010\u0019\u001A\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u00012\b\b\u0002\u0010\u001F\u001A\u00020\u001C2\b\b\u0002\u0010 \u001A\u00020\u001C2\b\b\u0002\u0010!\u001A\u00020\u001C2\b\b\u0002\u0010\"\u001A\u00020\u001C\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b#\u0010$\u001A\u001E\u0010\u0019\u001A\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u00012\u0006\u0010%\u001A\u00020\u00122\u0006\u0010&\u001A\u00020\u0012\u001A;\u0010\u0019\u001A\u00020\u00022\u0006\u0010\'\u001A\u00020\u00122\u0006\u0010(\u001A\u00020\u00122\u0006\u0010)\u001A\u00020\u00122\u0006\u0010*\u001A\u00020\u00122\u0006\u0010\u001B\u001A\u00020\u001C\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b+\u0010,\u001A6\u0010\u0019\u001A\u00020\u00022\u0006\u0010\'\u001A\u00020\u00122\u0006\u0010(\u001A\u00020\u00122\u0006\u0010)\u001A\u00020\u00122\u0006\u0010*\u001A\u00020\u00122\u0006\u0010%\u001A\u00020\u00122\u0006\u0010&\u001A\u00020\u0012\u001A\u001E\u0010-\u001A\u00020\u00022\u0006\u0010.\u001A\u00020\u00022\u0006\u0010/\u001A\u00020\u00022\u0006\u00100\u001A\u00020\u0012\u001A\u001F\u00101\u001A\u00020\u0002*\u00020\u00022\u0006\u00102\u001A\u00020\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b3\u00104\"\u0015\u0010\u0000\u001A\u00020\u0001*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001A\u00020\u0006*\u00020\u00028F\u00F8\u0001\u0000\u00A2\u0006\u0006\u001A\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001A\u00020\n*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b\t\u0010\u000B\"\u0015\u0010\f\u001A\u00020\n*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b\f\u0010\u000B\"\u0015\u0010\r\u001A\u00020\n*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b\r\u0010\u000B\"\u0015\u0010\u000E\u001A\u00020\n*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b\u000E\u0010\u000B\"\u0015\u0010\u000F\u001A\u00020\n*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b\u000F\u0010\u000B\"\u0015\u0010\u0010\u001A\u00020\n*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b\u0010\u0010\u000B\"\u0015\u0010\u0011\u001A\u00020\u0012*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0015\u001A\u00020\u0012*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b\u0016\u0010\u0014\"\u0015\u0010\u0017\u001A\u00020\u0001*\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b\u0018\u0010\u0004\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00065"}, d2 = {"boundingRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/RoundRect;", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", "isCircle", "", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isEllipse", "isEmpty", "isFinite", "isRect", "isSimple", "maxDimension", "", "getMaxDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "minDimension", "getMinDimension", "safeInnerRect", "getSafeInnerRect", "RoundRect", "rect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "topLeft", "topRight", "bottomRight", "bottomLeft", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "radiusX", "radiusY", "left", "top", "right", "bottom", "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "lerp", "start", "stop", "fraction", "translate", "offset", "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class RoundRectKt {
    public static final RoundRect RoundRect(float f, float f1, float f2, float f3, float f4, float f5) {
        long v = CornerRadiusKt.CornerRadius(f4, f5);
        return new RoundRect(f, f1, f2, f3, v, v, v, v, null);
    }

    public static final RoundRect RoundRect(Rect rect0, float f, float f1) {
        Intrinsics.checkNotNullParameter(rect0, "rect");
        return RoundRectKt.RoundRect(rect0.getLeft(), rect0.getTop(), rect0.getRight(), rect0.getBottom(), f, f1);
    }

    public static final RoundRect RoundRect-ZAM2FJo(Rect rect0, long v, long v1, long v2, long v3) {
        Intrinsics.checkNotNullParameter(rect0, "rect");
        return new RoundRect(rect0.getLeft(), rect0.getTop(), rect0.getRight(), rect0.getBottom(), v, v1, v2, v3, null);
    }

    // 去混淆评级： 低(20)
    public static RoundRect RoundRect-ZAM2FJo$default(Rect rect0, long v, long v1, long v2, long v3, int v4, Object object0) {
        long v5 = (v4 & 2) == 0 ? v : 0L;
        long v6 = (v4 & 4) == 0 ? v1 : 0L;
        long v7 = (v4 & 8) == 0 ? v2 : 0L;
        return (v4 & 16) == 0 ? RoundRectKt.RoundRect-ZAM2FJo(rect0, v5, v6, v7, v3) : RoundRectKt.RoundRect-ZAM2FJo(rect0, v5, v6, v7, 0L);
    }

    public static final RoundRect RoundRect-gG7oq9Y(float f, float f1, float f2, float f3, long v) {
        return RoundRectKt.RoundRect(f, f1, f2, f3, CornerRadius.getX-impl(v), CornerRadius.getY-impl(v));
    }

    public static final RoundRect RoundRect-sniSvfs(Rect rect0, long v) {
        Intrinsics.checkNotNullParameter(rect0, "rect");
        return RoundRectKt.RoundRect(rect0, CornerRadius.getX-impl(v), CornerRadius.getY-impl(v));
    }

    public static final Rect getBoundingRect(RoundRect roundRect0) {
        Intrinsics.checkNotNullParameter(roundRect0, "<this>");
        return new Rect(roundRect0.getLeft(), roundRect0.getTop(), roundRect0.getRight(), roundRect0.getBottom());
    }

    public static final long getCenter(RoundRect roundRect0) {
        Intrinsics.checkNotNullParameter(roundRect0, "<this>");
        return OffsetKt.Offset(roundRect0.getLeft() + roundRect0.getWidth() / 2.0f, roundRect0.getTop() + roundRect0.getHeight() / 2.0f);
    }

    public static final float getMaxDimension(RoundRect roundRect0) {
        Intrinsics.checkNotNullParameter(roundRect0, "<this>");
        return Math.max(Math.abs(roundRect0.getWidth()), Math.abs(roundRect0.getHeight()));
    }

    public static final float getMinDimension(RoundRect roundRect0) {
        Intrinsics.checkNotNullParameter(roundRect0, "<this>");
        return Math.min(Math.abs(roundRect0.getWidth()), Math.abs(roundRect0.getHeight()));
    }

    public static final Rect getSafeInnerRect(RoundRect roundRect0) {
        Intrinsics.checkNotNullParameter(roundRect0, "<this>");
        return new Rect(roundRect0.getLeft() + Math.max(CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()), CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs())) * 0.292893f, roundRect0.getTop() + Math.max(CornerRadius.getY-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()), CornerRadius.getY-impl(roundRect0.getTopRightCornerRadius-kKHJgLs())) * 0.292893f, roundRect0.getRight() - Math.max(CornerRadius.getX-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()), CornerRadius.getX-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs())) * 0.292893f, roundRect0.getBottom() - Math.max(CornerRadius.getY-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()), CornerRadius.getY-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs())) * 0.292893f);
    }

    public static final boolean isCircle(RoundRect roundRect0) {
        Intrinsics.checkNotNullParameter(roundRect0, "<this>");
        return roundRect0.getWidth() == roundRect0.getHeight() && RoundRectKt.isEllipse(roundRect0);
    }

    // 去混淆评级： 低(30)
    public static final boolean isEllipse(RoundRect roundRect0) {
        Intrinsics.checkNotNullParameter(roundRect0, "<this>");
        return CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) != CornerRadius.getX-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) || CornerRadius.getY-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) != CornerRadius.getY-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) || CornerRadius.getX-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) != CornerRadius.getX-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()) || CornerRadius.getY-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) != CornerRadius.getY-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()) || CornerRadius.getX-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()) != CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()) ? false : CornerRadius.getY-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()) == CornerRadius.getY-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()) && ((double)roundRect0.getWidth()) <= ((double)CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs())) * 2.0 && ((double)roundRect0.getHeight()) <= ((double)CornerRadius.getY-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs())) * 2.0;
    }

    public static final boolean isEmpty(RoundRect roundRect0) {
        Intrinsics.checkNotNullParameter(roundRect0, "<this>");
        return roundRect0.getLeft() >= roundRect0.getRight() || roundRect0.getTop() >= roundRect0.getBottom();
    }

    public static final boolean isFinite(RoundRect roundRect0) {
        Intrinsics.checkNotNullParameter(roundRect0, "<this>");
        float f = roundRect0.getLeft();
        if(!Float.isInfinite(f) && !Float.isNaN(f)) {
            float f1 = roundRect0.getTop();
            if(!Float.isInfinite(f1) && !Float.isNaN(f1)) {
                float f2 = roundRect0.getRight();
                if(!Float.isInfinite(f2) && !Float.isNaN(f2)) {
                    float f3 = roundRect0.getBottom();
                    return !Float.isInfinite(f3) && !Float.isNaN(f3);
                }
            }
        }
        return false;
    }

    // 去混淆评级： 低(25)
    public static final boolean isRect(RoundRect roundRect0) {
        Intrinsics.checkNotNullParameter(roundRect0, "<this>");
        if((CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) == 0.0f || CornerRadius.getY-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) == 0.0f) && (CornerRadius.getX-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) == 0.0f || CornerRadius.getY-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) == 0.0f) && (CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()) == 0.0f || CornerRadius.getY-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()) == 0.0f)) {
            return CornerRadius.getX-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()) == 0.0f ? true : CornerRadius.getY-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()) == 0.0f;
        }
        return false;
    }

    // 去混淆评级： 低(35)
    public static final boolean isSimple(RoundRect roundRect0) {
        Intrinsics.checkNotNullParameter(roundRect0, "<this>");
        return CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) != CornerRadius.getY-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) || CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) != CornerRadius.getX-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) || CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) != CornerRadius.getY-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) || CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) != CornerRadius.getX-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()) || CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) != CornerRadius.getY-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()) || CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) != CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()) ? false : CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) == CornerRadius.getY-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs());
    }

    public static final RoundRect lerp(RoundRect roundRect0, RoundRect roundRect1, float f) {
        Intrinsics.checkNotNullParameter(roundRect0, "start");
        Intrinsics.checkNotNullParameter(roundRect1, "stop");
        return new RoundRect(MathHelpersKt.lerp(roundRect0.getLeft(), roundRect1.getLeft(), f), MathHelpersKt.lerp(roundRect0.getTop(), roundRect1.getTop(), f), MathHelpersKt.lerp(roundRect0.getRight(), roundRect1.getRight(), f), MathHelpersKt.lerp(roundRect0.getBottom(), roundRect1.getBottom(), f), CornerRadiusKt.lerp-3Ry4LBc(roundRect0.getTopLeftCornerRadius-kKHJgLs(), roundRect1.getTopLeftCornerRadius-kKHJgLs(), f), CornerRadiusKt.lerp-3Ry4LBc(roundRect0.getTopRightCornerRadius-kKHJgLs(), roundRect1.getTopRightCornerRadius-kKHJgLs(), f), CornerRadiusKt.lerp-3Ry4LBc(roundRect0.getBottomRightCornerRadius-kKHJgLs(), roundRect1.getBottomRightCornerRadius-kKHJgLs(), f), CornerRadiusKt.lerp-3Ry4LBc(roundRect0.getBottomLeftCornerRadius-kKHJgLs(), roundRect1.getBottomLeftCornerRadius-kKHJgLs(), f), null);
    }

    public static final RoundRect translate-Uv8p0NA(RoundRect roundRect0, long v) {
        Intrinsics.checkNotNullParameter(roundRect0, "$this$translate");
        return new RoundRect(roundRect0.getLeft() + Offset.getX-impl(v), roundRect0.getTop() + Offset.getY-impl(v), roundRect0.getRight() + Offset.getX-impl(v), roundRect0.getBottom() + Offset.getY-impl(v), roundRect0.getTopLeftCornerRadius-kKHJgLs(), roundRect0.getTopRightCornerRadius-kKHJgLs(), roundRect0.getBottomRightCornerRadius-kKHJgLs(), roundRect0.getBottomLeftCornerRadius-kKHJgLs(), null);
    }
}

