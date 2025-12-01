package androidx.compose.ui.graphics;

import android.graphics.Shader.TileMode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0017\u0010\u0000\u001A\u00020\u0001*\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0005"}, d2 = {"toAndroidTileMode", "Landroid/graphics/Shader$TileMode;", "Landroidx/compose/ui/graphics/TileMode;", "toAndroidTileMode-0vamqd0", "(I)Landroid/graphics/Shader$TileMode;", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidTileMode_androidKt {
    // 去混淆评级： 低(20)
    public static final Shader.TileMode toAndroidTileMode-0vamqd0(int v) {
        if(TileMode.equals-impl0(v, 0)) {
            return Shader.TileMode.CLAMP;
        }
        if(TileMode.equals-impl0(v, 1)) {
            return Shader.TileMode.REPEAT;
        }
        return TileMode.equals-impl0(v, 2) ? Shader.TileMode.MIRROR : Shader.TileMode.CLAMP;
    }
}

