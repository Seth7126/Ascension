package kotlinx.coroutines;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class CommonPool..ExternalSyntheticLambda0 implements ThreadFactory {
    public final AtomicInteger f$0;

    public CommonPool..ExternalSyntheticLambda0(AtomicInteger atomicInteger0) {
        this.f$0 = atomicInteger0;
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        return CommonPool.$r8$lambda$ERvPtt6BNpepqyLHHf5J6mHx7SQ(this.f$0, runnable0);
    }
}

