package kotlinx.coroutines.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.Delay.DefaultImpls;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

@Deprecated(level = DeprecationLevel.WARNING, message = "This API has been deprecated to integrate with Structured Concurrency.", replaceWith = @ReplaceWith(expression = "TestCoroutineScope", imports = {"kotlin.coroutines.test"}))
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001<B\u0011\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\u0002\u0010\u0004J\u0018\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\u00062\b\b\u0002\u0010\u0018\u001A\u00020\u0019J\u0018\u0010\u001A\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u00062\b\b\u0002\u0010\u0018\u001A\u00020\u0019J$\u0010\u001D\u001A\u00020\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u00032\u0012\u0010\u001F\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0 J$\u0010\"\u001A\u00020\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u00032\u0012\u0010\u001F\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0 J*\u0010#\u001A\u00020\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u00032\u0018\u0010\u001F\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020!0 J$\u0010$\u001A\u00020\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u00032\u0012\u0010\u001F\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0 J\u0006\u0010%\u001A\u00020\u001BJ\u0014\u0010&\u001A\u00020\u001B2\n\u0010\'\u001A\u00060(j\u0002`)H\u0002J5\u0010*\u001A\u0002H+\"\u0004\b\u0000\u0010+2\u0006\u0010,\u001A\u0002H+2\u0018\u0010-\u001A\u0014\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002H+0.H\u0016\u00A2\u0006\u0002\u00100J(\u00101\u001A\u0004\u0018\u0001H2\"\b\b\u0000\u00102*\u00020/2\f\u00103\u001A\b\u0012\u0004\u0012\u0002H204H\u0096\u0002\u00A2\u0006\u0002\u00105J\u0014\u00106\u001A\u00020\u00012\n\u00103\u001A\u0006\u0012\u0002\b\u000304H\u0016J\u0010\u00107\u001A\u00020\u00062\b\b\u0002\u0010\u0018\u001A\u00020\u0019J\u001C\u00108\u001A\u00020\u00122\n\u0010\'\u001A\u00060(j\u0002`)2\u0006\u0010\u0017\u001A\u00020\u0006H\u0002J\b\u00109\u001A\u00020\u0006H\u0002J\b\u0010:\u001A\u00020\u0003H\u0016J\u0006\u0010;\u001A\u00020\u001BJ\u0010\u0010;\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u0006H\u0002R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001A\u00060\bR\u00020\u0000X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\nX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0017\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\r0\f8F\u00A2\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR\u0010\u0010\u0002\u001A\u0004\u0018\u00010\u0003X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0013\u001A\u00020\u0006X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\r0\u0015X\u0082\u0004\u00A2\u0006\u0002\n\u0000\u00A8\u0006="}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "name", "", "(Ljava/lang/String;)V", "counter", "", "ctxDispatcher", "Lkotlinx/coroutines/test/TestCoroutineContext$Dispatcher;", "ctxHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "exceptions", "", "", "getExceptions", "()Ljava/util/List;", "queue", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/test/TimedRunnableObsolete;", "time", "uncaughtExceptions", "", "advanceTimeBy", "delayTime", "unit", "Ljava/util/concurrent/TimeUnit;", "advanceTimeTo", "", "targetTime", "assertAllUnhandledExceptions", "message", "predicate", "Lkotlin/Function1;", "", "assertAnyUnhandledException", "assertExceptions", "assertUnhandledException", "cancelAllActions", "enqueue", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "now", "postDelayed", "processNextEvent", "toString", "triggerActions", "Dispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TestCoroutineContext implements CoroutineContext {
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001C\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\n\u0010\b\u001A\u00060\tj\u0002`\nH\u0016J$\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000E2\n\u0010\b\u001A\u00060\tj\u0002`\n2\u0006\u0010\u0006\u001A\u00020\u0007H\u0016J\b\u0010\u000F\u001A\u00020\u000EH\u0016J\u001E\u0010\u0010\u001A\u00020\u00052\u0006\u0010\r\u001A\u00020\u000E2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0016J\b\u0010\u0013\u001A\u00020\u0014H\u0016J\b\u0010\u0015\u001A\u00020\u0016H\u0016¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineContext$Dispatcher;", "Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/Delay;", "(Lkotlinx/coroutines/test/TestCoroutineContext;)V", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "processNextEvent", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "shouldBeProcessedFromContext", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    final class Dispatcher extends EventLoop implements Delay {
        public Dispatcher() {
            EventLoop.incrementUseCount$default(this, false, 1, null);
        }

        @Override  // kotlinx.coroutines.Delay
        public Object delay(long v, Continuation continuation0) {
            return DefaultImpls.delay(this, v, continuation0);
        }

        @Override  // kotlinx.coroutines.CoroutineDispatcher
        public void dispatch(CoroutineContext coroutineContext0, Runnable runnable0) {
            TestCoroutineContext.this.enqueue(runnable0);
        }

        @Override  // kotlinx.coroutines.Delay
        public DisposableHandle invokeOnTimeout(long v, Runnable runnable0, CoroutineContext coroutineContext0) {
            TimedRunnableObsolete timedRunnableObsolete0 = TestCoroutineContext.this.postDelayed(runnable0, v);
            return new DisposableHandle() {
                @Override  // kotlinx.coroutines.DisposableHandle
                public void dispose() {
                    timedRunnableObsolete0.queue.remove(this.$node);
                }
            };
        }

        @Override  // kotlinx.coroutines.EventLoop
        public long processNextEvent() {
            return TestCoroutineContext.this.processNextEvent();
        }

        @Override  // kotlinx.coroutines.Delay
        public void scheduleResumeAfterDelay(long v, CancellableContinuation cancellableContinuation0) {
            Runnable runnable0 = new Runnable() {
                @Override
                public final void run() {
                    this.resumeUndispatched(Dispatcher.this, Unit.INSTANCE);
                }
            };
            TestCoroutineContext.this.postDelayed(runnable0, v);
        }

        @Override  // kotlinx.coroutines.EventLoop
        public boolean shouldBeProcessedFromContext() {
            return true;
        }

        @Override  // kotlinx.coroutines.CoroutineDispatcher
        public String toString() {
            return "Dispatcher(" + TestCoroutineContext.this + ')';
        }
    }

    private long counter;
    private final Dispatcher ctxDispatcher;
    private final CoroutineExceptionHandler ctxHandler;
    private final String name;
    private final ThreadSafeHeap queue;
    private long time;
    private final List uncaughtExceptions;

    public TestCoroutineContext() {
        this(null, 1, null);
    }

    public TestCoroutineContext(String s) {
        this.name = s;
        this.uncaughtExceptions = new ArrayList();
        this.ctxDispatcher = new Dispatcher(this);
        this.ctxHandler = new CoroutineExceptionHandler(this) {
            @Override  // kotlinx.coroutines.CoroutineExceptionHandler
            public void handleException(CoroutineContext coroutineContext0, Throwable throwable0) {
                TestCoroutineContext.access$getUncaughtExceptions$p(TestCoroutineContext.this).add(throwable0);
            }
        };
        this.queue = new ThreadSafeHeap();
    }

    public TestCoroutineContext(String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            s = null;
        }
        this(s);
    }

    public static final List access$getUncaughtExceptions$p(TestCoroutineContext testCoroutineContext0) {
        return testCoroutineContext0.uncaughtExceptions;
    }

    public final long advanceTimeBy(long v, TimeUnit timeUnit0) {
        long v1 = this.time;
        this.advanceTimeTo(timeUnit0.toNanos(v) + v1, TimeUnit.NANOSECONDS);
        return timeUnit0.convert(this.time - v1, TimeUnit.NANOSECONDS);
    }

    public static long advanceTimeBy$default(TestCoroutineContext testCoroutineContext0, long v, TimeUnit timeUnit0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            timeUnit0 = TimeUnit.MILLISECONDS;
        }
        return testCoroutineContext0.advanceTimeBy(v, timeUnit0);
    }

    public final void advanceTimeTo(long v, TimeUnit timeUnit0) {
        long v1 = timeUnit0.toNanos(v);
        this.triggerActions(v1);
        if(v1 > this.time) {
            this.time = v1;
        }
    }

    public static void advanceTimeTo$default(TestCoroutineContext testCoroutineContext0, long v, TimeUnit timeUnit0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            timeUnit0 = TimeUnit.MILLISECONDS;
        }
        testCoroutineContext0.advanceTimeTo(v, timeUnit0);
    }

    public final void assertAllUnhandledExceptions(String s, Function1 function10) {
        Iterable iterable0 = this.uncaughtExceptions;
        boolean z = true;
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                    z = false;
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        if(!z) {
            throw new AssertionError(s);
        }
        this.uncaughtExceptions.clear();
    }

    public static void assertAllUnhandledExceptions$default(TestCoroutineContext testCoroutineContext0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = "";
        }
        testCoroutineContext0.assertAllUnhandledExceptions(s, function10);
    }

    public final void assertAnyUnhandledException(String s, Function1 function10) {
        Iterable iterable0 = this.uncaughtExceptions;
        boolean z = false;
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    z = true;
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        if(!z) {
            throw new AssertionError(s);
        }
        this.uncaughtExceptions.clear();
    }

    public static void assertAnyUnhandledException$default(TestCoroutineContext testCoroutineContext0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = "";
        }
        testCoroutineContext0.assertAnyUnhandledException(s, function10);
    }

    public final void assertExceptions(String s, Function1 function10) {
        if(!((Boolean)function10.invoke(this.uncaughtExceptions)).booleanValue()) {
            throw new AssertionError(s);
        }
        this.uncaughtExceptions.clear();
    }

    public static void assertExceptions$default(TestCoroutineContext testCoroutineContext0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = "";
        }
        testCoroutineContext0.assertExceptions(s, function10);
    }

    public final void assertUnhandledException(String s, Function1 function10) {
        if(this.uncaughtExceptions.size() != 1 || !((Boolean)function10.invoke(this.uncaughtExceptions.get(0))).booleanValue()) {
            throw new AssertionError(s);
        }
        this.uncaughtExceptions.clear();
    }

    public static void assertUnhandledException$default(TestCoroutineContext testCoroutineContext0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = "";
        }
        testCoroutineContext0.assertUnhandledException(s, function10);
    }

    public final void cancelAllActions() {
        if(!this.queue.isEmpty()) {
            this.queue.clear();
        }
    }

    private final void enqueue(Runnable runnable0) {
        long v = this.counter;
        this.counter = v + 1L;
        TimedRunnableObsolete timedRunnableObsolete0 = new TimedRunnableObsolete(runnable0, v, 0L, 4, null);
        this.queue.addLast(timedRunnableObsolete0);
    }

    @Override  // kotlin.coroutines.CoroutineContext
    public Object fold(Object object0, Function2 function20) {
        return function20.invoke(function20.invoke(object0, this.ctxDispatcher), this.ctxHandler);
    }

    @Override  // kotlin.coroutines.CoroutineContext
    public Element get(Key coroutineContext$Key0) {
        if(coroutineContext$Key0 == ContinuationInterceptor.Key) {
            return this.ctxDispatcher;
        }
        return coroutineContext$Key0 == CoroutineExceptionHandler.Key ? this.ctxHandler : null;
    }

    public final List getExceptions() {
        return this.uncaughtExceptions;
    }

    @Override  // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(Key coroutineContext$Key0) {
        if(coroutineContext$Key0 == ContinuationInterceptor.Key) {
            return this.ctxHandler;
        }
        return coroutineContext$Key0 == CoroutineExceptionHandler.Key ? this.ctxDispatcher : this;
    }

    public final long now(TimeUnit timeUnit0) {
        return timeUnit0.convert(this.time, TimeUnit.NANOSECONDS);
    }

    public static long now$default(TestCoroutineContext testCoroutineContext0, TimeUnit timeUnit0, int v, Object object0) {
        if((v & 1) != 0) {
            timeUnit0 = TimeUnit.MILLISECONDS;
        }
        return testCoroutineContext0.now(timeUnit0);
    }

    @Override  // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext0) {
        return kotlin.coroutines.CoroutineContext.DefaultImpls.plus(this, coroutineContext0);
    }

    private final TimedRunnableObsolete postDelayed(Runnable runnable0, long v) {
        long v1 = this.counter;
        this.counter = v1 + 1L;
        TimedRunnableObsolete timedRunnableObsolete0 = new TimedRunnableObsolete(runnable0, v1, this.time + TimeUnit.MILLISECONDS.toNanos(v));
        this.queue.addLast(timedRunnableObsolete0);
        return timedRunnableObsolete0;
    }

    private final long processNextEvent() {
        TimedRunnableObsolete timedRunnableObsolete0 = (TimedRunnableObsolete)this.queue.peek();
        if(timedRunnableObsolete0 != null) {
            this.triggerActions(timedRunnableObsolete0.time);
        }
        return this.queue.isEmpty() ? 0x7FFFFFFFFFFFFFFFL : 0L;
    }

    @Override
    public String toString() {
        return this.name == null ? "TestCoroutineContext@" + DebugStringsKt.getHexAddress(this) : this.name;
    }

    private final void triggerActions(long v) {
        while(true) {
            ThreadSafeHeap threadSafeHeap0 = this.queue;
            __monitor_enter(threadSafeHeap0);
            int v1 = FIN.finallyOpen$NT();
            ThreadSafeHeapNode threadSafeHeapNode0 = null;
            ThreadSafeHeapNode threadSafeHeapNode1 = threadSafeHeap0.firstImpl();
            if(threadSafeHeapNode1 == null) {
                FIN.finallyExec$NT(v1);
            }
            else {
                if(((TimedRunnableObsolete)threadSafeHeapNode1).time <= v) {
                    threadSafeHeapNode0 = threadSafeHeap0.removeAtImpl(0);
                }
                FIN.finallyCodeBegin$NT(v1);
                __monitor_exit(threadSafeHeap0);
                FIN.finallyCodeEnd$NT(v1);
            }
            if(((TimedRunnableObsolete)threadSafeHeapNode0) == null) {
                break;
            }
            if(((TimedRunnableObsolete)threadSafeHeapNode0).time != 0L) {
                this.time = ((TimedRunnableObsolete)threadSafeHeapNode0).time;
            }
            ((TimedRunnableObsolete)threadSafeHeapNode0).run();
        }
    }

    public final void triggerActions() {
        this.triggerActions(this.time);
    }
}

