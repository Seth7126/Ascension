package kotlinx.coroutines.flow;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BroadcastChannel;
import kotlinx.coroutines.channels.BroadcastKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowKt;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0005\u001A\u001E\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001A0\u0010\u0004\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\bH\u0007\u001A\u001C\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n\u001A/\u0010\u000B\u001A\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\r2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u0002H\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000F\u001A9\u0010\u0010\u001A\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\r2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u0002H\u00020\n2\u0006\u0010\u0011\u001A\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001A&\u0010\u0015\u001A\b\u0012\u0004\u0012\u0002H\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u0006H\u0007\u001A\u001C\u0010\u0016\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "Lkotlinx/coroutines/channels/BroadcastChannel;", "broadcastIn", "scope", "Lkotlinx/coroutines/CoroutineScope;", "start", "Lkotlinx/coroutines/CoroutineStart;", "consumeAsFlow", "Lkotlinx/coroutines/channels/ReceiveChannel;", "emitAll", "", "Lkotlinx/coroutines/flow/FlowCollector;", "channel", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitAllImpl", "consume", "", "emitAllImpl$FlowKt__ChannelsKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceIn", "receiveAsFlow", "kotlinx-coroutines-core"}, k = 5, mv = {1, 5, 1}, xi = 0x30, xs = "kotlinx/coroutines/flow/FlowKt")
final class FlowKt__ChannelsKt {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[BufferOverflow.values().length];
            arr_v[BufferOverflow.SUSPEND.ordinal()] = 1;
            arr_v[BufferOverflow.DROP_OLDEST.ordinal()] = 2;
            arr_v[BufferOverflow.DROP_LATEST.ordinal()] = 3;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\'BroadcastChannel\' is obsolete and all coreresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final Flow asFlow(BroadcastChannel broadcastChannel0) {
        return new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector0, Continuation continuation0) {
                Object object0 = FlowKt.emitAll(flowCollector0, broadcastChannel0.openSubscription(), continuation0);
                return object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        };
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use shareIn operator and the resulting SharedFlow as a replacement for BroadcastChannel", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, SharingStarted.Lazily, 0)", imports = {}))
    public static final BroadcastChannel broadcastIn(Flow flow0, CoroutineScope coroutineScope0, CoroutineStart coroutineStart0) {
        int v;
        ChannelFlow channelFlow0 = ChannelFlowKt.asChannelFlow(flow0);
        switch(WhenMappings.$EnumSwitchMapping$0[channelFlow0.onBufferOverflow.ordinal()]) {
            case 1: {
                v = channelFlow0.getProduceCapacity$kotlinx_coroutines_core();
                break;
            }
            case 2: {
                v = -1;
                break;
            }
            case 3: {
                throw new IllegalArgumentException("Broadcast channel does not support BufferOverflow.DROP_LATEST");
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        kotlinx.coroutines.flow.FlowKt__ChannelsKt.broadcastIn.1 flowKt__ChannelsKt$broadcastIn$10 = new Function2(flow0, null) {
            final Flow $this_broadcastIn;
            private Object L$0;
            int label;

            {
                this.$this_broadcastIn = flow0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                kotlinx.coroutines.flow.FlowKt__ChannelsKt.broadcastIn.1 flowKt__ChannelsKt$broadcastIn$10 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt.broadcastIn.1(this.$this_broadcastIn, continuation0);
                flowKt__ChannelsKt$broadcastIn$10.L$0 = object0;
                return flowKt__ChannelsKt$broadcastIn$10;
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((ProducerScope)object0), ((Continuation)object1));
            }

            public final Object invoke(ProducerScope producerScope0, Continuation continuation0) {
                return ((kotlinx.coroutines.flow.FlowKt__ChannelsKt.broadcastIn.1)this.create(producerScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
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
                                Object object1 = this.$$this$broadcast$inlined.send(object0, continuation0);
                                return object1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
                            }
                        };
                        this.label = 1;
                        return this.$this_broadcastIn.collect(flowCollector0, this) == object1 ? object1 : Unit.INSTANCE;
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
        return BroadcastKt.broadcast$default(coroutineScope0, channelFlow0.context, v, coroutineStart0, null, flowKt__ChannelsKt$broadcastIn$10, 8, null);
    }

    public static BroadcastChannel broadcastIn$default(Flow flow0, CoroutineScope coroutineScope0, CoroutineStart coroutineStart0, int v, Object object0) {
        if((v & 2) != 0) {
            coroutineStart0 = CoroutineStart.LAZY;
        }
        return FlowKt.broadcastIn(flow0, coroutineScope0, coroutineStart0);
    }

    public static final Flow consumeAsFlow(ReceiveChannel receiveChannel0) {
        return new ChannelAsFlow(receiveChannel0, true, null, 0, null, 28, null);
    }

    public static final Object emitAll(FlowCollector flowCollector0, ReceiveChannel receiveChannel0, Continuation continuation0) {
        Object object0 = FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(flowCollector0, receiveChannel0, true, continuation0);
        return object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    private static final Object emitAllImpl$FlowKt__ChannelsKt(FlowCollector flowCollector0, ReceiveChannel receiveChannel0, boolean z, Continuation continuation0) {
        Object object2;
        FlowCollector flowCollector1;
        boolean z1;
        kotlinx.coroutines.flow.FlowKt__ChannelsKt.emitAllImpl.1 flowKt__ChannelsKt$emitAllImpl$10;
        if(continuation0 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt.emitAllImpl.1) {
            flowKt__ChannelsKt$emitAllImpl$10 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt.emitAllImpl.1)continuation0;
            if((flowKt__ChannelsKt$emitAllImpl$10.label & 0x80000000) == 0) {
                flowKt__ChannelsKt$emitAllImpl$10 = new ContinuationImpl(continuation0) {
                    Object L$0;
                    Object L$1;
                    boolean Z$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(null, null, false, this);
                    }
                };
            }
            else {
                flowKt__ChannelsKt$emitAllImpl$10.label ^= 0x80000000;
            }
        }
        else {
            flowKt__ChannelsKt$emitAllImpl$10 = new ContinuationImpl(continuation0) {
                Object L$0;
                Object L$1;
                boolean Z$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(null, null, false, this);
                }
            };
        }
        Object object0 = flowKt__ChannelsKt$emitAllImpl$10.result;
        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(flowKt__ChannelsKt$emitAllImpl$10.label) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FlowKt.ensureActive(flowCollector0);
                goto label_27;
            }
            case 1: {
                z1 = flowKt__ChannelsKt$emitAllImpl$10.Z$0;
                receiveChannel0 = (ReceiveChannel)flowKt__ChannelsKt$emitAllImpl$10.L$1;
                flowCollector1 = (FlowCollector)flowKt__ChannelsKt$emitAllImpl$10.L$0;
                ResultKt.throwOnFailure(object0);
                object2 = ((ChannelResult)object0).unbox-impl();
                goto label_41;
            }
            case 2: {
                z1 = flowKt__ChannelsKt$emitAllImpl$10.Z$0;
                receiveChannel0 = (ReceiveChannel)flowKt__ChannelsKt$emitAllImpl$10.L$1;
                flowCollector1 = (FlowCollector)flowKt__ChannelsKt$emitAllImpl$10.L$0;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            z = z1;
            flowCollector0 = flowCollector1;
            try {
            label_27:
                flowKt__ChannelsKt$emitAllImpl$10.L$0 = flowCollector0;
                flowKt__ChannelsKt$emitAllImpl$10.L$1 = receiveChannel0;
                flowKt__ChannelsKt$emitAllImpl$10.Z$0 = z;
                flowKt__ChannelsKt$emitAllImpl$10.label = 1;
                object2 = receiveChannel0.receiveCatching-JP2dKIU(flowKt__ChannelsKt$emitAllImpl$10);
            }
            catch(Throwable throwable1) {
                throwable0 = throwable1;
                z1 = z;
                break;
            }
            if(object2 == object1) {
                return object1;
            }
            flowCollector1 = flowCollector0;
            z1 = z;
            try {
            label_41:
                if(ChannelResult.isClosed-impl(object2)) {
                    Throwable throwable2 = ChannelResult.exceptionOrNull-impl(object2);
                    if(throwable2 != null) {
                        throw throwable2;
                    }
                    goto label_45;
                }
                goto label_48;
            }
            catch(Throwable throwable0) {
                break;
            }
        label_45:
            if(z1) {
                ChannelsKt.cancelConsumed(receiveChannel0, null);
            }
            return Unit.INSTANCE;
            try {
            label_48:
                Object object3 = ChannelResult.getOrThrow-impl(object2);
                flowKt__ChannelsKt$emitAllImpl$10.L$0 = flowCollector1;
                flowKt__ChannelsKt$emitAllImpl$10.L$1 = receiveChannel0;
                flowKt__ChannelsKt$emitAllImpl$10.Z$0 = z1;
                flowKt__ChannelsKt$emitAllImpl$10.label = 2;
                if(flowCollector1.emit(object3, flowKt__ChannelsKt$emitAllImpl$10) != object1) {
                    continue;
                }
                return object1;
            }
            catch(Throwable throwable0) {
                break;
            }
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable3) {
            if(z1) {
                ChannelsKt.cancelConsumed(receiveChannel0, throwable0);
            }
            throw throwable3;
        }
    }

    public static final ReceiveChannel produceIn(Flow flow0, CoroutineScope coroutineScope0) {
        return ChannelFlowKt.asChannelFlow(flow0).produceImpl(coroutineScope0);
    }

    public static final Flow receiveAsFlow(ReceiveChannel receiveChannel0) {
        return new ChannelAsFlow(receiveChannel0, false, null, 0, null, 28, null);
    }
}

