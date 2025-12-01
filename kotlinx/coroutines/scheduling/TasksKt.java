package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0010\u0010\u0000\u001A\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001A\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000E\u0010\u0003\u001A\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0005\u001A\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001A\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\b\u001A\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000E\u0010\t\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\n\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u000B\u001A\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0012\u0010\f\u001A\u00020\r8\u0000@\u0000X\u0081\u000E¢\u0006\u0002\n\u0000\"\u0019\u0010\u000E\u001A\u00020\u000F*\u00020\u00108À\u0002X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u0011¨\u0006\u0012"}, d2 = {"BLOCKING_DEFAULT_PARALLELISM", "", "CORE_POOL_SIZE", "DEFAULT_DISPATCHER_NAME", "", "DEFAULT_SCHEDULER_NAME", "IDLE_WORKER_KEEP_ALIVE_NS", "", "MAX_POOL_SIZE", "TASK_NON_BLOCKING", "TASK_PROBABLY_BLOCKING", "WORK_STEALING_TIME_RESOLUTION_NS", "schedulerTimeSource", "Lkotlinx/coroutines/scheduling/SchedulerTimeSource;", "isBlocking", "", "Lkotlinx/coroutines/scheduling/Task;", "(Lkotlinx/coroutines/scheduling/Task;)Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class TasksKt {
    public static final int BLOCKING_DEFAULT_PARALLELISM = 0;
    public static final int CORE_POOL_SIZE = 0;
    public static final String DEFAULT_DISPATCHER_NAME = "Dispatchers.Default";
    public static final String DEFAULT_SCHEDULER_NAME = "DefaultDispatcher";
    public static final long IDLE_WORKER_KEEP_ALIVE_NS = 0L;
    public static final int MAX_POOL_SIZE = 0;
    public static final int TASK_NON_BLOCKING = 0;
    public static final int TASK_PROBABLY_BLOCKING = 1;
    public static final long WORK_STEALING_TIME_RESOLUTION_NS;
    public static SchedulerTimeSource schedulerTimeSource;

    static {
        TasksKt.WORK_STEALING_TIME_RESOLUTION_NS = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        TasksKt.BLOCKING_DEFAULT_PARALLELISM = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);
        int v = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.core.pool.size", RangesKt.coerceAtLeast(8, 2), 1, 0, 8, null);
        TasksKt.CORE_POOL_SIZE = v;
        TasksKt.MAX_POOL_SIZE = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.max.pool.size", RangesKt.coerceIn(0x400, v, 0x1FFFFE), 0, 0x1FFFFE, 4, null);
        TasksKt.IDLE_WORKER_KEEP_ALIVE_NS = TimeUnit.SECONDS.toNanos(SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        TasksKt.schedulerTimeSource = NanoTimeSource.INSTANCE;
    }

    public static final boolean isBlocking(Task task0) {
        return task0.taskContext.getTaskMode() == 1;
    }
}

