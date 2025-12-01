package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractTimeSource;
import kotlinx.coroutines.AbstractTimeSourceKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.internal.Symbol;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u0000 X2\u00020\\2\u00020]:\u0003XYZB+\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0001\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH\u0002\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0018\u0010\u0010\u001A\u00020\u00012\u0006\u0010\u000F\u001A\u00020\u0004H\u0086\b\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001A\u00020\u00012\u0006\u0010\u000F\u001A\u00020\u0004H\u0082\b\u00A2\u0006\u0004\b\u0012\u0010\u0011J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\u0001H\u0002\u00A2\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001D\u001A\u00020\n2\n\u0010\u001A\u001A\u00060\u0018j\u0002`\u00192\u0006\u0010\u001C\u001A\u00020\u001B\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0018\u0010\u001F\u001A\u00020\u00012\u0006\u0010\u000F\u001A\u00020\u0004H\u0082\b\u00A2\u0006\u0004\b\u001F\u0010\u0011J\u0015\u0010!\u001A\b\u0018\u00010 R\u00020\u0000H\u0002\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\u0013H\u0082\b\u00A2\u0006\u0004\b#\u0010\u0015J\u0010\u0010$\u001A\u00020\u0001H\u0082\b\u00A2\u0006\u0004\b$\u0010\u0017J-\u0010&\u001A\u00020\u00132\n\u0010\u001A\u001A\u00060\u0018j\u0002`\u00192\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0002\u0010%\u001A\u00020\f\u00A2\u0006\u0004\b&\u0010\'J\u001B\u0010)\u001A\u00020\u00132\n\u0010(\u001A\u00060\u0018j\u0002`\u0019H\u0016\u00A2\u0006\u0004\b)\u0010*J\u0010\u0010+\u001A\u00020\u0004H\u0082\b\u00A2\u0006\u0004\b+\u0010,J\u0010\u0010-\u001A\u00020\u0001H\u0082\b\u00A2\u0006\u0004\b-\u0010\u0017J\u001B\u0010/\u001A\u00020\u00012\n\u0010.\u001A\u00060 R\u00020\u0000H\u0002\u00A2\u0006\u0004\b/\u00100J\u0015\u00101\u001A\b\u0018\u00010 R\u00020\u0000H\u0002\u00A2\u0006\u0004\b1\u0010\"J\u0019\u00102\u001A\u00020\f2\n\u0010.\u001A\u00060 R\u00020\u0000\u00A2\u0006\u0004\b2\u00103J)\u00106\u001A\u00020\u00132\n\u0010.\u001A\u00060 R\u00020\u00002\u0006\u00104\u001A\u00020\u00012\u0006\u00105\u001A\u00020\u0001\u00A2\u0006\u0004\b6\u00107J\u0010\u00108\u001A\u00020\u0004H\u0082\b\u00A2\u0006\u0004\b8\u0010,J\u0015\u00109\u001A\u00020\u00132\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b9\u0010:J\u0015\u0010<\u001A\u00020\u00132\u0006\u0010;\u001A\u00020\u0004\u00A2\u0006\u0004\b<\u0010=J\u0017\u0010?\u001A\u00020\u00132\u0006\u0010>\u001A\u00020\fH\u0002\u00A2\u0006\u0004\b?\u0010@J\r\u0010A\u001A\u00020\u0013\u00A2\u0006\u0004\bA\u0010\u0015J\u000F\u0010B\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001A\u00020\fH\u0082\b\u00A2\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u0004H\u0002\u00A2\u0006\u0004\bF\u0010GJ\u000F\u0010H\u001A\u00020\fH\u0002\u00A2\u0006\u0004\bH\u0010EJ+\u0010I\u001A\u0004\u0018\u00010\n*\b\u0018\u00010 R\u00020\u00002\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010%\u001A\u00020\fH\u0002\u00A2\u0006\u0004\bI\u0010JR\u0017\u0010\u0010\u001A\u00020\u00018\u00C2\u0002@\u0002X\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\bK\u0010\u0017R\u0016\u0010\u0002\u001A\u00020\u00018\u0006@\u0007X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0002\u0010LR\u0017\u0010\u001F\u001A\u00020\u00018\u00C2\u0002@\u0002X\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\bM\u0010\u0017R\u0016\u0010O\u001A\u00020N8\u0006@\u0007X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001A\u00020N8\u0006@\u0007X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bQ\u0010PR\u0016\u0010\u0005\u001A\u00020\u00048\u0006@\u0007X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0005\u0010RR\u0013\u0010S\u001A\u00020\f8F@\u0006\u00A2\u0006\u0006\u001A\u0004\bS\u0010ER\u0016\u0010\u0003\u001A\u00020\u00018\u0006@\u0007X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0003\u0010LR\u0016\u0010\u0007\u001A\u00020\u00068\u0006@\u0007X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0007\u0010TR\"\u0010V\u001A\u000E\u0012\n\u0012\b\u0018\u00010 R\u00020\u00000U8\u0006@\u0007X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bV\u0010W\u00A8\u0006["}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlinx/coroutines/scheduling/Task;", "task", "", "addToGlobalQueue", "(Lkotlinx/coroutines/scheduling/Task;)Z", "state", "availableCpuPermits", "(J)I", "blockingTasks", "", "close", "()V", "createNewWorker", "()I", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "createTask", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;)Lkotlinx/coroutines/scheduling/Task;", "createdWorkers", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "currentWorker", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "decrementBlockingTasks", "decrementCreatedWorkers", "tailDispatch", "dispatch", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;Z)V", "command", "execute", "(Ljava/lang/Runnable;)V", "incrementBlockingTasks", "()J", "incrementCreatedWorkers", "worker", "parkedWorkersStackNextIndex", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)I", "parkedWorkersStackPop", "parkedWorkersStackPush", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)Z", "oldIndex", "newIndex", "parkedWorkersStackTopUpdate", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;II)V", "releaseCpuPermit", "runSafely", "(Lkotlinx/coroutines/scheduling/Task;)V", "timeout", "shutdown", "(J)V", "skipUnpark", "signalBlockingWork", "(Z)V", "signalCpuWork", "toString", "()Ljava/lang/String;", "tryAcquireCpuPermit", "()Z", "tryCreateWorker", "(J)Z", "tryUnpark", "submitToLocalQueue", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "getAvailableCpuPermits", "I", "getCreatedWorkers", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalBlockingQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalCpuQueue", "J", "isTerminated", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "workers", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class CoroutineScheduler implements Closeable, Executor {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\u000B\u001A\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000E\u0010\f\u001A\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001A\u00020\u000E8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u000F\u001A\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\u0010\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\u0011\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\u0012\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\u0013\u001A\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", "", "()V", "BLOCKING_MASK", "", "BLOCKING_SHIFT", "", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[WorkerState.values().length];
            arr_v[WorkerState.PARKING.ordinal()] = 1;
            arr_v[WorkerState.BLOCKING.ordinal()] = 2;
            arr_v[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            arr_v[WorkerState.DORMANT.ordinal()] = 4;
            arr_v[WorkerState.TERMINATED.ordinal()] = 5;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0080\u0004\u0018\u00002\u00020GB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u00A2\u0006\u0004\b\u0003\u0010\u0004B\t\b\u0002\u00A2\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0001H\u0002\u00A2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0001H\u0002\u00A2\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u000BH\u0002\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0019\u0010\u0011\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\u0010\u001A\u00020\u000FH\u0002\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\u0010\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001A\u00020\u00072\u0006\u0010\u0014\u001A\u00020\u0001H\u0002\u00A2\u0006\u0004\b\u0015\u0010\tJ\u000F\u0010\u0016\u001A\u00020\u000FH\u0002\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001A\u00020\u00012\u0006\u0010\u0018\u001A\u00020\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\u0007H\u0002\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0011\u0010\u001D\u001A\u0004\u0018\u00010\u000BH\u0002\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010\u001F\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\u001F\u0010\u001CJ\u000F\u0010 \u001A\u00020\u0007H\u0002\u00A2\u0006\u0004\b \u0010\u001CJ\u000F\u0010!\u001A\u00020\u000FH\u0002\u00A2\u0006\u0004\b!\u0010\u0017J\u000F\u0010\"\u001A\u00020\u0007H\u0002\u00A2\u0006\u0004\b\"\u0010\u001CJ\u0015\u0010%\u001A\u00020\u000F2\u0006\u0010$\u001A\u00020#\u00A2\u0006\u0004\b%\u0010&J\u0019\u0010(\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\'\u001A\u00020\u000FH\u0002\u00A2\u0006\u0004\b(\u0010\u0012J\u000F\u0010)\u001A\u00020\u0007H\u0002\u00A2\u0006\u0004\b)\u0010\u001CR*\u0010*\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00018\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-\"\u0004\b.\u0010\tR\u0016\u00100\u001A\u00020/8\u0006@\u0007X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001A\u00020\u000F8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001A\u0002048\u0002@\u0002X\u0082\u000E\u00A2\u0006\u0006\n\u0004\b5\u00106R$\u00108\u001A\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b8\u00109\u001A\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010>\u001A\u00020\u00018\u0002@\u0002X\u0082\u000E\u00A2\u0006\u0006\n\u0004\b>\u0010+R\u0014\u0010B\u001A\u00020?8\u00C6\u0002@\u0006\u00A2\u0006\u0006\u001A\u0004\b@\u0010AR\u0016\u0010C\u001A\u00020#8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001A\u0002048\u0002@\u0002X\u0082\u000E\u00A2\u0006\u0006\n\u0004\bE\u00106\u00A8\u0006F"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "", "index", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "taskMode", "", "afterTask", "(I)V", "beforeTask", "Lkotlinx/coroutines/scheduling/Task;", "task", "executeTask", "(Lkotlinx/coroutines/scheduling/Task;)V", "", "scanLocalQueue", "findAnyTask", "(Z)Lkotlinx/coroutines/scheduling/Task;", "findTask", "mode", "idleReset", "inStack", "()Z", "upperBound", "nextInt", "(I)I", "park", "()V", "pollGlobalQueues", "()Lkotlinx/coroutines/scheduling/Task;", "run", "runWorker", "tryAcquireCpuPermit", "tryPark", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "newState", "tryReleaseCpu", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z", "blockingOnly", "trySteal", "tryTerminateWorker", "indexInArray", "I", "getIndexInArray", "()I", "setIndexInArray", "Lkotlinx/coroutines/scheduling/WorkQueue;", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "mayHaveLocalTasks", "Z", "", "minDelayUntilStealableTaskNs", "J", "", "nextParkedWorker", "Ljava/lang/Object;", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "rngState", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "scheduler", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "terminationDeadline", "kotlinx-coroutines-core", "Ljava/lang/Thread;"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public final class Worker extends Thread {
        private volatile int indexInArray;
        public final WorkQueue localQueue;
        public boolean mayHaveLocalTasks;
        private long minDelayUntilStealableTaskNs;
        private volatile Object nextParkedWorker;
        private int rngState;
        public WorkerState state;
        private long terminationDeadline;
        volatile int workerCtl;
        static final AtomicIntegerFieldUpdater workerCtl$FU;

        static {
            Worker.workerCtl$FU = AtomicIntegerFieldUpdater.newUpdater(Worker.class, "workerCtl");
        }

        private Worker() {
            this.setDaemon(true);
            this.localQueue = new WorkQueue();
            this.state = WorkerState.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.NOT_IN_STACK;
            this.rngState = Random.Default.nextInt();
        }

        public Worker(int v) {
            this.setIndexInArray(v);
        }

        private final void afterTask(int v) {
            if(v == 0) {
                return;
            }
            CoroutineScheduler.controlState$FU.addAndGet(CoroutineScheduler.this, 0xFFFFFFFFFFE00000L);
            if(this.state != WorkerState.TERMINATED) {
                this.state = WorkerState.DORMANT;
            }
        }

        private final void beforeTask(int v) {
            if(v == 0) {
                return;
            }
            if(this.tryReleaseCpu(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.signalCpuWork();
            }
        }

        private final void executeTask(Task task0) {
            int v = task0.taskContext.getTaskMode();
            this.idleReset(v);
            this.beforeTask(v);
            CoroutineScheduler.this.runSafely(task0);
            this.afterTask(v);
        }

        private final Task findAnyTask(boolean z) {
            if(z) {
                boolean z1 = this.nextInt(CoroutineScheduler.this.corePoolSize * 2) == 0;
                if(z1) {
                    Task task0 = this.pollGlobalQueues();
                    if(task0 != null) {
                        return task0;
                    }
                }
                Task task1 = this.localQueue.poll();
                if(task1 == null) {
                    if(!z1) {
                        Task task2 = this.pollGlobalQueues();
                        return task2 == null ? this.trySteal(false) : task2;
                    }
                    return this.trySteal(false);
                }
                return task1;
            }
            Task task3 = this.pollGlobalQueues();
            return task3 == null ? this.trySteal(false) : task3;
        }

        public final Task findTask(boolean z) {
            Task task0;
            if(this.tryAcquireCpuPermit()) {
                return this.findAnyTask(z);
            }
            if(z) {
                task0 = this.localQueue.poll();
                if(task0 == null) {
                    task0 = (Task)CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
                    return task0 == null ? this.trySteal(true) : task0;
                }
            }
            else {
                task0 = (Task)CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            }
            return task0 == null ? this.trySteal(true) : task0;
        }

        public final int getIndexInArray() {
            return this.indexInArray;
        }

        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final CoroutineScheduler getScheduler() {
            return CoroutineScheduler.this;
        }

        private final void idleReset(int v) {
            this.terminationDeadline = 0L;
            if(this.state == WorkerState.PARKING) {
                this.state = WorkerState.BLOCKING;
            }
        }

        private final boolean inStack() {
            return this.nextParkedWorker != CoroutineScheduler.NOT_IN_STACK;
        }

        public final int nextInt(int v) {
            int v1 = this.rngState ^ this.rngState << 13;
            int v2 = v1 ^ v1 >> 17;
            int v3 = v2 ^ v2 << 5;
            this.rngState = v3;
            return (v - 1 & v) == 0 ? v3 & v - 1 : (v3 & 0x7FFFFFFF) % v;
        }

        private final void park() {
            if(this.terminationDeadline == 0L) {
                this.terminationDeadline = System.nanoTime() + CoroutineScheduler.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.idleWorkerKeepAliveNs);
            if(System.nanoTime() - this.terminationDeadline >= 0L) {
                this.terminationDeadline = 0L;
                this.tryTerminateWorker();
            }
        }

        private final Task pollGlobalQueues() {
            if(this.nextInt(2) == 0) {
                Task task0 = (Task)CoroutineScheduler.this.globalCpuQueue.removeFirstOrNull();
                return task0 == null ? ((Task)CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull()) : task0;
            }
            Task task1 = (Task)CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return task1 == null ? ((Task)CoroutineScheduler.this.globalCpuQueue.removeFirstOrNull()) : task1;
        }

        @Override
        public void run() {
            this.runWorker();
        }

        private final void runWorker() {
        alab1:
            while(true) {
                boolean z = false;
                while(true) {
                    if(CoroutineScheduler.this.isTerminated() || this.state == WorkerState.TERMINATED) {
                        break alab1;
                    }
                    Task task0 = this.findTask(this.mayHaveLocalTasks);
                    if(task0 != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        this.executeTask(task0);
                        break;
                    }
                    this.mayHaveLocalTasks = false;
                    if(this.minDelayUntilStealableTaskNs == 0L) {
                        this.tryPark();
                    }
                    else {
                        if(z) {
                            this.tryReleaseCpu(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                            break;
                        }
                        z = true;
                    }
                }
            }
            this.tryReleaseCpu(WorkerState.TERMINATED);
        }

        public final void setIndexInArray(int v) {
            this.setName(CoroutineScheduler.this.schedulerName + "-worker-" + (v == 0 ? "TERMINATED" : String.valueOf(v)));
            this.indexInArray = v;
        }

        public final void setNextParkedWorker(Object object0) {
            this.nextParkedWorker = object0;
        }

        private final boolean tryAcquireCpuPermit() {
            boolean z;
            if(this.state != WorkerState.CPU_ACQUIRED) {
                CoroutineScheduler coroutineScheduler0 = CoroutineScheduler.this;
                while(true) {
                    long v = coroutineScheduler0.controlState;
                    if(((int)((0x7FFFFC0000000000L & v) >> 42)) == 0) {
                        z = false;
                        break;
                    }
                    if(CoroutineScheduler.controlState$FU.compareAndSet(coroutineScheduler0, v, v - 0x40000000000L)) {
                        z = true;
                        break;
                    }
                }
                if(z) {
                    this.state = WorkerState.CPU_ACQUIRED;
                    return true;
                }
                return false;
            }
            return true;
        }

        private final void tryPark() {
            if(!this.inStack()) {
                CoroutineScheduler.this.parkedWorkersStackPush(this);
                return;
            }
            this.workerCtl = -1;
            while(this.inStack() && this.workerCtl == -1 && !CoroutineScheduler.this.isTerminated() && this.state != WorkerState.TERMINATED) {
                this.tryReleaseCpu(WorkerState.PARKING);
                Thread.interrupted();
                this.park();
            }
        }

        public final boolean tryReleaseCpu(WorkerState coroutineScheduler$WorkerState0) {
            WorkerState coroutineScheduler$WorkerState1 = this.state;
            boolean z = coroutineScheduler$WorkerState1 == WorkerState.CPU_ACQUIRED;
            if(z) {
                CoroutineScheduler.controlState$FU.addAndGet(CoroutineScheduler.this, 0x40000000000L);
            }
            if(coroutineScheduler$WorkerState1 != coroutineScheduler$WorkerState0) {
                this.state = coroutineScheduler$WorkerState0;
            }
            return z;
        }

        private final Task trySteal(boolean z) {
            int v = (int)(CoroutineScheduler.this.controlState & 0x1FFFFFL);
            if(v < 2) {
                return null;
            }
            int v1 = this.nextInt(v);
            CoroutineScheduler coroutineScheduler0 = CoroutineScheduler.this;
            long v2 = 0x7FFFFFFFFFFFFFFFL;
            for(int v3 = 0; v3 < v; ++v3) {
                ++v1;
                v1 = v1 <= v ? v1 + 1 : 1;
                Worker coroutineScheduler$Worker0 = (Worker)coroutineScheduler0.workers.get(v1);
                if(coroutineScheduler$Worker0 != null && coroutineScheduler$Worker0 != this) {
                    long v4 = z ? this.localQueue.tryStealBlockingFrom(coroutineScheduler$Worker0.localQueue) : this.localQueue.tryStealFrom(coroutineScheduler$Worker0.localQueue);
                    if(v4 == -1L) {
                        return this.localQueue.poll();
                    }
                    if(v4 > 0L) {
                        v2 = Math.min(v2, v4);
                    }
                }
            }
            if(v2 == 0x7FFFFFFFFFFFFFFFL) {
                v2 = 0L;
            }
            this.minDelayUntilStealableTaskNs = v2;
            return null;
        }

        private final void tryTerminateWorker() {
            AtomicReferenceArray atomicReferenceArray0 = CoroutineScheduler.this.workers;
            CoroutineScheduler coroutineScheduler0 = CoroutineScheduler.this;
            synchronized(atomicReferenceArray0) {
                if(coroutineScheduler0.isTerminated()) {
                    return;
                }
                if(((int)(coroutineScheduler0.controlState & 0x1FFFFFL)) <= coroutineScheduler0.corePoolSize) {
                    return;
                }
                if(!Worker.workerCtl$FU.compareAndSet(this, -1, 1)) {
                    return;
                }
                int v1 = this.getIndexInArray();
                this.setIndexInArray(0);
                coroutineScheduler0.parkedWorkersStackTopUpdate(this, v1, 0);
                long v2 = CoroutineScheduler.controlState$FU.getAndDecrement(coroutineScheduler0);
                if(((int)(v2 & 0x1FFFFFL)) != v1) {
                    Worker coroutineScheduler$Worker0 = (Worker)coroutineScheduler0.workers.get(((int)(v2 & 0x1FFFFFL)));
                    Intrinsics.checkNotNull(coroutineScheduler$Worker0);
                    coroutineScheduler0.workers.set(v1, coroutineScheduler$Worker0);
                    coroutineScheduler$Worker0.setIndexInArray(v1);
                    coroutineScheduler0.parkedWorkersStackTopUpdate(coroutineScheduler$Worker0, ((int)(v2 & 0x1FFFFFL)), v1);
                }
                coroutineScheduler0.workers.set(((int)(v2 & 0x1FFFFFL)), null);
            }
            this.state = WorkerState.TERMINATED;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;

        private static final WorkerState[] $values() [...] // Inlined contents
    }

    private static final long BLOCKING_MASK = 0x3FFFFE00000L;
    private static final int BLOCKING_SHIFT = 21;
    private static final int CLAIMED = 0;
    private static final long CPU_PERMITS_MASK = 0x7FFFFC0000000000L;
    private static final int CPU_PERMITS_SHIFT = 42;
    private static final long CREATED_MASK = 0x1FFFFFL;
    public static final Companion Companion = null;
    public static final int MAX_SUPPORTED_POOL_SIZE = 0x1FFFFE;
    public static final int MIN_SUPPORTED_POOL_SIZE = 1;
    public static final Symbol NOT_IN_STACK = null;
    private static final int PARKED = -1;
    private static final long PARKED_INDEX_MASK = 0x1FFFFFL;
    private static final long PARKED_VERSION_INC = 0x200000L;
    private static final long PARKED_VERSION_MASK = 0xFFFFFFFFFFE00000L;
    private static final int TERMINATED = 1;
    private volatile int _isTerminated;
    private static final AtomicIntegerFieldUpdater _isTerminated$FU;
    volatile long controlState;
    static final AtomicLongFieldUpdater controlState$FU;
    public final int corePoolSize;
    public final GlobalQueue globalBlockingQueue;
    public final GlobalQueue globalCpuQueue;
    public final long idleWorkerKeepAliveNs;
    public final int maxPoolSize;
    private volatile long parkedWorkersStack;
    private static final AtomicLongFieldUpdater parkedWorkersStack$FU;
    public final String schedulerName;
    public final AtomicReferenceArray workers;

    static {
        CoroutineScheduler.Companion = new Companion(null);
        CoroutineScheduler.NOT_IN_STACK = new Symbol("NOT_IN_STACK");
        CoroutineScheduler.parkedWorkersStack$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");
        CoroutineScheduler.controlState$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");
        CoroutineScheduler._isTerminated$FU = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");
    }

    public CoroutineScheduler(int v, int v1, long v2, String s) {
        this.corePoolSize = v;
        this.maxPoolSize = v1;
        this.idleWorkerKeepAliveNs = v2;
        this.schedulerName = s;
        if(v < 1) {
            throw new IllegalArgumentException(("Core pool size " + v + " should be at least 1").toString());
        }
        if(v1 < v) {
            throw new IllegalArgumentException(("Max pool size " + v1 + " should be greater than or equals to core pool size " + v).toString());
        }
        if(v1 > 0x1FFFFE) {
            throw new IllegalArgumentException(("Max pool size " + v1 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if(v2 <= 0L) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + v2 + " must be positive").toString());
        }
        this.globalCpuQueue = new GlobalQueue();
        this.globalBlockingQueue = new GlobalQueue();
        this.parkedWorkersStack = 0L;
        this.workers = new AtomicReferenceArray(v1 + 1);
        this.controlState = ((long)v) << 42;
        this._isTerminated = 0;
    }

    public CoroutineScheduler(int v, int v1, long v2, String s, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v3 & 4) != 0) {
            v2 = TasksKt.IDLE_WORKER_KEEP_ALIVE_NS;
        }
        if((v3 & 8) != 0) {
            s = "DefaultDispatcher";
        }
        this(v, v1, v2, s);
    }

    private final boolean addToGlobalQueue(Task task0) {
        return task0.taskContext.getTaskMode() == 1 ? this.globalBlockingQueue.addLast(task0) : this.globalCpuQueue.addLast(task0);
    }

    public final int availableCpuPermits(long v) {
        return (int)((v & 0x7FFFFC0000000000L) >> 42);
    }

    private final int blockingTasks(long v) {
        return (int)((v & 0x3FFFFE00000L) >> 21);
    }

    @Override
    public void close() {
        this.shutdown(10000L);
    }

    private final int createNewWorker() {
        synchronized(this.workers) {
            if(this.isTerminated()) {
                return -1;
            }
            int v1 = (int)(this.controlState & 0x1FFFFFL);
            int v2 = RangesKt.coerceAtLeast(v1 - ((int)((this.controlState & 0x3FFFFE00000L) >> 21)), 0);
            if(v2 >= this.corePoolSize) {
                return 0;
            }
            if(v1 >= this.maxPoolSize) {
                return 0;
            }
            int v3 = ((int)(this.controlState & 0x1FFFFFL)) + 1;
            if(v3 > 0 && this.workers.get(v3) == null) {
                Worker coroutineScheduler$Worker0 = new Worker(this, v3);
                this.workers.set(v3, coroutineScheduler$Worker0);
                if(v3 != ((int)(0x1FFFFFL & CoroutineScheduler.controlState$FU.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                coroutineScheduler$Worker0.start();
                return v2 + 1;
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final Task createTask(Runnable runnable0, TaskContext taskContext0) {
        long v = TasksKt.schedulerTimeSource.nanoTime();
        if(runnable0 instanceof Task) {
            ((Task)runnable0).submissionTime = v;
            ((Task)runnable0).taskContext = taskContext0;
            return (Task)runnable0;
        }
        return new TaskImpl(runnable0, v, taskContext0);
    }

    private final int createdWorkers(long v) {
        return (int)(v & 0x1FFFFFL);
    }

    private final Worker currentWorker() {
        Thread thread0 = Thread.currentThread();
        Worker coroutineScheduler$Worker0 = thread0 instanceof Worker ? ((Worker)thread0) : null;
        return coroutineScheduler$Worker0 == null || !Intrinsics.areEqual(CoroutineScheduler.this, this) ? null : coroutineScheduler$Worker0;
    }

    private final void decrementBlockingTasks() {
        CoroutineScheduler.controlState$FU.addAndGet(this, 0xFFFFFFFFFFE00000L);
    }

    private final int decrementCreatedWorkers() {
        return (int)(CoroutineScheduler.controlState$FU.getAndDecrement(this) & 0x1FFFFFL);
    }

    public final void dispatch(Runnable runnable0, TaskContext taskContext0, boolean z) {
        AbstractTimeSource abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
        if(abstractTimeSource0 != null) {
            abstractTimeSource0.trackTask();
        }
        Task task0 = this.createTask(runnable0, taskContext0);
        Worker coroutineScheduler$Worker0 = this.currentWorker();
        Task task1 = this.submitToLocalQueue(coroutineScheduler$Worker0, task0, z);
        if(task1 != null && !this.addToGlobalQueue(task1)) {
            throw new RejectedExecutionException(this.schedulerName + " was terminated");
        }
        boolean z1 = z && coroutineScheduler$Worker0 != null;
        if(task0.taskContext.getTaskMode() == 0) {
            if(z1) {
                return;
            }
            this.signalCpuWork();
            return;
        }
        this.signalBlockingWork(z1);
    }

    public static void dispatch$default(CoroutineScheduler coroutineScheduler0, Runnable runnable0, TaskContext taskContext0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            taskContext0 = NonBlockingContext.INSTANCE;
        }
        if((v & 4) != 0) {
            z = false;
        }
        coroutineScheduler0.dispatch(runnable0, taskContext0, z);
    }

    @Override
    public void execute(Runnable runnable0) {
        CoroutineScheduler.dispatch$default(this, runnable0, null, false, 6, null);
    }

    private final int getAvailableCpuPermits() {
        return (int)((this.controlState & 0x7FFFFC0000000000L) >> 42);
    }

    private final int getCreatedWorkers() {
        return (int)(this.controlState & 0x1FFFFFL);
    }

    private final long incrementBlockingTasks() {
        return CoroutineScheduler.controlState$FU.addAndGet(this, 0x200000L);
    }

    private final int incrementCreatedWorkers() {
        return (int)(CoroutineScheduler.controlState$FU.incrementAndGet(this) & 0x1FFFFFL);
    }

    public final boolean isTerminated() {
        return this._isTerminated;
    }

    private final int parkedWorkersStackNextIndex(Worker coroutineScheduler$Worker0) {
        for(Object object0 = coroutineScheduler$Worker0.getNextParkedWorker(); true; object0 = ((Worker)object0).getNextParkedWorker()) {
            if(object0 == CoroutineScheduler.NOT_IN_STACK) {
                return -1;
            }
            if(object0 == null) {
                return 0;
            }
            int v = ((Worker)object0).getIndexInArray();
            if(v != 0) {
                return v;
            }
        }
    }

    private final Worker parkedWorkersStackPop() {
        Worker coroutineScheduler$Worker0;
        do {
            long v = this.parkedWorkersStack;
            coroutineScheduler$Worker0 = (Worker)this.workers.get(((int)(0x1FFFFFL & v)));
            if(coroutineScheduler$Worker0 == null) {
                return null;
            }
            int v1 = this.parkedWorkersStackNextIndex(coroutineScheduler$Worker0);
        }
        while(v1 < 0 || !CoroutineScheduler.parkedWorkersStack$FU.compareAndSet(this, v, ((long)v1) | v + 0x200000L & 0xFFFFFFFFFFE00000L));
        coroutineScheduler$Worker0.setNextParkedWorker(CoroutineScheduler.NOT_IN_STACK);
        return coroutineScheduler$Worker0;
    }

    public final boolean parkedWorkersStackPush(Worker coroutineScheduler$Worker0) {
        if(coroutineScheduler$Worker0.getNextParkedWorker() != CoroutineScheduler.NOT_IN_STACK) {
            return false;
        }
        do {
            long v = this.parkedWorkersStack;
            coroutineScheduler$Worker0.setNextParkedWorker(this.workers.get(((int)(0x1FFFFFL & v))));
        }
        while(!CoroutineScheduler.parkedWorkersStack$FU.compareAndSet(this, v, ((long)coroutineScheduler$Worker0.getIndexInArray()) | v + 0x200000L & 0xFFFFFFFFFFE00000L));
        return true;
    }

    public final void parkedWorkersStackTopUpdate(Worker coroutineScheduler$Worker0, int v, int v1) {
        do {
            long v2 = this.parkedWorkersStack;
            int v3 = (int)(0x1FFFFFL & v2);
            if(v3 == v) {
                v3 = v1 == 0 ? this.parkedWorkersStackNextIndex(coroutineScheduler$Worker0) : v1;
            }
        }
        while(v3 < 0 || !CoroutineScheduler.parkedWorkersStack$FU.compareAndSet(this, v2, v2 + 0x200000L & 0xFFFFFFFFFFE00000L | ((long)v3)));
    }

    private final long releaseCpuPermit() {
        return CoroutineScheduler.controlState$FU.addAndGet(this, 0x40000000000L);
    }

    public final void runSafely(Task task0) {
        AbstractTimeSource abstractTimeSource0;
        try {
            task0.run();
            abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
        }
        catch(Throwable throwable0) {
            try {
                Thread thread0 = Thread.currentThread();
                thread0.getUncaughtExceptionHandler().uncaughtException(thread0, throwable0);
                abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
            }
            catch(Throwable throwable1) {
                AbstractTimeSource abstractTimeSource1 = AbstractTimeSourceKt.getTimeSource();
                if(abstractTimeSource1 != null) {
                    abstractTimeSource1.unTrackTask();
                }
                throw throwable1;
            }
            if(abstractTimeSource0 != null) {
                abstractTimeSource0.unTrackTask();
                return;
            }
            return;
        }
        if(abstractTimeSource0 != null) {
            abstractTimeSource0.unTrackTask();
        }
    }

    public final void shutdown(long v) {
        if(!CoroutineScheduler._isTerminated$FU.compareAndSet(this, 0, 1)) {
            return;
        }
        Worker coroutineScheduler$Worker0 = this.currentWorker();
        synchronized(this.workers) {
            int v1 = (int)(this.controlState & 0x1FFFFFL);
        }
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                Worker coroutineScheduler$Worker1 = (Worker)this.workers.get(v2);
                Intrinsics.checkNotNull(coroutineScheduler$Worker1);
                if(coroutineScheduler$Worker1 != coroutineScheduler$Worker0) {
                    while(coroutineScheduler$Worker1.isAlive()) {
                        LockSupport.unpark(coroutineScheduler$Worker1);
                        coroutineScheduler$Worker1.join(v);
                    }
                    coroutineScheduler$Worker1.localQueue.offloadAllWorkTo(this.globalBlockingQueue);
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        this.globalBlockingQueue.close();
        this.globalCpuQueue.close();
        while(true) {
            Task task0 = coroutineScheduler$Worker0 == null ? null : coroutineScheduler$Worker0.findTask(true);
            if(task0 == null) {
                task0 = (Task)this.globalCpuQueue.removeFirstOrNull();
            }
            if(task0 == null) {
                task0 = (Task)this.globalBlockingQueue.removeFirstOrNull();
                if(task0 != null) {
                    goto label_27;
                }
                break;
            }
        label_27:
            this.runSafely(task0);
        }
        if(coroutineScheduler$Worker0 != null) {
            coroutineScheduler$Worker0.tryReleaseCpu(WorkerState.TERMINATED);
        }
        this.parkedWorkersStack = 0L;
        this.controlState = 0L;
    }

    private final void signalBlockingWork(boolean z) {
        long v = CoroutineScheduler.controlState$FU.addAndGet(this, 0x200000L);
        if(z) {
            return;
        }
        if(this.tryUnpark()) {
            return;
        }
        if(this.tryCreateWorker(v)) {
            return;
        }
        this.tryUnpark();
    }

    public final void signalCpuWork() {
        if(this.tryUnpark()) {
            return;
        }
        if(CoroutineScheduler.tryCreateWorker$default(this, 0L, 1, null)) {
            return;
        }
        this.tryUnpark();
    }

    private final Task submitToLocalQueue(Worker coroutineScheduler$Worker0, Task task0, boolean z) {
        if(coroutineScheduler$Worker0 == null) {
            return task0;
        }
        if(coroutineScheduler$Worker0.state == WorkerState.TERMINATED) {
            return task0;
        }
        if(task0.taskContext.getTaskMode() == 0 && coroutineScheduler$Worker0.state == WorkerState.BLOCKING) {
            return task0;
        }
        coroutineScheduler$Worker0.mayHaveLocalTasks = true;
        return coroutineScheduler$Worker0.localQueue.add(task0, z);
    }

    @Override
    public String toString() {
        int v8;
        int v5;
        int v4;
        int v2;
        ArrayList arrayList0 = new ArrayList();
        int v = this.workers.length();
        int v1 = 0;
        if(1 < v) {
            v2 = 0;
            int v3 = 0;
            v4 = 0;
            v5 = 0;
            for(int v6 = 1; true; ++v6) {
                Worker coroutineScheduler$Worker0 = (Worker)this.workers.get(v6);
                if(coroutineScheduler$Worker0 != null) {
                    int v7 = coroutineScheduler$Worker0.localQueue.getSize$kotlinx_coroutines_core();
                    switch(WhenMappings.$EnumSwitchMapping$0[coroutineScheduler$Worker0.state.ordinal()]) {
                        case 1: {
                            ++v1;
                            break;
                        }
                        case 2: {
                            ++v2;
                            arrayList0.add(v7 + 'b');
                            break;
                        }
                        case 3: {
                            ++v3;
                            arrayList0.add(v7 + 'c');
                            break;
                        }
                        case 4: {
                            ++v4;
                            if(v7 > 0) {
                                arrayList0.add(v7 + 'd');
                            }
                            break;
                        }
                        case 5: {
                            ++v5;
                        }
                    }
                }
                if(v6 + 1 >= v) {
                    break;
                }
            }
            v8 = v1;
            v1 = v3;
        }
        else {
            v8 = 0;
            v2 = 0;
            v4 = 0;
            v5 = 0;
        }
        long v9 = this.controlState;
        return this.schedulerName + '@' + DebugStringsKt.getHexAddress(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + v1 + ", blocking = " + v2 + ", parked = " + v8 + ", dormant = " + v4 + ", terminated = " + v5 + "}, running workers queues = " + arrayList0 + ", global CPU queue size = " + this.globalCpuQueue.getSize() + ", global blocking queue size = " + this.globalBlockingQueue.getSize() + ", Control State {created workers= " + ((int)(0x1FFFFFL & v9)) + ", blocking tasks = " + ((int)((0x3FFFFE00000L & v9) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int)((0x7FFFFC0000000000L & v9) >> 42))) + "}]";
    }

    private final boolean tryAcquireCpuPermit() {
        do {
            long v = this.controlState;
            if(((int)((0x7FFFFC0000000000L & v) >> 42)) == 0) {
                return false;
            }
        }
        while(!CoroutineScheduler.controlState$FU.compareAndSet(this, v, v - 0x40000000000L));
        return true;
    }

    private final boolean tryCreateWorker(long v) {
        if(RangesKt.coerceAtLeast(((int)(0x1FFFFFL & v)) - ((int)((v & 0x3FFFFE00000L) >> 21)), 0) < this.corePoolSize) {
            int v1 = this.createNewWorker();
            if(v1 == 1 && this.corePoolSize > 1) {
                this.createNewWorker();
            }
            return v1 > 0;
        }
        return false;
    }

    static boolean tryCreateWorker$default(CoroutineScheduler coroutineScheduler0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = coroutineScheduler0.controlState;
        }
        return coroutineScheduler0.tryCreateWorker(v);
    }

    private final boolean tryUnpark() {
        Worker coroutineScheduler$Worker0;
        do {
            coroutineScheduler$Worker0 = this.parkedWorkersStackPop();
            if(coroutineScheduler$Worker0 == null) {
                return false;
            }
        }
        while(!Worker.workerCtl$FU.compareAndSet(coroutineScheduler$Worker0, -1, 0));
        LockSupport.unpark(coroutineScheduler$Worker0);
        return true;
    }
}

