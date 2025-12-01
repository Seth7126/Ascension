package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A \u0010\r\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001A-\u0010\u0012\u001A\u00020\u00022\u0006\u0010\u0013\u001A\u00020\u00022\u0006\u0010\u0014\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u000FH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001A+\u0010\u0018\u001A\u00020\u0002*\u00020\u00022\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00020\u001AH\u0086\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001B\u0010\u001C\"!\u0010\u0000\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"!\u0010\u0007\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006\"!\u0010\n\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0005\b\u009920\u0001¨\u0006\u001D"}, d2 = {"isFinite", "", "Landroidx/compose/ui/geometry/Offset;", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite-k-4lQ0M", "(J)Z", "isSpecified", "isSpecified-k-4lQ0M$annotations", "isSpecified-k-4lQ0M", "isUnspecified", "isUnspecified-k-4lQ0M$annotations", "isUnspecified-k-4lQ0M", "Offset", "x", "", "y", "(FF)J", "lerp", "start", "stop", "fraction", "lerp-Wko1d7g", "(JJF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-3MmeM6k", "(JLkotlin/jvm/functions/Function0;)J", "ui-geometry_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class OffsetKt {
    public static final long Offset(float f, float f1) [...] // 潜在的解密器

    public static final boolean isFinite-k-4lQ0M(long v) {
        float f = Offset.getX-impl(v);
        if(!Float.isInfinite(f) && !Float.isNaN(f)) {
            float f1 = Offset.getY-impl(v);
            return !Float.isInfinite(f1) && !Float.isNaN(f1);
        }
        return false;
    }

    public static void isFinite-k-4lQ0M$annotations(long v) {
    }

    // 去混淆评级： 低(20)
    public static final boolean isSpecified-k-4lQ0M(long v) {
        return v != 0x7FC000007FC00000L;
    }

    public static void isSpecified-k-4lQ0M$annotations(long v) {
    }

    // 去混淆评级： 低(20)
    public static final boolean isUnspecified-k-4lQ0M(long v) {
        return v == 0x7FC000007FC00000L;
    }

    public static void isUnspecified-k-4lQ0M$annotations(long v) {
    }

    public static final long lerp-Wko1d7g(long v, long v1, float f) {
        return OffsetKt.Offset(MathHelpersKt.lerp(Offset.getX-impl(v), Offset.getX-impl(v1), f), MathHelpersKt.lerp(Offset.getY-impl(v), Offset.getY-impl(v1), f));
    }

    public static final long takeOrElse-3MmeM6k(long v, Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        return OffsetKt.isSpecified-k-4lQ0M(v) ? v : ((Offset)function00.invoke()).unbox-impl();
    }
}

