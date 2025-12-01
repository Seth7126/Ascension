package androidx.compose.ui.res;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.font.Typeface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001A\u0015\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u0004H\u0007¢\u0006\u0002\u0010\b\u001A\u0018\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u0004H\u0002\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001C\u0010\u0002\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"cacheLock", "Ljava/lang/Object;", "syncLoadedTypefaces", "", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/Typeface;", "fontResource", "fontFamily", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/Typeface;", "fontResourceFromContext", "context", "Landroid/content/Context;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class FontResources_androidKt {
    private static final Object cacheLock;
    private static final Map syncLoadedTypefaces;

    static {
        FontResources_androidKt.cacheLock = new Object();
        FontResources_androidKt.syncLoadedTypefaces = new LinkedHashMap();
    }

    public static final Typeface fontResource(FontFamily fontFamily0, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(fontFamily0, "fontFamily");
        ComposerKt.sourceInformationMarkerStart(composer0, 0x1AAC1540, "C(fontResource)46@1641L7:FontResources.android.kt#ccshc7");
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        Typeface typeface0 = FontResources_androidKt.fontResourceFromContext(((Context)object0), fontFamily0);
        ComposerKt.sourceInformationMarkerEnd(composer0);
        return typeface0;
    }

    private static final Typeface fontResourceFromContext(Context context0, FontFamily fontFamily0) {
        if(!(fontFamily0 instanceof SystemFontFamily) && !(fontFamily0 instanceof LoadedFontFamily)) {
            return AndroidTypeface_androidKt.Typeface$default(context0, fontFamily0, null, 4, null);
        }
        synchronized(FontResources_androidKt.cacheLock) {
            Map map0 = FontResources_androidKt.syncLoadedTypefaces;
            Typeface typeface0 = map0.get(fontFamily0);
            if(typeface0 == null) {
                typeface0 = AndroidTypeface_androidKt.Typeface$default(context0, fontFamily0, null, 4, null);
                map0.put(fontFamily0, typeface0);
            }
            return typeface0;
        }
    }
}

