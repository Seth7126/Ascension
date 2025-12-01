package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u001A\u0010\t\u001A\u00020\n2\n\u0010\u000B\u001A\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001A\u00020\u000E\u001A$\u0010\t\u001A\u00020\n2\n\u0010\u000B\u001A\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u0002\u001A\u00020\u0003H\u0007\u001A\u001A\u0010\u000F\u001A\u00020\u00042\n\u0010\u000B\u001A\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001A\u00020\u000E\u001A$\u0010\u000F\u001A\u00020\u00042\n\u0010\u000B\u001A\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u0002\u001A\u00020\u0003H\u0007\u001A\u000E\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0001\u001AI\u0010\u0013\u001A\u00020\u0011\"\b\b\u0000\u0010\u0014*\u00020\u0001\"\b\b\u0001\u0010\u0015*\u00020\u0001*\u0016\u0012\u0004\u0012\u0002H\u0014\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\u00170\u00162\u0006\u0010\u0018\u001A\u0002H\u00142\u0006\u0010\u0019\u001A\u0002H\u0015H\u0002¢\u0006\u0002\u0010\u001A\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001E\u0010\u0002\u001A\u00020\u0003*\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\u001B"}, d2 = {"PendingApplyNoModifications", "", "recomposeCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "Landroidx/compose/runtime/ControlledComposition;", "getRecomposeCoroutineContext$annotations", "(Landroidx/compose/runtime/ControlledComposition;)V", "getRecomposeCoroutineContext", "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/coroutines/CoroutineContext;", "Composition", "Landroidx/compose/runtime/Composition;", "applier", "Landroidx/compose/runtime/Applier;", "parent", "Landroidx/compose/runtime/CompositionContext;", "ControlledComposition", "simulateHotReload", "", "context", "addValue", "K", "V", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "key", "value", "(Landroidx/compose/runtime/collection/IdentityArrayMap;Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class CompositionKt {
    private static final Object PendingApplyNoModifications;

    static {
        CompositionKt.PendingApplyNoModifications = new Object();
    }

    public static final Composition Composition(Applier applier0, CompositionContext compositionContext0) {
        Intrinsics.checkNotNullParameter(applier0, "applier");
        Intrinsics.checkNotNullParameter(compositionContext0, "parent");
        return new CompositionImpl(compositionContext0, applier0, null, 4, null);
    }

    @ExperimentalComposeApi
    public static final Composition Composition(Applier applier0, CompositionContext compositionContext0, CoroutineContext coroutineContext0) {
        Intrinsics.checkNotNullParameter(applier0, "applier");
        Intrinsics.checkNotNullParameter(compositionContext0, "parent");
        Intrinsics.checkNotNullParameter(coroutineContext0, "recomposeCoroutineContext");
        return new CompositionImpl(compositionContext0, applier0, coroutineContext0);
    }

    public static final ControlledComposition ControlledComposition(Applier applier0, CompositionContext compositionContext0) {
        Intrinsics.checkNotNullParameter(applier0, "applier");
        Intrinsics.checkNotNullParameter(compositionContext0, "parent");
        return new CompositionImpl(compositionContext0, applier0, null, 4, null);
    }

    @ExperimentalComposeApi
    public static final ControlledComposition ControlledComposition(Applier applier0, CompositionContext compositionContext0, CoroutineContext coroutineContext0) {
        Intrinsics.checkNotNullParameter(applier0, "applier");
        Intrinsics.checkNotNullParameter(compositionContext0, "parent");
        Intrinsics.checkNotNullParameter(coroutineContext0, "recomposeCoroutineContext");
        return new CompositionImpl(compositionContext0, applier0, coroutineContext0);
    }

    private static final void addValue(IdentityArrayMap identityArrayMap0, Object object0, Object object1) {
        if(identityArrayMap0.contains(object0)) {
            IdentityArraySet identityArraySet0 = (IdentityArraySet)identityArrayMap0.get(object0);
            if(identityArraySet0 != null) {
                identityArraySet0.add(object1);
            }
        }
        else {
            IdentityArraySet identityArraySet1 = new IdentityArraySet();
            identityArraySet1.add(object1);
            identityArrayMap0.set(object0, identityArraySet1);
        }
    }

    @ExperimentalComposeApi
    public static final CoroutineContext getRecomposeCoroutineContext(ControlledComposition controlledComposition0) {
        Intrinsics.checkNotNullParameter(controlledComposition0, "<this>");
        CompositionImpl compositionImpl0 = controlledComposition0 instanceof CompositionImpl ? ((CompositionImpl)controlledComposition0) : null;
        return compositionImpl0 == null ? EmptyCoroutineContext.INSTANCE : compositionImpl0.getRecomposeContext();
    }

    @ExperimentalComposeApi
    public static void getRecomposeCoroutineContext$annotations(ControlledComposition controlledComposition0) {
    }

    public static final void simulateHotReload(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "context");
        HotReloader.Companion.simulateHotReload$runtime_release(object0);
    }
}

