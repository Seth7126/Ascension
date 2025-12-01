package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0006\u0010\t\u001A\u00020\nJ\u0006\u0010\u000B\u001A\u00020\nJ:\u0010\f\u001A\u0002H\r\"\u0004\b\u0000\u0010\r2!\u0010\u000E\u001A\u001D\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u0002H\r0\u000FH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000E\u0010\u0002\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001A\u00020\u00058F¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0006R\u000E\u0010\u0007\u001A\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/PausableMonotonicFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "frameClock", "(Landroidx/compose/runtime/MonotonicFrameClock;)V", "isPaused", "", "()Z", "latch", "Landroidx/compose/runtime/Latch;", "pause", "", "resume", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PausableMonotonicFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private final MonotonicFrameClock frameClock;
    private final Latch latch;

    static {
    }

    public PausableMonotonicFrameClock(MonotonicFrameClock monotonicFrameClock0) {
        Intrinsics.checkNotNullParameter(monotonicFrameClock0, "frameClock");
        super();
        this.frameClock = monotonicFrameClock0;
        this.latch = new Latch();
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public Object fold(Object object0, Function2 function20) {
        return DefaultImpls.fold(this, object0, function20);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public Element get(Key coroutineContext$Key0) {
        return DefaultImpls.get(this, coroutineContext$Key0);
    }

    @Override  // androidx.compose.runtime.MonotonicFrameClock
    public Key getKey() {
        return DefaultImpls.getKey(this);
    }

    public final boolean isPaused() {
        return !this.latch.isOpen();
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public CoroutineContext minusKey(Key coroutineContext$Key0) {
        return DefaultImpls.minusKey(this, coroutineContext$Key0);
    }

    public final void pause() {
        this.latch.closeLatch();
    }

    @Override  // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext0) {
        return DefaultImpls.plus(this, coroutineContext0);
    }

    public final void resume() {
        this.latch.openLatch();
    }

    @Override  // androidx.compose.runtime.MonotonicFrameClock
    public Object withFrameNanos(Function1 function10, Continuation continuation0) {
        PausableMonotonicFrameClock pausableMonotonicFrameClock0;
        androidx.compose.runtime.PausableMonotonicFrameClock.withFrameNanos.1 pausableMonotonicFrameClock$withFrameNanos$10;
        if(continuation0 instanceof androidx.compose.runtime.PausableMonotonicFrameClock.withFrameNanos.1) {
            pausableMonotonicFrameClock$withFrameNanos$10 = (androidx.compose.runtime.PausableMonotonicFrameClock.withFrameNanos.1)continuation0;
            if((pausableMonotonicFrameClock$withFrameNanos$10.label & 0x80000000) == 0) {
                pausableMonotonicFrameClock$withFrameNanos$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return continuation0.withFrameNanos(null, this);
                    }
                };
            }
            else {
                pausableMonotonicFrameClock$withFrameNanos$10.label ^= 0x80000000;
            }
        }
        else {
            pausableMonotonicFrameClock$withFrameNanos$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return continuation0.withFrameNanos(null, this);
                }
            };
        }
        Object object0 = pausableMonotonicFrameClock$withFrameNanos$10.result;
        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(pausableMonotonicFrameClock$withFrameNanos$10.label) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                pausableMonotonicFrameClock$withFrameNanos$10.L$0 = this;
                pausableMonotonicFrameClock$withFrameNanos$10.L$1 = function10;
                pausableMonotonicFrameClock$withFrameNanos$10.label = 1;
                if(this.latch.await(pausableMonotonicFrameClock$withFrameNanos$10) == object1) {
                    return object1;
                }
                pausableMonotonicFrameClock0 = this;
                break;
            }
            case 1: {
                function10 = (Function1)pausableMonotonicFrameClock$withFrameNanos$10.L$1;
                pausableMonotonicFrameClock0 = (PausableMonotonicFrameClock)pausableMonotonicFrameClock$withFrameNanos$10.L$0;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        pausableMonotonicFrameClock$withFrameNanos$10.L$0 = null;
        pausableMonotonicFrameClock$withFrameNanos$10.L$1 = null;
        pausableMonotonicFrameClock$withFrameNanos$10.label = 2;
        object0 = pausableMonotonicFrameClock0.frameClock.withFrameNanos(function10, pausableMonotonicFrameClock$withFrameNanos$10);
        return object0 == object1 ? object1 : object0;
    }
}

