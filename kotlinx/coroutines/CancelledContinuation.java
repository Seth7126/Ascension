package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0000\u0018\u00002\u00020\fB%\u0012\n\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u0001\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001A\u00020\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lkotlinx/coroutines/CancelledContinuation;", "Lkotlin/coroutines/Continuation;", "continuation", "", "cause", "", "handled", "<init>", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;Z)V", "makeResumed", "()Z", "kotlinx-coroutines-core", "Lkotlinx/coroutines/CompletedExceptionally;"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class CancelledContinuation extends CompletedExceptionally {
    private volatile int _resumed;
    private static final AtomicIntegerFieldUpdater _resumed$FU;

    static {
        CancelledContinuation._resumed$FU = AtomicIntegerFieldUpdater.newUpdater(CancelledContinuation.class, "_resumed");
    }

    public CancelledContinuation(Continuation continuation0, Throwable throwable0, boolean z) {
        if(throwable0 == null) {
            throwable0 = new CancellationException("Continuation " + continuation0 + " was cancelled normally");
        }
        super(throwable0, z);
        this._resumed = 0;
    }

    public final boolean makeResumed() {
        return CancelledContinuation._resumed$FU.compareAndSet(this, 0, 1);
    }
}

