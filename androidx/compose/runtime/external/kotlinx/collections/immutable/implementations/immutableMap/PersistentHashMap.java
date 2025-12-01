package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u0000 ,*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001,B!\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\u0007\u001A\u00020\b\u00A2\u0006\u0002\u0010\tJ\u0014\u0010\u0019\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001AH\u0016J\u0014\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u0015\u0010\u001C\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u001FJ\u001A\u0010 \u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000BH\u0002J\u0018\u0010!\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u001E\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0002\u0010\"J\u001A\u0010\r\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0#H\u0001J)\u0010$\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001E\u001A\u00028\u00002\u0006\u0010%\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u0010&J*\u0010\'\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\u0010(\u001A\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)H\u0016J!\u0010*\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001E\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010+J)\u0010*\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001E\u001A\u00028\u00002\u0006\u0010%\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u0010&R&\u0010\n\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000B8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\u001A\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000B8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0010\u0010\u000ER \u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001A\u00020\bX\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u001A\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00010\u00168VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018\u00A8\u0006-"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "K", "V", "Lkotlin/collections/AbstractMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "size", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "entries", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "getEntries", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "keys", "getKeys", "getNode$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getSize", "()I", "values", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "clear", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "createEntries", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "putAll", "m", "", "remove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Companion", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PersistentHashMap extends AbstractMap implements PersistentMap {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u0004\"\u0004\b\u0002\u0010\u0007\"\u0004\b\u0003\u0010\bH\u0000¢\u0006\u0002\b\tR\u001A\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "emptyOf", "K", "V", "emptyOf$runtime_release", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final PersistentHashMap emptyOf$runtime_release() {
            return PersistentHashMap.EMPTY;
        }
    }

    public static final Companion Companion;
    private static final PersistentHashMap EMPTY;
    private final TrieNode node;
    private final int size;

    static {
        PersistentHashMap.Companion = new Companion(null);
        PersistentHashMap.EMPTY = new PersistentHashMap(TrieNode.Companion.getEMPTY$runtime_release(), 0);
    }

    public PersistentHashMap(TrieNode trieNode0, int v) {
        Intrinsics.checkNotNullParameter(trieNode0, "node");
        super();
        this.node = trieNode0;
        this.size = v;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public Builder builder() {
        return this.builder();
    }

    public PersistentHashMapBuilder builder() {
        return new PersistentHashMapBuilder(this);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap clear() {
        return PersistentHashMap.Companion.emptyOf$runtime_release();
    }

    @Override  // kotlin.collections.AbstractMap
    public boolean containsKey(Object object0) {
        return object0 == null ? this.node.containsKey(0, null, 0) : this.node.containsKey(object0.hashCode(), object0, 0);
    }

    private final ImmutableSet createEntries() {
        return new PersistentHashMapEntries(this);
    }

    public final ImmutableSet entrySet() {
        return this.getEntries();
    }

    @Override  // kotlin.collections.AbstractMap
    public Object get(Object object0) {
        return object0 == null ? this.node.get(0, null, 0) : this.node.get(object0.hashCode(), object0, 0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet getEntries() {
        return this.createEntries();
    }

    @Override  // kotlin.collections.AbstractMap
    public final Set getEntries() {
        return this.createEntries();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet getKeys() {
        return new PersistentHashMapKeys(this);
    }

    @Override  // kotlin.collections.AbstractMap
    public Set getKeys() {
        return this.getKeys();
    }

    public final TrieNode getNode$runtime_release() {
        return this.node;
    }

    @Override  // kotlin.collections.AbstractMap
    public int getSize() {
        return this.size;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableCollection getValues() {
        return new PersistentHashMapValues(this);
    }

    @Override  // kotlin.collections.AbstractMap
    public Collection getValues() {
        return this.getValues();
    }

    public final ImmutableSet keySet() {
        return this.getKeys();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap put(Object object0, Object object1) {
        return this.put(object0, object1);
    }

    public PersistentHashMap put(Object object0, Object object1) {
        ModificationResult trieNode$ModificationResult0 = this.node.put((object0 == null ? 0 : object0.hashCode()), object0, object1, 0);
        return trieNode$ModificationResult0 == null ? this : new PersistentHashMap(trieNode$ModificationResult0.getNode(), this.size() + trieNode$ModificationResult0.getSizeDelta());
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap putAll(Map map0) {
        Intrinsics.checkNotNullParameter(map0, "m");
        Builder persistentMap$Builder0 = this.builder();
        persistentMap$Builder0.putAll(map0);
        return persistentMap$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap remove(Object object0) {
        return this.remove(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap remove(Object object0, Object object1) {
        return this.remove(object0, object1);
    }

    public PersistentHashMap remove(Object object0) {
        TrieNode trieNode0 = this.node.remove((object0 == null ? 0 : object0.hashCode()), object0, 0);
        if(this.node == trieNode0) {
            return this;
        }
        return trieNode0 == null ? PersistentHashMap.Companion.emptyOf$runtime_release() : new PersistentHashMap(trieNode0, this.size() - 1);
    }

    public PersistentHashMap remove(Object object0, Object object1) {
        TrieNode trieNode0 = this.node.remove((object0 == null ? 0 : object0.hashCode()), object0, object1, 0);
        if(this.node == trieNode0) {
            return this;
        }
        return trieNode0 == null ? PersistentHashMap.Companion.emptyOf$runtime_release() : new PersistentHashMap(trieNode0, this.size() - 1);
    }

    public final ImmutableCollection values() {
        return this.getValues();
    }
}

