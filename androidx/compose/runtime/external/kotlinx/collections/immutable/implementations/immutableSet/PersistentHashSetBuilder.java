package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\u00A2\u0006\u0002\u0010\u0006J\u0015\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u001CJ\u0016\u0010\u001D\u001A\u00020\u001A2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001FH\u0016J\u000E\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J\b\u0010!\u001A\u00020\"H\u0016J\u0016\u0010#\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0002\u0010\u001CJ\u0016\u0010$\u001A\u00020\u001A2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001FH\u0016J\u000F\u0010%\u001A\b\u0012\u0004\u0012\u00028\u00000&H\u0096\u0002J\u0015\u0010\'\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u001CJ\u0016\u0010(\u001A\u00020\u001A2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001FH\u0016J\u0016\u0010)\u001A\u00020\u001A2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001FH\u0016R\u001E\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\b@BX\u0080\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR*\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\f@BX\u0080\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u001E\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0007\u001A\u00020\u0010@BX\u0080\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u000E\u00A2\u0006\u0002\n\u0000R$\u0010\u0015\u001A\u00020\b2\u0006\u0010\u0014\u001A\u00020\b@VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0016\u0010\u000B\"\u0004\b\u0017\u0010\u0018\u00A8\u0006*"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "E", "Lkotlin/collections/AbstractMutableSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "set", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;)V", "<set-?>", "", "modCount", "getModCount$runtime_release", "()I", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "getNode$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownership", "getOwnership$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "value", "size", "getSize", "setSize", "(I)V", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "", "build", "clear", "", "contains", "containsAll", "iterator", "", "remove", "removeAll", "retainAll", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PersistentHashSetBuilder extends AbstractMutableSet implements Builder {
    private int modCount;
    private TrieNode node;
    private MutabilityOwnership ownership;
    private PersistentHashSet set;
    private int size;

    public PersistentHashSetBuilder(PersistentHashSet persistentHashSet0) {
        Intrinsics.checkNotNullParameter(persistentHashSet0, "set");
        super();
        this.set = persistentHashSet0;
        this.ownership = new MutabilityOwnership();
        this.node = this.set.getNode$runtime_release();
        this.size = this.set.size();
    }

    @Override  // kotlin.collections.AbstractMutableSet
    public boolean add(Object object0) {
        this.node = this.node.mutableAdd((object0 == null ? 0 : object0.hashCode()), object0, 0, this);
        return false;
    }

    @Override
    public boolean addAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        PersistentHashSet persistentHashSet0 = collection0 instanceof PersistentHashSet ? ((PersistentHashSet)collection0) : null;
        if(persistentHashSet0 == null) {
            PersistentHashSetBuilder persistentHashSetBuilder0 = collection0 instanceof PersistentHashSetBuilder ? ((PersistentHashSetBuilder)collection0) : null;
            persistentHashSet0 = persistentHashSetBuilder0 == null ? null : persistentHashSetBuilder0.build();
        }
        if(persistentHashSet0 != null) {
            DeltaCounter deltaCounter0 = new DeltaCounter(0, 1, null);
            int v = this.size();
            TrieNode trieNode0 = this.node.mutableAddAll(persistentHashSet0.getNode$runtime_release(), 0, deltaCounter0, this);
            int v1 = collection0.size() + v - deltaCounter0.getCount();
            if(v != v1) {
                this.node = trieNode0;
                this.setSize(v1);
            }
            return v != this.size();
        }
        return super.addAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection$Builder
    public PersistentCollection build() {
        return this.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet$Builder
    public PersistentSet build() {
        return this.build();
    }

    public PersistentHashSet build() {
        PersistentHashSet persistentHashSet0;
        if(this.node == this.set.getNode$runtime_release()) {
            persistentHashSet0 = this.set;
        }
        else {
            this.ownership = new MutabilityOwnership();
            persistentHashSet0 = new PersistentHashSet(this.node, this.size());
        }
        this.set = persistentHashSet0;
        return persistentHashSet0;
    }

    @Override
    public void clear() {
        this.node = TrieNode.Companion.getEMPTY$runtime_release();
        this.setSize(0);
    }

    @Override
    public boolean contains(Object object0) {
        TrieNode trieNode0 = this.node;
        return object0 == null ? trieNode0.contains(0, null, 0) : trieNode0.contains(object0.hashCode(), object0, 0);
    }

    @Override
    public boolean containsAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        if(collection0 instanceof PersistentHashSet) {
            return this.node.containsAll(((PersistentHashSet)collection0).getNode$runtime_release(), 0);
        }
        return collection0 instanceof PersistentHashSetBuilder ? this.node.containsAll(((PersistentHashSetBuilder)collection0).node, 0) : super.containsAll(collection0);
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    public final TrieNode getNode$runtime_release() {
        return this.node;
    }

    public final MutabilityOwnership getOwnership$runtime_release() {
        return this.ownership;
    }

    @Override  // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.size;
    }

    @Override
    public Iterator iterator() {
        return new PersistentHashSetMutableIterator(this);
    }

    @Override
    public boolean remove(Object object0) {
        this.node = this.node.mutableRemove((object0 == null ? 0 : object0.hashCode()), object0, 0, this);
        return false;
    }

    @Override
    public boolean removeAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        PersistentHashSet persistentHashSet0 = collection0 instanceof PersistentHashSet ? ((PersistentHashSet)collection0) : null;
        if(persistentHashSet0 == null) {
            PersistentHashSetBuilder persistentHashSetBuilder0 = collection0 instanceof PersistentHashSetBuilder ? ((PersistentHashSetBuilder)collection0) : null;
            persistentHashSet0 = persistentHashSetBuilder0 == null ? null : persistentHashSetBuilder0.build();
        }
        if(persistentHashSet0 != null) {
            DeltaCounter deltaCounter0 = new DeltaCounter(0, 1, null);
            int v = this.size();
            Object object0 = this.node.mutableRemoveAll(persistentHashSet0.getNode$runtime_release(), 0, deltaCounter0, this);
            int v1 = v - deltaCounter0.getCount();
            if(v1 == 0) {
                this.clear();
                return v != this.size();
            }
            if(v1 != v) {
                if(object0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
                }
                this.node = (TrieNode)object0;
                this.setSize(v1);
                return v != this.size();
            }
            return v != this.size();
        }
        return super.removeAll(collection0);
    }

    @Override
    public boolean retainAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        PersistentHashSet persistentHashSet0 = collection0 instanceof PersistentHashSet ? ((PersistentHashSet)collection0) : null;
        if(persistentHashSet0 == null) {
            PersistentHashSetBuilder persistentHashSetBuilder0 = collection0 instanceof PersistentHashSetBuilder ? ((PersistentHashSetBuilder)collection0) : null;
            persistentHashSet0 = persistentHashSetBuilder0 == null ? null : persistentHashSetBuilder0.build();
        }
        if(persistentHashSet0 != null) {
            DeltaCounter deltaCounter0 = new DeltaCounter(0, 1, null);
            int v = this.size();
            Object object0 = this.node.mutableRetainAll(persistentHashSet0.getNode$runtime_release(), 0, deltaCounter0, this);
            int v1 = deltaCounter0.getCount();
            if(v1 == 0) {
                this.clear();
                return v != this.size();
            }
            if(v1 != v) {
                if(object0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
                }
                this.node = (TrieNode)object0;
                this.setSize(v1);
                return v != this.size();
            }
            return v != this.size();
        }
        return super.retainAll(collection0);
    }

    public void setSize(int v) {
        this.size = v;
        ++this.modCount;
    }
}

