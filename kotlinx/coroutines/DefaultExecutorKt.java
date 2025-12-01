package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001A\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"DefaultDelay", "Lkotlinx/coroutines/Delay;", "getDefaultDelay", "()Lkotlinx/coroutines/Delay;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class DefaultExecutorKt {
    private static final Delay DefaultDelay;

    static {
        DefaultExecutorKt.DefaultDelay = DefaultExecutor.INSTANCE;
    }

    public static final Delay getDefaultDelay() {
        return DefaultExecutorKt.DefaultDelay;
    }
}

