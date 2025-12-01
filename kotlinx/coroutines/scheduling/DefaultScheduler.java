package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001A\u00020\bH\u0016J\b\u0010\t\u001A\u00020\nH\u0007J\b\u0010\u000B\u001A\u00020\nH\u0016R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/scheduling/DefaultScheduler;", "Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "()V", "IO", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIO", "()Lkotlinx/coroutines/CoroutineDispatcher;", "close", "", "toDebugString", "", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DefaultScheduler extends ExperimentalCoroutineDispatcher {
    public static final DefaultScheduler INSTANCE;
    private static final CoroutineDispatcher IO;

    static {
        DefaultScheduler defaultScheduler0 = new DefaultScheduler();
        DefaultScheduler.INSTANCE = defaultScheduler0;
        DefaultScheduler.IO = new LimitingDispatcher(defaultScheduler0, SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.io.parallelism", RangesKt.coerceAtLeast(0x40, 8), 0, 0, 12, null), "Dispatchers.IO", 1);
    }

    private DefaultScheduler() {
        super(0, 0, null, 7, null);
    }

    @Override  // kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final CoroutineDispatcher getIO() {
        return DefaultScheduler.IO;
    }

    public final String toDebugString() {
        return super.toString();
    }

    @Override  // kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher
    public String toString() {
        return "Dispatchers.Default";
    }
}

