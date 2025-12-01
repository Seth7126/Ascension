package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\u00B0\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0000\n\u0002\u0010\u001C\n\u0002\b\u0002\u001A \u0010\b\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\f\u001A\u0012\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n\u001A+\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000F\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0010\"\u0002H\n\u00A2\u0006\u0002\u0010\u0011\u001A\u001E\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u0013\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u0015\u001AO\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u0013\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u00152*\u0010\u0016\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u00030\u0010\"\u000E\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u0003\u00A2\u0006\u0002\u0010\u0017\u001A/\u0010\u0018\u001A\b\u0012\u0004\u0012\u0002H\n0\u0019\"\u0004\b\u0000\u0010\n2\u0006\u0010\u001A\u001A\u0002H\n2\u000E\b\u0002\u0010\u001B\u001A\b\u0012\u0004\u0012\u0002H\n0\u001C\u00A2\u0006\u0002\u0010\u001D\u001A\u0012\u0010\u001E\u001A\b\u0012\u0004\u0012\u0002H\n0\u001C\"\u0004\b\u0000\u0010\n\u001A.\u0010\u001F\u001A\u0002H \"\u0004\b\u0000\u0010 2\n\u0010!\u001A\u0006\u0012\u0002\b\u00030\u00052\f\u0010\"\u001A\b\u0012\u0004\u0012\u0002H 0\fH\u0082\b\u00A2\u0006\u0002\u0010#\u001Aj\u0010$\u001A\u00020\u0006\"\u0004\b\u0000\u0010 2%\u0010%\u001A!\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\t\u00A2\u0006\f\b&\u0012\b\b\'\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00060\u00042%\u0010(\u001A!\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\t\u00A2\u0006\f\b&\u0012\b\b\'\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\"\u001A\b\u0012\u0004\u0012\u0002H 0\fH\u0000\u001As\u0010)\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0006\u0010*\u001A\u0002H\n2\b\u0010+\u001A\u0004\u0018\u00010,2\b\u0010-\u001A\u0004\u0018\u00010,2\b\u0010.\u001A\u0004\u0018\u00010,2/\b\u0001\u0010/\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n01\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000602\u0012\u0006\u0012\u0004\u0018\u00010,00\u00A2\u0006\u0002\b3H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u00104\u001Ai\u0010)\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0006\u0010*\u001A\u0002H\n2\b\u0010+\u001A\u0004\u0018\u00010,2\b\u0010-\u001A\u0004\u0018\u00010,2/\b\u0001\u0010/\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n01\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000602\u0012\u0006\u0012\u0004\u0018\u00010,00\u00A2\u0006\u0002\b3H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u00105\u001A_\u0010)\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0006\u0010*\u001A\u0002H\n2\b\u0010+\u001A\u0004\u0018\u00010,2/\b\u0001\u0010/\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n01\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000602\u0012\u0006\u0012\u0004\u0018\u00010,00\u00A2\u0006\u0002\b3H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u00106\u001Am\u0010)\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0006\u0010*\u001A\u0002H\n2\u0016\u00107\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010,0\u0010\"\u0004\u0018\u00010,2/\b\u0001\u0010/\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n01\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000602\u0012\u0006\u0012\u0004\u0018\u00010,00\u00A2\u0006\u0002\b3H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u00108\u001AU\u0010)\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0006\u0010*\u001A\u0002H\n2/\b\u0001\u0010/\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n01\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000602\u0012\u0006\u0012\u0004\u0018\u00010,00\u00A2\u0006\u0002\b3H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u00109\u001A\u0012\u0010:\u001A\b\u0012\u0004\u0012\u0002H\n0\u001C\"\u0004\b\u0000\u0010\n\u001A!\u0010;\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0006\u0010<\u001A\u0002H\nH\u0007\u00A2\u0006\u0002\u0010=\u001A \u0010>\u001A\b\u0012\u0004\u0012\u0002H\n0?\"\u0004\b\u0000\u0010\n2\f\u0010\"\u001A\b\u0012\u0004\u0012\u0002H\n0\f\u001A\u0012\u0010@\u001A\b\u0012\u0004\u0012\u0002H\n0\u001C\"\u0004\b\u0000\u0010\n\u001A?\u0010A\u001A\b\u0012\u0004\u0012\u0002H 0\t\"\b\b\u0000\u0010\n*\u0002H \"\u0004\b\u0001\u0010 *\b\u0012\u0004\u0012\u0002H\n0?2\u0006\u0010B\u001A\u0002H 2\b\b\u0002\u0010C\u001A\u00020DH\u0007\u00A2\u0006\u0002\u0010E\u001A-\u0010A\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0F2\b\b\u0002\u0010C\u001A\u00020DH\u0007\u00A2\u0006\u0002\u0010G\u001A4\u0010H\u001A\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\b\u0010I\u001A\u0004\u0018\u00010,2\n\u0010J\u001A\u0006\u0012\u0002\b\u00030KH\u0086\n\u00A2\u0006\u0002\u0010L\u001A&\u0010M\u001A\u00020N\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0O2\f\u0010P\u001A\b\u0012\u0004\u0012\u0002H\n0OH\u0002\u001A<\u0010Q\u001A\u00020\u0006\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00192\b\u0010I\u001A\u0004\u0018\u00010,2\n\u0010J\u001A\u0006\u0012\u0002\b\u00030K2\u0006\u0010\u001A\u001A\u0002H\nH\u0086\n\u00A2\u0006\u0002\u0010R\u001A\u001C\u0010S\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0T\u001A4\u0010U\u001A\u000E\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u0013\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u0015*\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u00030V\"J\u0010\u0000\u001A>\u0012:\u00128\u00124\u00122\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003j\u0002`\u00070\u00020\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000*d\b\u0002\u0010W\".\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032.\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006X"}, d2 = {"derivedStateObservers", "Landroidx/compose/runtime/SnapshotThreadLocal;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Lkotlin/Pair;", "Lkotlin/Function1;", "Landroidx/compose/runtime/DerivedState;", "", "Landroidx/compose/runtime/DerivedStateObservers;", "derivedStateOf", "Landroidx/compose/runtime/State;", "T", "calculation", "Lkotlin/Function0;", "mutableStateListOf", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "elements", "", "([Ljava/lang/Object;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "mutableStateMapOf", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "K", "V", "pairs", "([Lkotlin/Pair;)Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "mutableStateOf", "Landroidx/compose/runtime/MutableState;", "value", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/MutableState;", "neverEqualPolicy", "notifyObservers", "R", "derivedState", "block", "(Landroidx/compose/runtime/DerivedState;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "observeDerivedStateRecalculations", "start", "Lkotlin/ParameterName;", "name", "done", "produceState", "initialValue", "key1", "", "key2", "key3", "producer", "Lkotlin/Function2;", "Landroidx/compose/runtime/ProduceStateScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "keys", "(Ljava/lang/Object;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "referentialEqualityPolicy", "rememberUpdatedState", "newValue", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "snapshotFlow", "Lkotlinx/coroutines/flow/Flow;", "structuralEqualityPolicy", "collectAsState", "initial", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlinx/coroutines/flow/StateFlow;", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "getValue", "thisObj", "property", "Lkotlin/reflect/KProperty;", "(Landroidx/compose/runtime/State;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "intersects", "", "", "other", "setValue", "(Landroidx/compose/runtime/MutableState;Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "toMutableStateList", "", "toMutableStateMap", "", "DerivedStateObservers", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SnapshotStateKt {
    private static final SnapshotThreadLocal derivedStateObservers;

    static {
        SnapshotStateKt.derivedStateObservers = new SnapshotThreadLocal();
    }

    public static final State collectAsState(Flow flow0, Object object0, CoroutineContext coroutineContext0, Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(flow0, "<this>");
        composer0.startReplaceableGroup(0x7AE9FB1B);
        ComposerKt.sourceInformation(composer0, "C(collectAsState)P(1)796@29794L186:SnapshotState.kt#9igjgp");
        if((v1 & 2) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        State state0 = SnapshotStateKt.produceState(object0, flow0, coroutineContext0, new Function2(coroutineContext0, flow0, null) {
            final CoroutineContext $context;
            final Flow $this_collectAsState;
            private Object L$0;
            int label;

            {
                this.$context = coroutineContext0;
                this.$this_collectAsState = flow0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                androidx.compose.runtime.SnapshotStateKt.collectAsState.1 snapshotStateKt$collectAsState$10 = new androidx.compose.runtime.SnapshotStateKt.collectAsState.1(this.$context, this.$this_collectAsState, continuation0);
                snapshotStateKt$collectAsState$10.L$0 = object0;
                return snapshotStateKt$collectAsState$10;
            }

            public final Object invoke(ProduceStateScope produceStateScope0, Continuation continuation0) {
                return ((androidx.compose.runtime.SnapshotStateKt.collectAsState.1)this.create(produceStateScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((ProduceStateScope)object0), ((Continuation)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        ProduceStateScope produceStateScope0 = (ProduceStateScope)this.L$0;
                        if(Intrinsics.areEqual(this.$context, EmptyCoroutineContext.INSTANCE)) {
                            FlowCollector flowCollector0 = new FlowCollector() {
                                @Override  // kotlinx.coroutines.flow.FlowCollector
                                public Object emit(Object object0, Continuation continuation0) {
                                    this.$$this$produceState$inlined.setValue(object0);
                                    return Unit.INSTANCE;
                                }
                            };
                            this.label = 1;
                            if(this.$this_collectAsState.collect(flowCollector0, this) == object1) {
                                return object1;
                            }
                        }
                        else {
                            androidx.compose.runtime.SnapshotStateKt.collectAsState.1.2 snapshotStateKt$collectAsState$1$20 = new Function2(produceStateScope0, null) {
                                final ProduceStateScope $$this$produceState;
                                final Flow $this_collectAsState;
                                int label;

                                {
                                    this.$this_collectAsState = flow0;
                                    this.$$this$produceState = produceStateScope0;
                                    super(2, continuation0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation create(Object object0, Continuation continuation0) {
                                    return new androidx.compose.runtime.SnapshotStateKt.collectAsState.1.2(this.$this_collectAsState, this.$$this$produceState, continuation0);
                                }

                                @Override  // kotlin.jvm.functions.Function2
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                                }

                                public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                                    return ((androidx.compose.runtime.SnapshotStateKt.collectAsState.1.2)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object object0) {
                                    Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    switch(this.label) {
                                        case 0: {
                                            ResultKt.throwOnFailure(object0);
                                            FlowCollector flowCollector0 = new FlowCollector() {
                                                @Override  // kotlinx.coroutines.flow.FlowCollector
                                                public Object emit(Object object0, Continuation continuation0) {
                                                    this.$$this$produceState$inlined.setValue(object0);
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            this.label = 1;
                                            return this.$this_collectAsState.collect(flowCollector0, this) == object1 ? object1 : Unit.INSTANCE;
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
                            this.label = 2;
                            if(BuildersKt.withContext(this.$context, snapshotStateKt$collectAsState$1$20, this) == object1) {
                                return object1;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    case 1: 
                    case 2: {
                        ResultKt.throwOnFailure(object0);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, composer0, v >> 3 & 8 | 0x240 | v >> 3 & 14);
        composer0.endReplaceableGroup();
        return state0;
    }

    public static final State collectAsState(StateFlow stateFlow0, CoroutineContext coroutineContext0, Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(stateFlow0, "<this>");
        composer0.startReplaceableGroup(0x7AE9F90F);
        ComposerKt.sourceInformation(composer0, "C(collectAsState)781@29252L30:SnapshotState.kt#9igjgp");
        if((v1 & 1) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        State state0 = SnapshotStateKt.collectAsState(stateFlow0, stateFlow0.getValue(), coroutineContext0, composer0, 520, 0);
        composer0.endReplaceableGroup();
        return state0;
    }

    public static final State derivedStateOf(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "calculation");
        return new DerivedSnapshotState(function00);
    }

    public static final Object getValue(State state0, Object object0, KProperty kProperty0) {
        Intrinsics.checkNotNullParameter(state0, "<this>");
        Intrinsics.checkNotNullParameter(kProperty0, "property");
        return state0.getValue();
    }

    private static final boolean intersects(Set set0, Set set1) {
        if(set0.size() < set1.size()) {
            if(!(set0 instanceof Collection) || !set0.isEmpty()) {
                for(Object object0: set0) {
                    if(!set1.contains(object0)) {
                        continue;
                    }
                    return true;
                }
            }
        }
        else if(!(set1 instanceof Collection) || !set1.isEmpty()) {
            for(Object object1: set1) {
                if(set0.contains(object1)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public static final SnapshotStateList mutableStateListOf() {
        return new SnapshotStateList();
    }

    public static final SnapshotStateList mutableStateListOf(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        SnapshotStateList snapshotStateList0 = new SnapshotStateList();
        snapshotStateList0.addAll(ArraysKt.toList(arr_object));
        return snapshotStateList0;
    }

    public static final SnapshotStateMap mutableStateMapOf() {
        return new SnapshotStateMap();
    }

    public static final SnapshotStateMap mutableStateMapOf(Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        SnapshotStateMap snapshotStateMap0 = new SnapshotStateMap();
        snapshotStateMap0.putAll(MapsKt.toMap(arr_pair));
        return snapshotStateMap0;
    }

    public static final MutableState mutableStateOf(Object object0, SnapshotMutationPolicy snapshotMutationPolicy0) {
        Intrinsics.checkNotNullParameter(snapshotMutationPolicy0, "policy");
        return ActualAndroid_androidKt.createSnapshotMutableState(object0, snapshotMutationPolicy0);
    }

    public static MutableState mutableStateOf$default(Object object0, SnapshotMutationPolicy snapshotMutationPolicy0, int v, Object object1) {
        if((v & 2) != 0) {
            snapshotMutationPolicy0 = SnapshotStateKt.structuralEqualityPolicy();
        }
        return SnapshotStateKt.mutableStateOf(object0, snapshotMutationPolicy0);
    }

    public static final SnapshotMutationPolicy neverEqualPolicy() {
        return NeverEqualPolicy.INSTANCE;
    }

    private static final Object notifyObservers(DerivedState derivedState0, Function0 function00) {
        Object object0;
        PersistentList persistentList0 = (PersistentList)SnapshotStateKt.derivedStateObservers.get();
        if(persistentList0 == null) {
            persistentList0 = ExtensionsKt.persistentListOf();
        }
        int v = persistentList0.size();
        int v1 = 0;
        if(v - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                ((Function1)((Pair)persistentList0.get(v2)).component1()).invoke(derivedState0);
                if(v2 + 1 > v - 1) {
                    break;
                }
            }
        }
        try {
            object0 = function00.invoke();
            int v3 = persistentList0.size();
        }
        catch(Throwable throwable0) {
            int v4 = persistentList0.size();
            if(v4 - 1 >= 0) {
                while(true) {
                    ((Function1)((Pair)persistentList0.get(v1)).component2()).invoke(derivedState0);
                    if(v1 + 1 > v4 - 1) {
                        break;
                    }
                    ++v1;
                }
            }
            throw throwable0;
        }
        if(v3 - 1 >= 0) {
            while(true) {
                ((Function1)((Pair)persistentList0.get(v1)).component2()).invoke(derivedState0);
                if(v1 + 1 > v3 - 1) {
                    break;
                }
                ++v1;
            }
        }
        return object0;
    }

    public static final void observeDerivedStateRecalculations(Function1 function10, Function1 function11, Function0 function00) {
        Intrinsics.checkNotNullParameter(function10, "start");
        Intrinsics.checkNotNullParameter(function11, "done");
        Intrinsics.checkNotNullParameter(function00, "block");
        SnapshotThreadLocal snapshotThreadLocal0 = SnapshotStateKt.derivedStateObservers;
        PersistentList persistentList0 = (PersistentList)snapshotThreadLocal0.get();
        try {
            PersistentList persistentList1 = (PersistentList)snapshotThreadLocal0.get();
            if(persistentList1 == null) {
                persistentList1 = ExtensionsKt.persistentListOf();
            }
            snapshotThreadLocal0.set(persistentList1.add(TuplesKt.to(function10, function11)));
            function00.invoke();
        }
        catch(Throwable throwable0) {
            SnapshotStateKt.derivedStateObservers.set(persistentList0);
            throw throwable0;
        }
        snapshotThreadLocal0.set(persistentList0);
    }

    public static final State produceState(Object object0, Object object1, Object object2, Object object3, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function20, "producer");
        composer0.startReplaceableGroup(-1870511014);
        ComposerKt.sourceInformation(composer0, "C(produceState)701@25796L41,702@25842L107:SnapshotState.kt#9igjgp");
        composer0.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
        MutableState mutableState0 = composer0.rememberedValue();
        if(mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        EffectsKt.LaunchedEffect(object1, object2, object3, new Function2(function20, mutableState0, null) {
            final Function2 $producer;
            final MutableState $result;
            private Object L$0;
            int label;

            {
                this.$producer = function20;
                this.$result = mutableState0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                androidx.compose.runtime.SnapshotStateKt.produceState.4 snapshotStateKt$produceState$40 = new androidx.compose.runtime.SnapshotStateKt.produceState.4(this.$producer, this.$result, continuation0);
                snapshotStateKt$produceState$40.L$0 = object0;
                return snapshotStateKt$produceState$40;
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                return ((androidx.compose.runtime.SnapshotStateKt.produceState.4)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        CoroutineContext coroutineContext0 = ((CoroutineScope)this.L$0).getCoroutineContext();
                        ProduceStateScopeImpl produceStateScopeImpl0 = new ProduceStateScopeImpl(this.$result, coroutineContext0);
                        this.label = 1;
                        return this.$producer.invoke(produceStateScopeImpl0, this) == object1 ? object1 : Unit.INSTANCE;
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
        }, composer0, 584);
        composer0.endReplaceableGroup();
        return mutableState0;
    }

    public static final State produceState(Object object0, Object object1, Object object2, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function20, "producer");
        composer0.startReplaceableGroup(-1870512401);
        ComposerKt.sourceInformation(composer0, "C(produceState)666@24393L41,667@24439L101:SnapshotState.kt#9igjgp");
        composer0.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
        MutableState mutableState0 = composer0.rememberedValue();
        if(mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        EffectsKt.LaunchedEffect(object1, object2, new Function2(function20, mutableState0, null) {
            final Function2 $producer;
            final MutableState $result;
            private Object L$0;
            int label;

            {
                this.$producer = function20;
                this.$result = mutableState0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                androidx.compose.runtime.SnapshotStateKt.produceState.3 snapshotStateKt$produceState$30 = new androidx.compose.runtime.SnapshotStateKt.produceState.3(this.$producer, this.$result, continuation0);
                snapshotStateKt$produceState$30.L$0 = object0;
                return snapshotStateKt$produceState$30;
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                return ((androidx.compose.runtime.SnapshotStateKt.produceState.3)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        CoroutineContext coroutineContext0 = ((CoroutineScope)this.L$0).getCoroutineContext();
                        ProduceStateScopeImpl produceStateScopeImpl0 = new ProduceStateScopeImpl(this.$result, coroutineContext0);
                        this.label = 1;
                        return this.$producer.invoke(produceStateScopeImpl0, this) == object1 ? object1 : Unit.INSTANCE;
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
        }, composer0, 72);
        composer0.endReplaceableGroup();
        return mutableState0;
    }

    public static final State produceState(Object object0, Object object1, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function20, "producer");
        composer0.startReplaceableGroup(0x908239A9);
        ComposerKt.sourceInformation(composer0, "C(produceState)632@23027L41,633@23073L95:SnapshotState.kt#9igjgp");
        composer0.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
        MutableState mutableState0 = composer0.rememberedValue();
        if(mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        EffectsKt.LaunchedEffect(object1, new Function2(function20, mutableState0, null) {
            final Function2 $producer;
            final MutableState $result;
            private Object L$0;
            int label;

            {
                this.$producer = function20;
                this.$result = mutableState0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                androidx.compose.runtime.SnapshotStateKt.produceState.2 snapshotStateKt$produceState$20 = new androidx.compose.runtime.SnapshotStateKt.produceState.2(this.$producer, this.$result, continuation0);
                snapshotStateKt$produceState$20.L$0 = object0;
                return snapshotStateKt$produceState$20;
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                return ((androidx.compose.runtime.SnapshotStateKt.produceState.2)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        CoroutineContext coroutineContext0 = ((CoroutineScope)this.L$0).getCoroutineContext();
                        ProduceStateScopeImpl produceStateScopeImpl0 = new ProduceStateScopeImpl(this.$result, coroutineContext0);
                        this.label = 1;
                        return this.$producer.invoke(produceStateScopeImpl0, this) == object1 ? object1 : Unit.INSTANCE;
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
        }, composer0, 8);
        composer0.endReplaceableGroup();
        return mutableState0;
    }

    public static final State produceState(Object object0, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function20, "producer");
        composer0.startReplaceableGroup(-1870515065);
        ComposerKt.sourceInformation(composer0, "C(produceState)599@21697L41,600@21743L95:SnapshotState.kt#9igjgp");
        composer0.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
        MutableState mutableState0 = composer0.rememberedValue();
        if(mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        Function2 function21 = new Function2(function20, mutableState0, null) {
            final Function2 $producer;
            final MutableState $result;
            private Object L$0;
            int label;

            {
                this.$producer = function20;
                this.$result = mutableState0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                androidx.compose.runtime.SnapshotStateKt.produceState.1 snapshotStateKt$produceState$10 = new androidx.compose.runtime.SnapshotStateKt.produceState.1(this.$producer, this.$result, continuation0);
                snapshotStateKt$produceState$10.L$0 = object0;
                return snapshotStateKt$produceState$10;
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                return ((androidx.compose.runtime.SnapshotStateKt.produceState.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        CoroutineContext coroutineContext0 = ((CoroutineScope)this.L$0).getCoroutineContext();
                        ProduceStateScopeImpl produceStateScopeImpl0 = new ProduceStateScopeImpl(this.$result, coroutineContext0);
                        this.label = 1;
                        return this.$producer.invoke(produceStateScopeImpl0, this) == object1 ? object1 : Unit.INSTANCE;
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
        EffectsKt.LaunchedEffect(Unit.INSTANCE, function21, composer0, 0);
        composer0.endReplaceableGroup();
        return mutableState0;
    }

    public static final State produceState(Object object0, Object[] arr_object, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "keys");
        Intrinsics.checkNotNullParameter(function20, "producer");
        composer0.startReplaceableGroup(-1870509641);
        ComposerKt.sourceInformation(composer0, "C(produceState)734@27144L41,736@27260L102:SnapshotState.kt#9igjgp");
        composer0.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
        MutableState mutableState0 = composer0.rememberedValue();
        if(mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        EffectsKt.LaunchedEffect(Arrays.copyOf(arr_object, arr_object.length), new Function2(function20, mutableState0, null) {
            final Function2 $producer;
            final MutableState $result;
            private Object L$0;
            int label;

            {
                this.$producer = function20;
                this.$result = mutableState0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                androidx.compose.runtime.SnapshotStateKt.produceState.5 snapshotStateKt$produceState$50 = new androidx.compose.runtime.SnapshotStateKt.produceState.5(this.$producer, this.$result, continuation0);
                snapshotStateKt$produceState$50.L$0 = object0;
                return snapshotStateKt$produceState$50;
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                return ((androidx.compose.runtime.SnapshotStateKt.produceState.5)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        CoroutineContext coroutineContext0 = ((CoroutineScope)this.L$0).getCoroutineContext();
                        ProduceStateScopeImpl produceStateScopeImpl0 = new ProduceStateScopeImpl(this.$result, coroutineContext0);
                        this.label = 1;
                        return this.$producer.invoke(produceStateScopeImpl0, this) == object1 ? object1 : Unit.INSTANCE;
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
        }, composer0, 8);
        composer0.endReplaceableGroup();
        return mutableState0;
    }

    public static final SnapshotMutationPolicy referentialEqualityPolicy() {
        return ReferentialEqualityPolicy.INSTANCE;
    }

    public static final State rememberUpdatedState(Object object0, Composer composer0, int v) {
        composer0.startReplaceableGroup(0xA56F1108);
        ComposerKt.sourceInformation(composer0, "C(rememberUpdatedState)*764@28632L41:SnapshotState.kt#9igjgp");
        composer0.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
        MutableState mutableState0 = composer0.rememberedValue();
        if(mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        mutableState0.setValue(object0);
        composer0.endReplaceableGroup();
        return mutableState0;
    }

    public static final void setValue(MutableState mutableState0, Object object0, KProperty kProperty0, Object object1) {
        Intrinsics.checkNotNullParameter(mutableState0, "<this>");
        Intrinsics.checkNotNullParameter(kProperty0, "property");
        mutableState0.setValue(object1);
    }

    public static final Flow snapshotFlow(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        return FlowKt.flow(new Function2(function00, null) {
            final Function0 $block;
            int I$0;
            private Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            int label;

            {
                this.$block = function00;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                androidx.compose.runtime.SnapshotStateKt.snapshotFlow.1 snapshotStateKt$snapshotFlow$10 = new androidx.compose.runtime.SnapshotStateKt.snapshotFlow.1(this.$block, continuation0);
                snapshotStateKt$snapshotFlow$10.L$0 = object0;
                return snapshotStateKt$snapshotFlow$10;
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((FlowCollector)object0), ((Continuation)object1));
            }

            public final Object invoke(FlowCollector flowCollector0, Continuation continuation0) {
                return ((androidx.compose.runtime.SnapshotStateKt.snapshotFlow.1)this.create(flowCollector0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                Object object6;
                Object object2;
                androidx.compose.runtime.SnapshotStateKt.snapshotFlow.1 snapshotStateKt$snapshotFlow$11;
                androidx.compose.runtime.SnapshotStateKt.snapshotFlow.1 snapshotStateKt$snapshotFlow$10;
                Object object5;
                FlowCollector flowCollector1;
                Set set1;
                Function1 function11;
                Channel channel1;
                ObserverHandle observerHandle1;
                Object object4;
                int v2;
                Object object3;
                ObserverHandle observerHandle0;
                Channel channel0;
                Function1 function10;
                Set set0;
                FlowCollector flowCollector0;
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            alab1:
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        flowCollector0 = (FlowCollector)this.L$0;
                        set0 = new LinkedHashSet();
                        function10 = new Function1() {
                            final Set $readSet;

                            {
                                this.$readSet = set0;
                                super(1);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.invoke(object0);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Object object0) {
                                Intrinsics.checkNotNullParameter(object0, "it");
                                this.$readSet.add(object0);
                            }
                        };
                        channel0 = ChannelKt.Channel$default(0x7FFFFFFF, null, null, 6, null);
                        Function2 function20 = new Function2() {
                            final Channel $appliedChanges;

                            {
                                this.$appliedChanges = channel0;
                                super(2);
                            }

                            @Override  // kotlin.jvm.functions.Function2
                            public Object invoke(Object object0, Object object1) {
                                this.invoke(((Set)object0), ((Snapshot)object1));
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Set set0, Snapshot snapshot0) {
                                Intrinsics.checkNotNullParameter(set0, "changed");
                                Intrinsics.checkNotNullParameter(snapshot0, "$noName_1");
                                this.$appliedChanges.trySend-JP2dKIU(set0);
                            }
                        };
                        observerHandle0 = Snapshot.Companion.registerApplyObserver(function20);
                        try {
                            Snapshot snapshot0 = Snapshot.Companion.takeSnapshot(function10);
                            try {
                                Snapshot snapshot1 = snapshot0.makeCurrent();
                                try {
                                    object2 = this.$block.invoke();
                                }
                                finally {
                                    snapshot0.restoreCurrent(snapshot1);
                                }
                            }
                            finally {
                                snapshot0.dispose();
                            }
                            this.L$0 = flowCollector0;
                            this.L$1 = set0;
                            this.L$2 = function10;
                            this.L$3 = channel0;
                            this.L$4 = observerHandle0;
                            this.L$5 = object2;
                            this.label = 1;
                            if(flowCollector0.emit(object2, this) == object1) {
                                return object1;
                            }
                            object3 = object2;
                            goto label_57;
                        }
                        catch(Throwable throwable0) {
                            observerHandle0.dispose();
                            throw throwable0;
                        }
                    }
                    case 1: {
                        object3 = this.L$5;
                        observerHandle0 = (ObserverHandle)this.L$4;
                        channel0 = (Channel)this.L$3;
                        function10 = (Function1)this.L$2;
                        set0 = (Set)this.L$1;
                        flowCollector0 = (FlowCollector)this.L$0;
                        goto label_56;
                    }
                    case 2: {
                        v2 = this.I$0;
                        object4 = this.L$5;
                        observerHandle1 = (ObserverHandle)this.L$4;
                        channel1 = (Channel)this.L$3;
                        function11 = (Function1)this.L$2;
                        set1 = (Set)this.L$1;
                        flowCollector1 = (FlowCollector)this.L$0;
                        try {
                            ResultKt.throwOnFailure(object0);
                            object5 = object0;
                            snapshotStateKt$snapshotFlow$10 = this;
                            goto label_77;
                        }
                        catch(Throwable throwable0) {
                            observerHandle0 = observerHandle1;
                            observerHandle0.dispose();
                            throw throwable0;
                        }
                    }
                    case 3: {
                        object3 = this.L$5;
                        observerHandle0 = (ObserverHandle)this.L$4;
                        channel0 = (Channel)this.L$3;
                        function10 = (Function1)this.L$2;
                        set0 = (Set)this.L$1;
                        flowCollector0 = (FlowCollector)this.L$0;
                        try {
                        label_56:
                            ResultKt.throwOnFailure(object0);
                        label_57:
                            snapshotStateKt$snapshotFlow$11 = this;
                            while(true) {
                            label_58:
                                snapshotStateKt$snapshotFlow$11.L$0 = flowCollector0;
                                snapshotStateKt$snapshotFlow$11.L$1 = set0;
                                snapshotStateKt$snapshotFlow$11.L$2 = function10;
                                snapshotStateKt$snapshotFlow$11.L$3 = channel0;
                                snapshotStateKt$snapshotFlow$11.L$4 = observerHandle0;
                                snapshotStateKt$snapshotFlow$11.L$5 = object3;
                                snapshotStateKt$snapshotFlow$11.I$0 = 0;
                                snapshotStateKt$snapshotFlow$11.label = 2;
                                object5 = channel0.receive(snapshotStateKt$snapshotFlow$11);
                                if(object5 == object1) {
                                    break alab1;
                                }
                                goto label_69;
                            }
                        }
                        catch(Throwable throwable0) {
                            observerHandle0.dispose();
                            throw throwable0;
                        }
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return object1;
            label_69:
                snapshotStateKt$snapshotFlow$10 = snapshotStateKt$snapshotFlow$11;
                flowCollector1 = flowCollector0;
                set1 = set0;
                function11 = function10;
                channel1 = channel0;
                observerHandle1 = observerHandle0;
                object4 = object3;
                v2 = 0;
                try {
                label_77:
                    for(Set set2 = (Set)object5; true; set2 = set3) {
                        v2 = v2 != 0 || SnapshotStateKt.intersects(set1, set2) ? 1 : 0;
                        Set set3 = (Set)ChannelResult.getOrNull-impl(channel1.tryReceive-PtdJZtk());
                        if(set3 == null) {
                            break;
                        }
                    }
                    if(v2 != 0) {
                        set1.clear();
                        Snapshot snapshot2 = Snapshot.Companion.takeSnapshot(function11);
                        try {
                            Snapshot snapshot3 = snapshot2.makeCurrent();
                            try {
                                object6 = snapshotStateKt$snapshotFlow$10.$block.invoke();
                            }
                            finally {
                                snapshot2.restoreCurrent(snapshot3);
                            }
                        }
                        finally {
                            snapshot2.dispose();
                        }
                        if(!Intrinsics.areEqual(object6, object4)) {
                            snapshotStateKt$snapshotFlow$10.L$0 = flowCollector1;
                            snapshotStateKt$snapshotFlow$10.L$1 = set1;
                            snapshotStateKt$snapshotFlow$10.L$2 = function11;
                            snapshotStateKt$snapshotFlow$10.L$3 = channel1;
                            snapshotStateKt$snapshotFlow$10.L$4 = observerHandle1;
                            snapshotStateKt$snapshotFlow$10.L$5 = object6;
                            snapshotStateKt$snapshotFlow$10.label = 3;
                            if(flowCollector1.emit(object6, snapshotStateKt$snapshotFlow$10) == object1) {
                                return object1;
                            }
                            observerHandle0 = observerHandle1;
                            channel0 = channel1;
                            function10 = function11;
                            set0 = set1;
                            flowCollector0 = flowCollector1;
                            object3 = object6;
                            snapshotStateKt$snapshotFlow$11 = snapshotStateKt$snapshotFlow$10;
                            goto label_58;
                        }
                    }
                    object3 = object4;
                    observerHandle0 = observerHandle1;
                    channel0 = channel1;
                    function10 = function11;
                    set0 = set1;
                    flowCollector0 = flowCollector1;
                }
                catch(Throwable throwable0) {
                    observerHandle0 = observerHandle1;
                    observerHandle0.dispose();
                    throw throwable0;
                }
                try {
                    snapshotStateKt$snapshotFlow$11 = snapshotStateKt$snapshotFlow$10;
                    goto label_58;
                }
                catch(Throwable throwable0) {
                }
                observerHandle0.dispose();
                throw throwable0;
            }
        });
    }

    public static final SnapshotMutationPolicy structuralEqualityPolicy() {
        return StructuralEqualityPolicy.INSTANCE;
    }

    public static final SnapshotStateList toMutableStateList(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        SnapshotStateList snapshotStateList0 = new SnapshotStateList();
        snapshotStateList0.addAll(collection0);
        return snapshotStateList0;
    }

    public static final SnapshotStateMap toMutableStateMap(Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        SnapshotStateMap snapshotStateMap0 = new SnapshotStateMap();
        snapshotStateMap0.putAll(MapsKt.toMap(iterable0));
        return snapshotStateMap0;
    }
}

