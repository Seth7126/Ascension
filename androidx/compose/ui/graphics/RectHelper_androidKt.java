package androidx.compose.ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0003\u001A\u00020\u0004*\u00020\u0002\u001A\n\u0010\u0005\u001A\u00020\u0002*\u00020\u0001¨\u0006\u0006"}, d2 = {"toAndroidRect", "Landroid/graphics/Rect;", "Landroidx/compose/ui/geometry/Rect;", "toAndroidRectF", "Landroid/graphics/RectF;", "toComposeRect", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class RectHelper_androidKt {
    public static final Rect toAndroidRect(androidx.compose.ui.geometry.Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "<this>");
        return new Rect(((int)rect0.getLeft()), ((int)rect0.getTop()), ((int)rect0.getRight()), ((int)rect0.getBottom()));
    }

    public static final RectF toAndroidRectF(androidx.compose.ui.geometry.Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "<this>");
        return new RectF(rect0.getLeft(), rect0.getTop(), rect0.getRight(), rect0.getBottom());
    }

    public static final androidx.compose.ui.geometry.Rect toComposeRect(Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "<this>");
        return new androidx.compose.ui.geometry.Rect(((float)rect0.left), ((float)rect0.top), ((float)rect0.right), ((float)rect0.bottom));
    }
}

