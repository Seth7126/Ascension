package androidx.compose.runtime;

import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0006\u001A\u0002H\u0007\"\u0004\b\u0000\u0010\u00072!\u0010\b\u001A\u001D\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u0002H\u00070\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000ER\u0016\u0010\u0003\u001A\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000F"}, d2 = {"Landroidx/compose/runtime/DefaultChoreographerFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "()V", "choreographer", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class DefaultChoreographerFrameClock implements MonotonicFrameClock {
    public static final DefaultChoreographerFrameClock INSTANCE;
    private static final Choreographer choreographer;

    static {
        DefaultChoreographerFrameClock.INSTANCE = new DefaultChoreographerFrameClock();
        DefaultChoreographerFrameClock.choreographer = (Choreographer)BuildersKt.runBlocking(Dispatchers.getMain().getImmediate(), new DefaultChoreographerFrameClock.choreographer.1(null));
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

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public CoroutineContext minusKey(Key coroutineContext$Key0) {
        return DefaultImpls.minusKey(this, coroutineContext$Key0);
    }

    @Override  // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext0) {
        return DefaultImpls.plus(this, coroutineContext0);
    }

    @Override  // androidx.compose.runtime.MonotonicFrameClock
    public Object withFrameNanos(Function1 function10, Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        Choreographer.FrameCallback choreographer$FrameCallback0 = new Choreographer.FrameCallback() {
            @Override  // android.view.Choreographer$FrameCallback
            public final void doFrame(long v) {
                Object object0;
                CancellableContinuation cancellableContinuation0;
                try {
                    cancellableContinuation0 = function10;
                    object0 = Result.constructor-impl(this.$onFrame.invoke(v));
                }
                catch(Throwable throwable0) {
                    object0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
                }
                cancellableContinuation0.resumeWith(object0);
            }
        };
        DefaultChoreographerFrameClock.choreographer.postFrameCallback(choreographer$FrameCallback0);
        cancellableContinuationImpl0.invokeOnCancellation(new Function1() {
            final Choreographer.FrameCallback $callback;

            {
                this.$callback = choreographer$FrameCallback0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(Throwable throwable0) {
                DefaultChoreographerFrameClock.choreographer.removeFrameCallback(this.$callback);
            }
        });
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }
}

