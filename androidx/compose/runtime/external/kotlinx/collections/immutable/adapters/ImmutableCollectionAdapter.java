package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00028\u0000H\u0096\u0003¢\u0006\u0002\u0010\rJ\u0017\u0010\u000E\u001A\u00020\u000B2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0001J\u0013\u0010\u0010\u001A\u00020\u000B2\b\u0010\u0011\u001A\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001A\u00020\u0007H\u0016J\t\u0010\u0014\u001A\u00020\u000BH\u0096\u0001J\u000F\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0003J\b\u0010\u0017\u001A\u00020\u0018H\u0016R\u0014\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001A\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableCollectionAdapter;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "", "impl", "(Ljava/util/Collection;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "equals", "other", "", "hashCode", "isEmpty", "iterator", "", "toString", "", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public class ImmutableCollectionAdapter implements ImmutableCollection, Collection, KMappedMarker {
    private final Collection impl;

    public ImmutableCollectionAdapter(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "impl");
        super();
        this.impl = collection0;
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean contains(Object object0) {
        return this.impl.contains(object0);
    }

    @Override
    public boolean containsAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return this.impl.containsAll(collection0);
    }

    @Override
    public boolean equals(Object object0) {
        return this.impl.equals(object0);
    }

    public int getSize() {
        return this.impl.size();
    }

    @Override
    public int hashCode() {
        return this.impl.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.impl.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return this.impl.iterator();
    }

    @Override
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeIf(Predicate predicate0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "array");
        return CollectionToArray.toArray(this, arr_object);
    }

    @Override
    public String toString() {
        return this.impl.toString();
    }
}

