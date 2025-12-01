package kotlinx.coroutines.flow;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.flow.internal.FusibleFlow.DefaultImpls;
import kotlinx.coroutines.flow.internal.FusibleFlow;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0015\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0002¢\u0006\u0002\b\u0004\u001A(\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\b\b\u0002\u0010\b\u001A\u00020\tH\u0007\u001A0\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B\u001A\u001C\u0010\f\u001A\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0006\u001A\u001C\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0006\u001A$\u0010\u000E\u001A\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\u0006\u0010\u0002\u001A\u00020\u0003\u001A[\u0010\u000F\u001A\b\u0012\u0004\u0012\u0002H\u00100\u0006\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00070\u00062\u0006\u0010\u0011\u001A\u00020\u00032\b\b\u0002\u0010\u0012\u001A\u00020\t2#\u0010\u0013\u001A\u001F\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u00060\u0014¢\u0006\u0002\b\u0015H\u0007¨\u0006\u0016"}, d2 = {"checkFlowContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "checkFlowContext$FlowKt__ContextKt", "buffer", "Lkotlinx/coroutines/flow/Flow;", "T", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "cancellable", "conflate", "flowOn", "flowWith", "R", "flowContext", "bufferSize", "builder", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 5, 1}, xi = 0x30, xs = "kotlinx/coroutines/flow/FlowKt")
final class FlowKt__ContextKt {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final Flow buffer(Flow flow0, int v) {
        return FlowKt.buffer$default(flow0, v, null, 2, null);
    }

    public static final Flow buffer(Flow flow0, int v, BufferOverflow bufferOverflow0) {
        int v1;
        BufferOverflow bufferOverflow1;
        if(v < 0 && (v != -2 && v != -1)) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + v).toString());
        }
        if(v == -1 && bufferOverflow0 != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if(v == -1) {
            bufferOverflow1 = BufferOverflow.DROP_OLDEST;
            v1 = 0;
        }
        else {
            v1 = v;
            bufferOverflow1 = bufferOverflow0;
        }
        return flow0 instanceof FusibleFlow ? DefaultImpls.fuse$default(((FusibleFlow)flow0), null, v1, bufferOverflow1, 1, null) : new ChannelFlowOperatorImpl(flow0, null, v1, bufferOverflow1, 2, null);
    }

    public static Flow buffer$default(Flow flow0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = -2;
        }
        return FlowKt__ContextKt.buffer(flow0, v);
    }

    public static Flow buffer$default(Flow flow0, int v, BufferOverflow bufferOverflow0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = -2;
        }
        if((v1 & 2) != 0) {
            bufferOverflow0 = BufferOverflow.SUSPEND;
        }
        return FlowKt.buffer(flow0, v, bufferOverflow0);
    }

    public static final Flow cancellable(Flow flow0) {
        return !(flow0 instanceof CancellableFlow) ? new CancellableFlowImpl(flow0) : flow0;
    }

    private static final void checkFlowContext$FlowKt__ContextKt(CoroutineContext coroutineContext0) {
        if(coroutineContext0.get(Job.Key) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext0).toString());
        }
    }

    public static final Flow conflate(Flow flow0) {
        return FlowKt__ContextKt.buffer$default(flow0, -1, null, 2, null);
    }

    public static final Flow flowOn(Flow flow0, CoroutineContext coroutineContext0) {
        FlowKt__ContextKt.checkFlowContext$FlowKt__ContextKt(coroutineContext0);
        if(!Intrinsics.areEqual(coroutineContext0, EmptyCoroutineContext.INSTANCE)) {
            return flow0 instanceof FusibleFlow ? DefaultImpls.fuse$default(((FusibleFlow)flow0), coroutineContext0, 0, null, 6, null) : new ChannelFlowOperatorImpl(flow0, coroutineContext0, 0, null, 12, null);
        }
        return flow0;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "flowWith is deprecated without replacement, please refer to its KDoc for an explanation")
    public static final Flow flowWith(Flow flow0, CoroutineContext coroutineContext0, int v, Function1 function10) {
        FlowKt__ContextKt.checkFlowContext$FlowKt__ContextKt(coroutineContext0);
        return new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector0, Continuation continuation0) {
                CoroutineContext coroutineContext0 = continuation0.getContext().minusKey(Job.Key);
                Flow flow0 = FlowKt__ContextKt.buffer$default(FlowKt.flowOn(flow0, coroutineContext0), v, null, 2, null);
                Object object0 = FlowKt__ContextKt.buffer$default(FlowKt.flowOn(((Flow)function10.invoke(flow0)), coroutineContext0), v, null, 2, null).collect(new kotlinx.coroutines.flow.FlowKt__ContextKt.flowWith.lambda-3..inlined.collect.1(flowCollector0), continuation0);
                return object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        };

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        public final class kotlinx.coroutines.flow.FlowKt__ContextKt.flowWith.lambda-3..inlined.collect.1 implements FlowCollector {
            public kotlinx.coroutines.flow.FlowKt__ContextKt.flowWith.lambda-3..inlined.collect.1(FlowCollector flowCollector0) {
            }

            @Override  // kotlinx.coroutines.flow.FlowCollector
            public Object emit(Object object0, Continuation continuation0) {
                Object object1 = this.$this_unsafeFlow$inlined.emit(object0, continuation0);
                return object1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
            }
        }

    }

    public static Flow flowWith$default(Flow flow0, CoroutineContext coroutineContext0, int v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = -2;
        }
        return FlowKt.flowWith(flow0, coroutineContext0, v, function10);
    }
}

