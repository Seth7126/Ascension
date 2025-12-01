package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\u001A\u0018\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0007\u001A\u0010\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"newFixedThreadPoolContext", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "nThreads", "", "name", "", "newSingleThreadContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ThreadPoolDispatcherKt {
    public static final ExecutorCoroutineDispatcher newFixedThreadPoolContext(int v, String s) {
        if(v < 1) {
            throw new IllegalArgumentException(("Expected at least one thread, but " + v + " specified").toString());
        }
        return new ThreadPoolDispatcher(v, s);
    }

    public static final ExecutorCoroutineDispatcher newSingleThreadContext(String s) {
        return ThreadPoolDispatcherKt.newFixedThreadPoolContext(1, s);
    }
}

