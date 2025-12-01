package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b*\u0001\n\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u001C\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u001F2\u0006\u0010 \u001A\u00020\u001BH\u0016J\n\u0010!\u001A\u0004\u0018\u00010\u001BH\u0002J\u0010\u0010\"\u001A\u00020\u001D2\u0006\u0010#\u001A\u00020$H\u0002J\b\u0010%\u001A\u00020\u001DH\u0002J\u0015\u0010&\u001A\u00020\u001D2\u0006\u0010\'\u001A\u00020\u0017H\u0000¢\u0006\u0002\b(J\u0015\u0010)\u001A\u00020\u001D2\u0006\u0010\'\u001A\u00020\u0017H\u0000¢\u0006\u0002\b*R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001A\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000BR\u0011\u0010\f\u001A\u00020\r¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u000E\u0010\u0004\u001A\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0010\u001A\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0012\u001A\u00020\u0013X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0014\u001A\u00020\u0013X\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u001B0\u001AX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "choreographer", "Landroid/view/Choreographer;", "handler", "Landroid/os/Handler;", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "getChoreographer", "()Landroid/view/Choreographer;", "dispatchCallback", "androidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1", "Landroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1;", "frameClock", "Landroidx/compose/runtime/MonotonicFrameClock;", "getFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "lock", "", "scheduledFrameDispatch", "", "scheduledTrampolineDispatch", "spareToRunOnFrame", "", "Landroid/view/Choreographer$FrameCallback;", "toRunOnFrame", "toRunTrampolined", "Lkotlin/collections/ArrayDeque;", "Ljava/lang/Runnable;", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "nextTask", "performFrameDispatch", "frameTimeNanos", "", "performTrampolineDispatch", "postFrameCallback", "callback", "postFrameCallback$ui_release", "removeFrameCallback", "removeFrameCallback$ui_release", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidUiDispatcher extends CoroutineDispatcher {
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u001B\u0010\u0007\u001A\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\b\u0010\u0006R\u0014\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00040\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher$Companion;", "", "()V", "CurrentThread", "Lkotlin/coroutines/CoroutineContext;", "getCurrentThread", "()Lkotlin/coroutines/CoroutineContext;", "Main", "getMain", "Main$delegate", "Lkotlin/Lazy;", "currentThread", "Ljava/lang/ThreadLocal;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        static final KProperty[] $$delegatedProperties;

        static {
            Companion.$$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "Main", "getMain()Lkotlin/coroutines/CoroutineContext;"))};
        }

        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final CoroutineContext getCurrentThread() {
            if(AndroidUiDispatcher_androidKt.isMainThread()) {
                return this.getMain();
            }
            CoroutineContext coroutineContext0 = (CoroutineContext)AndroidUiDispatcher.currentThread.get();
            if(coroutineContext0 == null) {
                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
            }
            return coroutineContext0;
        }

        public final CoroutineContext getMain() {
            return (CoroutineContext)AndroidUiDispatcher.Main$delegate.getValue();
        }
    }

    public static final int $stable;
    public static final Companion Companion;
    private static final Lazy Main$delegate;
    private final Choreographer choreographer;
    private static final ThreadLocal currentThread;
    private final androidx.compose.ui.platform.AndroidUiDispatcher.dispatchCallback.1 dispatchCallback;
    private final MonotonicFrameClock frameClock;
    private final Handler handler;
    private final Object lock;
    private boolean scheduledFrameDispatch;
    private boolean scheduledTrampolineDispatch;
    private List spareToRunOnFrame;
    private List toRunOnFrame;
    private final ArrayDeque toRunTrampolined;

    static {
        AndroidUiDispatcher.Companion = new Companion(null);
        AndroidUiDispatcher.$stable = 8;
        AndroidUiDispatcher.Main$delegate = LazyKt.lazy(AndroidUiDispatcher.Companion.Main.2.INSTANCE);
        AndroidUiDispatcher.currentThread = new AndroidUiDispatcher.Companion.currentThread.1();
    }

    private AndroidUiDispatcher(Choreographer choreographer0, Handler handler0) {
        this.choreographer = choreographer0;
        this.handler = handler0;
        this.lock = new Object();
        this.toRunTrampolined = new ArrayDeque();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new Object() {
            @Override  // android.view.Choreographer$FrameCallback
            public void doFrame(long v) {
                AndroidUiDispatcher.this.handler.removeCallbacks(this);
                AndroidUiDispatcher.this.performTrampolineDispatch();
                AndroidUiDispatcher.this.performFrameDispatch(v);
            }

            @Override
            public void run() {
                AndroidUiDispatcher.this.performTrampolineDispatch();
                Object object0 = AndroidUiDispatcher.this.lock;
                AndroidUiDispatcher androidUiDispatcher0 = AndroidUiDispatcher.this;
                synchronized(object0) {
                    if(androidUiDispatcher0.toRunOnFrame.isEmpty()) {
                        androidUiDispatcher0.getChoreographer().removeFrameCallback(this);
                        androidUiDispatcher0.scheduledFrameDispatch = false;
                    }
                }
            }
        };
        this.frameClock = new AndroidUiFrameClock(choreographer0);
    }

    public AndroidUiDispatcher(Choreographer choreographer0, Handler handler0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(choreographer0, handler0);
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext coroutineContext0, Runnable runnable0) {
        Intrinsics.checkNotNullParameter(coroutineContext0, "context");
        Intrinsics.checkNotNullParameter(runnable0, "block");
        synchronized(this.lock) {
            this.toRunTrampolined.addLast(runnable0);
            if(!this.scheduledTrampolineDispatch) {
                this.scheduledTrampolineDispatch = true;
                this.handler.post(this.dispatchCallback);
                if(!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.getChoreographer().postFrameCallback(this.dispatchCallback);
                }
            }
        }
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    public final MonotonicFrameClock getFrameClock() {
        return this.frameClock;
    }

    private final Runnable nextTask() {
        synchronized(this.lock) {
            return (Runnable)this.toRunTrampolined.removeFirstOrNull();
        }
    }

    private final void performFrameDispatch(long v) {
        List list0;
        synchronized(this.lock) {
            if(!this.scheduledFrameDispatch) {
                return;
            }
            this.scheduledFrameDispatch = false;
            list0 = this.toRunOnFrame;
            this.toRunOnFrame = this.spareToRunOnFrame;
            this.spareToRunOnFrame = list0;
        }
        int v2 = list0.size();
        if(v2 > 0) {
            for(int v1 = 0; true; ++v1) {
                ((Choreographer.FrameCallback)list0.get(v1)).doFrame(v);
                if(v1 + 1 >= v2) {
                    break;
                }
            }
        }
        list0.clear();
    }

    private final void performTrampolineDispatch() {
        boolean z;
        do {
            for(Runnable runnable0 = this.nextTask(); runnable0 != null; runnable0 = this.nextTask()) {
                runnable0.run();
            }
            synchronized(this.lock) {
                if(this.toRunTrampolined.isEmpty()) {
                    z = false;
                    this.scheduledTrampolineDispatch = false;
                }
                else {
                    z = true;
                }
            }
        }
        while(z);
    }

    public final void postFrameCallback$ui_release(Choreographer.FrameCallback choreographer$FrameCallback0) {
        Intrinsics.checkNotNullParameter(choreographer$FrameCallback0, "callback");
        synchronized(this.lock) {
            this.toRunOnFrame.add(choreographer$FrameCallback0);
            if(!this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = true;
                this.getChoreographer().postFrameCallback(this.dispatchCallback);
            }
        }
    }

    public final void removeFrameCallback$ui_release(Choreographer.FrameCallback choreographer$FrameCallback0) {
        Intrinsics.checkNotNullParameter(choreographer$FrameCallback0, "callback");
        synchronized(this.lock) {
            this.toRunOnFrame.remove(choreographer$FrameCallback0);
        }
    }
}

