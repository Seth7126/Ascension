package androidx.compose.ui.unit;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u000E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003¨\u0006\u0004"}, d2 = {"Density", "Landroidx/compose/ui/unit/Density;", "context", "Landroid/content/Context;", "ui-unit_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidDensity_androidKt {
    public static final Density Density(Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        return DensityKt.Density(context0.getResources().getDisplayMetrics().density, context0.getResources().getConfiguration().fontScale);
    }
}

