package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010\'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B\u0019\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\n\u001A\u00020\u000BH\u0096\u0002J\u0015\u0010\f\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\b\u0010\r\u001A\u00020\u000EH\u0016J\u001B\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00028\u0001¢\u0006\u0002\u0010\u0012R,\u0010\b\u001A \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderEntriesIterator;", "K", "V", "", "", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)V", "base", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderBaseIterator;", "hasNext", "", "next", "remove", "", "setValue", "key", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PersistentHashMapBuilderEntriesIterator implements Iterator, KMutableIterator {
    private final PersistentHashMapBuilderBaseIterator base;

    public PersistentHashMapBuilderEntriesIterator(PersistentHashMapBuilder persistentHashMapBuilder0) {
        Intrinsics.checkNotNullParameter(persistentHashMapBuilder0, "builder");
        super();
        TrieNodeBaseIterator[] arr_trieNodeBaseIterator = new TrieNodeBaseIterator[8];
        for(int v = 0; v < 8; ++v) {
            arr_trieNodeBaseIterator[v] = new TrieNodeMutableEntriesIterator(this);
        }
        this.base = new PersistentHashMapBuilderBaseIterator(persistentHashMapBuilder0, arr_trieNodeBaseIterator);
    }

    @Override
    public boolean hasNext() {
        return this.base.hasNext();
    }

    @Override
    public Object next() {
        return this.next();
    }

    public Map.Entry next() {
        return (Map.Entry)this.base.next();
    }

    @Override
    public void remove() {
        this.base.remove();
    }

    public final void setValue(Object object0, Object object1) {
        this.base.setValue(object0, object1);
    }
}

