package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0004\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001A\u00020\u0012H\u0002J\t\u0010\u0013\u001A\u00020\u0014H\u0096\u0002J\u000E\u0010\u0015\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0016R\u001A\u0010\t\u001A\u00020\nX\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER \u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0010\u0010\u0003\u001A\u0004\u0018\u00010\u0004X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetIterator;", "E", "", "nextElement", "", "map", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "(Ljava/lang/Object;Ljava/util/Map;)V", "index", "", "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", "getMap$runtime_release", "()Ljava/util/Map;", "checkHasNext", "", "hasNext", "", "next", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public class PersistentOrderedSetIterator implements Iterator, KMappedMarker {
    private int index;
    private final Map map;
    private Object nextElement;

    public PersistentOrderedSetIterator(Object object0, Map map0) {
        Intrinsics.checkNotNullParameter(map0, "map");
        super();
        this.nextElement = object0;
        this.map = map0;
    }

    private final void checkHasNext() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final int getIndex$runtime_release() {
        return this.index;
    }

    public final Map getMap$runtime_release() {
        return this.map;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.map.size();
    }

    @Override
    public Object next() {
        this.checkHasNext();
        Object object0 = this.nextElement;
        ++this.index;
        Object object1 = this.map.get(object0);
        if(object1 == null) {
            throw new ConcurrentModificationException("Hash code of an element (" + object0 + ") has changed after it was added to the persistent set.");
        }
        this.nextElement = ((Links)object1).getNext();
        return object0;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime_release(int v) {
        this.index = v;
    }
}

