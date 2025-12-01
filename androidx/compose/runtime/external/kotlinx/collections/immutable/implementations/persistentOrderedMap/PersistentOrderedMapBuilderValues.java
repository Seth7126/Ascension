package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableCollection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000FJ\b\u0010\u0010\u001A\u00020\u0011H\u0016J\u0016\u0010\u0012\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u000FJ\u000F\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0096\u0002R\u001A\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001A\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000B¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderValues;", "K", "V", "", "Lkotlin/collections/AbstractMutableCollection;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "clear", "", "contains", "iterator", "", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PersistentOrderedMapBuilderValues extends AbstractMutableCollection implements Collection, KMutableCollection {
    private final PersistentOrderedMapBuilder builder;

    public PersistentOrderedMapBuilderValues(PersistentOrderedMapBuilder persistentOrderedMapBuilder0) {
        Intrinsics.checkNotNullParameter(persistentOrderedMapBuilder0, "builder");
        super();
        this.builder = persistentOrderedMapBuilder0;
    }

    @Override  // kotlin.collections.AbstractMutableCollection
    public boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.builder.clear();
    }

    @Override
    public boolean contains(Object object0) {
        return this.builder.containsValue(object0);
    }

    @Override  // kotlin.collections.AbstractMutableCollection
    public int getSize() {
        return this.builder.size();
    }

    @Override
    public Iterator iterator() {
        return new PersistentOrderedMapBuilderValuesIterator(this.builder);
    }
}

