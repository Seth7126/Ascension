package kotlinx.coroutines;

import java.util.concurrent.ThreadFactory;

public final class ThreadPoolDispatcher..ExternalSyntheticLambda0 implements ThreadFactory {
    public final ThreadPoolDispatcher f$0;

    public ThreadPoolDispatcher..ExternalSyntheticLambda0(ThreadPoolDispatcher threadPoolDispatcher0) {
        this.f$0 = threadPoolDispatcher0;
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        return ThreadPoolDispatcher.$r8$lambda$W24uUimg9kaJilc37Etkfwyjyfs(this.f$0, runnable0);
    }
}

