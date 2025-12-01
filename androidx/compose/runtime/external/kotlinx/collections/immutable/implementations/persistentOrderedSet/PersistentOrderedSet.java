package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u001E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \'*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\'B-\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0002\u0010\nJ\u001B\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0016J\u001C\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u000E\u0010\u001A\u001A\b\u0012\u0004\u0012\u00028\u00000\u001BH\u0016J\u000E\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\u0016\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u0015\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0002\u0010\u001FJ\u000F\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00000!H\u0096\u0002J\u001B\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0016J\"\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010$\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001E0%H\u0016J\u001C\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u001C\u0010&\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016R\u0016\u0010\u0004\u001A\u0004\u0018\u00010\u0005X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR \u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bX\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0016\u0010\u0006\u001A\u0004\u0018\u00010\u0005X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u0014\u0010\u0010\u001A\u00020\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013\u00A8\u0006("}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "E", "Lkotlin/collections/AbstractSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "firstElement", "", "lastElement", "hashMap", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "getFirstElement$runtime_release", "()Ljava/lang/Object;", "getHashMap$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "getLastElement$runtime_release", "size", "", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "addAll", "elements", "", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "clear", "contains", "", "(Ljava/lang/Object;)Z", "iterator", "", "remove", "removeAll", "predicate", "Lkotlin/Function1;", "retainAll", "Companion", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PersistentOrderedSet extends AbstractSet implements PersistentSet {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0001\u0010\bH\u0000¢\u0006\u0002\b\tR\u0014\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "", "emptyOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "E", "emptyOf$runtime_release", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final PersistentSet emptyOf$runtime_release() {
            return PersistentOrderedSet.EMPTY;
        }
    }

    public static final Companion Companion;
    private static final PersistentOrderedSet EMPTY;
    private final Object firstElement;
    private final PersistentHashMap hashMap;
    private final Object lastElement;

    static {
        PersistentOrderedSet.Companion = new Companion(null);
        PersistentHashMap persistentHashMap0 = PersistentHashMap.Companion.emptyOf$runtime_release();
        PersistentOrderedSet.EMPTY = new PersistentOrderedSet(EndOfChain.INSTANCE, EndOfChain.INSTANCE, persistentHashMap0);
    }

    public PersistentOrderedSet(Object object0, Object object1, PersistentHashMap persistentHashMap0) {
        Intrinsics.checkNotNullParameter(persistentHashMap0, "hashMap");
        super();
        this.firstElement = object0;
        this.lastElement = object1;
        this.hashMap = persistentHashMap0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection add(Object object0) {
        return this.add(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet add(Object object0) {
        if(this.hashMap.containsKey(object0)) {
            return this;
        }
        if(this.isEmpty()) {
            Links links0 = new Links();
            return new PersistentOrderedSet(object0, object0, this.hashMap.put(object0, links0));
        }
        Object object1 = this.hashMap.get(this.lastElement);
        Intrinsics.checkNotNull(object1);
        Links links1 = ((Links)object1).withNext(object0);
        PersistentHashMap persistentHashMap0 = this.hashMap.put(this.lastElement, links1).put(object0, new Links(this.lastElement));
        return new PersistentOrderedSet(this.firstElement, object0, persistentHashMap0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection addAll(Collection collection0) {
        return this.addAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet addAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        Builder persistentSet$Builder0 = this.builder();
        persistentSet$Builder0.addAll(collection0);
        return persistentSet$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder builder() {
        return this.builder();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public Builder builder() {
        return new PersistentOrderedSetBuilder(this);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection clear() {
        return this.clear();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet clear() {
        return PersistentOrderedSet.Companion.emptyOf$runtime_release();
    }

    @Override  // kotlin.collections.AbstractCollection
    public boolean contains(Object object0) {
        return this.hashMap.containsKey(object0);
    }

    public final Object getFirstElement$runtime_release() {
        return this.firstElement;
    }

    public final PersistentHashMap getHashMap$runtime_release() {
        return this.hashMap;
    }

    public final Object getLastElement$runtime_release() {
        return this.lastElement;
    }

    @Override  // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.hashMap.size();
    }

    @Override  // kotlin.collections.AbstractSet
    public Iterator iterator() {
        return new PersistentOrderedSetIterator(this.firstElement, this.hashMap);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection remove(Object object0) {
        return this.remove(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet remove(Object object0) {
        Links links0 = (Links)this.hashMap.get(object0);
        if(links0 == null) {
            return this;
        }
        PersistentHashMap persistentHashMap0 = this.hashMap.remove(object0);
        if(links0.getHasPrevious()) {
            Object object1 = persistentHashMap0.get(links0.getPrevious());
            Intrinsics.checkNotNull(object1);
            persistentHashMap0 = persistentHashMap0.put(links0.getPrevious(), ((Links)object1).withNext(links0.getNext()));
        }
        if(links0.getHasNext()) {
            Object object2 = persistentHashMap0.get(links0.getNext());
            Intrinsics.checkNotNull(object2);
            persistentHashMap0 = persistentHashMap0.put(links0.getNext(), ((Links)object2).withPrevious(links0.getPrevious()));
        }
        Object object3 = links0.getHasPrevious() ? this.firstElement : links0.getNext();
        return links0.getHasNext() ? new PersistentOrderedSet(object3, this.lastElement, persistentHashMap0) : new PersistentOrderedSet(object3, links0.getPrevious(), persistentHashMap0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection removeAll(Collection collection0) {
        return this.removeAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection removeAll(Function1 function10) {
        return this.removeAll(function10);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet removeAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        Builder persistentSet$Builder0 = this.builder();
        persistentSet$Builder0.removeAll(collection0);
        return persistentSet$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet removeAll(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Builder persistentSet$Builder0 = this.builder();
        CollectionsKt.removeAll(persistentSet$Builder0, function10);
        return persistentSet$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection retainAll(Collection collection0) {
        return this.retainAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet retainAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        Builder persistentSet$Builder0 = this.builder();
        persistentSet$Builder0.retainAll(collection0);
        return persistentSet$Builder0.build();
    }
}

