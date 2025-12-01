package androidx.compose.ui.text.font;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001A\u001E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0005¨\u0006\u0006"}, d2 = {"lerp", "Landroidx/compose/ui/text/font/FontWeight;", "start", "stop", "fraction", "", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class FontWeightKt {
    public static final FontWeight lerp(FontWeight fontWeight0, FontWeight fontWeight1, float f) {
        Intrinsics.checkNotNullParameter(fontWeight0, "start");
        Intrinsics.checkNotNullParameter(fontWeight1, "stop");
        return new FontWeight(RangesKt.coerceIn(MathHelpersKt.lerp(fontWeight0.getWeight(), fontWeight1.getWeight(), f), 1, 1000));
    }
}

