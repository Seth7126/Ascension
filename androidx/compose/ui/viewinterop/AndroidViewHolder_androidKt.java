package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0014\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0002\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Unmeasured", "", "layoutAccordingTo", "", "Landroid/view/View;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidViewHolder_androidKt {
    private static final int Unmeasured = 0x80000000;

    private static final void layoutAccordingTo(View view0, LayoutNode layoutNode0) {
        long v = LayoutCoordinatesKt.positionInRoot(layoutNode0.getCoordinates());
        int v1 = MathKt.roundToInt(Offset.getX-impl(v));
        int v2 = MathKt.roundToInt(Offset.getY-impl(v));
        view0.layout(v1, v2, view0.getMeasuredWidth() + v1, view0.getMeasuredHeight() + v2);
    }
}

