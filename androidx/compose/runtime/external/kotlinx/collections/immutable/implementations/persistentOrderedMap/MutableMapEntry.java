package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap.Entry;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\'\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B5\u0012\u0018\u0010\u0005\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006\u0012\u0006\u0010\b\u001A\u00028\u0000\u0012\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\nJ\u0015\u0010\u000E\u001A\u00028\u00012\u0006\u0010\u000F\u001A\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010R\u0014\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u000E¢\u0006\u0002\n\u0000R \u0010\u0005\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000B\u001A\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/MutableMapEntry;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MapEntry;", "", "mutableMap", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "key", "links", "(Ljava/util/Map;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;)V", "value", "getValue", "()Ljava/lang/Object;", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class MutableMapEntry extends MapEntry implements Map.Entry, Entry {
    private LinkedValue links;
    private final Map mutableMap;

    public MutableMapEntry(Map map0, Object object0, LinkedValue linkedValue0) {
        Intrinsics.checkNotNullParameter(map0, "mutableMap");
        Intrinsics.checkNotNullParameter(linkedValue0, "links");
        super(object0, linkedValue0.getValue());
        this.mutableMap = map0;
        this.links = linkedValue0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry
    public Object getValue() {
        return this.links.getValue();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry
    public Object setValue(Object object0) {
        Object object1 = this.links.getValue();
        this.links = this.links.withValue(object0);
        Object object2 = this.getKey();
        this.mutableMap.put(object2, this.links);
        return object1;
    }
}

