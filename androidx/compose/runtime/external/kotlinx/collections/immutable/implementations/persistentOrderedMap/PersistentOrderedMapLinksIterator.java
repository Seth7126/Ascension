package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B)\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\u0018\u0010\u0007\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\b¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001A\u00020\u0015H\u0096\u0002J\u000F\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002R \u0010\u0007\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001A\u0010\n\u001A\u00020\u000BX\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapLinksIterator;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "nextKey", "", "hashMap", "", "(Ljava/lang/Object;Ljava/util/Map;)V", "index", "", "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", "getNextKey$runtime_release", "()Ljava/lang/Object;", "setNextKey$runtime_release", "(Ljava/lang/Object;)V", "hasNext", "", "next", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public class PersistentOrderedMapLinksIterator implements Iterator, KMappedMarker {
    private final Map hashMap;
    private int index;
    private Object nextKey;

    public PersistentOrderedMapLinksIterator(Object object0, Map map0) {
        Intrinsics.checkNotNullParameter(map0, "hashMap");
        super();
        this.nextKey = object0;
        this.hashMap = map0;
    }

    public final int getIndex$runtime_release() {
        return this.index;
    }

    public final Object getNextKey$runtime_release() {
        return this.nextKey;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.hashMap.size();
    }

    public LinkedValue next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.hashMap.get(this.nextKey);
        if(object0 == null) {
            throw new ConcurrentModificationException("Hash code of a key (" + this.getNextKey$runtime_release() + ") has changed after it was added to the persistent map.");
        }
        ++this.index;
        this.nextKey = ((LinkedValue)object0).getNext();
        return (LinkedValue)object0;
    }

    @Override
    public Object next() {
        return this.next();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime_release(int v) {
        this.index = v;
    }

    public final void setNextKey$runtime_release(Object object0) {
        this.nextKey = object0;
    }
}

