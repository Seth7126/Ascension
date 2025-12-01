package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0011\u001A\u0004\u0018\u0001H\u0012\"\u0004\b\u0000\u0010\u00122\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u0002H\u00120\u0014H\u0082\b¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001A\u00020\u0017H\u0016J\b\u0010\u0018\u001A\u00020\u0019H\u0002J\b\u0010\u001A\u001A\u00020\u0019H\u0002J\u001C\u0010\u001B\u001A\u00020\u00172\u0006\u0010\u001C\u001A\u00020\u001D2\n\u0010\u0013\u001A\u00060\u001Ej\u0002`\u001FH\u0016J\b\u0010 \u001A\u00020\u0006H\u0002J!\u0010!\u001A\u00020\u00102\n\u0010\"\u001A\u0006\u0012\u0002\b\u00030#2\u0006\u0010\u0005\u001A\u00020\u0019H\u0000¢\u0006\u0002\b$J\r\u0010%\u001A\u00020\u0017H\u0000¢\u0006\u0002\b&J\u0015\u0010\'\u001A\u00020\u00172\u0006\u0010(\u001A\u00020)H\u0000¢\u0006\u0002\b*J\b\u0010+\u001A\u00020\u0004H\u0016J\r\u0010\u000F\u001A\u00020\u0017H\u0000¢\u0006\u0002\b,R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001A\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001A\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\u0010\u0010\r\u001A\u0004\u0018\u00010\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u000E\u001A\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u000F\u001A\u00020\u0010X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lkotlinx/coroutines/CommonPool;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "()V", "DEFAULT_PARALLELISM_PROPERTY_NAME", "", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "parallelism", "", "getParallelism", "()I", "pool", "requestedParallelism", "usePrivatePool", "", "Try", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "close", "", "createPlainPool", "Ljava/util/concurrent/ExecutorService;", "createPool", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "getOrCreatePoolSync", "isGoodCommonPool", "fjpClass", "Ljava/lang/Class;", "isGoodCommonPool$kotlinx_coroutines_core", "restore", "restore$kotlinx_coroutines_core", "shutdown", "timeout", "", "shutdown$kotlinx_coroutines_core", "toString", "usePrivatePool$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class CommonPool extends ExecutorCoroutineDispatcher {
    private static final String DEFAULT_PARALLELISM_PROPERTY_NAME = "kotlinx.coroutines.default.parallelism";
    public static final CommonPool INSTANCE;
    private static volatile Executor pool;
    private static final int requestedParallelism;
    private static boolean usePrivatePool;

    public static void $r8$lambda$36bgNy4lLwRHCWOZ-fm6LcwyUbo() {
    }

    // 检测为 Lambda 实现
    public static void $r8$lambda$B8tWIgKlJHpaqvQwjtIxhEc709w(Runnable runnable0) [...]

    // 检测为 Lambda 实现
    public static Thread $r8$lambda$ERvPtt6BNpepqyLHHf5J6mHx7SQ(AtomicInteger atomicInteger0, Runnable runnable0) [...]

    static {
        int v;
        String s;
        CommonPool.INSTANCE = new CommonPool();
        try {
            s = null;
            s = System.getProperty("kotlinx.coroutines.default.parallelism");
        }
        catch(Throwable unused_ex) {
        }
        if(s == null) {
            v = -1;
        }
        else {
            Integer integer0 = StringsKt.toIntOrNull(s);
            if(integer0 == null || ((int)integer0) < 1) {
                throw new IllegalStateException(("Expected positive number in kotlinx.coroutines.default.parallelism, but has " + s).toString());
            }
            v = (int)integer0;
        }
        CommonPool.requestedParallelism = v;
    }

    private final Object Try(Function0 function00) {
        try {
            return function00.invoke();
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    // 去混淆评级： 低(20)
    @Override  // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool");
    }

    // 去混淆评级： 低(20)
    private final ExecutorService createPlainPool() {
        return Executors.newFixedThreadPool(7, (Runnable runnable0) -> CommonPool.createPlainPool$lambda-12(new AtomicInteger(), runnable0));
    }

    private static final Thread createPlainPool$lambda-12(AtomicInteger atomicInteger0, Runnable runnable0) {
        Thread thread0 = new Thread(runnable0, Intrinsics.stringPlus("CommonPool-worker-", atomicInteger0.incrementAndGet()));
        thread0.setDaemon(true);
        return thread0;
    }

    private final ExecutorService createPool() {
        ExecutorService executorService1;
        Class class0;
        ExecutorService executorService0;
        if(System.getSecurityManager() != null) {
            return this.createPlainPool();
        }
        try {
            executorService0 = null;
            class0 = null;
            class0 = Class.forName("java.util.concurrent.ForkJoinPool");
        }
        catch(Throwable unused_ex) {
        }
        if(class0 == null) {
            return this.createPlainPool();
        }
        if(!CommonPool.usePrivatePool && CommonPool.requestedParallelism < 0) {
            try {
                Object object0 = class0.getMethod("commonPool").invoke(null);
                executorService1 = null;
                if(object0 instanceof ExecutorService) {
                    executorService1 = (ExecutorService)object0;
                }
            }
            catch(Throwable unused_ex) {
            }
            if(executorService1 != null) {
                if(!CommonPool.INSTANCE.isGoodCommonPool$kotlinx_coroutines_core(class0, executorService1)) {
                    executorService1 = null;
                }
                if(executorService1 != null) {
                    return executorService1;
                }
            }
        }
        try {
            Object object1 = class0.getConstructor(Integer.TYPE).newInstance(7);
            if(object1 instanceof ExecutorService) {
                executorService0 = (ExecutorService)object1;
            }
        }
        catch(Throwable unused_ex) {
        }
        return executorService0 == null ? this.createPlainPool() : executorService0;
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext coroutineContext0, Runnable runnable0) {
        try {
            AbstractTimeSource abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
            (CommonPool.pool == null ? this.getOrCreatePoolSync() : CommonPool.pool).execute((abstractTimeSource0 == null ? runnable0 : abstractTimeSource0.wrapTask(runnable0)));
        }
        catch(RejectedExecutionException unused_ex) {
            AbstractTimeSource abstractTimeSource1 = AbstractTimeSourceKt.getTimeSource();
            if(abstractTimeSource1 != null) {
                abstractTimeSource1.unTrackTask();
            }
            DefaultExecutor.INSTANCE.enqueue(runnable0);
        }
    }

    @Override  // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public Executor getExecutor() {
        return CommonPool.pool == null ? this.getOrCreatePoolSync() : CommonPool.pool;
    }

    private final Executor getOrCreatePoolSync() {
        synchronized(this) {
            Executor executor0 = CommonPool.pool;
            if(executor0 == null) {
                ExecutorService executorService0 = this.createPool();
                CommonPool.pool = executorService0;
                executor0 = executorService0;
            }
            return executor0;
        }
    }

    private final int getParallelism() [...] // 潜在的解密器

    public final boolean isGoodCommonPool$kotlinx_coroutines_core(Class class0, ExecutorService executorService0) {
        executorService0.submit(new CommonPool..ExternalSyntheticLambda1());
        Integer integer0 = null;
        try {
            Object object0 = class0.getMethod("getPoolSize").invoke(executorService0);
            if(object0 instanceof Integer) {
                integer0 = (Integer)object0;
            }
        }
        catch(Throwable unused_ex) {
        }
        return integer0 == null ? false : ((int)integer0) >= 1;
    }

    private static final void isGoodCommonPool$lambda-9() {
    }

    public final void restore$kotlinx_coroutines_core() {
        synchronized(this) {
            this.shutdown$kotlinx_coroutines_core(0L);
            CommonPool.usePrivatePool = false;
            CommonPool.pool = null;
        }
    }

    public final void shutdown$kotlinx_coroutines_core(long v) {
        synchronized(this) {
            ExecutorService executorService0 = CommonPool.pool instanceof ExecutorService ? ((ExecutorService)CommonPool.pool) : null;
            if(executorService0 != null) {
                executorService0.shutdown();
                if(v > 0L) {
                    executorService0.awaitTermination(v, TimeUnit.MILLISECONDS);
                }
                for(Object object0: executorService0.shutdownNow()) {
                    DefaultExecutor.INSTANCE.enqueue(((Runnable)object0));
                }
            }
            CommonPool.pool = (Runnable runnable0) -> CommonPool.shutdown$lambda-16(runnable0);
        }
    }

    private static final void shutdown$lambda-16(Runnable runnable0) {
        throw new RejectedExecutionException("CommonPool was shutdown");
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "CommonPool";
    }

    public final void usePrivatePool$kotlinx_coroutines_core() {
        synchronized(this) {
            this.shutdown$kotlinx_coroutines_core(0L);
            CommonPool.usePrivatePool = true;
            CommonPool.pool = null;
        }
    }
}

