package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001A\u00020\u0002H\u0007\u001A\u001C\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0007¨\u0006\u0005"}, d2 = {"scale", "Landroidx/compose/ui/Modifier;", "", "scaleX", "scaleY", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ScaleKt {
    public static final Modifier scale(Modifier modifier0, float f) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        return ScaleKt.scale(modifier0, f, f);
    }

    public static final Modifier scale(Modifier modifier0, float f, float f1) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        return f != 1.0f || f1 != 1.0f ? GraphicsLayerModifierKt.graphicsLayer-sKFY_QE$default(modifier0, f, f1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0x1FFC, null) : modifier0;
    }
}

