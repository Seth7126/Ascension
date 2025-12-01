package androidx.compose.ui.res;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\u001A\u0017\u0010\u0000\u001A\u00020\u00012\b\b\u0001\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001A\u001A\u0010\u0005\u001A\u00020\u00062\b\b\u0001\u0010\u0002\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001A\u0017\u0010\b\u001A\u00020\t2\b\b\u0001\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\n\u001A\u0017\u0010\u000B\u001A\u00020\u00032\b\b\u0001\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"booleanResource", "", "id", "", "(ILandroidx/compose/runtime/Composer;I)Z", "dimensionResource", "Landroidx/compose/ui/unit/Dp;", "(ILandroidx/compose/runtime/Composer;I)F", "integerArrayResource", "", "(ILandroidx/compose/runtime/Composer;I)[I", "integerResource", "(ILandroidx/compose/runtime/Composer;I)I", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class PrimitiveResources_androidKt {
    public static final boolean booleanResource(int v, Composer composer0, int v1) {
        ComposerKt.sourceInformationMarkerStart(composer0, 0x3E100DB6, "C(booleanResource)63@1877L7:PrimitiveResources.android.kt#ccshc7");
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        boolean z = ((Context)object0).getResources().getBoolean(v);
        ComposerKt.sourceInformationMarkerEnd(composer0);
        return z;
    }

    public static final float dimensionResource(int v, Composer composer0, int v1) {
        ComposerKt.sourceInformationMarkerStart(composer0, 0xD1B19DA9, "C(dimensionResource)76@2180L7,77@2219L7:PrimitiveResources.android.kt#ccshc7");
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object1 = composer0.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        float f = Dp.constructor-impl(((Context)object0).getResources().getDimension(v) / ((Density)object1).getDensity());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        return f;
    }

    public static final int[] integerArrayResource(int v, Composer composer0, int v1) {
        ComposerKt.sourceInformationMarkerStart(composer0, 0xCCB4FA26, "C(integerArrayResource)50@1581L7:PrimitiveResources.android.kt#ccshc7");
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        int[] arr_v = ((Context)object0).getResources().getIntArray(v);
        Intrinsics.checkNotNullExpressionValue(arr_v, "context.resources.getIntArray(id)");
        ComposerKt.sourceInformationMarkerEnd(composer0);
        return arr_v;
    }

    public static final int integerResource(int v, Composer composer0, int v1) {
        ComposerKt.sourceInformationMarkerStart(composer0, 0x270D4EFB, "C(integerResource)37@1263L7:PrimitiveResources.android.kt#ccshc7");
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer0);
        int v2 = ((Context)object0).getResources().getInteger(v);
        ComposerKt.sourceInformationMarkerEnd(composer0);
        return v2;
    }
}

