package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001A \u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001A-\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u00012\u0006\u0010\b\u001A\u00020\u00012\u0006\u0010\t\u001A\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\f\u001A\"\u0010\r\u001A\u00020\u000E*\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0001H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001A\"\u0010\r\u001A\u00020\u000E*\u00020\u00012\u0006\u0010\u000F\u001A\u00020\u000EH\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0011\u001A\"\u0010\u0013\u001A\u00020\u000E*\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0001H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0011\u001A\"\u0010\u0013\u001A\u00020\u000E*\u00020\u00012\u0006\u0010\u000F\u001A\u00020\u000EH\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0011\u001A\u001A\u0010\u0016\u001A\u00020\u0001*\u00020\u000EH\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001A\u001A\u0010\u0019\u001A\u00020\u000E*\u00020\u0001H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001A\u0010\u0018\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u001B"}, d2 = {"IntOffset", "Landroidx/compose/ui/unit/IntOffset;", "x", "", "y", "(II)J", "lerp", "start", "stop", "fraction", "", "lerp-81ZRxRo", "(JJF)J", "minus", "Landroidx/compose/ui/geometry/Offset;", "offset", "minus-Nv-tHpc", "(JJ)J", "minus-oCl6YwE", "plus", "plus-Nv-tHpc", "plus-oCl6YwE", "round", "round-k-4lQ0M", "(J)J", "toOffset", "toOffset--gyyYBs", "ui-unit_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class IntOffsetKt {
    public static final long IntOffset(int v, int v1) {
        return ((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20;
    }

    public static final long lerp-81ZRxRo(long v, long v1, float f) {
        return IntOffsetKt.IntOffset(MathHelpersKt.lerp(((int)(v >> 0x20)), ((int)(v1 >> 0x20)), f), MathHelpersKt.lerp(((int)(v & 0xFFFFFFFFL)), ((int)(v1 & 0xFFFFFFFFL)), f));
    }

    public static final long minus-Nv-tHpc(long v, long v1) {
        return OffsetKt.Offset(Offset.getX-impl(v) - ((float)(((int)(v1 >> 0x20)))), Offset.getY-impl(v) - ((float)(((int)(v1 & 0xFFFFFFFFL)))));
    }

    public static final long minus-oCl6YwE(long v, long v1) {
        return OffsetKt.Offset(((float)IntOffset.getX-impl(v)) - Offset.getX-impl(v1), ((float)IntOffset.getY-impl(v)) - Offset.getY-impl(v1));
    }

    public static final long plus-Nv-tHpc(long v, long v1) {
        return OffsetKt.Offset(Offset.getX-impl(v) + ((float)(((int)(v1 >> 0x20)))), Offset.getY-impl(v) + ((float)(((int)(v1 & 0xFFFFFFFFL)))));
    }

    public static final long plus-oCl6YwE(long v, long v1) {
        return OffsetKt.Offset(((float)(((int)(v >> 0x20)))) + Offset.getX-impl(v1), ((float)(((int)(v & 0xFFFFFFFFL)))) + Offset.getY-impl(v1));
    }

    public static final long round-k-4lQ0M(long v) {
        return IntOffsetKt.IntOffset(MathKt.roundToInt(Offset.getX-impl(v)), MathKt.roundToInt(Offset.getY-impl(v)));
    }

    public static final long toOffset--gyyYBs(long v) {
        return OffsetKt.Offset(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
    }
}

