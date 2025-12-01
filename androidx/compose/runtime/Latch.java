package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\r\u001A\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000EJ\u0006\u0010\u000F\u001A\u00020\bJ\u0006\u0010\u0010\u001A\u00020\bJ%\u0010\u0011\u001A\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u0002H\u00120\u0014H\u0086\bø\u0001\u0001¢\u0006\u0002\u0010\u0015R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u000E¢\u0006\u0002\n\u0000R\u001A\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001A\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u000E\u0010\u000B\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001A\u0010\f\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000E¢\u0006\u0002\n\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/Latch;", "", "()V", "_isOpen", "", "awaiters", "", "Lkotlin/coroutines/Continuation;", "", "isOpen", "()Z", "lock", "spareList", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "closeLatch", "openLatch", "withClosed", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Latch {
    private boolean _isOpen;
    private List awaiters;
    private final Object lock;
    private List spareList;

    public Latch() {
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
        this._isOpen = true;
    }

    public final Object await(Continuation continuation0) {
        if(this.isOpen()) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        synchronized(this.lock) {
            this.awaiters.add(cancellableContinuationImpl0);
        }
        cancellableContinuationImpl0.invokeOnCancellation(new Function1(cancellableContinuationImpl0) {
            final CancellableContinuation $co;

            {
                Latch.this = latch0;
                this.$co = cancellableContinuation0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(Throwable throwable0) {
                synchronized(Latch.this.lock) {
                    Latch.this.awaiters.remove(this.$co);
                }
            }
        });
        Object object1 = cancellableContinuationImpl0.getResult();
        if(object1 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    public final void closeLatch() {
        synchronized(this.lock) {
            this._isOpen = false;
        }
    }

    public final boolean isOpen() {
        synchronized(this.lock) {
        }
        return this._isOpen;
    }

    public final void openLatch() {
        synchronized(this.lock) {
            if(this.isOpen()) {
                return;
            }
            List list0 = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = list0;
            this._isOpen = true;
            int v1 = list0.size();
            if(v1 > 0) {
                for(int v2 = 0; true; ++v2) {
                    ((Continuation)list0.get(v2)).resumeWith(Unit.INSTANCE);
                    if(v2 + 1 >= v1) {
                        break;
                    }
                }
            }
            list0.clear();
        }
    }

    public final Object withClosed(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        this.closeLatch();
        try {
            return function00.invoke();
        }
        finally {
            this.openLatch();
        }
    }
}

