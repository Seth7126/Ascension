package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010\'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B3\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\b\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0002\u0010\u000BJ\u0015\u0010\f\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator;", "K", "V", "Landroidx/compose/runtime/snapshots/StateMapMutableIterator;", "", "", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "iterator", "", "", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;Ljava/util/Iterator;)V", "next", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class StateMapMutableEntriesIterator extends StateMapMutableIterator implements Iterator, KMutableIterator {
    public StateMapMutableEntriesIterator(SnapshotStateMap snapshotStateMap0, Iterator iterator0) {
        Intrinsics.checkNotNullParameter(snapshotStateMap0, "map");
        Intrinsics.checkNotNullParameter(iterator0, "iterator");
        super(snapshotStateMap0, iterator0);
    }

    @Override
    public Object next() {
        return this.next();
    }

    public Map.Entry next() {
        this.advance();
        if(this.getCurrent() == null) {
            throw new IllegalStateException();
        }
        return new Object() {
            private final Object key;
            private Object value;

            {
                Map.Entry map$Entry0 = stateMapMutableEntriesIterator0.getCurrent();
                Intrinsics.checkNotNull(map$Entry0);
                this.key = map$Entry0.getKey();
                Map.Entry map$Entry1 = stateMapMutableEntriesIterator0.getCurrent();
                Intrinsics.checkNotNull(map$Entry1);
                this.value = map$Entry1.getValue();
            }

            @Override
            public Object getKey() {
                return this.key;
            }

            @Override
            public Object getValue() {
                return this.value;
            }

            @Override
            public Object setValue(Object object0) {
                StateMapMutableEntriesIterator stateMapMutableEntriesIterator0 = StateMapMutableEntriesIterator.this;
                if(stateMapMutableEntriesIterator0.getMap().getModification$runtime_release() != stateMapMutableEntriesIterator0.modification) {
                    throw new ConcurrentModificationException();
                }
                stateMapMutableEntriesIterator0.getMap().put(this.getKey(), object0);
                this.setValue(object0);
                return this.getValue();
            }

            public void setValue(Object object0) {
                this.value = object0;
            }
        };
    }
}

