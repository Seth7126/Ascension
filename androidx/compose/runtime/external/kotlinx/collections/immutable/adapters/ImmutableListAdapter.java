package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00028\u0000H\u0096\u0003¢\u0006\u0002\u0010\rJ\u0017\u0010\u000E\u001A\u00020\u000B2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0001J\u0013\u0010\u0011\u001A\u00020\u000B2\b\u0010\u0012\u001A\u0004\u0018\u00010\u0013H\u0096\u0002J\u0016\u0010\u0014\u001A\u00028\u00002\u0006\u0010\u0015\u001A\u00020\u0007H\u0096\u0003¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001A\u00020\u0007H\u0016J\u0016\u0010\u0018\u001A\u00020\u00072\u0006\u0010\f\u001A\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\u0019J\t\u0010\u001A\u001A\u00020\u000BH\u0096\u0001J\u000F\u0010\u001B\u001A\b\u0012\u0004\u0012\u00028\u00000\u001CH\u0096\u0003J\u0016\u0010\u001D\u001A\u00020\u00072\u0006\u0010\f\u001A\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\u0019J\u000F\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001FH\u0096\u0001J\u0017\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001F2\u0006\u0010\u0015\u001A\u00020\u0007H\u0096\u0001J\u001E\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010!\u001A\u00020\u00072\u0006\u0010\"\u001A\u00020\u0007H\u0016J\b\u0010#\u001A\u00020$H\u0016R\u0014\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001A\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\b\u0010\t¨\u0006%"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableListAdapter;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "", "impl", "(Ljava/util/List;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "equals", "other", "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ImmutableListAdapter implements ImmutableList, List, KMappedMarker {
    private final List impl;

    public ImmutableListAdapter(List list0) {
        Intrinsics.checkNotNullParameter(list0, "impl");
        super();
        this.impl = list0;
    }

    @Override
    public void add(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
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

    @Override
    public Object get(int v) {
        return this.impl.get(v);
    }

    public int getSize() {
        return this.impl.size();
    }

    @Override
    public int hashCode() {
        return this.impl.hashCode();
    }

    @Override
    public int indexOf(Object object0) {
        return this.impl.indexOf(object0);
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
    public int lastIndexOf(Object object0) {
        return this.impl.lastIndexOf(object0);
    }

    @Override
    public ListIterator listIterator() {
        return this.impl.listIterator();
    }

    @Override
    public ListIterator listIterator(int v) {
        return this.impl.listIterator(v);
    }

    @Override
    public Object remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
    public void replaceAll(UnaryOperator unaryOperator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object set(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    public void sort(Comparator comparator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    public ImmutableList subList(int v, int v1) {
        return new ImmutableListAdapter(this.impl.subList(v, v1));
    }

    @Override
    public List subList(int v, int v1) {
        return this.subList(v, v1);
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

