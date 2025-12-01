package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B%\u0012\n\u0010\u0005\u001A\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007¢\u0006\u0002\u0010\tJ\u0011\u0010\u0016\u001A\u00020\u00112\u0006\u0010\u0017\u001A\u00020\u0000H\u0096\u0002J\b\u0010\u0005\u001A\u00020\u0018H\u0016J\b\u0010\u0019\u001A\u00020\u001AH\u0016R\u000E\u0010\u0006\u001A\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u000BX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0010\u001A\u00020\u0011X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0005\u001A\u00060\u0002j\u0002`\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001A\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u001B"}, d2 = {"Lkotlinx/coroutines/test/TimedRunnableObsolete;", "", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "run", "count", "", "time", "(Ljava/lang/Runnable;JJ)V", "heap", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "compareTo", "other", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class TimedRunnableObsolete implements Comparable, Runnable, ThreadSafeHeapNode {
    private final long count;
    private ThreadSafeHeap heap;
    private int index;
    private final Runnable run;
    public final long time;

    public TimedRunnableObsolete(Runnable runnable0, long v, long v1) {
        this.run = runnable0;
        this.count = v;
        this.time = v1;
    }

    public TimedRunnableObsolete(Runnable runnable0, long v, long v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(runnable0, ((v2 & 2) == 0 ? v : 0L), ((v2 & 4) == 0 ? v1 : 0L));
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo(((TimedRunnableObsolete)object0));
    }

    public int compareTo(TimedRunnableObsolete timedRunnableObsolete0) {
        return this.time == timedRunnableObsolete0.time ? Intrinsics.compare(this.count, timedRunnableObsolete0.count) : Intrinsics.compare(this.time, timedRunnableObsolete0.time);
    }

    @Override  // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public ThreadSafeHeap getHeap() {
        return this.heap;
    }

    @Override  // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public int getIndex() {
        return this.index;
    }

    @Override
    public void run() {
        this.run.run();
    }

    @Override  // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public void setHeap(ThreadSafeHeap threadSafeHeap0) {
        this.heap = threadSafeHeap0;
    }

    @Override  // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public void setIndex(int v) {
        this.index = v;
    }

    @Override
    public String toString() {
        return "TimedRunnable(time=" + this.time + ", run=" + this.run + ')';
    }
}

