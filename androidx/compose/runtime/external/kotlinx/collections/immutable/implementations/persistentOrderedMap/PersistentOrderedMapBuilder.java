package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\'\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001F\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u00A2\u0006\u0002\u0010\u0007J\u0014\u0010\"\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0016J\b\u0010$\u001A\u00020%H\u0016J\u0015\u0010&\u001A\u00020\'2\u0006\u0010(\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010)J\u0018\u0010*\u001A\u0004\u0018\u00018\u00012\u0006\u0010(\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0002\u0010+J\u001F\u0010,\u001A\u0004\u0018\u00018\u00012\u0006\u0010(\u001A\u00028\u00002\u0006\u0010-\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u0010.J\u0017\u0010/\u001A\u0004\u0018\u00018\u00012\u0006\u0010(\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010+J\u001B\u0010/\u001A\u00020\'2\u0006\u0010(\u001A\u00028\u00002\u0006\u0010-\u001A\u00028\u0001\u00A2\u0006\u0002\u00100R&\u0010\b\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\"\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\u000E@BX\u0080\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00140\u0013X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0016R\u001A\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\t8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0018\u0010\fR\u0010\u0010\u0019\u001A\u0004\u0018\u00010\u000EX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001A\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u001A\u001A\u00020\u001B8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001C\u0010\u001DR\u001A\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00010\u001F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b \u0010!\u00A8\u00061"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "K", "V", "Lkotlin/collections/AbstractMutableMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "<set-?>", "", "firstKey", "getFirstKey$runtime_release", "()Ljava/lang/Object;", "hashMapBuilder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "getHashMapBuilder$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "keys", "getKeys", "lastKey", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "build", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PersistentOrderedMapBuilder extends AbstractMutableMap implements Builder {
    private Object firstKey;
    private final PersistentHashMapBuilder hashMapBuilder;
    private Object lastKey;
    private PersistentOrderedMap map;

    public PersistentOrderedMapBuilder(PersistentOrderedMap persistentOrderedMap0) {
        Intrinsics.checkNotNullParameter(persistentOrderedMap0, "map");
        super();
        this.map = persistentOrderedMap0;
        this.firstKey = persistentOrderedMap0.getFirstKey$runtime_release();
        this.lastKey = this.map.getLastKey$runtime_release();
        this.hashMapBuilder = this.map.getHashMap$runtime_release().builder();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap$Builder
    public PersistentMap build() {
        PersistentOrderedMap persistentOrderedMap0;
        PersistentHashMap persistentHashMap0 = this.hashMapBuilder.build();
        if(persistentHashMap0 == this.map.getHashMap$runtime_release()) {
            boolean z = this.firstKey != this.map.getFirstKey$runtime_release();
            boolean z1 = this.lastKey == this.map.getLastKey$runtime_release();
            persistentOrderedMap0 = this.map;
        }
        else {
            persistentOrderedMap0 = new PersistentOrderedMap(this.firstKey, this.lastKey, persistentHashMap0);
        }
        this.map = persistentOrderedMap0;
        return persistentOrderedMap0;
    }

    @Override
    public void clear() {
        this.hashMapBuilder.clear();
        this.firstKey = EndOfChain.INSTANCE;
        this.lastKey = EndOfChain.INSTANCE;
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.hashMapBuilder.containsKey(object0);
    }

    @Override
    public Object get(Object object0) {
        LinkedValue linkedValue0 = (LinkedValue)this.hashMapBuilder.get(object0);
        return linkedValue0 == null ? null : linkedValue0.getValue();
    }

    @Override  // kotlin.collections.AbstractMutableMap
    public Set getEntries() {
        return new PersistentOrderedMapBuilderEntries(this);
    }

    public final Object getFirstKey$runtime_release() {
        return this.firstKey;
    }

    public final PersistentHashMapBuilder getHashMapBuilder$runtime_release() {
        return this.hashMapBuilder;
    }

    @Override  // kotlin.collections.AbstractMutableMap
    public Set getKeys() {
        return new PersistentOrderedMapBuilderKeys(this);
    }

    @Override  // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override  // kotlin.collections.AbstractMutableMap
    public Collection getValues() {
        return new PersistentOrderedMapBuilderValues(this);
    }

    @Override  // kotlin.collections.AbstractMutableMap
    public Object put(Object object0, Object object1) {
        LinkedValue linkedValue0 = (LinkedValue)this.hashMapBuilder.get(object0);
        if(linkedValue0 != null) {
            if(linkedValue0.getValue() == object1) {
                return object1;
            }
            LinkedValue linkedValue1 = linkedValue0.withValue(object1);
            this.hashMapBuilder.put(object0, linkedValue1);
            return linkedValue0.getValue();
        }
        if(this.isEmpty()) {
            this.firstKey = object0;
            this.lastKey = object0;
            LinkedValue linkedValue2 = new LinkedValue(object1);
            this.hashMapBuilder.put(object0, linkedValue2);
            return null;
        }
        Object object2 = this.lastKey;
        Object object3 = this.hashMapBuilder.get(object2);
        Intrinsics.checkNotNull(object3);
        LinkedValue linkedValue3 = ((LinkedValue)object3).withNext(object0);
        this.hashMapBuilder.put(object2, linkedValue3);
        LinkedValue linkedValue4 = new LinkedValue(object1, object2);
        this.hashMapBuilder.put(object0, linkedValue4);
        this.lastKey = object0;
        return null;
    }

    @Override
    public Object remove(Object object0) {
        LinkedValue linkedValue0 = (LinkedValue)this.hashMapBuilder.remove(object0);
        if(linkedValue0 == null) {
            return null;
        }
        if(linkedValue0.getHasPrevious()) {
            Object object1 = this.hashMapBuilder.get(linkedValue0.getPrevious());
            Intrinsics.checkNotNull(object1);
            LinkedValue linkedValue1 = ((LinkedValue)object1).withNext(linkedValue0.getNext());
            this.hashMapBuilder.put(linkedValue0.getPrevious(), linkedValue1);
        }
        else {
            this.firstKey = linkedValue0.getNext();
        }
        if(linkedValue0.getHasNext()) {
            Object object2 = this.hashMapBuilder.get(linkedValue0.getNext());
            Intrinsics.checkNotNull(object2);
            LinkedValue linkedValue2 = ((LinkedValue)object2).withPrevious(linkedValue0.getPrevious());
            this.hashMapBuilder.put(linkedValue0.getNext(), linkedValue2);
            return linkedValue0.getValue();
        }
        this.lastKey = linkedValue0.getPrevious();
        return linkedValue0.getValue();
    }

    @Override
    public final boolean remove(Object object0, Object object1) {
        LinkedValue linkedValue0 = (LinkedValue)this.hashMapBuilder.get(object0);
        if(linkedValue0 == null) {
            return false;
        }
        if(Intrinsics.areEqual(linkedValue0.getValue(), object1)) {
            this.remove(object0);
            return true;
        }
        return false;
    }
}

