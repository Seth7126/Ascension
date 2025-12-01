package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007\u001A\f\u0010\u0004\u001A\u00020\u0001*\u00020\u0001H\u0007¨\u0006\u0005"}, d2 = {"clip", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clipToBounds", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ClipKt {
    public static final Modifier clip(Modifier modifier0, Shape shape0) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(shape0, "shape");
        return GraphicsLayerModifierKt.graphicsLayer-sKFY_QE$default(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape0, true, 0x7FF, null);
    }

    public static final Modifier clipToBounds(Modifier modifier0) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        return GraphicsLayerModifierKt.graphicsLayer-sKFY_QE$default(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, 0xFFF, null);
    }
}

