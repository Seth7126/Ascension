package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001A\u00028\u0000H\u0011¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/runtime/StaticProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "defaultFactory", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "provided", "Landroidx/compose/runtime/State;", "value", "provided$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class StaticProvidableCompositionLocal extends ProvidableCompositionLocal {
    public StaticProvidableCompositionLocal(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "defaultFactory");
        super(function00);
    }

    @Override  // androidx.compose.runtime.CompositionLocal
    public State provided$runtime_release(Object object0, Composer composer0, int v) {
        composer0.startReplaceableGroup(0xBD44B9B9);
        ComposerKt.sourceInformation(composer0, "C(provided):CompositionLocal.kt#9igjgp");
        StaticValueHolder staticValueHolder0 = new StaticValueHolder(object0);
        composer0.endReplaceableGroup();
        return staticValueHolder0;
    }
}

