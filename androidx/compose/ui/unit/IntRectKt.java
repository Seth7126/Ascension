package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\u001A%\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001A%\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0006\u001A%\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u000B\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000F\u001A \u0010\u0010\u001A\u00020\u00012\u0006\u0010\u0011\u001A\u00020\u00012\u0006\u0010\u0012\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u0014H\u0007\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"IntRect", "Landroidx/compose/ui/unit/IntRect;", "topLeft", "Landroidx/compose/ui/unit/IntOffset;", "bottomRight", "IntRect-E1MhUcY", "(JJ)Landroidx/compose/ui/unit/IntRect;", "offset", "size", "Landroidx/compose/ui/unit/IntSize;", "IntRect-VbeCjmY", "center", "radius", "", "IntRect-ar5cAso", "(JI)Landroidx/compose/ui/unit/IntRect;", "lerp", "start", "stop", "fraction", "", "ui-unit_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class IntRectKt {
    public static final IntRect IntRect-E1MhUcY(long v, long v1) {
        return new IntRect(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)), ((int)(v1 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)));
    }

    public static final IntRect IntRect-VbeCjmY(long v, long v1) {
        return new IntRect(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)), ((int)(v >> 0x20)) + ((int)(v1 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) + ((int)(v1 & 0xFFFFFFFFL)));
    }

    public static final IntRect IntRect-ar5cAso(long v, int v1) {
        return new IntRect(((int)(v >> 0x20)) - v1, ((int)(v & 0xFFFFFFFFL)) - v1, ((int)(v >> 0x20)) + v1, ((int)(v & 0xFFFFFFFFL)) + v1);
    }

    public static final IntRect lerp(IntRect intRect0, IntRect intRect1, float f) {
        Intrinsics.checkNotNullParameter(intRect0, "start");
        Intrinsics.checkNotNullParameter(intRect1, "stop");
        return new IntRect(MathHelpersKt.lerp(intRect0.getLeft(), intRect1.getLeft(), f), MathHelpersKt.lerp(intRect0.getTop(), intRect1.getTop(), f), MathHelpersKt.lerp(intRect0.getRight(), intRect1.getRight(), f), MathHelpersKt.lerp(intRect0.getBottom(), intRect1.getBottom(), f));
    }
}

