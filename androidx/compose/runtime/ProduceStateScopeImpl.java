package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001B\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001F\u0010\u000F\u001A\u00020\u00102\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u000E\u0010\u0015\u001A\u00028\u0000H\u0096\u0003¢\u0006\u0002\u0010\fJ\u0015\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0017H\u0096\u0003R\u0014\u0010\u0005\u001A\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0018\u0010\n\u001A\u00028\u0000X\u0096\u000F¢\u0006\f\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000E\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/ProduceStateScopeImpl;", "T", "Landroidx/compose/runtime/ProduceStateScope;", "Landroidx/compose/runtime/MutableState;", "state", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/CoroutineContext;)V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "awaitDispose", "", "onDispose", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "component1", "component2", "Lkotlin/Function1;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class ProduceStateScopeImpl implements MutableState, ProduceStateScope {
    private final MutableState $$delegate_0;
    private final CoroutineContext coroutineContext;

    public ProduceStateScopeImpl(MutableState mutableState0, CoroutineContext coroutineContext0) {
        Intrinsics.checkNotNullParameter(mutableState0, "state");
        Intrinsics.checkNotNullParameter(coroutineContext0, "coroutineContext");
        super();
        this.coroutineContext = coroutineContext0;
        this.$$delegate_0 = mutableState0;
    }

    @Override  // androidx.compose.runtime.ProduceStateScope
    public Object awaitDispose(Function0 function00, Continuation continuation0) {
        androidx.compose.runtime.ProduceStateScopeImpl.awaitDispose.1 produceStateScopeImpl$awaitDispose$10;
        if(continuation0 instanceof androidx.compose.runtime.ProduceStateScopeImpl.awaitDispose.1) {
            produceStateScopeImpl$awaitDispose$10 = (androidx.compose.runtime.ProduceStateScopeImpl.awaitDispose.1)continuation0;
            if((produceStateScopeImpl$awaitDispose$10.label & 0x80000000) == 0) {
                produceStateScopeImpl$awaitDispose$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return continuation0.awaitDispose(null, this);
                    }
                };
            }
            else {
                produceStateScopeImpl$awaitDispose$10.label ^= 0x80000000;
            }
        }
        else {
            produceStateScopeImpl$awaitDispose$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return continuation0.awaitDispose(null, this);
                }
            };
        }
        Object object0 = produceStateScopeImpl$awaitDispose$10.result;
        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(produceStateScopeImpl$awaitDispose$10.label) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    produceStateScopeImpl$awaitDispose$10.L$0 = function00;
                    produceStateScopeImpl$awaitDispose$10.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(produceStateScopeImpl$awaitDispose$10), 1);
                    cancellableContinuationImpl0.initCancellability();
                    Object object2 = cancellableContinuationImpl0.getResult();
                    if(object2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(produceStateScopeImpl$awaitDispose$10);
                    }
                    if(object2 != object1) {
                        throw new KotlinNothingValueException();
                    }
                    return object1;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                function00 = (Function0)produceStateScopeImpl$awaitDispose$10.L$0;
                try {
                    ResultKt.throwOnFailure(object0);
                    throw new KotlinNothingValueException();
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        function00.invoke();
        throw throwable0;
    }

    @Override  // androidx.compose.runtime.MutableState
    public Object component1() {
        return this.$$delegate_0.component1();
    }

    @Override  // androidx.compose.runtime.MutableState
    public Function1 component2() {
        return this.$$delegate_0.component2();
    }

    @Override  // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override  // androidx.compose.runtime.MutableState
    public Object getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override  // androidx.compose.runtime.MutableState
    public void setValue(Object object0) {
        this.$$delegate_0.setValue(object0);
    }
}

