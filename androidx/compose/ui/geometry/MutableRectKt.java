package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/MutableRect;", "ui-geometry_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class MutableRectKt {
    public static final Rect toRect(MutableRect mutableRect0) {
        Intrinsics.checkNotNullParameter(mutableRect0, "<this>");
        return new Rect(mutableRect0.getLeft(), mutableRect0.getTop(), mutableRect0.getRight(), mutableRect0.getBottom());
    }
}

