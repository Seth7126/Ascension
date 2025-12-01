package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001B\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000FJ\t\u0010\u0010\u001A\u00020\u0011H\u0096\u0002J\b\u0010\u0012\u001A\u00020\u0011H\u0016J\u000E\u0010\u0013\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001A\u00020\u0006H\u0016J\r\u0010\u0016\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0017\u001A\u00020\u0006H\u0016J\b\u0010\u0018\u001A\u00020\rH\u0016J\u0015\u0010\u0019\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000FJ\b\u0010\u001A\u001A\u00020\rH\u0002R\u000E\u0010\b\u001A\u00020\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u0017\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u000E\u0010\u000B\u001A\u00020\u0006X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u001B"}, d2 = {"Landroidx/compose/runtime/snapshots/StateListIterator;", "T", "", "list", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "offset", "", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V", "index", "getList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "modification", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "validateModification", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class StateListIterator implements ListIterator, KMutableListIterator {
    private int index;
    private final SnapshotStateList list;
    private int modification;

    public StateListIterator(SnapshotStateList snapshotStateList0, int v) {
        Intrinsics.checkNotNullParameter(snapshotStateList0, "list");
        super();
        this.list = snapshotStateList0;
        this.index = v - 1;
        this.modification = snapshotStateList0.getModification$runtime_release();
    }

    @Override
    public void add(Object object0) {
        this.validateModification();
        this.list.add(this.index + 1, object0);
        ++this.index;
        this.modification = this.list.getModification$runtime_release();
    }

    public final SnapshotStateList getList() {
        return this.list;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.list.size() - 1;
    }

    @Override
    public boolean hasPrevious() {
        return this.index >= 0;
    }

    @Override
    public Object next() {
        this.validateModification();
        int v = this.index + 1;
        SnapshotStateListKt.validateRange(v, this.list.size());
        Object object0 = this.list.get(v);
        this.index = v;
        return object0;
    }

    @Override
    public int nextIndex() {
        return this.index + 1;
    }

    @Override
    public Object previous() {
        this.validateModification();
        SnapshotStateListKt.validateRange(this.index, this.list.size());
        Object object0 = this.list.get(this.index);
        --this.index;
        return object0;
    }

    @Override
    public int previousIndex() {
        return this.index;
    }

    @Override
    public void remove() {
        this.validateModification();
        this.list.remove(this.index);
        --this.index;
        this.modification = this.list.getModification$runtime_release();
    }

    @Override
    public void set(Object object0) {
        this.validateModification();
        this.list.set(this.index, object0);
        this.modification = this.list.getModification$runtime_release();
    }

    private final void validateModification() {
        if(this.list.getModification$runtime_release() != this.modification) {
            throw new ConcurrentModificationException();
        }
    }
}

