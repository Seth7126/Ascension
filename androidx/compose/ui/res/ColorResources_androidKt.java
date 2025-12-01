package androidx.compose.ui.res;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001A\u001A\u0010\u0000\u001A\u00020\u00012\b\b\u0001\u0010\u0002\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"colorResource", "Landroidx/compose/ui/graphics/Color;", "id", "", "(ILandroidx/compose/runtime/Composer;I)J", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ColorResources_androidKt {
    public static final long colorResource(int v, Composer composer0, int v1) {
        ComposerKt.sourceInformationMarkerStart(composer0, 0x40B8201F, "C(colorResource)37@1238L7:ColorResources.android.kt#ccshc7");
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        long v2 = Build.VERSION.SDK_INT < 23 ? ColorKt.Color(((Context)object0).getResources().getColor(v)) : ColorResourceHelper.INSTANCE.getColor-WaAFU9c(((Context)object0), v);
        ComposerKt.sourceInformationMarkerEnd(composer0);
        return v2;
    }
}

