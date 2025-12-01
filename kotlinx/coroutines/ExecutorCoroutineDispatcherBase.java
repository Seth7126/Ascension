package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ConcurrentKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH\u0002J\b\u0010\f\u001A\u00020\u0007H\u0016J\u001C\u0010\r\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\n\u0010\u000E\u001A\u00060\u000Fj\u0002`\u0010H\u0016J\u0013\u0010\u0011\u001A\u00020\u00052\b\u0010\u0012\u001A\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001A\u00020\u0015H\u0016J\r\u0010\u0016\u001A\u00020\u0007H\u0000¢\u0006\u0002\b\u0017J$\u0010\u0018\u001A\u00020\u00192\u0006\u0010\u001A\u001A\u00020\u001B2\n\u0010\u000E\u001A\u00060\u000Fj\u0002`\u00102\u0006\u0010\b\u001A\u00020\tH\u0016J*\u0010\u001C\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u001D2\n\u0010\u000E\u001A\u00060\u000Fj\u0002`\u00102\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\u001A\u001A\u00020\u001BH\u0002J\u001E\u0010\u001E\u001A\u00020\u00072\u0006\u0010\u001A\u001A\u00020\u001B2\f\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00070 H\u0016J\b\u0010!\u001A\u00020\"H\u0016R\u000E\u0010\u0004\u001A\u00020\u0005X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcherBase;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "()V", "removesFutureOnCancellation", "", "cancelJobOnRejection", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "Ljava/util/concurrent/RejectedExecutionException;", "close", "dispatch", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "equals", "other", "", "hashCode", "", "initFutureCancellation", "initFutureCancellation$kotlinx_coroutines_core", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "scheduleBlock", "Ljava/util/concurrent/ScheduledFuture;", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class ExecutorCoroutineDispatcherBase extends ExecutorCoroutineDispatcher implements Delay {
    private boolean removesFutureOnCancellation;

    private final void cancelJobOnRejection(CoroutineContext coroutineContext0, RejectedExecutionException rejectedExecutionException0) {
        JobKt.cancel(coroutineContext0, ExceptionsKt.CancellationException("The task was rejected", rejectedExecutionException0));
    }

    @Override  // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public void close() {
        Executor executor0 = this.getExecutor();
        ExecutorService executorService0 = executor0 instanceof ExecutorService ? ((ExecutorService)executor0) : null;
        if(executorService0 != null) {
            executorService0.shutdown();
        }
    }

    @Override  // kotlinx.coroutines.Delay
    public Object delay(long v, Continuation continuation0) {
        return DefaultImpls.delay(this, v, continuation0);
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext coroutineContext0, Runnable runnable0) {
        try {
            AbstractTimeSource abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
            this.getExecutor().execute((abstractTimeSource0 == null ? runnable0 : abstractTimeSource0.wrapTask(runnable0)));
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            AbstractTimeSource abstractTimeSource1 = AbstractTimeSourceKt.getTimeSource();
            if(abstractTimeSource1 != null) {
                abstractTimeSource1.unTrackTask();
            }
            this.cancelJobOnRejection(coroutineContext0, rejectedExecutionException0);
            Dispatchers.getIO().dispatch(coroutineContext0, runnable0);
        }
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof ExecutorCoroutineDispatcherBase && ((ExecutorCoroutineDispatcherBase)object0).getExecutor() == this.getExecutor();
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this.getExecutor());
    }

    public final void initFutureCancellation$kotlinx_coroutines_core() {
        this.removesFutureOnCancellation = ConcurrentKt.removeFutureOnCancel(this.getExecutor());
    }

    @Override  // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long v, Runnable runnable0, CoroutineContext coroutineContext0) {
        ScheduledFuture scheduledFuture0 = this.removesFutureOnCancellation ? this.scheduleBlock(runnable0, coroutineContext0, v) : null;
        return scheduledFuture0 != null ? new DisposableFutureHandle(scheduledFuture0) : DefaultExecutor.INSTANCE.invokeOnTimeout(v, runnable0, coroutineContext0);
    }

    private final ScheduledFuture scheduleBlock(Runnable runnable0, CoroutineContext coroutineContext0, long v) {
        try {
            Executor executor0 = this.getExecutor();
            ScheduledExecutorService scheduledExecutorService0 = executor0 instanceof ScheduledExecutorService ? ((ScheduledExecutorService)executor0) : null;
            if(scheduledExecutorService0 != null) {
                return scheduledExecutorService0.schedule(runnable0, v, TimeUnit.MILLISECONDS);
            }
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            this.cancelJobOnRejection(coroutineContext0, rejectedExecutionException0);
        }
        return null;
    }

    @Override  // kotlinx.coroutines.Delay
    public void scheduleResumeAfterDelay(long v, CancellableContinuation cancellableContinuation0) {
        ScheduledFuture scheduledFuture0 = this.removesFutureOnCancellation ? this.scheduleBlock(new ResumeUndispatchedRunnable(this, cancellableContinuation0), cancellableContinuation0.getContext(), v) : null;
        if(scheduledFuture0 != null) {
            JobKt.cancelFutureOnCancellation(cancellableContinuation0, scheduledFuture0);
            return;
        }
        DefaultExecutor.INSTANCE.scheduleResumeAfterDelay(v, cancellableContinuation0);
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return this.getExecutor().toString();
    }
}

