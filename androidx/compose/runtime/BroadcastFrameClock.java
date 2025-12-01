package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0012\u001A\u00020\u00042\f\b\u0002\u0010\u0013\u001A\u00060\u0014j\u0002`\u0015J\u0010\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0017\u001A\u00020\nH\u0002J\u000E\u0010\u0018\u001A\u00020\u00042\u0006\u0010\u0019\u001A\u00020\u001AJ+\u0010\u001B\u001A\u0002H\u001C\"\u0004\b\u0000\u0010\u001C2\u0012\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u0002H\u001C0\u001EH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001FR\u0018\u0010\u0006\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007X\u0082\u000E¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001A\u0004\u0018\u00010\nX\u0082\u000E¢\u0006\u0002\n\u0000R\u0011\u0010\u000B\u001A\u00020\f8F¢\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\u000E\u0010\u000F\u001A\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007X\u0082\u000E¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "onNewAwaiters", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "awaiters", "", "Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "failureCause", "", "hasAwaiters", "", "getHasAwaiters", "()Z", "lock", "", "spareList", "cancel", "cancellationException", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "fail", "cause", "sendFrame", "timeNanos", "", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "FrameAwaiter", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class BroadcastFrameClock implements MonotonicFrameClock {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\'\u0012\u0012\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u000E\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0005R\u0017\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u001D\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "R", "", "onFrame", "Lkotlin/Function1;", "", "continuation", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "getContinuation", "()Lkotlin/coroutines/Continuation;", "getOnFrame", "()Lkotlin/jvm/functions/Function1;", "resume", "", "timeNanos", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class FrameAwaiter {
        private final Continuation continuation;
        private final Function1 onFrame;

        public FrameAwaiter(Function1 function10, Continuation continuation0) {
            Intrinsics.checkNotNullParameter(function10, "onFrame");
            Intrinsics.checkNotNullParameter(continuation0, "continuation");
            super();
            this.onFrame = function10;
            this.continuation = continuation0;
        }

        public final Continuation getContinuation() {
            return this.continuation;
        }

        public final Function1 getOnFrame() {
            return this.onFrame;
        }

        public final void resume(long v) {
            Object object0;
            Continuation continuation0;
            try {
                continuation0 = this.continuation;
                object0 = Result.constructor-impl(this.getOnFrame().invoke(v));
            }
            catch(Throwable throwable0) {
                object0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
            }
            continuation0.resumeWith(object0);
        }
    }

    public static final int $stable = 8;
    private List awaiters;
    private Throwable failureCause;
    private final Object lock;
    private final Function0 onNewAwaiters;
    private List spareList;

    static {
    }

    public BroadcastFrameClock() {
        this(null, 1, null);
    }

    public BroadcastFrameClock(Function0 function00) {
        this.onNewAwaiters = function00;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
    }

    public BroadcastFrameClock(Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            function00 = null;
        }
        this(function00);
    }

    public final void cancel(CancellationException cancellationException0) {
        Intrinsics.checkNotNullParameter(cancellationException0, "cancellationException");
        this.fail(cancellationException0);
    }

    public static void cancel$default(BroadcastFrameClock broadcastFrameClock0, CancellationException cancellationException0, int v, Object object0) {
        if((v & 1) != 0) {
            cancellationException0 = new CancellationException("clock cancelled");
        }
        broadcastFrameClock0.cancel(cancellationException0);
    }

    private final void fail(Throwable throwable0) {
        synchronized(this.lock) {
            if(this.failureCause != null) {
                return;
            }
            this.failureCause = throwable0;
            List list0 = this.awaiters;
            int v1 = list0.size();
            if(v1 - 1 >= 0) {
                for(int v2 = 0; true; ++v2) {
                    ((FrameAwaiter)list0.get(v2)).getContinuation().resumeWith(Result.constructor-impl(ResultKt.createFailure(throwable0)));
                    if(v2 + 1 > v1 - 1) {
                        break;
                    }
                }
            }
            this.awaiters.clear();
        }
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public Object fold(Object object0, Function2 function20) {
        return DefaultImpls.fold(this, object0, function20);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public Element get(Key coroutineContext$Key0) {
        return DefaultImpls.get(this, coroutineContext$Key0);
    }

    public final boolean getHasAwaiters() {
        synchronized(this.lock) {
            boolean z = this.awaiters.isEmpty();
            return !z;
        }
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

    public final void sendFrame(long v) {
        synchronized(this.lock) {
            List list0 = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = list0;
            int v2 = list0.size();
            if(v2 > 0) {
                for(int v3 = 0; true; ++v3) {
                    ((FrameAwaiter)list0.get(v3)).resume(v);
                    if(v3 + 1 >= v2) {
                        break;
                    }
                }
            }
            list0.clear();
        }
    }

    @Override  // androidx.compose.runtime.MonotonicFrameClock
    public Object withFrameNanos(Function1 function10, Continuation continuation0) {
        boolean z = true;
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        synchronized(this.lock) {
            Throwable throwable0 = this.failureCause;
            if(throwable0 != null) {
                cancellableContinuationImpl0.resumeWith(Result.constructor-impl(ResultKt.createFailure(throwable0)));
                goto label_28;
            }
            ref$ObjectRef0.element = new FrameAwaiter(function10, cancellableContinuationImpl0);
            boolean z1 = !this.awaiters.isEmpty();
            List list0 = this.awaiters;
            if(ref$ObjectRef0.element != null) {
                list0.add(((FrameAwaiter)ref$ObjectRef0.element));
                if(z1) {
                    z = false;
                }
                cancellableContinuationImpl0.invokeOnCancellation(new Function1(ref$ObjectRef0) {
                    final ObjectRef $awaiter;

                    {
                        BroadcastFrameClock.this = broadcastFrameClock0;
                        this.$awaiter = ref$ObjectRef0;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((Throwable)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Throwable throwable0) {
                        Object object0 = BroadcastFrameClock.this.lock;
                        ObjectRef ref$ObjectRef0 = this.$awaiter;
                        synchronized(object0) {
                            List list0 = BroadcastFrameClock.this.awaiters;
                            if(ref$ObjectRef0.element != null) {
                                list0.remove(((FrameAwaiter)ref$ObjectRef0.element));
                                return;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("awaiter");
                        }
                        throw null;
                    }
                });
                if(Boxing.boxBoolean(z).booleanValue() && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    }
                    catch(Throwable throwable1) {
                        this.fail(throwable1);
                    }
                }
            label_28:
                Object object1 = cancellableContinuationImpl0.getResult();
                if(object1 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation0);
                }
                return object1;
            }
            Intrinsics.throwUninitializedPropertyAccessException("awaiter");
        }
        throw null;
    }
}

