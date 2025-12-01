package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\u0006\u0010\u000B\u001A\u00020\u0005H\u0086\u0004R\u0016\u0010\u0003\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/activity/compose/LocalOnBackPressedDispatcherOwner;", "", "()V", "LocalOnBackPressedDispatcherOwner", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "current", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/OnBackPressedDispatcherOwner;", "provides", "Landroidx/compose/runtime/ProvidedValue;", "dispatcherOwner", "activity-compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LocalOnBackPressedDispatcherOwner {
    public static final int $stable;
    public static final LocalOnBackPressedDispatcherOwner INSTANCE;
    private static final ProvidableCompositionLocal LocalOnBackPressedDispatcherOwner;

    static {
        LocalOnBackPressedDispatcherOwner.INSTANCE = new LocalOnBackPressedDispatcherOwner();
        LocalOnBackPressedDispatcherOwner.LocalOnBackPressedDispatcherOwner = CompositionLocalKt.compositionLocalOf$default(null, LocalOnBackPressedDispatcherOwner.LocalOnBackPressedDispatcherOwner.1.INSTANCE, 1, null);
    }

    public final OnBackPressedDispatcherOwner getCurrent(Composer composer0, int v) {
        composer0.startReplaceableGroup(0x64249E20);
        ComposerKt.sourceInformation(composer0, "C46@1881L7:BackHandler.kt#q1dkbc");
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(LocalOnBackPressedDispatcherOwner.LocalOnBackPressedDispatcherOwner);
        ComposerKt.sourceInformationMarkerEnd(composer0);
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner0 = (OnBackPressedDispatcherOwner)object0;
        if(onBackPressedDispatcherOwner0 == null) {
            composer0.startReplaceableGroup(1680121441);
            ComposerKt.sourceInformation(composer0, "*47@1957L7");
            ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object1 = composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ComposerKt.sourceInformationMarkerEnd(composer0);
            Context context0 = (Context)object1;
            while(true) {
                if(!(context0 instanceof ContextWrapper)) {
                    context0 = null;
                    break;
                }
                if(context0 instanceof OnBackPressedDispatcherOwner) {
                    break;
                }
                context0 = ((ContextWrapper)context0).getBaseContext();
                Intrinsics.checkNotNullExpressionValue(context0, "innerContext.baseContext");
            }
            onBackPressedDispatcherOwner0 = (OnBackPressedDispatcherOwner)context0;
        }
        else {
            composer0.startReplaceableGroup(1680121384);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return onBackPressedDispatcherOwner0;
    }

    public final ProvidedValue provides(OnBackPressedDispatcherOwner onBackPressedDispatcherOwner0) {
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner0, "dispatcherOwner");
        return LocalOnBackPressedDispatcherOwner.LocalOnBackPressedDispatcherOwner.provides(onBackPressedDispatcherOwner0);
    }
}

