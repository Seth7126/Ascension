package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u001B\u001A\u00020\u001CH\u0002J\b\u0010\u001D\u001A\u00020\u0010H\u0002J\r\u0010\u001E\u001A\u00020\u001CH\u0000¢\u0006\u0002\b\u001FJ$\u0010 \u001A\u00020!2\u0006\u0010\"\u001A\u00020\b2\n\u0010#\u001A\u00060\u0002j\u0002`\u00032\u0006\u0010$\u001A\u00020%H\u0016J\b\u0010&\u001A\u00020\u0014H\u0002J\b\u0010\'\u001A\u00020\u001CH\u0016J\u000E\u0010(\u001A\u00020\u001C2\u0006\u0010)\u001A\u00020\bR\u000E\u0010\u0005\u001A\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u000B\u001A\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\f\u001A\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\r\u001A\u00020\u000EX\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u000F\u001A\u0004\u0018\u00010\u0010X\u0082\u000E¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0004R\u000E\u0010\u0012\u001A\u00020\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001A\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001A\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001A\u00020\u00108TX\u0094\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001A¨\u0006*"}, d2 = {"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopImplBase;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "()V", "ACTIVE", "", "DEFAULT_KEEP_ALIVE", "", "FRESH", "KEEP_ALIVE_NANOS", "SHUTDOWN_ACK", "SHUTDOWN_REQ", "THREAD_NAME", "", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "debugStatus", "isShutdownRequested", "", "()Z", "isThreadPresent", "isThreadPresent$kotlinx_coroutines_core", "thread", "getThread", "()Ljava/lang/Thread;", "acknowledgeShutdownIfNeeded", "", "createThreadSync", "ensureStarted", "ensureStarted$kotlinx_coroutines_core", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "block", "context", "Lkotlin/coroutines/CoroutineContext;", "notifyStartup", "run", "shutdown", "timeout", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DefaultExecutor extends EventLoopImplBase implements Runnable {
    private static final int ACTIVE = 1;
    private static final long DEFAULT_KEEP_ALIVE = 1000L;
    private static final int FRESH = 0;
    public static final DefaultExecutor INSTANCE = null;
    private static final long KEEP_ALIVE_NANOS = 0L;
    private static final int SHUTDOWN_ACK = 3;
    private static final int SHUTDOWN_REQ = 2;
    public static final String THREAD_NAME = "kotlinx.coroutines.DefaultExecutor";
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        DefaultExecutor defaultExecutor0 = new DefaultExecutor();
        DefaultExecutor.INSTANCE = defaultExecutor0;
        EventLoop.incrementUseCount$default(defaultExecutor0, false, 1, null);
        DefaultExecutor.KEEP_ALIVE_NANOS = TimeUnit.MILLISECONDS.toNanos(1000L);
    }

    private final void acknowledgeShutdownIfNeeded() {
        synchronized(this) {
        }
    }

    private final Thread createThreadSync() {
        synchronized(this) {
            Thread thread0 = DefaultExecutor._thread;
            if(thread0 == null) {
                thread0 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                DefaultExecutor._thread = thread0;
                thread0.setDaemon(true);
                thread0.start();
            }
            return thread0;
        }
    }

    public final void ensureStarted$kotlinx_coroutines_core() {
        synchronized(this) {
            DefaultExecutor.debugStatus = 0;
            this.createThreadSync();
            while(DefaultExecutor.debugStatus == 0) {
                this.wait();
            }
        }
    }

    @Override  // kotlinx.coroutines.EventLoopImplPlatform
    protected Thread getThread() {
        return DefaultExecutor._thread == null ? this.createThreadSync() : DefaultExecutor._thread;
    }

    private static void get_thread$annotations() {
    }

    @Override  // kotlinx.coroutines.EventLoopImplBase
    public DisposableHandle invokeOnTimeout(long v, Runnable runnable0, CoroutineContext coroutineContext0) {
        return this.scheduleInvokeOnTimeout(v, runnable0);
    }

    private final boolean isShutdownRequested() [...] // 潜在的解密器

    public final boolean isThreadPresent$kotlinx_coroutines_core() {
        return DefaultExecutor._thread != null;
    }

    private final boolean notifyStartup() {
        synchronized(this) {
            DefaultExecutor.debugStatus = 1;
            this.notifyAll();
            return true;
        }
    }

    @Override
    public void run() {
        long v2;
        long v1;
        ThreadLocalEventLoop.INSTANCE.setEventLoop$kotlinx_coroutines_core(this);
        AbstractTimeSource abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
        if(abstractTimeSource0 != null) {
            abstractTimeSource0.registerTimeLoopThread();
        }
        try {
            if(!this.notifyStartup()) {
                goto label_5;
            }
            goto label_13;
        }
        catch(Throwable throwable0) {
            goto label_42;
        }
    label_5:
        DefaultExecutor._thread = null;
        this.acknowledgeShutdownIfNeeded();
        AbstractTimeSource abstractTimeSource1 = AbstractTimeSourceKt.getTimeSource();
        if(abstractTimeSource1 != null) {
            abstractTimeSource1.unregisterTimeLoopThread();
        }
        if(!this.isEmpty()) {
            this.getThread();
        }
        return;
    label_13:
        long v = 0x7FFFFFFFFFFFFFFFL;
        while(true) {
            try {
            label_14:
                Thread.interrupted();
                v1 = this.processNextEvent();
                if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                    AbstractTimeSource abstractTimeSource2 = AbstractTimeSourceKt.getTimeSource();
                    v2 = abstractTimeSource2 == null ? System.nanoTime() : abstractTimeSource2.nanoTime();
                    if(v == 0x7FFFFFFFFFFFFFFFL) {
                        goto label_22;
                    }
                    goto label_23;
                }
                else {
                    v = 0x7FFFFFFFFFFFFFFFL;
                }
                goto label_34;
            }
            catch(Throwable throwable0) {
                break;
            }
        label_22:
            v = DefaultExecutor.KEEP_ALIVE_NANOS + v2;
        label_23:
            long v3 = v - v2;
            if(v3 <= 0L) {
                DefaultExecutor._thread = null;
                this.acknowledgeShutdownIfNeeded();
                AbstractTimeSource abstractTimeSource3 = AbstractTimeSourceKt.getTimeSource();
                if(abstractTimeSource3 != null) {
                    abstractTimeSource3.unregisterTimeLoopThread();
                }
                if(!this.isEmpty()) {
                    this.getThread();
                }
                return;
            }
            try {
                v1 = RangesKt.coerceAtMost(0x7FFFFFFFFFFFFFFFL, v3);
            label_34:
                if(v1 <= 0L) {
                    goto label_14;
                }
                AbstractTimeSource abstractTimeSource4 = AbstractTimeSourceKt.getTimeSource();
                if(abstractTimeSource4 == null) {
                    LockSupport.parkNanos(this, v1);
                    goto label_14;
                }
                abstractTimeSource4.parkNanos(this, v1);
                goto label_14;
            }
            catch(Throwable throwable0) {
            }
            break;
        }
    label_42:
        DefaultExecutor._thread = null;
        this.acknowledgeShutdownIfNeeded();
        AbstractTimeSource abstractTimeSource5 = AbstractTimeSourceKt.getTimeSource();
        if(abstractTimeSource5 != null) {
            abstractTimeSource5.unregisterTimeLoopThread();
        }
        if(!this.isEmpty()) {
            this.getThread();
        }
        throw throwable0;
    }

    public final void shutdown(long v) {
        synchronized(this) {
            long v2 = System.currentTimeMillis();
            DefaultExecutor.debugStatus = 2;
            while(DefaultExecutor._thread != null) {
                Thread thread0 = DefaultExecutor._thread;
                if(thread0 != null) {
                    AbstractTimeSource abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
                    if(abstractTimeSource0 == null) {
                        LockSupport.unpark(thread0);
                    }
                    else {
                        abstractTimeSource0.unpark(thread0);
                    }
                }
                if(v2 + v - System.currentTimeMillis() <= 0L) {
                    break;
                }
                this.wait(v);
            }
            DefaultExecutor.debugStatus = 0;
        }
    }
}

