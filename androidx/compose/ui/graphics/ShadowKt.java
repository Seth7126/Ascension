package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001A \u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"lerp", "Landroidx/compose/ui/graphics/Shadow;", "start", "stop", "fraction", "", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ShadowKt {
    public static final Shadow lerp(Shadow shadow0, Shadow shadow1, float f) {
        Intrinsics.checkNotNullParameter(shadow0, "start");
        Intrinsics.checkNotNullParameter(shadow1, "stop");
        return new Shadow(ColorKt.lerp-jxsXWHM(shadow0.getColor-0d7_KjU(), shadow1.getColor-0d7_KjU(), f), OffsetKt.lerp-Wko1d7g(shadow0.getOffset-F1C5BW0(), shadow1.getOffset-F1C5BW0(), f), MathHelpersKt.lerp(shadow0.getBlurRadius(), shadow1.getBlurRadius(), f), null);
    }
}

