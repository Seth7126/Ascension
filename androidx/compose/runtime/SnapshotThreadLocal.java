package androidx.compose.runtime;

import androidx.compose.runtime.internal.ThreadMap;
import androidx.compose.runtime.internal.ThreadMapKt;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\r\u0010\t\u001A\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\nJ\u0015\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u000ER\u001E\u0010\u0004\u001A\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000F"}, d2 = {"Landroidx/compose/runtime/SnapshotThreadLocal;", "T", "", "()V", "map", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/ThreadMap;", "Landroidx/compose/runtime/AtomicReference;", "writeMutex", "get", "()Ljava/lang/Object;", "set", "", "value", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SnapshotThreadLocal {
    private final AtomicReference map;
    private final Object writeMutex;

    public SnapshotThreadLocal() {
        this.map = new AtomicReference(ThreadMapKt.getEmptyThreadMap());
        this.writeMutex = new Object();
    }

    public final Object get() {
        return ((ThreadMap)this.map.get()).get(Thread.currentThread().getId());
    }

    public final void set(Object object0) {
        long v = Thread.currentThread().getId();
        synchronized(this.writeMutex) {
            ThreadMap threadMap0 = (ThreadMap)this.map.get();
            if(threadMap0.trySet(v, object0)) {
                return;
            }
            ThreadMap threadMap1 = threadMap0.newWith(v, object0);
            this.map.set(threadMap1);
        }
    }
}

