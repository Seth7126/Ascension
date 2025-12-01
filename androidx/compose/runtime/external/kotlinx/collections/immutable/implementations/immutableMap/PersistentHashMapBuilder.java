package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\'\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001F\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u00A2\u0006\u0002\u0010\u0007J\u0014\u0010.\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0016J\b\u0010/\u001A\u000200H\u0016J\u0015\u00101\u001A\u0002022\u0006\u00103\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u00104J\u0018\u00105\u001A\u0004\u0018\u00018\u00012\u0006\u00103\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0002\u00106J\u001F\u00107\u001A\u0004\u0018\u00018\u00012\u0006\u00103\u001A\u00028\u00002\u0006\u0010&\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u00108J\u001E\u00109\u001A\u0002002\u0014\u0010:\u001A\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010;H\u0016J\u0017\u0010<\u001A\u0004\u0018\u00018\u00012\u0006\u00103\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u00106J\u001B\u0010<\u001A\u0002022\u0006\u00103\u001A\u00028\u00002\u0006\u0010&\u001A\u00028\u0001\u00A2\u0006\u0002\u0010=R&\u0010\b\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\u001A\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\t8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000E\u0010\fR\u001A\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001A\u0010\u000F\u001A\u00020\u0010X\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016X\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001AR\u001E\u0010\u001B\u001A\u0004\u0018\u00018\u0001X\u0080\u000E\u00A2\u0006\u0010\n\u0002\u0010 \u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR\u001E\u0010#\u001A\u00020\"2\u0006\u0010!\u001A\u00020\"@BX\u0080\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b$\u0010%R$\u0010\'\u001A\u00020\u00102\u0006\u0010&\u001A\u00020\u0010@VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u001A\u0010*\u001A\b\u0012\u0004\u0012\u00028\u00010+8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b,\u0010-\u00A8\u0006>"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "Lkotlin/collections/AbstractMutableMap;", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "modCount", "", "getModCount$runtime_release", "()I", "setModCount$runtime_release", "(I)V", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "operationResult", "getOperationResult$runtime_release", "()Ljava/lang/Object;", "setOperationResult$runtime_release", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "<set-?>", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownership", "getOwnership$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "value", "size", "getSize", "setSize", "values", "", "getValues", "()Ljava/util/Collection;", "build", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PersistentHashMapBuilder extends AbstractMutableMap implements Builder {
    private PersistentHashMap map;
    private int modCount;
    private TrieNode node;
    private Object operationResult;
    private MutabilityOwnership ownership;
    private int size;

    public PersistentHashMapBuilder(PersistentHashMap persistentHashMap0) {
        Intrinsics.checkNotNullParameter(persistentHashMap0, "map");
        super();
        this.map = persistentHashMap0;
        this.ownership = new MutabilityOwnership();
        this.node = this.map.getNode$runtime_release();
        this.size = this.map.size();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap$Builder
    public PersistentMap build() {
        return this.build();
    }

    public PersistentHashMap build() {
        PersistentHashMap persistentHashMap0;
        if(this.node == this.map.getNode$runtime_release()) {
            persistentHashMap0 = this.map;
        }
        else {
            this.ownership = new MutabilityOwnership();
            persistentHashMap0 = new PersistentHashMap(this.node, this.size());
        }
        this.map = persistentHashMap0;
        return persistentHashMap0;
    }

    @Override
    public void clear() {
        this.node = TrieNode.Companion.getEMPTY$runtime_release();
        this.setSize(0);
    }

    @Override
    public boolean containsKey(Object object0) {
        TrieNode trieNode0 = this.node;
        return object0 == null ? trieNode0.containsKey(0, null, 0) : trieNode0.containsKey(object0.hashCode(), object0, 0);
    }

    @Override
    public Object get(Object object0) {
        TrieNode trieNode0 = this.node;
        return object0 == null ? trieNode0.get(0, null, 0) : trieNode0.get(object0.hashCode(), object0, 0);
    }

    @Override  // kotlin.collections.AbstractMutableMap
    public Set getEntries() {
        return new PersistentHashMapBuilderEntries(this);
    }

    @Override  // kotlin.collections.AbstractMutableMap
    public Set getKeys() {
        return new PersistentHashMapBuilderKeys(this);
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    public final TrieNode getNode$runtime_release() {
        return this.node;
    }

    public final Object getOperationResult$runtime_release() {
        return this.operationResult;
    }

    public final MutabilityOwnership getOwnership$runtime_release() {
        return this.ownership;
    }

    @Override  // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this.size;
    }

    @Override  // kotlin.collections.AbstractMutableMap
    public Collection getValues() {
        return new PersistentHashMapBuilderValues(this);
    }

    @Override  // kotlin.collections.AbstractMutableMap
    public Object put(Object object0, Object object1) {
        this.operationResult = null;
        this.node = this.node.mutablePut((object0 == null ? 0 : object0.hashCode()), object0, object1, 0, this);
        return this.operationResult;
    }

    @Override
    public void putAll(Map map0) {
        Intrinsics.checkNotNullParameter(map0, "from");
        PersistentHashMap persistentHashMap0 = map0 instanceof PersistentHashMap ? ((PersistentHashMap)map0) : null;
        if(persistentHashMap0 == null) {
            PersistentHashMapBuilder persistentHashMapBuilder0 = map0 instanceof PersistentHashMapBuilder ? ((PersistentHashMapBuilder)map0) : null;
            persistentHashMap0 = persistentHashMapBuilder0 == null ? null : persistentHashMapBuilder0.build();
        }
        if(persistentHashMap0 == null) {
            super.putAll(map0);
        }
        else {
            DeltaCounter deltaCounter0 = new DeltaCounter(0, 1, null);
            int v = this.size();
            this.node = this.node.mutablePutAll(persistentHashMap0.getNode$runtime_release(), 0, deltaCounter0, this);
            int v1 = persistentHashMap0.size() + v - deltaCounter0.getCount();
            if(v != v1) {
                this.setSize(v1);
            }
        }
    }

    @Override
    public Object remove(Object object0) {
        this.operationResult = null;
        TrieNode trieNode0 = this.node.mutableRemove((object0 == null ? 0 : object0.hashCode()), object0, 0, this);
        if(trieNode0 == null) {
            trieNode0 = TrieNode.Companion.getEMPTY$runtime_release();
        }
        this.node = trieNode0;
        return this.operationResult;
    }

    @Override
    public final boolean remove(Object object0, Object object1) {
        int v = this.size();
        TrieNode trieNode0 = this.node.mutableRemove((object0 == null ? 0 : object0.hashCode()), object0, object1, 0, this);
        if(trieNode0 == null) {
            trieNode0 = TrieNode.Companion.getEMPTY$runtime_release();
        }
        this.node = trieNode0;
        return v != this.size();
    }

    public final void setModCount$runtime_release(int v) {
        this.modCount = v;
    }

    public final void setNode$runtime_release(TrieNode trieNode0) {
        Intrinsics.checkNotNullParameter(trieNode0, "<set-?>");
        this.node = trieNode0;
    }

    public final void setOperationResult$runtime_release(Object object0) {
        this.operationResult = object0;
    }

    public void setSize(int v) {
        this.size = v;
        ++this.modCount;
    }
}

