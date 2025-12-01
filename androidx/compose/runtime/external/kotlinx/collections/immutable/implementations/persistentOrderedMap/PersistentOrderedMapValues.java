package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u000FJ\u000F\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0096\u0002R\u001A\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001A\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000B¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapValues;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "Lkotlin/collections/AbstractCollection;", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PersistentOrderedMapValues extends AbstractCollection implements ImmutableCollection {
    private final PersistentOrderedMap map;

    public PersistentOrderedMapValues(PersistentOrderedMap persistentOrderedMap0) {
        Intrinsics.checkNotNullParameter(persistentOrderedMap0, "map");
        super();
        this.map = persistentOrderedMap0;
    }

    @Override  // kotlin.collections.AbstractCollection
    public boolean contains(Object object0) {
        return this.map.containsValue(object0);
    }

    @Override  // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.map.size();
    }

    @Override  // kotlin.collections.AbstractCollection
    public Iterator iterator() {
        return new PersistentOrderedMapValuesIterator(this.map);
    }
}

