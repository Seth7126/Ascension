package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010*\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0002\u0010\u0006J\r\u0010\r\u001A\u00020\u000EH\u0000¢\u0006\u0002\b\u000FJ\r\u0010\u0010\u001A\u00020\u000EH\u0000¢\u0006\u0002\b\u0011J\t\u0010\u0012\u001A\u00020\u0013H\u0096\u0002J\b\u0010\u0014\u001A\u00020\u0013H\u0016J\b\u0010\u0015\u001A\u00020\u0004H\u0016J\b\u0010\u0016\u001A\u00020\u0004H\u0016R\u001A\u0010\u0003\u001A\u00020\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001A\u0010\u0005\u001A\u00020\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "E", "", "index", "", "size", "(II)V", "getIndex", "()I", "setIndex", "(I)V", "getSize", "setSize", "checkHasNext", "", "checkHasNext$runtime_release", "checkHasPrevious", "checkHasPrevious$runtime_release", "hasNext", "", "hasPrevious", "nextIndex", "previousIndex", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class AbstractListIterator implements ListIterator, KMappedMarker {
    private int index;
    private int size;

    public AbstractListIterator(int v, int v1) {
        this.index = v;
        this.size = v1;
    }

    @Override
    public void add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void checkHasNext$runtime_release() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void checkHasPrevious$runtime_release() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getSize() {
        return this.size;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override
    public boolean hasPrevious() {
        return this.index > 0;
    }

    @Override
    public Object next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public int nextIndex() {
        return this.index;
    }

    @Override
    public int previousIndex() {
        return this.index - 1;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void set(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int v) {
        this.index = v;
    }

    public final void setSize(int v) {
        this.size = v;
    }
}

