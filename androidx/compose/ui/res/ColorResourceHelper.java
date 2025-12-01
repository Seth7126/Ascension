package androidx.compose.ui.res;

import android.content.Context;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\b\b\u0001\u0010\u0007\u001A\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/res/ColorResourceHelper;", "", "()V", "getColor", "Landroidx/compose/ui/graphics/Color;", "context", "Landroid/content/Context;", "id", "", "getColor-WaAFU9c", "(Landroid/content/Context;I)J", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class ColorResourceHelper {
    public static final ColorResourceHelper INSTANCE;

    static {
        ColorResourceHelper.INSTANCE = new ColorResourceHelper();
    }

    public final long getColor-WaAFU9c(Context context0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        return ColorKt.Color(context0.getResources().getColor(v, context0.getTheme()));
    }
}

