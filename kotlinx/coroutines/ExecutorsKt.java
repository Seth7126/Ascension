package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0011\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001A\u0011\u0010\u0000\u001A\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\b\u0003\u001A\n\u0010\u0006\u001A\u00020\u0002*\u00020\u0001¨\u0006\u0007"}, d2 = {"asCoroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "from", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/ExecutorService;", "asExecutor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ExecutorsKt {
    public static final Executor asExecutor(CoroutineDispatcher coroutineDispatcher0) {
        ExecutorCoroutineDispatcher executorCoroutineDispatcher0 = coroutineDispatcher0 instanceof ExecutorCoroutineDispatcher ? ((ExecutorCoroutineDispatcher)coroutineDispatcher0) : null;
        return executorCoroutineDispatcher0 == null ? new DispatcherExecutor(coroutineDispatcher0) : executorCoroutineDispatcher0.getExecutor();
    }

    public static final CoroutineDispatcher from(Executor executor0) {
        CoroutineDispatcher coroutineDispatcher0 = null;
        DispatcherExecutor dispatcherExecutor0 = executor0 instanceof DispatcherExecutor ? ((DispatcherExecutor)executor0) : null;
        if(dispatcherExecutor0 != null) {
            coroutineDispatcher0 = dispatcherExecutor0.dispatcher;
        }
        return coroutineDispatcher0 == null ? new ExecutorCoroutineDispatcherImpl(executor0) : coroutineDispatcher0;
    }

    public static final ExecutorCoroutineDispatcher from(ExecutorService executorService0) {
        return new ExecutorCoroutineDispatcherImpl(executorService0);
    }
}

