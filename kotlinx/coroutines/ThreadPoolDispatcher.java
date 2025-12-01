package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001A\u00020\u000EH\u0016J\b\u0010\u000F\u001A\u00020\u0005H\u0016R\u0014\u0010\u0007\u001A\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0004\u001A\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u000B\u001A\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/ThreadPoolDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcherBase;", "nThreads", "", "name", "", "(ILjava/lang/String;)V", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "threadNo", "Ljava/util/concurrent/atomic/AtomicInteger;", "close", "", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ThreadPoolDispatcher extends ExecutorCoroutineDispatcherBase {
    private final Executor executor;
    private final int nThreads;
    private final String name;
    private final AtomicInteger threadNo;

    // 检测为 Lambda 实现
    public static Thread $r8$lambda$W24uUimg9kaJilc37Etkfwyjyfs(ThreadPoolDispatcher threadPoolDispatcher0, Runnable runnable0) [...]

    public ThreadPoolDispatcher(int v, String s) {
        this.nThreads = v;
        this.name = s;
        this.threadNo = new AtomicInteger();
        this.executor = Executors.newScheduledThreadPool(v, (Runnable runnable0) -> ThreadPoolDispatcher.executor$lambda-0(this, runnable0));
        this.initFutureCancellation$kotlinx_coroutines_core();
    }

    @Override  // kotlinx.coroutines.ExecutorCoroutineDispatcherBase
    public void close() {
        ((ExecutorService)this.getExecutor()).shutdown();
    }

    private static final Thread executor$lambda-0(ThreadPoolDispatcher threadPoolDispatcher0, Runnable runnable0) {
        return threadPoolDispatcher0.nThreads == 1 ? new PoolThread(threadPoolDispatcher0, runnable0, threadPoolDispatcher0.name) : new PoolThread(threadPoolDispatcher0, runnable0, threadPoolDispatcher0.name + '-' + threadPoolDispatcher0.threadNo.incrementAndGet());
    }

    @Override  // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public Executor getExecutor() {
        return this.executor;
    }

    @Override  // kotlinx.coroutines.ExecutorCoroutineDispatcherBase
    public String toString() {
        return "ThreadPoolDispatcher[" + this.nThreads + ", " + this.name + ']';
    }
}

