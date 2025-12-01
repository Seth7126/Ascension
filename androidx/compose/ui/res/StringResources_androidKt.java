package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\u001A\r\u0010\u0000\u001A\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001A\u001D\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0006\u001A\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001A\u0017\u0010\t\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u0007H\u0007¢\u0006\u0002\u0010\n\u001A+\u0010\t\u001A\u00020\u00052\b\b\u0001\u0010\u0006\u001A\u00020\u00072\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0004\"\u00020\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"resources", "Landroid/content/res/Resources;", "(Landroidx/compose/runtime/Composer;I)Landroid/content/res/Resources;", "stringArrayResource", "", "", "id", "", "(ILandroidx/compose/runtime/Composer;I)[Ljava/lang/String;", "stringResource", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatArgs", "", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class StringResources_androidKt {
    private static final Resources resources(Composer composer0, int v) {
        ComposerKt.sourceInformationMarkerStart(composer0, 0x2B0DF821, "C(resources)73@2131L7,74@2163L7:StringResources.android.kt#ccshc7");
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        composer0.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        Resources resources0 = ((Context)object0).getResources();
        Intrinsics.checkNotNullExpressionValue(resources0, "LocalContext.current.resources");
        ComposerKt.sourceInformationMarkerEnd(composer0);
        return resources0;
    }

    public static final String[] stringArrayResource(int v, Composer composer0, int v1) {
        ComposerKt.sourceInformationMarkerStart(composer0, 0x4CEF2D86, "C(stringArrayResource)62@1861L11:StringResources.android.kt#ccshc7");
        String[] arr_s = StringResources_androidKt.resources(composer0, 0).getStringArray(v);
        Intrinsics.checkNotNullExpressionValue(arr_s, "resources.getStringArray(id)");
        ComposerKt.sourceInformationMarkerEnd(composer0);
        return arr_s;
    }

    public static final String stringResource(int v, Composer composer0, int v1) {
        ComposerKt.sourceInformationMarkerStart(composer0, 0x16DAF7DC, "C(stringResource)35@1191L11:StringResources.android.kt#ccshc7");
        String s = StringResources_androidKt.resources(composer0, 0).getString(v);
        Intrinsics.checkNotNullExpressionValue(s, "resources.getString(id)");
        ComposerKt.sourceInformationMarkerEnd(composer0);
        return s;
    }

    public static final String stringResource(int v, Object[] arr_object, Composer composer0, int v1) {
        Intrinsics.checkNotNullParameter(arr_object, "formatArgs");
        ComposerKt.sourceInformationMarkerStart(composer0, 0x16DAF930, "C(stringResource)P(1)49@1555L11:StringResources.android.kt#ccshc7");
        String s = StringResources_androidKt.resources(composer0, 0).getString(v, Arrays.copyOf(arr_object, arr_object.length));
        Intrinsics.checkNotNullExpressionValue(s, "resources.getString(id, *formatArgs)");
        ComposerKt.sourceInformationMarkerEnd(composer0);
        return s;
    }
}

