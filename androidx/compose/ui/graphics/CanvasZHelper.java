package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/CanvasZHelper;", "", "()V", "enableZ", "", "canvas", "Landroid/graphics/Canvas;", "enable", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class CanvasZHelper {
    public static final CanvasZHelper INSTANCE;

    static {
        CanvasZHelper.INSTANCE = new CanvasZHelper();
    }

    public final void enableZ(Canvas canvas0, boolean z) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        if(z) {
            canvas0.enableZ();
            return;
        }
        canvas0.disableZ();
    }
}

