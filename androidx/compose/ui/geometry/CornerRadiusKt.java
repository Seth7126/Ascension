package androidx.compose.ui.geometry;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\u001A\"\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001A-\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u00012\u0006\u0010\b\u001A\u00020\u00012\u0006\u0010\t\u001A\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000B\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"CornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "x", "", "y", "(FF)J", "lerp", "start", "stop", "fraction", "lerp-3Ry4LBc", "(JJF)J", "ui-geometry_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class CornerRadiusKt {
    public static final long CornerRadius(float f, float f1) {
        return ((long)Float.floatToIntBits(f1)) & 0xFFFFFFFFL | ((long)Float.floatToIntBits(f)) << 0x20;
    }

    public static long CornerRadius$default(float f, float f1, int v, Object object0) [...] // 潜在的解密器

    public static final long lerp-3Ry4LBc(long v, long v1, float f) {
        return CornerRadiusKt.CornerRadius((1.0f - f) * CornerRadius.getX-impl(v) + f * CornerRadius.getX-impl(v1), (1.0f - f) * CornerRadius.getY-impl(v) + f * CornerRadius.getY-impl(v1));
    }
}

