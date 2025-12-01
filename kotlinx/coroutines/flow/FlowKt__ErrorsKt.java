package kotlinx.coroutines.flow;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001Ah\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012B\u0010\u0003\u001A>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004\u00A2\u0006\u0002\b\r\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u000E\u001A1\u0010\u000F\u001A\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0080@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0011\u001A\u0019\u0010\u0012\u001A\u00020\u0013*\u00020\u00062\u0006\u0010\u0014\u001A\u00020\u0015H\u0002\u00A2\u0006\u0002\b\u0016\u001A\u001B\u0010\u0017\u001A\u00020\u0013*\u00020\u00062\b\u0010\u0018\u001A\u0004\u0018\u00010\u0006H\u0002\u00A2\u0006\u0002\b\u0019\u001AB\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u001B\u001A\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0014\b\u0002\u0010\u001C\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u001DH\u0007\u001A>\u0010\u001E\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u001F\u001A\u00020 2\u0014\b\u0002\u0010\u001C\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u001DH\u0007\u001Ac\u0010\u001E\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u001F\u001A\u00020!23\b\u0002\u0010\u001C\u001A-\b\u0001\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\"\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010#\u001A}\u0010$\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012W\u0010\u001C\u001AS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110!\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\f0%\u00A2\u0006\u0002\b\r\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\'*\\\b\u0007\u0010(\"\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u001D2\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u001DB6\b)\u0012\n\b*\u0012\u0006\b\n0+8,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u001C\b/\u0012\u0018\b\u000BB\u0014\b0\u0012\u0006\b1\u0012\u0002\b\f\u0012\b\b2\u0012\u0004\b\b(3\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u00064"}, d2 = {"catch", "Lkotlinx/coroutines/flow/Flow;", "T", "action", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "catchImpl", "collector", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCancellationCause", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "isCancellationCause$FlowKt__ErrorsKt", "isSameExceptionAs", "other", "isSameExceptionAs$FlowKt__ErrorsKt", "onErrorCollect", "fallback", "predicate", "Lkotlin/Function1;", "retry", "retries", "", "", "Lkotlin/Function2;", "(Lkotlinx/coroutines/flow/Flow;JLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "retryWhen", "Lkotlin/Function4;", "attempt", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "ExceptionPredicate", "Lkotlin/Deprecated;", "level", "Lkotlin/DeprecationLevel;", "ERROR", "message", "Use (Throwable) -> Boolean functional type", "replaceWith", "Lkotlin/ReplaceWith;", "imports", "expression", "(Throwable) -> Boolean", "kotlinx-coroutines-core"}, k = 5, mv = {1, 5, 1}, xi = 0x30, xs = "kotlinx/coroutines/flow/FlowKt")
final class FlowKt__ErrorsKt {
    @Deprecated(level = DeprecationLevel.ERROR, message = "Use (Throwable) -> Boolean functional type", replaceWith = @ReplaceWith(expression = "(Throwable) -> Boolean", imports = {}))
    public static void ExceptionPredicate$annotations() {
    }

    public static final Flow catch(Flow flow0, Function3 function30) {
        return new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector0, Continuation continuation0) {
                kotlinx.coroutines.flow.FlowKt__ErrorsKt.catch..inlined.unsafeFlow.1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$10;
                kotlinx.coroutines.flow.FlowKt__ErrorsKt.catch..inlined.unsafeFlow.1.1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10;
                if(continuation0 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt.catch..inlined.unsafeFlow.1.1) {
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.catch..inlined.unsafeFlow.1.1)continuation0;
                    if((flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10.label & 0x80000000) == 0) {
                        flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                            Object L$0;
                            Object L$1;
                            int label;
                            Object result;

                            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object object0) {
                                this.result = object0;
                                this.label |= 0x80000000;
                                return continuation0.collect(null, this);
                            }
                        };
                    }
                    else {
                        flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10.label ^= 0x80000000;
                    }
                }
                else {
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                        Object L$0;
                        Object L$1;
                        int label;
                        Object result;

                        @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object object0) {
                            this.result = object0;
                            this.label |= 0x80000000;
                            return continuation0.collect(null, this);
                        }
                    };
                }
                Object object0 = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10.result;
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10.L$0 = this;
                        flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10.L$1 = flowCollector0;
                        flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10.label = 1;
                        object0 = FlowKt.catchImpl(flow0, flowCollector0, flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10);
                        if(object0 == object1) {
                            return object1;
                        }
                        flowKt__ErrorsKt$catch$$inlined$unsafeFlow$10 = this;
                        break;
                    }
                    case 1: {
                        flowCollector0 = (FlowCollector)flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10.L$1;
                        flowKt__ErrorsKt$catch$$inlined$unsafeFlow$10 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.catch..inlined.unsafeFlow.1)flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10.L$0;
                        ResultKt.throwOnFailure(object0);
                        break;
                    }
                    case 2: {
                        ResultKt.throwOnFailure(object0);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(((Throwable)object0) != null) {
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10.L$0 = null;
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10.L$1 = null;
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10.label = 2;
                    if(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$10.$action$inlined.invoke(flowCollector0, ((Throwable)object0), flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$10) == object1) {
                        return object1;
                    }
                }
                return Unit.INSTANCE;
            }
        };
    }

    public static final Object catchImpl(Flow flow0, FlowCollector flowCollector0, Continuation continuation0) {
        ObjectRef ref$ObjectRef1;
        kotlinx.coroutines.flow.FlowKt__ErrorsKt.catchImpl.1 flowKt__ErrorsKt$catchImpl$10;
        if(continuation0 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt.catchImpl.1) {
            flowKt__ErrorsKt$catchImpl$10 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.catchImpl.1)continuation0;
            if((flowKt__ErrorsKt$catchImpl$10.label & 0x80000000) == 0) {
                flowKt__ErrorsKt$catchImpl$10 = new ContinuationImpl(continuation0) {
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return FlowKt.catchImpl(null, null, this);
                    }
                };
            }
            else {
                flowKt__ErrorsKt$catchImpl$10.label ^= 0x80000000;
            }
        }
        else {
            flowKt__ErrorsKt$catchImpl$10 = new ContinuationImpl(continuation0) {
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return FlowKt.catchImpl(null, null, this);
                }
            };
        }
        Object object0 = flowKt__ErrorsKt$catchImpl$10.result;
        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(flowKt__ErrorsKt$catchImpl$10.label) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                try {
                    FlowCollector flowCollector1 = new FlowCollector() {
                        @Override  // kotlinx.coroutines.flow.FlowCollector
                        public Object emit(Object object0, Continuation continuation0) {
                            kotlinx.coroutines.flow.FlowKt__ErrorsKt.catchImpl..inlined.collect.1 flowKt__ErrorsKt$catchImpl$$inlined$collect$10;
                            kotlinx.coroutines.flow.FlowKt__ErrorsKt.catchImpl..inlined.collect.1.1 flowKt__ErrorsKt$catchImpl$$inlined$collect$1$10;
                            if(continuation0 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt.catchImpl..inlined.collect.1.1) {
                                flowKt__ErrorsKt$catchImpl$$inlined$collect$1$10 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.catchImpl..inlined.collect.1.1)continuation0;
                                if((flowKt__ErrorsKt$catchImpl$$inlined$collect$1$10.label & 0x80000000) == 0) {
                                    flowKt__ErrorsKt$catchImpl$$inlined$collect$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                        Object L$0;
                                        int label;
                                        Object result;

                                        @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object object0) {
                                            this.result = object0;
                                            this.label |= 0x80000000;
                                            return continuation0.emit(null, this);
                                        }
                                    };
                                }
                                else {
                                    flowKt__ErrorsKt$catchImpl$$inlined$collect$1$10.label ^= 0x80000000;
                                }
                            }
                            else {
                                flowKt__ErrorsKt$catchImpl$$inlined$collect$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    Object L$0;
                                    int label;
                                    Object result;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object object0) {
                                        this.result = object0;
                                        this.label |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            Object object1 = flowKt__ErrorsKt$catchImpl$$inlined$collect$1$10.result;
                            Object object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            switch(flowKt__ErrorsKt$catchImpl$$inlined$collect$1$10.label) {
                                case 0: {
                                    ResultKt.throwOnFailure(object1);
                                    try {
                                        flowKt__ErrorsKt$catchImpl$$inlined$collect$1$10.L$0 = this;
                                        flowKt__ErrorsKt$catchImpl$$inlined$collect$1$10.label = 1;
                                        return flowCollector0.emit(object0, flowKt__ErrorsKt$catchImpl$$inlined$collect$1$10) == object2 ? object2 : Unit.INSTANCE;
                                    }
                                    catch(Throwable throwable0) {
                                        flowKt__ErrorsKt$catchImpl$$inlined$collect$10 = this;
                                        flowKt__ErrorsKt$catchImpl$$inlined$collect$10.$fromDownstream$inlined.element = throwable0;
                                        throw throwable0;
                                    }
                                }
                                case 1: {
                                    flowKt__ErrorsKt$catchImpl$$inlined$collect$10 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.catchImpl..inlined.collect.1)flowKt__ErrorsKt$catchImpl$$inlined$collect$1$10.L$0;
                                    try {
                                        ResultKt.throwOnFailure(object1);
                                        return Unit.INSTANCE;
                                    }
                                    catch(Throwable throwable0) {
                                    }
                                    flowKt__ErrorsKt$catchImpl$$inlined$collect$10.$fromDownstream$inlined.element = throwable0;
                                    throw throwable0;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                        }
                    };
                    flowKt__ErrorsKt$catchImpl$10.L$0 = ref$ObjectRef0;
                    flowKt__ErrorsKt$catchImpl$10.label = 1;
                    return flow0.collect(flowCollector1, flowKt__ErrorsKt$catchImpl$10) == object1 ? object1 : null;
                }
                catch(Throwable object2) {
                    ref$ObjectRef1 = ref$ObjectRef0;
                    goto label_28;
                }
                return object1;
            }
            case 1: {
                ref$ObjectRef1 = (ObjectRef)flowKt__ErrorsKt$catchImpl$10.L$0;
                try {
                    ResultKt.throwOnFailure(object0);
                    return null;
                }
                catch(Throwable object2) {
                }
            label_28:
                if(FlowKt__ErrorsKt.isSameExceptionAs$FlowKt__ErrorsKt(((Throwable)object2), ((Throwable)ref$ObjectRef1.element)) || FlowKt__ErrorsKt.isCancellationCause$FlowKt__ErrorsKt(((Throwable)object2), flowKt__ErrorsKt$catchImpl$10.getContext())) {
                    throw object2;
                }
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private static final boolean isCancellationCause$FlowKt__ErrorsKt(Throwable throwable0, CoroutineContext coroutineContext0) {
        Job job0 = (Job)coroutineContext0.get(Job.Key);
        return job0 == null || !job0.isCancelled() ? false : FlowKt__ErrorsKt.isSameExceptionAs$FlowKt__ErrorsKt(throwable0, job0.getCancellationException());
    }

    // 去混淆评级： 中等(70)
    private static final boolean isSameExceptionAs$FlowKt__ErrorsKt(Throwable throwable0, Throwable throwable1) {
        return throwable1 != null && Intrinsics.areEqual(throwable1, throwable0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use catch { e -> if (predicate(e)) emitAll(fallback) else throw e }", replaceWith = @ReplaceWith(expression = "catch { e -> if (predicate(e)) emitAll(fallback) else throw e }", imports = {}))
    public static final Flow onErrorCollect(Flow flow0, Flow flow1, Function1 function10) {
        return FlowKt.catch(flow0, new Function3(function10, flow1, null) {
            final Flow $fallback;
            final Function1 $predicate;
            private Object L$0;
            Object L$1;
            int label;

            {
                this.$predicate = function10;
                this.$fallback = flow0;
                super(3, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((FlowCollector)object0), ((Throwable)object1), ((Continuation)object2));
            }

            public final Object invoke(FlowCollector flowCollector0, Throwable throwable0, Continuation continuation0) {
                kotlinx.coroutines.flow.FlowKt__ErrorsKt.onErrorCollect.2 flowKt__ErrorsKt$onErrorCollect$20 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt.onErrorCollect.2(this.$predicate, this.$fallback, continuation0);
                flowKt__ErrorsKt$onErrorCollect$20.L$0 = flowCollector0;
                flowKt__ErrorsKt$onErrorCollect$20.L$1 = throwable0;
                return flowKt__ErrorsKt$onErrorCollect$20.invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        FlowCollector flowCollector0 = (FlowCollector)this.L$0;
                        Throwable throwable0 = (Throwable)this.L$1;
                        if(!((Boolean)this.$predicate.invoke(throwable0)).booleanValue()) {
                            throw throwable0;
                        }
                        this.L$0 = null;
                        this.label = 1;
                        return FlowKt.emitAll(flowCollector0, this.$fallback, this) == object1 ? object1 : Unit.INSTANCE;
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
        });
    }

    public static Flow onErrorCollect$default(Flow flow0, Flow flow1, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            function10 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.onErrorCollect.1.INSTANCE;
        }
        return FlowKt.onErrorCollect(flow0, flow1, function10);

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000B\n\u0000\u0010\u0004\u001A\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\n"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class kotlinx.coroutines.flow.FlowKt__ErrorsKt.onErrorCollect.1 extends Lambda implements Function1 {
            public static final kotlinx.coroutines.flow.FlowKt__ErrorsKt.onErrorCollect.1 INSTANCE;

            static {
                kotlinx.coroutines.flow.FlowKt__ErrorsKt.onErrorCollect.1.INSTANCE = new kotlinx.coroutines.flow.FlowKt__ErrorsKt.onErrorCollect.1();
            }

            kotlinx.coroutines.flow.FlowKt__ErrorsKt.onErrorCollect.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(((Throwable)object0)));
            }

            public final boolean invoke(Throwable throwable0) {
                return true;
            }
        }

    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "binary compatibility with retries: Int preview version")
    public static final Flow retry(Flow flow0, int v, Function1 function10) {
        if(v <= 0) {
            throw new IllegalArgumentException(("Expected positive amount of retries, but had " + v).toString());
        }
        return FlowKt.retryWhen(flow0, new Function4(function10, v, null) {
            final Function1 $predicate;
            final int $retries;
            long J$0;
            Object L$0;
            int label;

            {
                this.$predicate = function10;
                this.$retries = v;
                super(4, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function4
            public Object invoke(Object object0, Object object1, Object object2, Object object3) {
                return this.invoke(((FlowCollector)object0), ((Throwable)object1), ((Number)object2).longValue(), ((Continuation)object3));
            }

            public final Object invoke(FlowCollector flowCollector0, Throwable throwable0, long v, Continuation continuation0) {
                kotlinx.coroutines.flow.FlowKt__ErrorsKt.retry.6 flowKt__ErrorsKt$retry$60 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt.retry.6(this.$predicate, this.$retries, continuation0);
                flowKt__ErrorsKt$retry$60.L$0 = throwable0;
                flowKt__ErrorsKt$retry$60.J$0 = v;
                return flowKt__ErrorsKt$retry$60.invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                ResultKt.throwOnFailure(object0);
                long v = this.J$0;
                return !((Boolean)this.$predicate.invoke(((Throwable)this.L$0))).booleanValue() || v >= ((long)this.$retries) ? Boxing.boxBoolean(false) : Boxing.boxBoolean(true);
            }
        });
    }

    public static final Flow retry(Flow flow0, long v, Function2 function20) {
        if(v <= 0L) {
            throw new IllegalArgumentException(("Expected positive amount of retries, but had " + v).toString());
        }
        return FlowKt.retryWhen(flow0, new Function4(v, function20, null) {
            final Function2 $predicate;
            final long $retries;
            long J$0;
            Object L$0;
            int label;

            {
                this.$retries = v;
                this.$predicate = function20;
                super(4, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function4
            public Object invoke(Object object0, Object object1, Object object2, Object object3) {
                return this.invoke(((FlowCollector)object0), ((Throwable)object1), ((Number)object2).longValue(), ((Continuation)object3));
            }

            public final Object invoke(FlowCollector flowCollector0, Throwable throwable0, long v, Continuation continuation0) {
                kotlinx.coroutines.flow.FlowKt__ErrorsKt.retry.3 flowKt__ErrorsKt$retry$30 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt.retry.3(this.$retries, this.$predicate, continuation0);
                flowKt__ErrorsKt$retry$30.L$0 = throwable0;
                flowKt__ErrorsKt$retry$30.J$0 = v;
                return flowKt__ErrorsKt$retry$30.invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                boolean z = true;
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        Throwable throwable0 = (Throwable)this.L$0;
                        if(this.J$0 >= this.$retries) {
                            return Boxing.boxBoolean(false);
                        }
                        this.label = 1;
                        object0 = this.$predicate.invoke(throwable0, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        ResultKt.throwOnFailure(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(!((Boolean)object0).booleanValue()) {
                    z = false;
                }
                return Boxing.boxBoolean(z);
            }
        });
    }

    public static Flow retry$default(Flow flow0, int v, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0x7FFFFFFF;
        }
        if((v1 & 2) != 0) {
            function10 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.retry.4.INSTANCE;
        }
        return FlowKt.retry(flow0, v, function10);

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000B\n\u0000\u0010\u0004\u001A\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\n"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class kotlinx.coroutines.flow.FlowKt__ErrorsKt.retry.4 extends Lambda implements Function1 {
            public static final kotlinx.coroutines.flow.FlowKt__ErrorsKt.retry.4 INSTANCE;

            static {
                kotlinx.coroutines.flow.FlowKt__ErrorsKt.retry.4.INSTANCE = new kotlinx.coroutines.flow.FlowKt__ErrorsKt.retry.4();
            }

            kotlinx.coroutines.flow.FlowKt__ErrorsKt.retry.4() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(((Throwable)object0)));
            }

            public final boolean invoke(Throwable throwable0) {
                return true;
            }
        }

    }

    public static Flow retry$default(Flow flow0, long v, Function2 function20, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0x7FFFFFFFFFFFFFFFL;
        }
        if((v1 & 2) != 0) {
            function20 = new Function2(null) {
                int label;

                {
                    super(2, continuation0);
                }

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object object0, Continuation continuation0) {
                    return new kotlinx.coroutines.flow.FlowKt__ErrorsKt.retry.1(continuation0);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((Throwable)object0), ((Continuation)object1));
                }

                public final Object invoke(Throwable throwable0, Continuation continuation0) {
                    return ((kotlinx.coroutines.flow.FlowKt__ErrorsKt.retry.1)this.create(throwable0, continuation0)).invokeSuspend(Unit.INSTANCE);
                }

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object object0) {
                    if(this.label != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    ResultKt.throwOnFailure(object0);
                    return Boxing.boxBoolean(true);
                }
            };
        }
        return FlowKt.retry(flow0, v, function20);
    }

    public static final Flow retryWhen(Flow flow0, Function4 function40) {
        return new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector0, Continuation continuation0) {
                Throwable throwable0;
                kotlinx.coroutines.flow.FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$11;
                FlowCollector flowCollector1;
                int v1;
                kotlinx.coroutines.flow.FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$10;
                long v;
                kotlinx.coroutines.flow.FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1.1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10;
                if(continuation0 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1.1) {
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1.1)continuation0;
                    if((flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.label & 0x80000000) == 0) {
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                            int I$0;
                            long J$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            int label;
                            Object result;

                            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object object0) {
                                this.result = object0;
                                this.label |= 0x80000000;
                                return continuation0.collect(null, this);
                            }
                        };
                    }
                    else {
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.label ^= 0x80000000;
                    }
                }
                else {
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                        int I$0;
                        long J$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        int label;
                        Object result;

                        @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object object0) {
                            this.result = object0;
                            this.label |= 0x80000000;
                            return continuation0.collect(null, this);
                        }
                    };
                }
                Object object0 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.result;
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        v = 0L;
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$10 = this;
                        goto label_34;
                    }
                    case 1: {
                        v1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.I$0;
                        v = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.J$0;
                        flowCollector1 = (FlowCollector)flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.L$1;
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$11 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1)flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.L$0;
                        ResultKt.throwOnFailure(object0);
                        goto label_47;
                    }
                    case 2: {
                        v = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.J$0;
                        throwable0 = (Throwable)flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.L$2;
                        flowCollector1 = (FlowCollector)flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.L$1;
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$11 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.retryWhen..inlined.unsafeFlow.1)flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.L$0;
                        ResultKt.throwOnFailure(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(((Boolean)object0).booleanValue()) {
                    ++v;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$10 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$11;
                    v1 = 1;
                    while(true) {
                        if(v1 == 0) {
                            return Unit.INSTANCE;
                        }
                        flowCollector0 = flowCollector1;
                    label_34:
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.L$0 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$10;
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.L$1 = flowCollector0;
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.L$2 = null;
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.J$0 = v;
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.I$0 = 0;
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.label = 1;
                        Object object2 = FlowKt.catchImpl(flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$10.$this_retryWhen$inlined, flowCollector0, flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10);
                        if(object2 == object1) {
                            return object1;
                        }
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$11 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$10;
                        object0 = object2;
                        flowCollector1 = flowCollector0;
                        v1 = 0;
                    label_47:
                        if(((Throwable)object0) != null) {
                            break;
                        }
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$10 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$11;
                    }
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.L$0 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$11;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.L$1 = flowCollector1;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.L$2 = (Throwable)object0;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.J$0 = v;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10.label = 2;
                    Object object3 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$11.$predicate$inlined.invoke(flowCollector1, ((Throwable)object0), Boxing.boxLong(v), flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$10);
                    if(object3 == object1) {
                        return object1;
                    }
                    Throwable throwable1 = (Throwable)object0;
                    object0 = object3;
                    throwable0 = throwable1;
                }
                throw throwable0;
            }
        };
    }
}

