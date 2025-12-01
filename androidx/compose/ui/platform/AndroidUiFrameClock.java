package androidx.compose.ui.platform;

import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock.DefaultImpls;
import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J+\u0010\u0007\u001A\u0002H\b\"\u0004\b\u0000\u0010\b2\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u0002H\b0\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "choreographer", "Landroid/view/Choreographer;", "(Landroid/view/Choreographer;)V", "getChoreographer", "()Landroid/view/Choreographer;", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private final Choreographer choreographer;

    static {
    }

    public AndroidUiFrameClock(Choreographer choreographer0) {
        Intrinsics.checkNotNullParameter(choreographer0, "choreographer");
        super();
        this.choreographer = choreographer0;
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public Object fold(Object object0, Function2 function20) {
        return DefaultImpls.fold(this, object0, function20);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public Element get(Key coroutineContext$Key0) {
        return DefaultImpls.get(this, coroutineContext$Key0);
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
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
        Element coroutineContext$Element0 = continuation0.getContext().get(ContinuationInterceptor.Key);
        AndroidUiDispatcher androidUiDispatcher0 = coroutineContext$Element0 instanceof AndroidUiDispatcher ? ((AndroidUiDispatcher)coroutineContext$Element0) : null;
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        Choreographer.FrameCallback choreographer$FrameCallback0 = new Choreographer.FrameCallback() {
            @Override  // android.view.Choreographer$FrameCallback
            public final void doFrame(long v) {
                Object object0;
                CancellableContinuation cancellableContinuation0;
                try {
                    cancellableContinuation0 = this;
                    object0 = Result.constructor-impl(this.$onFrame.invoke(v));
                }
                catch(Throwable throwable0) {
                    object0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
                }
                cancellableContinuation0.resumeWith(object0);
            }
        };
        if(androidUiDispatcher0 == null || !Intrinsics.areEqual(androidUiDispatcher0.getChoreographer(), this.getChoreographer())) {
            this.getChoreographer().postFrameCallback(choreographer$FrameCallback0);
            cancellableContinuationImpl0.invokeOnCancellation(new Function1(choreographer$FrameCallback0) {
                final Choreographer.FrameCallback $callback;

                {
                    AndroidUiFrameClock.this = androidUiFrameClock0;
                    this.$callback = choreographer$FrameCallback0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((Throwable)object0));
                    return Unit.INSTANCE;
                }

                public final void invoke(Throwable throwable0) {
                    AndroidUiFrameClock.this.getChoreographer().removeFrameCallback(this.$callback);
                }
            });
        }
        else {
            androidUiDispatcher0.postFrameCallback$ui_release(choreographer$FrameCallback0);
            cancellableContinuationImpl0.invokeOnCancellation(new Function1(choreographer$FrameCallback0) {
                final Choreographer.FrameCallback $callback;
                final AndroidUiDispatcher $uiDispatcher;

                {
                    this.$uiDispatcher = androidUiDispatcher0;
                    this.$callback = choreographer$FrameCallback0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((Throwable)object0));
                    return Unit.INSTANCE;
                }

                public final void invoke(Throwable throwable0) {
                    this.$uiDispatcher.removeFrameCallback$ui_release(this.$callback);
                }
            });
        }
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }
}

