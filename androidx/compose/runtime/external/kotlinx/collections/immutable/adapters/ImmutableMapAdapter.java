package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001A\u001A\u00020\u00172\u0006\u0010\u001B\u001A\u00028\u0001H\u0096\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001C\u001A\u00020\u00172\b\u0010\u001D\u001A\u0004\u0018\u00010\u001EH\u0096\u0002J\u0018\u0010\u001F\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u0018\u001A\u00028\u0000H\u0096\u0003¢\u0006\u0002\u0010 J\b\u0010!\u001A\u00020\u000FH\u0016J\t\u0010\"\u001A\u00020\u0017H\u0096\u0001J\b\u0010#\u001A\u00020$H\u0016R&\u0010\u0007\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001A\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\bX\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0012\u0010\u000E\u001A\u00020\u000FX\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0015¨\u0006%"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableMapAdapter;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableMap;", "", "impl", "(Ljava/util/Map;)V", "entries", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "getEntries", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "keys", "getKeys", "size", "", "getSize", "()I", "values", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "equals", "other", "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "isEmpty", "toString", "", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ImmutableMapAdapter implements ImmutableMap, Map, KMappedMarker {
    private final ImmutableSet entries;
    private final Map impl;
    private final ImmutableSet keys;
    private final ImmutableCollection values;

    public ImmutableMapAdapter(Map map0) {
        Intrinsics.checkNotNullParameter(map0, "impl");
        super();
        this.impl = map0;
        this.keys = new ImmutableSetAdapter(map0.keySet());
        this.values = new ImmutableCollectionAdapter(map0.values());
        this.entries = new ImmutableSetAdapter(map0.entrySet());
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object compute(Object object0, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object computeIfAbsent(Object object0, Function function0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object computeIfPresent(Object object0, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.impl.containsKey(object0);
    }

    @Override
    public boolean containsValue(Object object0) {
        return this.impl.containsValue(object0);
    }

    public final ImmutableSet entrySet() {
        return this.getEntries();
    }

    @Override
    public Set entrySet() {
        return this.entrySet();
    }

    @Override
    public boolean equals(Object object0) {
        return this.impl.equals(object0);
    }

    @Override
    public Object get(Object object0) {
        return this.impl.get(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet getEntries() {
        return this.entries;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet getKeys() {
        return this.keys;
    }

    public int getSize() {
        return this.impl.size();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableCollection getValues() {
        return this.values;
    }

    @Override
    public int hashCode() {
        return this.impl.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.impl.isEmpty();
    }

    public final ImmutableSet keySet() {
        return this.getKeys();
    }

    @Override
    public Set keySet() {
        return this.keySet();
    }

    @Override
    public Object merge(Object object0, Object object1, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object put(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void putAll(Map map0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object putIfAbsent(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean remove(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object replace(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean replace(Object object0, Object object1, Object object2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void replaceAll(BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    public String toString() {
        return this.impl.toString();
    }

    public final ImmutableCollection values() {
        return this.getValues();
    }

    @Override
    public Collection values() {
        return this.values();
    }
}

