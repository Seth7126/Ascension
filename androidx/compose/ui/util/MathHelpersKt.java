package androidx.compose.ui.util;

import kotlin.Metadata;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\u001A\u001E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0001\u001A\u001E\u0010\u0000\u001A\u00020\u00052\u0006\u0010\u0002\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00052\u0006\u0010\u0004\u001A\u00020\u0001\u001A\u001E\u0010\u0000\u001A\u00020\u00062\u0006\u0010\u0002\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00062\u0006\u0010\u0004\u001A\u00020\u0001¨\u0006\u0007"}, d2 = {"lerp", "", "start", "stop", "fraction", "", "", "ui-util_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class MathHelpersKt {
    public static final float lerp(float f, float f1, float f2) [...] // Inlined contents

    public static final int lerp(int v, int v1, float f) {
        return v + MathKt.roundToInt(((double)(v1 - v)) * ((double)f));
    }

    public static final long lerp(long v, long v1, float f) {
        return v + MathKt.roundToLong(((double)(v1 - v)) * ((double)f));
    }
}

