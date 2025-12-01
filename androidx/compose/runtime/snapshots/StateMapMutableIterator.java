package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u000B\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B3\u0012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0018\u0010\u0006\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u001C\u001A\u00020\u001DH\u0004J\u0006\u0010\u001E\u001A\u00020\u001FJ%\u0010 \u001A\u0002H!\"\u0004\b\u0002\u0010!2\f\u0010\"\u001A\b\u0012\u0004\u0012\u0002H!0#H\u0084\bø\u0001\u0000¢\u0006\u0002\u0010$J\u0006\u0010%\u001A\u00020\u001DR(\u0010\n\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\bX\u0084\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER#\u0010\u0006\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u001D\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0013\u001A\u00020\u0014X\u0084\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\bX\u0084\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001A\u0010\f\"\u0004\b\u001B\u0010\u000E\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&"}, d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableIterator;", "K", "V", "", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "iterator", "", "", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;Ljava/util/Iterator;)V", "current", "getCurrent", "()Ljava/util/Map$Entry;", "setCurrent", "(Ljava/util/Map$Entry;)V", "getIterator", "()Ljava/util/Iterator;", "getMap", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "modification", "", "getModification", "()I", "setModification", "(I)V", "next", "getNext", "setNext", "advance", "", "hasNext", "", "modify", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "remove", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
abstract class StateMapMutableIterator {
    private Map.Entry current;
    private final Iterator iterator;
    private final SnapshotStateMap map;
    private int modification;
    private Map.Entry next;

    public StateMapMutableIterator(SnapshotStateMap snapshotStateMap0, Iterator iterator0) {
        Intrinsics.checkNotNullParameter(snapshotStateMap0, "map");
        Intrinsics.checkNotNullParameter(iterator0, "iterator");
        super();
        this.map = snapshotStateMap0;
        this.iterator = iterator0;
        this.modification = snapshotStateMap0.getModification$runtime_release();
        this.advance();
    }

    protected final void advance() {
        Map.Entry map$Entry0;
        this.current = this.next;
        if(this.iterator.hasNext()) {
            Object object0 = this.iterator.next();
            map$Entry0 = (Map.Entry)object0;
        }
        else {
            map$Entry0 = null;
        }
        this.next = map$Entry0;
    }

    protected final Map.Entry getCurrent() {
        return this.current;
    }

    public final Iterator getIterator() {
        return this.iterator;
    }

    public final SnapshotStateMap getMap() {
        return this.map;
    }

    protected final int getModification() {
        return this.modification;
    }

    protected final Map.Entry getNext() {
        return this.next;
    }

    public final boolean hasNext() {
        return this.next != null;
    }

    protected final Object modify(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        if(this.getMap().getModification$runtime_release() != this.modification) {
            throw new ConcurrentModificationException();
        }
        Object object0 = function00.invoke();
        this.modification = this.getMap().getModification$runtime_release();
        return object0;
    }

    public final void remove() {
        if(this.getMap().getModification$runtime_release() != this.modification) {
            throw new ConcurrentModificationException();
        }
        Map.Entry map$Entry0 = this.getCurrent();
        if(map$Entry0 == null) {
            throw new IllegalStateException();
        }
        this.getMap().remove(map$Entry0.getKey());
        this.setCurrent(null);
        this.modification = this.getMap().getModification$runtime_release();
    }

    protected final void setCurrent(Map.Entry map$Entry0) {
        this.current = map$Entry0;
    }

    protected final void setModification(int v) {
        this.modification = v;
    }

    protected final void setNext(Map.Entry map$Entry0) {
        this.next = map$Entry0;
    }
}

