package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u0000 3*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004:\u00013B3\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u0018\u0010\b\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n0\t\u00A2\u0006\u0002\u0010\u000BJ\u0014\u0010 \u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!H\u0016J\u0014\u0010\"\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u0015\u0010#\u001A\u00020$2\u0006\u0010%\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010&J\u001A\u0010\'\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000E0\rH\u0002J\u0018\u0010(\u001A\u0004\u0018\u00018\u00012\u0006\u0010%\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0002\u0010)J\u001A\u0010\u000F\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000E0*H\u0001J)\u0010+\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010%\u001A\u00028\u00002\u0006\u0010,\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u0010-J*\u0010.\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\u0010/\u001A\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0016J!\u00101\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010%\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u00102J)\u00101\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010%\u001A\u00028\u00002\u0006\u0010,\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u0010-R&\u0010\f\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000E0\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0016\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R&\u0010\b\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n0\tX\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u001A\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0007\u001A\u0004\u0018\u00010\u0006X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0018\u001A\u00020\u00198VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001A\u0010\u001BR\u001A\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00010\u001D8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001E\u0010\u001F\u00A8\u00064"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "K", "V", "Lkotlin/collections/AbstractMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "firstKey", "", "lastKey", "hashMap", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "entries", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "getEntries", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "getFirstKey$runtime_release", "()Ljava/lang/Object;", "getHashMap$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "keys", "getKeys", "getLastKey$runtime_release", "size", "", "getSize", "()I", "values", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "clear", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "createEntries", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "putAll", "m", "", "remove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "Companion", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PersistentOrderedMap extends AbstractMap implements PersistentMap {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u0004\"\u0004\b\u0002\u0010\u0007\"\u0004\b\u0003\u0010\bH\u0000¢\u0006\u0002\b\tR\u001A\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "", "emptyOf", "K", "V", "emptyOf$runtime_release", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final PersistentOrderedMap emptyOf$runtime_release() {
            return PersistentOrderedMap.EMPTY;
        }
    }

    public static final Companion Companion;
    private static final PersistentOrderedMap EMPTY;
    private final Object firstKey;
    private final PersistentHashMap hashMap;
    private final Object lastKey;

    static {
        PersistentOrderedMap.Companion = new Companion(null);
        PersistentHashMap persistentHashMap0 = PersistentHashMap.Companion.emptyOf$runtime_release();
        PersistentOrderedMap.EMPTY = new PersistentOrderedMap(EndOfChain.INSTANCE, EndOfChain.INSTANCE, persistentHashMap0);
    }

    public PersistentOrderedMap(Object object0, Object object1, PersistentHashMap persistentHashMap0) {
        Intrinsics.checkNotNullParameter(persistentHashMap0, "hashMap");
        super();
        this.firstKey = object0;
        this.lastKey = object1;
        this.hashMap = persistentHashMap0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public Builder builder() {
        return new PersistentOrderedMapBuilder(this);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap clear() {
        return PersistentOrderedMap.Companion.emptyOf$runtime_release();
    }

    @Override  // kotlin.collections.AbstractMap
    public boolean containsKey(Object object0) {
        return this.hashMap.containsKey(object0);
    }

    private final ImmutableSet createEntries() {
        return new PersistentOrderedMapEntries(this);
    }

    public final ImmutableSet entrySet() {
        return this.getEntries();
    }

    @Override  // kotlin.collections.AbstractMap
    public Object get(Object object0) {
        LinkedValue linkedValue0 = (LinkedValue)this.hashMap.get(object0);
        return linkedValue0 == null ? null : linkedValue0.getValue();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet getEntries() {
        return this.createEntries();
    }

    @Override  // kotlin.collections.AbstractMap
    public final Set getEntries() {
        return this.createEntries();
    }

    public final Object getFirstKey$runtime_release() {
        return this.firstKey;
    }

    public final PersistentHashMap getHashMap$runtime_release() {
        return this.hashMap;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet getKeys() {
        return new PersistentOrderedMapKeys(this);
    }

    @Override  // kotlin.collections.AbstractMap
    public Set getKeys() {
        return this.getKeys();
    }

    public final Object getLastKey$runtime_release() {
        return this.lastKey;
    }

    @Override  // kotlin.collections.AbstractMap
    public int getSize() {
        return this.hashMap.size();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableCollection getValues() {
        return new PersistentOrderedMapValues(this);
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

    public PersistentOrderedMap put(Object object0, Object object1) {
        if(this.isEmpty()) {
            LinkedValue linkedValue0 = new LinkedValue(object1);
            return new PersistentOrderedMap(object0, object0, this.hashMap.put(object0, linkedValue0));
        }
        LinkedValue linkedValue1 = (LinkedValue)this.hashMap.get(object0);
        if(linkedValue1 != null) {
            if(linkedValue1.getValue() == object1) {
                return this;
            }
            LinkedValue linkedValue2 = linkedValue1.withValue(object1);
            PersistentHashMap persistentHashMap0 = this.hashMap.put(object0, linkedValue2);
            return new PersistentOrderedMap(this.firstKey, this.lastKey, persistentHashMap0);
        }
        Object object2 = this.hashMap.get(this.lastKey);
        Intrinsics.checkNotNull(object2);
        LinkedValue linkedValue3 = ((LinkedValue)object2).withNext(object0);
        PersistentHashMap persistentHashMap1 = this.hashMap.put(this.lastKey, linkedValue3).put(object0, new LinkedValue(object1, this.lastKey));
        return new PersistentOrderedMap(this.firstKey, object0, persistentHashMap1);
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

    public PersistentOrderedMap remove(Object object0) {
        LinkedValue linkedValue0 = (LinkedValue)this.hashMap.get(object0);
        if(linkedValue0 == null) {
            return this;
        }
        PersistentHashMap persistentHashMap0 = this.hashMap.remove(object0);
        if(linkedValue0.getHasPrevious()) {
            Object object1 = persistentHashMap0.get(linkedValue0.getPrevious());
            Intrinsics.checkNotNull(object1);
            persistentHashMap0 = persistentHashMap0.put(linkedValue0.getPrevious(), ((LinkedValue)object1).withNext(linkedValue0.getNext()));
        }
        if(linkedValue0.getHasNext()) {
            Object object2 = persistentHashMap0.get(linkedValue0.getNext());
            Intrinsics.checkNotNull(object2);
            persistentHashMap0 = persistentHashMap0.put(linkedValue0.getNext(), ((LinkedValue)object2).withPrevious(linkedValue0.getPrevious()));
        }
        Object object3 = linkedValue0.getHasPrevious() ? this.firstKey : linkedValue0.getNext();
        return linkedValue0.getHasNext() ? new PersistentOrderedMap(object3, this.lastKey, persistentHashMap0) : new PersistentOrderedMap(object3, linkedValue0.getPrevious(), persistentHashMap0);
    }

    public PersistentOrderedMap remove(Object object0, Object object1) {
        LinkedValue linkedValue0 = (LinkedValue)this.hashMap.get(object0);
        if(linkedValue0 == null) {
            return this;
        }
        return Intrinsics.areEqual(linkedValue0.getValue(), object1) ? this.remove(object0) : this;
    }

    public final ImmutableCollection values() {
        return this.getValues();
    }
}

