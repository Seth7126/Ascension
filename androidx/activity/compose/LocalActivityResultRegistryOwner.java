package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\u0006\u0010\u000B\u001A\u00020\u0005H\u0086\u0004R\u0016\u0010\u0003\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/activity/compose/LocalActivityResultRegistryOwner;", "", "()V", "LocalComposition", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/activity/result/ActivityResultRegistryOwner;", "current", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/result/ActivityResultRegistryOwner;", "provides", "Landroidx/compose/runtime/ProvidedValue;", "registryOwner", "activity-compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LocalActivityResultRegistryOwner {
    public static final int $stable;
    public static final LocalActivityResultRegistryOwner INSTANCE;
    private static final ProvidableCompositionLocal LocalComposition;

    static {
        LocalActivityResultRegistryOwner.INSTANCE = new LocalActivityResultRegistryOwner();
        LocalActivityResultRegistryOwner.LocalComposition = CompositionLocalKt.compositionLocalOf$default(null, LocalActivityResultRegistryOwner.LocalComposition.1.INSTANCE, 1, null);
    }

    public final ActivityResultRegistryOwner getCurrent(Composer composer0, int v) {
        composer0.startReplaceableGroup(0x758C5D0E);
        ComposerKt.sourceInformation(composer0, "C46@1894L7:ActivityResultRegistry.kt#q1dkbc");
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(LocalActivityResultRegistryOwner.LocalComposition);
        ComposerKt.sourceInformationMarkerEnd(composer0);
        ActivityResultRegistryOwner activityResultRegistryOwner0 = (ActivityResultRegistryOwner)object0;
        if(activityResultRegistryOwner0 == null) {
            composer0.startReplaceableGroup(0x758C5D3E);
            ComposerKt.sourceInformation(composer0, "*47@1969L7");
            ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object1 = composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ComposerKt.sourceInformationMarkerEnd(composer0);
            Context context0 = (Context)object1;
            while(true) {
                if(!(context0 instanceof ContextWrapper)) {
                    context0 = null;
                    break;
                }
                if(context0 instanceof ActivityResultRegistryOwner) {
                    break;
                }
                context0 = ((ContextWrapper)context0).getBaseContext();
                Intrinsics.checkNotNullExpressionValue(context0, "innerContext.baseContext");
            }
            activityResultRegistryOwner0 = (ActivityResultRegistryOwner)context0;
        }
        else {
            composer0.startReplaceableGroup(0x758C5D16);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return activityResultRegistryOwner0;
    }

    public final ProvidedValue provides(ActivityResultRegistryOwner activityResultRegistryOwner0) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner0, "registryOwner");
        return LocalActivityResultRegistryOwner.LocalComposition.provides(activityResultRegistryOwner0);
    }
}

