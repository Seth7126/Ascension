package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u001E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 !*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001!B\u001B\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\u001B\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000E\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000FJ\u001C\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016J\u000E\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016J\u000E\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\u0016\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u000E\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001A\u00020\u00172\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016J\u000F\u0010\u001A\u001A\b\u0012\u0004\u0012\u00028\u00000\u001BH\u0096\u0002J\u001B\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000E\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000FJ\"\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u001FH\u0016J\u001C\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016J\u001C\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016R\u001A\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001A\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f¨\u0006\""}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "E", "Lkotlin/collections/AbstractSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "size", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;I)V", "getNode$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "addAll", "elements", "", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "clear", "contains", "", "(Ljava/lang/Object;)Z", "containsAll", "iterator", "", "remove", "removeAll", "predicate", "Lkotlin/Function1;", "retainAll", "Companion", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PersistentHashSet extends AbstractSet implements PersistentSet {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0001\u0010\bH\u0000¢\u0006\u0002\b\tR\u0014\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "", "emptyOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "E", "emptyOf$runtime_release", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final PersistentSet emptyOf$runtime_release() {
            return PersistentHashSet.EMPTY;
        }
    }

    public static final Companion Companion;
    private static final PersistentHashSet EMPTY;
    private final TrieNode node;
    private final int size;

    static {
        PersistentHashSet.Companion = new Companion(null);
        PersistentHashSet.EMPTY = new PersistentHashSet(TrieNode.Companion.getEMPTY$runtime_release(), 0);
    }

    public PersistentHashSet(TrieNode trieNode0, int v) {
        Intrinsics.checkNotNullParameter(trieNode0, "node");
        super();
        this.node = trieNode0;
        this.size = v;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection add(Object object0) {
        return this.add(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet add(Object object0) {
        TrieNode trieNode0 = this.node.add((object0 == null ? 0 : object0.hashCode()), object0, 0);
        return this.node == trieNode0 ? this : new PersistentHashSet(trieNode0, this.size() + 1);
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
        return new PersistentHashSetBuilder(this);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection clear() {
        return this.clear();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet clear() {
        return PersistentHashSet.Companion.emptyOf$runtime_release();
    }

    @Override  // kotlin.collections.AbstractCollection
    public boolean contains(Object object0) {
        return object0 == null ? this.node.contains(0, null, 0) : this.node.contains(object0.hashCode(), object0, 0);
    }

    @Override  // kotlin.collections.AbstractCollection
    public boolean containsAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        if(collection0 instanceof PersistentHashSet) {
            return this.node.containsAll(((PersistentHashSet)collection0).node, 0);
        }
        if(collection0 instanceof PersistentHashSetBuilder) {
            TrieNode trieNode0 = ((PersistentHashSetBuilder)collection0).getNode$runtime_release();
            return this.node.containsAll(trieNode0, 0);
        }
        return super.containsAll(collection0);
    }

    public final TrieNode getNode$runtime_release() {
        return this.node;
    }

    @Override  // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    @Override  // kotlin.collections.AbstractSet
    public Iterator iterator() {
        return new PersistentHashSetIterator(this.node);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection remove(Object object0) {
        return this.remove(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public PersistentSet remove(Object object0) {
        TrieNode trieNode0 = this.node.remove((object0 == null ? 0 : object0.hashCode()), object0, 0);
        return this.node == trieNode0 ? this : new PersistentHashSet(trieNode0, this.size() - 1);
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

