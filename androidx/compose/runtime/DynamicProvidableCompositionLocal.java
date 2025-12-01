package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\n\u001A\u00028\u0000H\u0011¢\u0006\u0004\b\u000B\u0010\fR\u0014\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/DynamicProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "defaultFactory", "Lkotlin/Function0;", "(Landroidx/compose/runtime/SnapshotMutationPolicy;Lkotlin/jvm/functions/Function0;)V", "provided", "Landroidx/compose/runtime/State;", "value", "provided$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DynamicProvidableCompositionLocal extends ProvidableCompositionLocal {
    private final SnapshotMutationPolicy policy;

    public DynamicProvidableCompositionLocal(SnapshotMutationPolicy snapshotMutationPolicy0, Function0 function00) {
        Intrinsics.checkNotNullParameter(snapshotMutationPolicy0, "policy");
        Intrinsics.checkNotNullParameter(function00, "defaultFactory");
        super(function00);
        this.policy = snapshotMutationPolicy0;
    }

    @Override  // androidx.compose.runtime.CompositionLocal
    public State provided$runtime_release(Object object0, Composer composer0, int v) {
        composer0.startReplaceableGroup(0xC3F05E60);
        ComposerKt.sourceInformation(composer0, "C(provided)*125@5325L42:CompositionLocal.kt#9igjgp");
        composer0.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
        MutableState mutableState0 = composer0.rememberedValue();
        if(mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf(object0, this.policy);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        mutableState0.setValue(object0);
        composer0.endReplaceableGroup();
        return mutableState0;
    }
}

