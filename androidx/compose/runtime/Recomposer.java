package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult.Failure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jeb.synthetic.FIN;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000\u00E4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u0080\u00012\u00020\u0001:\b\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0004J\u0010\u0010?\u001A\u00020>2\u0006\u0010@\u001A\u00020AH\u0002J\u0006\u0010B\u001A\u00020CJ\u0011\u0010D\u001A\u00020>H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010EJ\u0011\u0010F\u001A\u00020>H\u0082@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010EJ\u0006\u0010G\u001A\u00020>J\u0006\u0010H\u001A\u00020>J*\u0010I\u001A\u00020>2\u0006\u0010J\u001A\u00020\u00172\u0011\u0010K\u001A\r\u0012\u0004\u0012\u00020>0L\u00A2\u0006\u0002\bMH\u0010\u00A2\u0006\u0004\bN\u0010OJ:\u0010P\u001A\u0002HQ\"\u0004\b\u0000\u0010Q2\u0006\u0010J\u001A\u00020\u00172\u000E\u0010R\u001A\n\u0012\u0004\u0012\u000206\u0018\u00010S2\f\u0010T\u001A\b\u0012\u0004\u0012\u0002HQ0LH\u0082\b\u00A2\u0006\u0002\u0010UJ\u0010\u0010V\u001A\n\u0012\u0004\u0012\u00020>\u0018\u00010=H\u0002J\u0015\u0010W\u001A\u00020>2\u0006\u0010J\u001A\u00020\u0017H\u0010\u00A2\u0006\u0002\bXJ\u0015\u0010Y\u001A\u00020>2\u0006\u0010Z\u001A\u00020[H\u0010\u00A2\u0006\u0002\b\\J\u0011\u0010]\u001A\u00020>H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010EJ\"\u0010^\u001A\u0004\u0018\u00010\u00172\u0006\u0010J\u001A\u00020\u00172\u000E\u0010R\u001A\n\u0012\u0004\u0012\u000206\u0018\u00010SH\u0002J\u001C\u0010_\u001A\u000E\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020>0`2\u0006\u0010J\u001A\u00020\u0017H\u0002JO\u0010a\u001A\u00020>2<\u0010T\u001A8\b\u0001\u0012\u0004\u0012\u00020c\u0012\u0013\u0012\u00110d\u00A2\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(g\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0h\u0012\u0006\u0012\u0004\u0018\u0001060b\u00A2\u0006\u0002\biH\u0082@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010jJ\b\u0010k\u001A\u00020>H\u0002J\u001D\u0010k\u001A\u00020>2\u0012\u0010l\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020>0`H\u0082\bJ\u001B\u0010m\u001A\u00020>2\f\u0010n\u001A\b\u0012\u0004\u0012\u00020p0oH\u0010\u00A2\u0006\u0002\bqJ\u0015\u0010r\u001A\u00020>2\u0006\u0010J\u001A\u00020\u0017H\u0010\u00A2\u0006\u0002\bsJ\u0010\u0010t\u001A\u00020>2\u0006\u0010u\u001A\u000201H\u0002J!\u0010v\u001A\u00020>2\u0006\u0010g\u001A\u00020d2\u0006\u0010w\u001A\u00020xH\u0082@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010yJ\u0011\u0010z\u001A\u00020>H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010EJ\u0019\u0010{\u001A\u00020>2\u0006\u0010,\u001A\u00020\u0003H\u0087@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010|J\u0015\u0010}\u001A\u00020>2\u0006\u0010J\u001A\u00020\u0017H\u0010\u00A2\u0006\u0002\b~J,\u0010\u007F\u001A\u000E\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020>0`2\u0006\u0010J\u001A\u00020\u00172\u000E\u0010R\u001A\n\u0012\u0004\u0012\u000206\u0018\u00010SH\u0002R\u0014\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\tX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001E\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\u000B@BX\u0086\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0010\u0010\u000F\u001A\u0004\u0018\u00010\u0010X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001A\u00020\u00128PX\u0090\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001A\u00020\u001A8PX\u0090\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001B\u0010\u001CR\u000E\u0010\u001D\u001A\u00020\u001AX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001A\u00020\u0003X\u0090\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001E\u0010\u001FR\u000E\u0010 \u001A\u00020!X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\"\u001A\u00020\u00128BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010\u0014R\u0014\u0010$\u001A\u00020\u00128BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b%\u0010\u0014R\u0011\u0010&\u001A\u00020\u00128F\u00A2\u0006\u0006\u001A\u0004\b\'\u0010\u0014R\u0014\u0010(\u001A\u00020\u00128BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b)\u0010\u0014R\u000E\u0010*\u001A\u00020\u0012X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010+\u001A\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010,\u001A\u00020\u00038PX\u0090\u0004\u00A2\u0006\u0006\u001A\u0004\b-\u0010\u001FR\u0012\u0010.\u001A\u00060/R\u00020\u0000X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0010\u00100\u001A\u0004\u0018\u000101X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u00102\u001A\u00020\u00128BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b3\u0010\u0014R\u001A\u00104\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u000206050\u0016X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0017\u00107\u001A\b\u0012\u0004\u0012\u00020\u0007088F\u00A2\u0006\u0006\u001A\u0004\b9\u0010:R\u000E\u0010;\u001A\u000206X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0016\u0010<\u001A\n\u0012\u0004\u0012\u00020>\u0018\u00010=X\u0082\u000E\u00A2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006\u0084\u0001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/Recomposer$State;", "broadcastFrameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "<set-?>", "", "changeCount", "getChangeCount", "()J", "closeCause", "", "collectingParameterInformation", "", "getCollectingParameterInformation$runtime_release", "()Z", "compositionInvalidations", "", "Landroidx/compose/runtime/ControlledComposition;", "compositionsAwaitingApply", "compoundHashKey", "", "getCompoundHashKey$runtime_release", "()I", "concurrentCompositionsOutstanding", "getEffectCoroutineContext$runtime_release", "()Lkotlin/coroutines/CoroutineContext;", "effectJob", "Lkotlinx/coroutines/CompletableJob;", "hasConcurrentFrameWorkLocked", "getHasConcurrentFrameWorkLocked", "hasFrameWorkLocked", "getHasFrameWorkLocked", "hasPendingWork", "getHasPendingWork", "hasSchedulingWork", "getHasSchedulingWork", "isClosed", "knownCompositions", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime_release", "recomposerInfo", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "runnerJob", "Lkotlinx/coroutines/Job;", "shouldKeepRecomposing", "getShouldKeepRecomposing", "snapshotInvalidations", "", "", "state", "Lkotlinx/coroutines/flow/Flow;", "getState", "()Lkotlinx/coroutines/flow/Flow;", "stateLock", "workContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "applyAndCheck", "snapshot", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "asRecomposerInfo", "Landroidx/compose/runtime/RecomposerInfo;", "awaitIdle", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitWorkAvailable", "cancel", "close", "composeInitial", "composition", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composing", "T", "modifiedValues", "Landroidx/compose/runtime/collection/IdentityArraySet;", "block", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "deriveStateLocked", "invalidate", "invalidate$runtime_release", "invalidateScope", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateScope$runtime_release", "join", "performRecompose", "readObserverOf", "Lkotlin/Function1;", "recompositionRunner", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/ParameterName;", "name", "parentFrameClock", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordComposerModificationsLocked", "onEachInvalidComposition", "recordInspectionTable", "table", "", "Landroidx/compose/runtime/tooling/CompositionData;", "recordInspectionTable$runtime_release", "registerComposition", "registerComposition$runtime_release", "registerRunnerJob", "callingJob", "runFrameLoop", "frameSignal", "Landroidx/compose/runtime/ProduceFrameSignal;", "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runRecomposeAndApplyChanges", "runRecomposeConcurrentlyAndApplyChanges", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unregisterComposition", "unregisterComposition$runtime_release", "writeObserverOf", "Companion", "HotReloadable", "RecomposerInfoImpl", "State", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Recomposer extends CompositionContext {
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000E\u001A\u00020\u000F2\n\u0010\u0010\u001A\u00060\u0006R\u00020\u0007H\u0002J\u0015\u0010\u0011\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0001H\u0000¢\u0006\u0002\b\u0013J\u0014\u0010\u0014\u001A\u00020\u000F2\n\u0010\u0010\u001A\u00060\u0006R\u00020\u0007H\u0002J\r\u0010\u0015\u001A\u00020\u0001H\u0000¢\u0006\u0002\b\u0016R\u001E\u0010\u0003\u001A\u0012\u0012\u000E\u0012\f\u0012\b\u0012\u00060\u0006R\u00020\u00070\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001D\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\n0\t8F¢\u0006\u0006\u001A\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "()V", "_runningRecomposers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "runningRecomposers", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/compose/runtime/RecomposerInfo;", "getRunningRecomposers", "()Lkotlinx/coroutines/flow/StateFlow;", "addRunning", "", "info", "loadStateAndComposeForHotReload", "token", "loadStateAndComposeForHotReload$runtime_release", "removeRunning", "saveStateAndDisposeForHotReload", "saveStateAndDisposeForHotReload$runtime_release", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        private final void addRunning(RecomposerInfoImpl recomposer$RecomposerInfoImpl0) {
            do {
                PersistentSet persistentSet0 = (PersistentSet)Recomposer._runningRecomposers.getValue();
                PersistentSet persistentSet1 = persistentSet0.add(recomposer$RecomposerInfoImpl0);
            }
            while(persistentSet0 != persistentSet1 && !Recomposer._runningRecomposers.compareAndSet(persistentSet0, persistentSet1));
        }

        public final StateFlow getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final void loadStateAndComposeForHotReload$runtime_release(Object object0) {
            Intrinsics.checkNotNullParameter(object0, "token");
            int v = ((List)object0).size();
            if(v - 1 >= 0) {
                for(int v2 = 0; true; ++v2) {
                    ((HotReloadable)((List)object0).get(v2)).resetContent();
                    if(v2 + 1 > v - 1) {
                        break;
                    }
                }
            }
            int v3 = ((List)object0).size();
            if(v3 - 1 >= 0) {
                for(int v1 = 0; true; ++v1) {
                    ((HotReloadable)((List)object0).get(v1)).recompose();
                    if(v1 + 1 > v3 - 1) {
                        break;
                    }
                }
            }
        }

        private final void removeRunning(RecomposerInfoImpl recomposer$RecomposerInfoImpl0) {
            do {
                PersistentSet persistentSet0 = (PersistentSet)Recomposer._runningRecomposers.getValue();
                PersistentSet persistentSet1 = persistentSet0.remove(recomposer$RecomposerInfoImpl0);
            }
            while(persistentSet0 != persistentSet1 && !Recomposer._runningRecomposers.compareAndSet(persistentSet0, persistentSet1));
        }

        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            Iterable iterable0 = (Iterable)Recomposer._runningRecomposers.getValue();
            Collection collection0 = new ArrayList();
            for(Object object0: iterable0) {
                CollectionsKt.addAll(collection0, ((RecomposerInfoImpl)object0).saveStateAndDisposeForHotReload());
            }
            return (List)collection0;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001A\u00020\u0007J\u0006\u0010\u000B\u001A\u00020\u0007J\u0006\u0010\f\u001A\u00020\u0007R\u001B\u0010\u0005\u001A\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bX\u0082\u000E¢\u0006\u0004\n\u0002\u0010\tR\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/Recomposer$HotReloadable;", "", "composition", "Landroidx/compose/runtime/CompositionImpl;", "(Landroidx/compose/runtime/CompositionImpl;)V", "composable", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/jvm/functions/Function2;", "clearContent", "recompose", "resetContent", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class HotReloadable {
        private Function2 composable;
        private final CompositionImpl composition;

        public HotReloadable(CompositionImpl compositionImpl0) {
            Intrinsics.checkNotNullParameter(compositionImpl0, "composition");
            super();
            this.composition = compositionImpl0;
            this.composable = compositionImpl0.getComposable();
        }

        public final void clearContent() {
            if(this.composition.isRoot()) {
                this.composition.setContent(ComposableSingletons.RecomposerKt.INSTANCE.getLambda-1$runtime_release());
            }
        }

        public final void recompose() {
            if(this.composition.isRoot()) {
                this.composition.setContent(this.composable);
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00120\u0011R\u0014\u0010\u0003\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u001A\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/RecomposerInfo;", "(Landroidx/compose/runtime/Recomposer;)V", "changeCount", "", "getChangeCount", "()J", "hasPendingWork", "", "getHasPendingWork", "()Z", "state", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()Lkotlinx/coroutines/flow/Flow;", "saveStateAndDisposeForHotReload", "", "Landroidx/compose/runtime/Recomposer$HotReloadable;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
            Intrinsics.checkNotNullParameter(recomposer0, "this$0");
            Recomposer.this = recomposer0;
            super();
        }

        @Override  // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        @Override  // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override  // androidx.compose.runtime.RecomposerInfo
        public Flow getState() {
            return Recomposer.this.getState();
        }

        public final List saveStateAndDisposeForHotReload() {
            List list0;
            synchronized(Recomposer.this.stateLock) {
                list0 = CollectionsKt.toMutableList(Recomposer.this.knownCompositions);
            }
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v1 = list0.size();
            if(v1 - 1 >= 0) {
                for(int v3 = 0; true; ++v3) {
                    ControlledComposition controlledComposition0 = (ControlledComposition)list0.get(v3);
                    CompositionImpl compositionImpl0 = controlledComposition0 instanceof CompositionImpl ? ((CompositionImpl)controlledComposition0) : null;
                    if(compositionImpl0 != null) {
                        arrayList0.add(compositionImpl0);
                    }
                    if(v3 + 1 > v1 - 1) {
                        break;
                    }
                }
            }
            ArrayList arrayList1 = new ArrayList(arrayList0.size());
            int v4 = arrayList0.size();
            if(v4 - 1 >= 0) {
                for(int v2 = 0; true; ++v2) {
                    HotReloadable recomposer$HotReloadable0 = new HotReloadable(((CompositionImpl)arrayList0.get(v2)));
                    recomposer$HotReloadable0.clearContent();
                    arrayList1.add(recomposer$HotReloadable0);
                    if(v2 + 1 > v4 - 1) {
                        break;
                    }
                }
            }
            return arrayList1;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork;

        private static final State[] $values() [...] // Inlined contents
    }

    public static final int $stable;
    public static final Companion Companion;
    private static final MutableStateFlow _runningRecomposers;
    private final MutableStateFlow _state;
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;
    private Throwable closeCause;
    private final List compositionInvalidations;
    private final List compositionsAwaitingApply;
    private int concurrentCompositionsOutstanding;
    private final CoroutineContext effectCoroutineContext;
    private final CompletableJob effectJob;
    private boolean isClosed;
    private final List knownCompositions;
    private final RecomposerInfoImpl recomposerInfo;
    private Job runnerJob;
    private final List snapshotInvalidations;
    private final Object stateLock;
    private CancellableContinuation workContinuation;

    static {
        Recomposer.Companion = new Companion(null);
        Recomposer.$stable = 8;
        Recomposer._runningRecomposers = StateFlowKt.MutableStateFlow(ExtensionsKt.persistentSetOf());
    }

    public Recomposer(CoroutineContext coroutineContext0) {
        Intrinsics.checkNotNullParameter(coroutineContext0, "effectCoroutineContext");
        super();
        BroadcastFrameClock broadcastFrameClock0 = new BroadcastFrameClock(new Function0() {
            {
                Recomposer.this = recomposer0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                Object object0 = Recomposer.this.stateLock;
                Recomposer recomposer0 = Recomposer.this;
                synchronized(object0) {
                    CancellableContinuation cancellableContinuation0 = recomposer0.deriveStateLocked();
                    if(((State)recomposer0._state.getValue()).compareTo(State.ShuttingDown) > 0) {
                        if(cancellableContinuation0 != null) {
                            cancellableContinuation0.resumeWith(Unit.INSTANCE);
                        }
                        return;
                    }
                }
                throw ExceptionsKt.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", recomposer0.closeCause);
            }
        });
        this.broadcastFrameClock = broadcastFrameClock0;
        CompletableJob completableJob0 = JobKt.Job(((Job)coroutineContext0.get(Job.Key)));
        completableJob0.invokeOnCompletion(new Function1() {
            {
                Recomposer.this = recomposer0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(Throwable throwable0) {
                CancellableContinuation cancellableContinuation0;
                CancellableContinuation cancellableContinuation1;
                CancellationException cancellationException0 = ExceptionsKt.CancellationException("Recomposer effect job completed", throwable0);
                Object object0 = Recomposer.this.stateLock;
                Recomposer recomposer0 = Recomposer.this;
                synchronized(object0) {
                    Job job0 = recomposer0.runnerJob;
                    cancellableContinuation0 = null;
                    if(job0 == null) {
                        recomposer0.closeCause = cancellationException0;
                        recomposer0._state.setValue(State.ShutDown);
                    }
                    else {
                        recomposer0._state.setValue(State.ShuttingDown);
                        if(recomposer0.isClosed) {
                            cancellableContinuation1 = recomposer0.workContinuation == null ? null : recomposer0.workContinuation;
                        }
                        else {
                            job0.cancel(cancellationException0);
                            cancellableContinuation1 = null;
                        }
                        recomposer0.workContinuation = null;
                        job0.invokeOnCompletion(new Function1(throwable0) {
                            final Throwable $throwable;

                            {
                                Recomposer.this = recomposer0;
                                this.$throwable = throwable0;
                                super(1);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.invoke(((Throwable)object0));
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Throwable throwable0) {
                                Object object0 = Recomposer.this.stateLock;
                                Recomposer recomposer0 = Recomposer.this;
                                Throwable throwable1 = this.$throwable;
                                synchronized(object0) {
                                    if(throwable1 == null) {
                                        throwable1 = null;
                                    }
                                    else if(throwable0 != null) {
                                        if(!(throwable0 instanceof CancellationException) == 0) {
                                            throwable0 = null;
                                        }
                                        if(throwable0 != null) {
                                            kotlin.ExceptionsKt.addSuppressed(throwable1, throwable0);
                                        }
                                    }
                                    recomposer0.closeCause = throwable1;
                                    recomposer0._state.setValue(State.ShutDown);
                                }
                            }
                        });
                        cancellableContinuation0 = cancellableContinuation1;
                    }
                }
                if(cancellableContinuation0 != null) {
                    cancellableContinuation0.resumeWith(Unit.INSTANCE);
                }
            }
        });
        this.effectJob = completableJob0;
        this.effectCoroutineContext = coroutineContext0.plus(broadcastFrameClock0).plus(completableJob0);
        this.stateLock = new Object();
        this.knownCompositions = new ArrayList();
        this.snapshotInvalidations = new ArrayList();
        this.compositionInvalidations = new ArrayList();
        this.compositionsAwaitingApply = new ArrayList();
        this._state = StateFlowKt.MutableStateFlow(State.Inactive);
        this.recomposerInfo = new RecomposerInfoImpl(this);
    }

    public static final Object access$recompositionRunner(Recomposer recomposer0, Function3 function30, Continuation continuation0) {
        return recomposer0.recompositionRunner(function30, continuation0);
    }

    private final void applyAndCheck(MutableSnapshot mutableSnapshot0) {
        if(mutableSnapshot0.apply() instanceof Failure) {
            throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
        }
    }

    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    public final Object awaitIdle(Continuation continuation0) {
        Object object0 = FlowKt.collect(FlowKt.takeWhile(this.getState(), new Function2() {
            Object L$0;
            int label;

            {
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                androidx.compose.runtime.Recomposer.awaitIdle.2 recomposer$awaitIdle$20 = new androidx.compose.runtime.Recomposer.awaitIdle.2(continuation0);
                recomposer$awaitIdle$20.L$0 = object0;
                return recomposer$awaitIdle$20;
            }

            public final Object invoke(State recomposer$State0, Continuation continuation0) {
                return ((androidx.compose.runtime.Recomposer.awaitIdle.2)this.create(recomposer$State0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((State)object0), ((Continuation)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                ResultKt.throwOnFailure(object0);
                return ((State)this.L$0).compareTo(State.Idle) <= 0 ? Boxing.boxBoolean(false) : Boxing.boxBoolean(true);
            }
        }), continuation0);
        return object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    private final Object awaitWorkAvailable(Continuation continuation0) {
        if(!this.getHasSchedulingWork()) {
            CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation0), 1);
            cancellableContinuationImpl0.initCancellability();
            Object object0 = this.stateLock;
            synchronized(object0) {
                if(this.getHasSchedulingWork()) {
                    cancellableContinuationImpl0.resumeWith(Unit.INSTANCE);
                }
                else {
                    this.workContinuation = cancellableContinuationImpl0;
                }
            }
            Object object1 = cancellableContinuationImpl0.getResult();
            if(object1 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation0);
            }
            return object1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void cancel() {
        DefaultImpls.cancel$default(this.effectJob, null, 1, null);
    }

    public final void close() {
        if(this.effectJob.complete()) {
            synchronized(this.stateLock) {
                this.isClosed = true;
            }
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void composeInitial$runtime_release(ControlledComposition controlledComposition0, Function2 function20) {
        Intrinsics.checkNotNullParameter(controlledComposition0, "composition");
        Intrinsics.checkNotNullParameter(function20, "content");
        boolean z = controlledComposition0.isComposing();
        Function1 function10 = this.readObserverOf(controlledComposition0);
        Function1 function11 = this.writeObserverOf(controlledComposition0, null);
        MutableSnapshot mutableSnapshot0 = Snapshot.Companion.takeMutableSnapshot(function10, function11);
        try {
            Snapshot snapshot0 = mutableSnapshot0.makeCurrent();
            try {
                controlledComposition0.composeContent(function20);
            }
            finally {
                mutableSnapshot0.restoreCurrent(snapshot0);
            }
        }
        finally {
            this.applyAndCheck(mutableSnapshot0);
        }
        if(!z) {
            Snapshot.Companion.notifyObjectsInitialized();
        }
        controlledComposition0.applyChanges();
        synchronized(this.stateLock) {
            if(((State)this._state.getValue()).compareTo(State.ShuttingDown) > 0 && !this.knownCompositions.contains(controlledComposition0)) {
                this.knownCompositions.add(controlledComposition0);
            }
        }
        if(!z) {
            Snapshot.Companion.notifyObjectsInitialized();
        }
    }

    private final Object composing(ControlledComposition controlledComposition0, IdentityArraySet identityArraySet0, Function0 function00) {
        Function1 function10 = this.readObserverOf(controlledComposition0);
        Function1 function11 = this.writeObserverOf(controlledComposition0, identityArraySet0);
        MutableSnapshot mutableSnapshot0 = Snapshot.Companion.takeMutableSnapshot(function10, function11);
        try {
            Snapshot snapshot0 = mutableSnapshot0.makeCurrent();
            try {
                return function00.invoke();
            }
            finally {
                mutableSnapshot0.restoreCurrent(snapshot0);
            }
        }
        finally {
            this.applyAndCheck(mutableSnapshot0);
        }
    }

    private final CancellableContinuation deriveStateLocked() {
        State recomposer$State0;
        if(((State)this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
            this.knownCompositions.clear();
            this.snapshotInvalidations.clear();
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            CancellableContinuation cancellableContinuation0 = this.workContinuation;
            if(cancellableContinuation0 != null) {
                kotlinx.coroutines.CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation0, null, 1, null);
            }
            this.workContinuation = null;
            return null;
        }
        if(this.runnerJob == null) {
            this.snapshotInvalidations.clear();
            this.compositionInvalidations.clear();
            recomposer$State0 = this.broadcastFrameClock.getHasAwaiters() ? State.InactivePendingWork : State.Inactive;
        }
        else {
            recomposer$State0 = !this.compositionInvalidations.isEmpty() != 0 || !this.snapshotInvalidations.isEmpty() != 0 || !this.compositionsAwaitingApply.isEmpty() != 0 || this.concurrentCompositionsOutstanding > 0 || this.broadcastFrameClock.getHasAwaiters() ? State.PendingWork : State.Idle;
        }
        this._state.setValue(recomposer$State0);
        if(recomposer$State0 == State.PendingWork) {
            CancellableContinuation cancellableContinuation1 = this.workContinuation;
            this.workContinuation = null;
            return cancellableContinuation1;
        }
        return null;
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public CoroutineContext getEffectCoroutineContext$runtime_release() {
        return this.effectCoroutineContext;
    }

    private final boolean getHasConcurrentFrameWorkLocked() {
        return !this.compositionsAwaitingApply.isEmpty() != 0 || this.broadcastFrameClock.getHasAwaiters();
    }

    private final boolean getHasFrameWorkLocked() {
        return !this.compositionInvalidations.isEmpty() != 0 || this.broadcastFrameClock.getHasAwaiters();
    }

    public final boolean getHasPendingWork() {
        boolean z = true;
        synchronized(this.stateLock) {
            if(!this.snapshotInvalidations.isEmpty() == 0 && !this.compositionInvalidations.isEmpty() == 0 && this.concurrentCompositionsOutstanding <= 0 && !this.compositionsAwaitingApply.isEmpty() == 0 && !this.broadcastFrameClock.getHasAwaiters()) {
                z = false;
            }
            return z;
        }
    }

    private final boolean getHasSchedulingWork() {
        boolean z = true;
        synchronized(this.stateLock) {
            if(!this.snapshotInvalidations.isEmpty() == 0 && !this.compositionInvalidations.isEmpty() == 0 && !this.broadcastFrameClock.getHasAwaiters()) {
                z = false;
            }
            return z;
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
        return EmptyCoroutineContext.INSTANCE;
    }

    private final boolean getShouldKeepRecomposing() {
        synchronized(this.stateLock) {
        }
        if(!this.isClosed == 0) {
            for(Object object0: this.effectJob.getChildren()) {
                if(((Job)object0).isActive()) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public final Flow getState() {
        return this._state;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(ControlledComposition controlledComposition0) {
        CancellableContinuation cancellableContinuation0;
        Intrinsics.checkNotNullParameter(controlledComposition0, "composition");
        synchronized(this.stateLock) {
            if(this.compositionInvalidations.contains(controlledComposition0)) {
                cancellableContinuation0 = null;
            }
            else {
                this.compositionInvalidations.add(controlledComposition0);
                cancellableContinuation0 = this.deriveStateLocked();
            }
        }
        if(cancellableContinuation0 != null) {
            cancellableContinuation0.resumeWith(Unit.INSTANCE);
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(RecomposeScopeImpl recomposeScopeImpl0) {
        CancellableContinuation cancellableContinuation0;
        Intrinsics.checkNotNullParameter(recomposeScopeImpl0, "scope");
        synchronized(this.stateLock) {
            Set set0 = SetsKt.setOf(recomposeScopeImpl0);
            this.snapshotInvalidations.add(set0);
            cancellableContinuation0 = this.deriveStateLocked();
        }
        if(cancellableContinuation0 != null) {
            cancellableContinuation0.resumeWith(Unit.INSTANCE);
        }
    }

    public final Object join(Continuation continuation0) {
        Object object0 = FlowKt.first(this.getState(), new Function2() {
            Object L$0;
            int label;

            {
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                androidx.compose.runtime.Recomposer.join.2 recomposer$join$20 = new androidx.compose.runtime.Recomposer.join.2(continuation0);
                recomposer$join$20.L$0 = object0;
                return recomposer$join$20;
            }

            public final Object invoke(State recomposer$State0, Continuation continuation0) {
                return ((androidx.compose.runtime.Recomposer.join.2)this.create(recomposer$State0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((State)object0), ((Continuation)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                ResultKt.throwOnFailure(object0);
                return ((State)this.L$0) == State.ShutDown ? Boxing.boxBoolean(true) : Boxing.boxBoolean(false);
            }
        }, continuation0);
        return object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    private final ControlledComposition performRecompose(ControlledComposition controlledComposition0, IdentityArraySet identityArraySet0) {
        boolean z;
        if(!controlledComposition0.isComposing() && !controlledComposition0.isDisposed()) {
            Function1 function10 = this.readObserverOf(controlledComposition0);
            Function1 function11 = this.writeObserverOf(controlledComposition0, identityArraySet0);
            MutableSnapshot mutableSnapshot0 = Snapshot.Companion.takeMutableSnapshot(function10, function11);
            try {
                Snapshot snapshot0 = mutableSnapshot0.makeCurrent();
                try {
                    if(identityArraySet0 != null && identityArraySet0.isNotEmpty()) {
                        controlledComposition0.prepareCompose(new Function0(controlledComposition0) {
                            final ControlledComposition $composition;
                            final IdentityArraySet $modifiedValues;

                            {
                                this.$modifiedValues = identityArraySet0;
                                this.$composition = controlledComposition0;
                                super(0);
                            }

                            @Override  // kotlin.jvm.functions.Function0
                            public Object invoke() {
                                this.invoke();
                                return Unit.INSTANCE;
                            }

                            public final void invoke() {
                                ControlledComposition controlledComposition0 = this.$composition;
                                for(Object object0: this.$modifiedValues) {
                                    controlledComposition0.recordWriteOf(object0);
                                }
                            }
                        });
                    }
                    z = controlledComposition0.recompose();
                }
                catch(Throwable throwable0) {
                    mutableSnapshot0.restoreCurrent(snapshot0);
                    throw throwable0;
                }
                mutableSnapshot0.restoreCurrent(snapshot0);
                return z ? controlledComposition0 : null;
            }
            finally {
                this.applyAndCheck(mutableSnapshot0);
            }
        }
        return null;
    }

    private final Function1 readObserverOf(ControlledComposition controlledComposition0) {
        return new Function1() {
            final ControlledComposition $composition;

            {
                this.$composition = controlledComposition0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(object0);
                return Unit.INSTANCE;
            }

            public final void invoke(Object object0) {
                Intrinsics.checkNotNullParameter(object0, "value");
                this.$composition.recordReadOf(object0);
            }
        };
    }

    private final Object recompositionRunner(Function3 function30, Continuation continuation0) {
        androidx.compose.runtime.Recomposer.recompositionRunner.2 recomposer$recompositionRunner$20 = new Function2(function30, MonotonicFrameClockKt.getMonotonicFrameClock(continuation0.getContext()), null) {
            final Function3 $block;
            final MonotonicFrameClock $parentFrameClock;
            private Object L$0;
            Object L$1;
            int label;

            {
                Recomposer.this = recomposer0;
                this.$block = function30;
                this.$parentFrameClock = monotonicFrameClock0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                androidx.compose.runtime.Recomposer.recompositionRunner.2 recomposer$recompositionRunner$20 = new androidx.compose.runtime.Recomposer.recompositionRunner.2(Recomposer.this, this.$block, this.$parentFrameClock, continuation0);
                recomposer$recompositionRunner$20.L$0 = object0;
                return recomposer$recompositionRunner$20;
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                return ((androidx.compose.runtime.Recomposer.recompositionRunner.2)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                Throwable throwable1;
                ObserverHandle observerHandle1;
                Job job0;
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        job0 = JobKt.getJob(((CoroutineScope)this.L$0).getCoroutineContext());
                        Recomposer.this.registerRunnerJob(job0);
                        androidx.compose.runtime.Recomposer.recompositionRunner.2.unregisterApplyObserver.1 recomposer$recompositionRunner$2$unregisterApplyObserver$10 = new Function2() {
                            {
                                Recomposer.this = recomposer0;
                                super(2);
                            }

                            @Override  // kotlin.jvm.functions.Function2
                            public Object invoke(Object object0, Object object1) {
                                this.invoke(((Set)object0), ((Snapshot)object1));
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Set set0, Snapshot snapshot0) {
                                CancellableContinuation cancellableContinuation0;
                                Intrinsics.checkNotNullParameter(set0, "changed");
                                Intrinsics.checkNotNullParameter(snapshot0, "$noName_1");
                                Object object0 = Recomposer.this.stateLock;
                                Recomposer recomposer0 = Recomposer.this;
                                synchronized(object0) {
                                    if(((State)recomposer0._state.getValue()).compareTo(State.Idle) >= 0) {
                                        recomposer0.snapshotInvalidations.add(set0);
                                        cancellableContinuation0 = recomposer0.deriveStateLocked();
                                    }
                                    else {
                                        cancellableContinuation0 = null;
                                    }
                                }
                                if(cancellableContinuation0 != null) {
                                    cancellableContinuation0.resumeWith(Unit.INSTANCE);
                                }
                            }
                        };
                        ObserverHandle observerHandle0 = Snapshot.Companion.registerApplyObserver(recomposer$recompositionRunner$2$unregisterApplyObserver$10);
                        Recomposer.Companion.addRunning(Recomposer.this.recomposerInfo);
                        try {
                            synchronized(Recomposer.this.stateLock) {
                                List list0 = Recomposer.this.knownCompositions;
                                int v1 = list0.size();
                                if(v1 - 1 >= 0) {
                                    for(int v2 = 0; true; ++v2) {
                                        ((ControlledComposition)list0.get(v2)).invalidateAll();
                                        if(v2 + 1 > v1 - 1) {
                                            break;
                                        }
                                    }
                                }
                            }
                            androidx.compose.runtime.Recomposer.recompositionRunner.2.2 recomposer$recompositionRunner$2$20 = new Function2(this.$parentFrameClock, null) {
                                final Function3 $block;
                                final MonotonicFrameClock $parentFrameClock;
                                private Object L$0;
                                int label;

                                {
                                    this.$block = function30;
                                    this.$parentFrameClock = monotonicFrameClock0;
                                    super(2, continuation0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation create(Object object0, Continuation continuation0) {
                                    androidx.compose.runtime.Recomposer.recompositionRunner.2.2 recomposer$recompositionRunner$2$20 = new androidx.compose.runtime.Recomposer.recompositionRunner.2.2(this.$block, this.$parentFrameClock, continuation0);
                                    recomposer$recompositionRunner$2$20.L$0 = object0;
                                    return recomposer$recompositionRunner$2$20;
                                }

                                @Override  // kotlin.jvm.functions.Function2
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                                }

                                public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                                    return ((androidx.compose.runtime.Recomposer.recompositionRunner.2.2)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object object0) {
                                    Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    switch(this.label) {
                                        case 0: {
                                            ResultKt.throwOnFailure(object0);
                                            this.label = 1;
                                            return this.$block.invoke(((CoroutineScope)this.L$0), this.$parentFrameClock, this) == object1 ? object1 : Unit.INSTANCE;
                                        }
                                        case 1: {
                                            ResultKt.throwOnFailure(object0);
                                            return Unit.INSTANCE;
                                        }
                                        default: {
                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                        }
                                    }
                                }
                            };
                            this.L$0 = job0;
                            this.L$1 = observerHandle0;
                            this.label = 1;
                            if(CoroutineScopeKt.coroutineScope(recomposer$recompositionRunner$2$20, this) == object1) {
                                return object1;
                            }
                        }
                        catch(Throwable throwable0) {
                            observerHandle1 = observerHandle0;
                            throwable1 = throwable0;
                            goto label_41;
                        }
                        observerHandle1 = observerHandle0;
                        break;
                    }
                    case 1: {
                        observerHandle1 = (ObserverHandle)this.L$1;
                        job0 = (Job)this.L$0;
                        try {
                            ResultKt.throwOnFailure(object0);
                            break;
                        }
                        catch(Throwable throwable1) {
                        }
                    label_41:
                        observerHandle1.dispose();
                        Object object3 = Recomposer.this.stateLock;
                        Recomposer recomposer0 = Recomposer.this;
                        synchronized(object3) {
                            if(recomposer0.runnerJob == job0) {
                                recomposer0.runnerJob = null;
                            }
                            recomposer0.deriveStateLocked();
                        }
                        Recomposer.Companion.removeRunning(Recomposer.this.recomposerInfo);
                        throw throwable1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                observerHandle1.dispose();
                Object object4 = Recomposer.this.stateLock;
                Recomposer recomposer1 = Recomposer.this;
                synchronized(object4) {
                    if(recomposer1.runnerJob == job0) {
                        recomposer1.runnerJob = null;
                    }
                    recomposer1.deriveStateLocked();
                }
                Recomposer.Companion.removeRunning(Recomposer.this.recomposerInfo);
                return Unit.INSTANCE;
            }
        };
        Object object0 = BuildersKt.withContext(this.broadcastFrameClock, recomposer$recompositionRunner$20, continuation0);
        return object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    private final void recordComposerModificationsLocked() {
        if(!this.snapshotInvalidations.isEmpty() != 0) {
            List list0 = this.snapshotInvalidations;
            int v = list0.size();
            if(v - 1 >= 0) {
                for(int v1 = 0; true; ++v1) {
                    Set set0 = (Set)list0.get(v1);
                    List list1 = this.knownCompositions;
                    int v2 = list1.size() - 1;
                    if(v2 >= 0) {
                        for(int v3 = 0; true; ++v3) {
                            ((ControlledComposition)list1.get(v3)).recordModificationsOf(set0);
                            if(v3 + 1 > v2) {
                                break;
                            }
                        }
                    }
                    if(v1 + 1 > v - 1) {
                        break;
                    }
                }
            }
            this.snapshotInvalidations.clear();
            if(this.deriveStateLocked() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
            }
        }
    }

    private final void recordComposerModificationsLocked(Function1 function10) {
        if(!this.snapshotInvalidations.isEmpty() != 0) {
            List list0 = this.snapshotInvalidations;
            int v1 = list0.size();
            if(v1 - 1 >= 0) {
                for(int v2 = 0; true; ++v2) {
                    Set set0 = (Set)list0.get(v2);
                    List list1 = this.knownCompositions;
                    int v3 = list1.size() - 1;
                    if(v3 >= 0) {
                        for(int v4 = 0; true; ++v4) {
                            ((ControlledComposition)list1.get(v4)).recordModificationsOf(set0);
                            if(v4 + 1 > v3) {
                                break;
                            }
                        }
                    }
                    if(v2 + 1 > v1 - 1) {
                        break;
                    }
                }
            }
            this.snapshotInvalidations.clear();
        }
        List list2 = this.compositionInvalidations;
        int v5 = list2.size();
        if(v5 - 1 >= 0) {
            for(int v = 0; true; ++v) {
                function10.invoke(list2.get(v));
                if(v + 1 > v5 - 1) {
                    break;
                }
            }
        }
        this.compositionInvalidations.clear();
        if(this.deriveStateLocked() != null) {
            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(Set set0) {
        Intrinsics.checkNotNullParameter(set0, "table");
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(ControlledComposition controlledComposition0) {
        Intrinsics.checkNotNullParameter(controlledComposition0, "composition");
    }

    private final void registerRunnerJob(Job job0) {
        Throwable throwable0;
        synchronized(this.stateLock) {
            throwable0 = this.closeCause;
            if(throwable0 == null) {
                if(((State)this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if(this.runnerJob != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                this.runnerJob = job0;
                this.deriveStateLocked();
                return;
            }
        }
        throw throwable0;
    }

    private final Object runFrameLoop(MonotonicFrameClock monotonicFrameClock0, ProduceFrameSignal produceFrameSignal0, Continuation continuation0) {
        Recomposer recomposer1;
        MonotonicFrameClock monotonicFrameClock1;
        ProduceFrameSignal produceFrameSignal1;
        List list3;
        List list2;
        Recomposer recomposer0;
        List list1;
        List list0;
        androidx.compose.runtime.Recomposer.runFrameLoop.1 recomposer$runFrameLoop$10;
        if(continuation0 instanceof androidx.compose.runtime.Recomposer.runFrameLoop.1) {
            recomposer$runFrameLoop$10 = (androidx.compose.runtime.Recomposer.runFrameLoop.1)continuation0;
            if((recomposer$runFrameLoop$10.label & 0x80000000) == 0) {
                recomposer$runFrameLoop$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return continuation0.runFrameLoop(null, null, this);
                    }
                };
            }
            else {
                recomposer$runFrameLoop$10.label ^= 0x80000000;
            }
        }
        else {
            recomposer$runFrameLoop$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return continuation0.runFrameLoop(null, null, this);
                }
            };
        }
        Object object0 = recomposer$runFrameLoop$10.result;
        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(recomposer$runFrameLoop$10.label) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                list0 = new ArrayList();
                list1 = new ArrayList();
                recomposer0 = this;
                goto label_35;
            }
            case 1: {
                list2 = (List)recomposer$runFrameLoop$10.L$4;
                list3 = (List)recomposer$runFrameLoop$10.L$3;
                produceFrameSignal1 = (ProduceFrameSignal)recomposer$runFrameLoop$10.L$2;
                monotonicFrameClock1 = (MonotonicFrameClock)recomposer$runFrameLoop$10.L$1;
                recomposer1 = (Recomposer)recomposer$runFrameLoop$10.L$0;
                ResultKt.throwOnFailure(object0);
                goto label_48;
            }
            case 2: {
                list2 = (List)recomposer$runFrameLoop$10.L$4;
                list3 = (List)recomposer$runFrameLoop$10.L$3;
                produceFrameSignal1 = (ProduceFrameSignal)recomposer$runFrameLoop$10.L$2;
                monotonicFrameClock1 = (MonotonicFrameClock)recomposer$runFrameLoop$10.L$1;
                recomposer1 = (Recomposer)recomposer$runFrameLoop$10.L$0;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            list0 = list3;
            produceFrameSignal0 = produceFrameSignal1;
            list1 = list2;
            monotonicFrameClock0 = monotonicFrameClock1;
            recomposer0 = recomposer1;
        label_35:
            recomposer$runFrameLoop$10.L$0 = recomposer0;
            recomposer$runFrameLoop$10.L$1 = monotonicFrameClock0;
            recomposer$runFrameLoop$10.L$2 = produceFrameSignal0;
            recomposer$runFrameLoop$10.L$3 = list0;
            recomposer$runFrameLoop$10.L$4 = list1;
            recomposer$runFrameLoop$10.label = 1;
            if(produceFrameSignal0.awaitFrameRequest(recomposer0.stateLock, recomposer$runFrameLoop$10) == object1) {
                return object1;
            }
            recomposer1 = recomposer0;
            monotonicFrameClock1 = monotonicFrameClock0;
            list2 = list1;
            produceFrameSignal1 = produceFrameSignal0;
            list3 = list0;
        label_48:
            Function1 function10 = new Function1(list3, list2, produceFrameSignal1) {
                final ProduceFrameSignal $frameSignal;
                final List $toApply;
                final List $toRecompose;

                {
                    Recomposer.this = recomposer0;
                    this.$toRecompose = list0;
                    this.$toApply = list1;
                    this.$frameSignal = produceFrameSignal0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.invoke(((Number)object0).longValue());
                }

                public final CancellableContinuation invoke(long v) {
                    if(Recomposer.this.broadcastFrameClock.getHasAwaiters()) {
                        Object object0 = Trace.INSTANCE.beginSection("Recomposer:animation");
                        try {
                            Recomposer.this.broadcastFrameClock.sendFrame(v);
                            Snapshot.Companion.sendApplyNotifications();
                        }
                        finally {
                            Trace.INSTANCE.endSection(object0);
                        }
                    }
                    Recomposer recomposer0 = Recomposer.this;
                    List list0 = this.$toRecompose;
                    List list1 = this.$toApply;
                    ProduceFrameSignal produceFrameSignal0 = this.$frameSignal;
                    Object object1 = Trace.INSTANCE.beginSection("Recomposer:recompose");
                    try {
                        synchronized(recomposer0.stateLock) {
                            recomposer0.recordComposerModificationsLocked();
                            List list2 = recomposer0.compositionsAwaitingApply;
                            int v4 = list2.size();
                            if(v4 - 1 >= 0) {
                                for(int v6 = 0; true; ++v6) {
                                    list1.add(((ControlledComposition)list2.get(v6)));
                                    if(v6 + 1 > v4 - 1) {
                                        break;
                                    }
                                }
                            }
                            recomposer0.compositionsAwaitingApply.clear();
                            List list3 = recomposer0.compositionInvalidations;
                            int v7 = list3.size();
                            if(v7 - 1 >= 0) {
                                for(int v8 = 0; true; ++v8) {
                                    list0.add(((ControlledComposition)list3.get(v8)));
                                    if(v8 + 1 > v7 - 1) {
                                        break;
                                    }
                                }
                            }
                            recomposer0.compositionInvalidations.clear();
                            produceFrameSignal0.takeFrameRequestLocked();
                        }
                        IdentityArraySet identityArraySet0 = new IdentityArraySet();
                        try {
                            int v10 = list0.size();
                            if(v10 - 1 >= 0) {
                                for(int v11 = 0; true; ++v11) {
                                    ControlledComposition controlledComposition0 = recomposer0.performRecompose(((ControlledComposition)list0.get(v11)), identityArraySet0);
                                    if(controlledComposition0 != null) {
                                        list1.add(controlledComposition0);
                                    }
                                    if(v11 + 1 > v10 - 1) {
                                        break;
                                    }
                                }
                            }
                        }
                        finally {
                            list0.clear();
                        }
                        if(!list1.isEmpty() != 0) {
                            recomposer0.changeCount = recomposer0.getChangeCount() + 1L;
                        }
                        try {
                            int v13 = list1.size();
                            if(v13 - 1 >= 0) {
                                for(int v5 = 0; true; ++v5) {
                                    ((ControlledComposition)list1.get(v5)).applyChanges();
                                    if(v5 + 1 > v13 - 1) {
                                        break;
                                    }
                                }
                            }
                        }
                        finally {
                            list1.clear();
                        }
                        synchronized(recomposer0.stateLock) {
                            return recomposer0.deriveStateLocked();
                        }
                    }
                    finally {
                        Trace.INSTANCE.endSection(object1);
                    }
                }
            };
            recomposer$runFrameLoop$10.L$0 = recomposer1;
            recomposer$runFrameLoop$10.L$1 = monotonicFrameClock1;
            recomposer$runFrameLoop$10.L$2 = produceFrameSignal1;
            recomposer$runFrameLoop$10.L$3 = list3;
            recomposer$runFrameLoop$10.L$4 = list2;
            recomposer$runFrameLoop$10.label = 2;
        }
        while(monotonicFrameClock1.withFrameNanos(function10, recomposer$runFrameLoop$10) != object1);
        return object1;
    }

    public final Object runRecomposeAndApplyChanges(Continuation continuation0) {
        Object object0 = this.recompositionRunner(new Function3(null) {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;

            {
                Recomposer.this = recomposer0;
                super(3, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((CoroutineScope)object0), ((MonotonicFrameClock)object1), ((Continuation)object2));
            }

            public final Object invoke(CoroutineScope coroutineScope0, MonotonicFrameClock monotonicFrameClock0, Continuation continuation0) {
                androidx.compose.runtime.Recomposer.runRecomposeAndApplyChanges.2 recomposer$runRecomposeAndApplyChanges$20 = new androidx.compose.runtime.Recomposer.runRecomposeAndApplyChanges.2(Recomposer.this, continuation0);
                recomposer$runRecomposeAndApplyChanges$20.L$0 = monotonicFrameClock0;
                return recomposer$runRecomposeAndApplyChanges$20.invokeSuspend(Unit.INSTANCE);
            }

            // This method was un-flattened
            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                List list1;
                List list0;
                MonotonicFrameClock monotonicFrameClock0;
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        monotonicFrameClock0 = (MonotonicFrameClock)this.L$0;
                        list0 = new ArrayList();
                        list1 = new ArrayList();
                        break;
                    }
                    case 1: {
                        List list2 = (List)this.L$2;
                        List list3 = (List)this.L$1;
                        MonotonicFrameClock monotonicFrameClock1 = (MonotonicFrameClock)this.L$0;
                        ResultKt.throwOnFailure(object0);
                        monotonicFrameClock0 = monotonicFrameClock1;
                        list1 = list2;
                        list0 = list3;
                        goto label_30;
                    }
                    case 2: {
                        List list4 = (List)this.L$2;
                        List list5 = (List)this.L$1;
                        MonotonicFrameClock monotonicFrameClock2 = (MonotonicFrameClock)this.L$0;
                        ResultKt.throwOnFailure(object0);
                        monotonicFrameClock0 = monotonicFrameClock2;
                        list1 = list4;
                        list0 = list5;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(Recomposer.this.getShouldKeepRecomposing()) {
                    this.L$0 = monotonicFrameClock0;
                    this.L$1 = list0;
                    this.L$2 = list1;
                    this.label = 1;
                    if(Recomposer.this.awaitWorkAvailable(this) == object1) {
                        return object1;
                    }
                label_30:
                    Object object2 = Recomposer.this.stateLock;
                    Recomposer recomposer0 = Recomposer.this;
                    synchronized(object2) {
                        if(!recomposer0.getHasFrameWorkLocked()) {
                            recomposer0.recordComposerModificationsLocked();
                            if(!recomposer0.getHasFrameWorkLocked()) {
                                continue;
                            }
                        }
                    }
                    androidx.compose.runtime.Recomposer.runRecomposeAndApplyChanges.2.2 recomposer$runRecomposeAndApplyChanges$2$20 = new Function1(list0, list1) {
                        final List $toApply;
                        final List $toRecompose;

                        {
                            Recomposer.this = recomposer0;
                            this.$toRecompose = list0;
                            this.$toApply = list1;
                            super(1);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.invoke(((Number)object0).longValue());
                        }

                        public final CancellableContinuation invoke(long v) {
                            if(Recomposer.this.broadcastFrameClock.getHasAwaiters()) {
                                Object object0 = Trace.INSTANCE.beginSection("Recomposer:animation");
                                try {
                                    Recomposer.this.broadcastFrameClock.sendFrame(v);
                                    Snapshot.Companion.sendApplyNotifications();
                                }
                                finally {
                                    Trace.INSTANCE.endSection(object0);
                                }
                            }
                            Recomposer recomposer0 = Recomposer.this;
                            List list0 = this.$toRecompose;
                            List list1 = this.$toApply;
                            Object object1 = Trace.INSTANCE.beginSection("Recomposer:recompose");
                            try {
                                synchronized(recomposer0.stateLock) {
                                    recomposer0.recordComposerModificationsLocked();
                                    List list2 = recomposer0.compositionInvalidations;
                                    int v4 = list2.size();
                                    if(v4 - 1 >= 0) {
                                        for(int v6 = 0; true; ++v6) {
                                            list0.add(((ControlledComposition)list2.get(v6)));
                                            if(v6 + 1 > v4 - 1) {
                                                break;
                                            }
                                        }
                                    }
                                    recomposer0.compositionInvalidations.clear();
                                }
                                IdentityArraySet identityArraySet0 = new IdentityArraySet();
                                IdentityArraySet identityArraySet1 = new IdentityArraySet();
                                while(!list0.isEmpty() != 0) {
                                    try {
                                        int v8 = list0.size() - 1;
                                        if(v8 >= 0) {
                                            for(int v9 = 0; true; ++v9) {
                                                ControlledComposition controlledComposition0 = (ControlledComposition)list0.get(v9);
                                                identityArraySet1.add(controlledComposition0);
                                                ControlledComposition controlledComposition1 = recomposer0.performRecompose(controlledComposition0, identityArraySet0);
                                                if(controlledComposition1 != null) {
                                                    list1.add(controlledComposition1);
                                                }
                                                if(v9 + 1 > v8) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    finally {
                                        list0.clear();
                                    }
                                    if(identityArraySet0.isNotEmpty()) {
                                        synchronized(recomposer0.stateLock) {
                                            List list3 = recomposer0.knownCompositions;
                                            int v11 = list3.size() - 1;
                                            if(v11 >= 0) {
                                                for(int v12 = 0; true; ++v12) {
                                                    ControlledComposition controlledComposition2 = (ControlledComposition)list3.get(v12);
                                                    if(!identityArraySet1.contains(controlledComposition2) && controlledComposition2.observesAnyOf(identityArraySet0)) {
                                                        list0.add(controlledComposition2);
                                                    }
                                                    if(v12 + 1 > v11) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if(!list1.isEmpty() != 0) {
                                    recomposer0.changeCount = recomposer0.getChangeCount() + 1L;
                                    try {
                                        int v14 = list1.size();
                                        if(v14 - 1 >= 0) {
                                            for(int v5 = 0; true; ++v5) {
                                                ((ControlledComposition)list1.get(v5)).applyChanges();
                                                if(v5 + 1 > v14 - 1) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    finally {
                                        list1.clear();
                                    }
                                }
                                synchronized(recomposer0.stateLock) {
                                    return recomposer0.deriveStateLocked();
                                }
                            }
                            finally {
                                Trace.INSTANCE.endSection(object1);
                            }
                        }
                    };
                    this.L$0 = monotonicFrameClock0;
                    this.L$1 = list0;
                    this.L$2 = list1;
                    this.label = 2;
                    if(monotonicFrameClock0.withFrameNanos(recomposer$runRecomposeAndApplyChanges$2$20, this) != object1) {
                        continue;
                    }
                    return object1;
                }
                return Unit.INSTANCE;
            }
        }, continuation0);
        return object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @ExperimentalComposeApi
    public final Object runRecomposeConcurrentlyAndApplyChanges(CoroutineContext coroutineContext0, Continuation continuation0) {
        Object object0 = this.recompositionRunner(new Function3(this, null) {
            final CoroutineContext $recomposeCoroutineContext;
            private Object L$0;
            Object L$1;
            Object L$2;
            int label;

            {
                this.$recomposeCoroutineContext = coroutineContext0;
                Recomposer.this = recomposer0;
                super(3, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((CoroutineScope)object0), ((MonotonicFrameClock)object1), ((Continuation)object2));
            }

            public final Object invoke(CoroutineScope coroutineScope0, MonotonicFrameClock monotonicFrameClock0, Continuation continuation0) {
                androidx.compose.runtime.Recomposer.runRecomposeConcurrentlyAndApplyChanges.2 recomposer$runRecomposeConcurrentlyAndApplyChanges$20 = new androidx.compose.runtime.Recomposer.runRecomposeConcurrentlyAndApplyChanges.2(this.$recomposeCoroutineContext, Recomposer.this, continuation0);
                recomposer$runRecomposeConcurrentlyAndApplyChanges$20.L$0 = coroutineScope0;
                recomposer$runRecomposeConcurrentlyAndApplyChanges$20.L$1 = monotonicFrameClock0;
                return recomposer$runRecomposeConcurrentlyAndApplyChanges$20.invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                Continuation continuation0;
                androidx.compose.runtime.Recomposer.runRecomposeConcurrentlyAndApplyChanges.2 recomposer$runRecomposeConcurrentlyAndApplyChanges$22;
                Recomposer recomposer1;
                int v;
                ProduceFrameSignal produceFrameSignal1;
                CoroutineScope coroutineScope2;
                androidx.compose.runtime.Recomposer.runRecomposeConcurrentlyAndApplyChanges.2 recomposer$runRecomposeConcurrentlyAndApplyChanges$20;
                Job job0;
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        CoroutineScope coroutineScope0 = (CoroutineScope)this.L$0;
                        MonotonicFrameClock monotonicFrameClock0 = (MonotonicFrameClock)this.L$1;
                        boolean z = this.$recomposeCoroutineContext.get(Job.Key) == null;
                        CoroutineContext coroutineContext0 = this.$recomposeCoroutineContext;
                        if(!z) {
                            throw new IllegalArgumentException(Intrinsics.stringPlus("recomposeCoroutineContext may not contain a Job; found ", coroutineContext0.get(Job.Key)).toString());
                        }
                        CoroutineScope coroutineScope1 = CoroutineScopeKt.CoroutineScope(coroutineScope0.getCoroutineContext().plus(this.$recomposeCoroutineContext).plus(JobKt.Job(JobKt.getJob(coroutineScope0.getCoroutineContext()))));
                        ProduceFrameSignal produceFrameSignal0 = new ProduceFrameSignal();
                        job0 = BuildersKt__Builders_commonKt.launch$default(coroutineScope0, null, null, new Function2(monotonicFrameClock0, produceFrameSignal0, null) {
                            final ProduceFrameSignal $frameSignal;
                            final MonotonicFrameClock $parentFrameClock;
                            int label;

                            {
                                Recomposer.this = recomposer0;
                                this.$parentFrameClock = monotonicFrameClock0;
                                this.$frameSignal = produceFrameSignal0;
                                super(2, continuation0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation create(Object object0, Continuation continuation0) {
                                return new androidx.compose.runtime.Recomposer.runRecomposeConcurrentlyAndApplyChanges.2.frameLoop.1(Recomposer.this, this.$parentFrameClock, this.$frameSignal, continuation0);
                            }

                            @Override  // kotlin.jvm.functions.Function2
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                            }

                            public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                                return ((androidx.compose.runtime.Recomposer.runRecomposeConcurrentlyAndApplyChanges.2.frameLoop.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object object0) {
                                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                switch(this.label) {
                                    case 0: {
                                        ResultKt.throwOnFailure(object0);
                                        this.label = 1;
                                        return Recomposer.this.runFrameLoop(this.$parentFrameClock, this.$frameSignal, this) == object1 ? object1 : Unit.INSTANCE;
                                    }
                                    case 1: {
                                        ResultKt.throwOnFailure(object0);
                                        return Unit.INSTANCE;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                            }
                        }, 3, null);
                        recomposer$runRecomposeConcurrentlyAndApplyChanges$20 = this;
                        coroutineScope2 = coroutineScope1;
                        produceFrameSignal1 = produceFrameSignal0;
                        goto label_73;
                    }
                    case 1: {
                        job0 = (Job)this.L$2;
                        produceFrameSignal1 = (ProduceFrameSignal)this.L$1;
                        CoroutineScope coroutineScope3 = (CoroutineScope)this.L$0;
                        ResultKt.throwOnFailure(object0);
                        androidx.compose.runtime.Recomposer.runRecomposeConcurrentlyAndApplyChanges.2 recomposer$runRecomposeConcurrentlyAndApplyChanges$21 = this;
                        CoroutineScope coroutineScope4 = coroutineScope3;
                        while(true) {
                            Object object2 = Recomposer.this.stateLock;
                            Recomposer recomposer0 = Recomposer.this;
                            synchronized(object2) {
                                v = FIN.finallyOpen$NT();
                                if(!recomposer0.snapshotInvalidations.isEmpty() != 0) {
                                    List list0 = recomposer0.snapshotInvalidations;
                                    int v1 = list0.size() - 1;
                                    if(v1 >= 0) {
                                        for(int v2 = 0; true; ++v2) {
                                            Set set0 = (Set)list0.get(v2);
                                            List list1 = recomposer0.knownCompositions;
                                            int v3 = list1.size() - 1;
                                            if(v3 >= 0) {
                                                for(int v4 = 0; true; ++v4) {
                                                    ((ControlledComposition)list1.get(v4)).recordModificationsOf(set0);
                                                    if(v4 + 1 > v3) {
                                                        break;
                                                    }
                                                }
                                            }
                                            if(v2 + 1 > v1) {
                                                break;
                                            }
                                        }
                                    }
                                    recomposer0.snapshotInvalidations.clear();
                                }
                                List list2 = recomposer0.compositionInvalidations;
                                int v5 = list2.size() - 1;
                                if(v5 >= 0) {
                                    int v6 = 0;
                                    while(true) {
                                        ControlledComposition controlledComposition0 = (ControlledComposition)list2.get(v6);
                                        ++recomposer0.concurrentCompositionsOutstanding;
                                        recomposer1 = recomposer0;
                                        recomposer$runRecomposeConcurrentlyAndApplyChanges$22 = recomposer$runRecomposeConcurrentlyAndApplyChanges$21;
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope4, CompositionKt.getRecomposeCoroutineContext(controlledComposition0), null, new Function2(controlledComposition0, null) {
                                            final ControlledComposition $composition;
                                            int label;

                                            {
                                                Recomposer.this = recomposer0;
                                                this.$composition = controlledComposition0;
                                                super(2, continuation0);
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation create(Object object0, Continuation continuation0) {
                                                return new androidx.compose.runtime.Recomposer.runRecomposeConcurrentlyAndApplyChanges.2.2.1.1(Recomposer.this, this.$composition, continuation0);
                                            }

                                            @Override  // kotlin.jvm.functions.Function2
                                            public Object invoke(Object object0, Object object1) {
                                                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                                            }

                                            public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                                                return ((androidx.compose.runtime.Recomposer.runRecomposeConcurrentlyAndApplyChanges.2.2.1.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object object0) {
                                                CancellableContinuation cancellableContinuation0;
                                                if(this.label != 0) {
                                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(object0);
                                                ControlledComposition controlledComposition0 = Recomposer.this.performRecompose(this.$composition, null);
                                                Object object1 = Recomposer.this.stateLock;
                                                Recomposer recomposer0 = Recomposer.this;
                                                synchronized(object1) {
                                                    if(controlledComposition0 != null) {
                                                        recomposer0.compositionsAwaitingApply.add(controlledComposition0);
                                                    }
                                                    --recomposer0.concurrentCompositionsOutstanding;
                                                    cancellableContinuation0 = recomposer0.deriveStateLocked();
                                                }
                                                if(cancellableContinuation0 != null) {
                                                    cancellableContinuation0.resumeWith(Unit.INSTANCE);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, 2, null);
                                        if(v6 + 1 > v5) {
                                            break;
                                        }
                                        recomposer$runRecomposeConcurrentlyAndApplyChanges$21 = recomposer$runRecomposeConcurrentlyAndApplyChanges$22;
                                        ++v6;
                                        recomposer0 = recomposer1;
                                    }
                                }
                                else {
                                    recomposer1 = recomposer0;
                                    recomposer$runRecomposeConcurrentlyAndApplyChanges$22 = recomposer$runRecomposeConcurrentlyAndApplyChanges$21;
                                }
                                recomposer1.compositionInvalidations.clear();
                                if(recomposer1.deriveStateLocked() != null) {
                                    goto label_90;
                                }
                                continuation0 = recomposer1.getHasConcurrentFrameWorkLocked() ? produceFrameSignal1.requestFrameLocked() : null;
                                FIN.finallyCodeBegin$NT(v);
                            }
                            FIN.finallyCodeEnd$NT(v);
                            if(continuation0 != null) {
                                continuation0.resumeWith(Unit.INSTANCE);
                            }
                            recomposer$runRecomposeConcurrentlyAndApplyChanges$20 = recomposer$runRecomposeConcurrentlyAndApplyChanges$22;
                            coroutineScope2 = coroutineScope4;
                        label_73:
                            if(!Recomposer.this.getShouldKeepRecomposing()) {
                                break;
                            }
                            recomposer$runRecomposeConcurrentlyAndApplyChanges$20.L$0 = coroutineScope2;
                            recomposer$runRecomposeConcurrentlyAndApplyChanges$20.L$1 = produceFrameSignal1;
                            recomposer$runRecomposeConcurrentlyAndApplyChanges$20.L$2 = job0;
                            recomposer$runRecomposeConcurrentlyAndApplyChanges$20.label = 1;
                            if(Recomposer.this.awaitWorkAvailable(recomposer$runRecomposeConcurrentlyAndApplyChanges$20) == object1) {
                                return object1;
                            }
                            coroutineScope4 = coroutineScope2;
                            recomposer$runRecomposeConcurrentlyAndApplyChanges$21 = recomposer$runRecomposeConcurrentlyAndApplyChanges$20;
                        }
                        Job job1 = JobKt.getJob(coroutineScope2.getCoroutineContext());
                        recomposer$runRecomposeConcurrentlyAndApplyChanges$20.L$0 = job0;
                        recomposer$runRecomposeConcurrentlyAndApplyChanges$20.L$1 = null;
                        recomposer$runRecomposeConcurrentlyAndApplyChanges$20.L$2 = null;
                        recomposer$runRecomposeConcurrentlyAndApplyChanges$20.label = 2;
                        if(JobKt.cancelAndJoin(job1, recomposer$runRecomposeConcurrentlyAndApplyChanges$20) == object1) {
                            return object1;
                        label_90:
                            FIN.finallyExec$NT(v);
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                        }
                        goto label_95;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        ResultKt.throwOnFailure(object0);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                job0 = (Job)this.L$0;
                ResultKt.throwOnFailure(object0);
                recomposer$runRecomposeConcurrentlyAndApplyChanges$20 = this;
            label_95:
                recomposer$runRecomposeConcurrentlyAndApplyChanges$20.L$0 = null;
                recomposer$runRecomposeConcurrentlyAndApplyChanges$20.label = 3;
                return JobKt.cancelAndJoin(job0, recomposer$runRecomposeConcurrentlyAndApplyChanges$20) == object1 ? object1 : Unit.INSTANCE;
            }
        }, continuation0);
        return object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(ControlledComposition controlledComposition0) {
        Intrinsics.checkNotNullParameter(controlledComposition0, "composition");
        synchronized(this.stateLock) {
            this.knownCompositions.remove(controlledComposition0);
        }
    }

    private final Function1 writeObserverOf(ControlledComposition controlledComposition0, IdentityArraySet identityArraySet0) {
        return new Function1(identityArraySet0) {
            final ControlledComposition $composition;
            final IdentityArraySet $modifiedValues;

            {
                this.$composition = controlledComposition0;
                this.$modifiedValues = identityArraySet0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(object0);
                return Unit.INSTANCE;
            }

            public final void invoke(Object object0) {
                Intrinsics.checkNotNullParameter(object0, "value");
                this.$composition.recordWriteOf(object0);
                IdentityArraySet identityArraySet0 = this.$modifiedValues;
                if(identityArraySet0 != null) {
                    identityArraySet0.add(object0);
                }
            }
        };
    }
}

