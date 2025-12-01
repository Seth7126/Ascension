package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\b\u001A8\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001A\u0018\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u0003H\u0002\u001A\u001F\u0010\u000B\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001A\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000E\u001A!\u0010\u000B\u001A\u00020\u000F*\u00020\u00012\u0006\u0010\u0010\u001A\u00020\u000FH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000E\u001A!\u0010\u0012\u001A\u00020\u0003*\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001A!\u0010\u0016\u001A\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001A\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0015\u001A!\u0010\u0019\u001A\u00020\u001A*\u00020\u00012\u0006\u0010\u0010\u001A\u00020\u000FH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001B\u0010\u001C\u001A-\u0010\u001D\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u001E\u001A\u00020\u00032\b\b\u0002\u0010\u001F\u001A\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\""}, d2 = {"Constraints", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "", "maxWidth", "minHeight", "maxHeight", "(IIII)J", "addMaxWithMinimum", "max", "value", "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", "constrainHeight", "height", "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", "width", "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "offset", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ConstraintsKt {
    public static final long Constraints(int v, int v1, int v2, int v3) {
        if(v1 < v) {
            throw new IllegalArgumentException(("maxWidth(" + v1 + ") must be >= than minWidth(" + v + ')').toString());
        }
        if(v3 < v2) {
            throw new IllegalArgumentException(("maxHeight(" + v3 + ") must be >= than minHeight(" + v2 + ')').toString());
        }
        if(v < 0 || v2 < 0) {
            throw new IllegalArgumentException(("minWidth(" + v + ") and minHeight(" + v2 + ") must be >= 0").toString());
        }
        return Constraints.Companion.createConstraints-Zbe2FdA$ui_unit_release(v, v1, v2, v3);
    }

    public static long Constraints$default(int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = 0;
        }
        if((v4 & 2) != 0) {
            v1 = 0x7FFFFFFF;
        }
        if((v4 & 4) != 0) {
            v2 = 0;
        }
        if((v4 & 8) != 0) {
            v3 = 0x7FFFFFFF;
        }
        return ConstraintsKt.Constraints(v, v1, v2, v3);
    }

    private static final int addMaxWithMinimum(int v, int v1) {
        return v == 0x7FFFFFFF ? 0x7FFFFFFF : RangesKt.coerceAtLeast(v + v1, 0);
    }

    public static final long constrain-4WqzIAM(long v, long v1) {
        return IntSizeKt.IntSize(RangesKt.coerceIn(((int)(v1 >> 0x20)), Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v)), RangesKt.coerceIn(((int)(v1 & 0xFFFFFFFFL)), Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v)));
    }

    public static final long constrain-N9IONVI(long v, long v1) {
        return ConstraintsKt.Constraints(RangesKt.coerceIn(Constraints.getMinWidth-impl(v1), Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v)), RangesKt.coerceIn(Constraints.getMaxWidth-impl(v1), Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v)), RangesKt.coerceIn(Constraints.getMinHeight-impl(v1), Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v)), RangesKt.coerceIn(Constraints.getMaxHeight-impl(v1), Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v)));
    }

    public static final int constrainHeight-K40F9xA(long v, int v1) {
        return RangesKt.coerceIn(v1, Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v));
    }

    public static final int constrainWidth-K40F9xA(long v, int v1) {
        return RangesKt.coerceIn(v1, Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v));
    }

    // 去混淆评级： 低(30)
    public static final boolean isSatisfiedBy-4WqzIAM(long v, long v1) {
        return Constraints.getMinWidth-impl(v) > ((int)(v1 >> 0x20)) || ((int)(v1 >> 0x20)) > Constraints.getMaxWidth-impl(v) ? false : Constraints.getMinHeight-impl(v) <= ((int)(v1 & 0xFFFFFFFFL)) && ((int)(v1 & 0xFFFFFFFFL)) <= Constraints.getMaxHeight-impl(v);
    }

    public static final long offset-NN6Ew-U(long v, int v1, int v2) {
        return ConstraintsKt.Constraints(RangesKt.coerceAtLeast(Constraints.getMinWidth-impl(v) + v1, 0), ConstraintsKt.addMaxWithMinimum(Constraints.getMaxWidth-impl(v), v1), RangesKt.coerceAtLeast(Constraints.getMinHeight-impl(v) + v2, 0), ConstraintsKt.addMaxWithMinimum(Constraints.getMaxHeight-impl(v), v2));
    }

    public static long offset-NN6Ew-U$default(long v, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v1 = 0;
        }
        if((v3 & 2) != 0) {
            v2 = 0;
        }
        return ConstraintsKt.offset-NN6Ew-U(v, v1, v2);
    }
}

