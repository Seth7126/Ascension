package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u001E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B\u0019\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001C\u0010\b\u001A\u00020\t2\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u000B\u001A\u00020\t2\u0018\u0010\f\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\u001D\u0010\u000E\u001A\u00020\u000F2\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\"\u0010\u0010\u001A\u00020\u000F2\u0018\u0010\f\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\u001B\u0010\u0011\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0012H\u0096\u0002J\u001C\u0010\u0013\u001A\u00020\u000F2\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u0014\u001A\u00020\u000F2\u0018\u0010\f\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\"\u0010\u0015\u001A\u00020\u000F2\u0018\u0010\f\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapEntrySet;", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "add", "", "element", "addAll", "elements", "", "contains", "", "containsAll", "iterator", "", "remove", "removeAll", "retainAll", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class SnapshotMapEntrySet extends SnapshotMapSet {
    public SnapshotMapEntrySet(SnapshotStateMap snapshotStateMap0) {
        Intrinsics.checkNotNullParameter(snapshotStateMap0, "map");
        super(snapshotStateMap0);
    }

    public Void add(Map.Entry map$Entry0) {
        Intrinsics.checkNotNullParameter(map$Entry0, "element");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override
    public boolean add(Object object0) {
        return ((Boolean)this.add(((Map.Entry)object0))).booleanValue();
    }

    public Void addAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override
    public boolean addAll(Collection collection0) {
        return ((Boolean)this.addAll(collection0)).booleanValue();
    }

    @Override
    public final boolean contains(Object object0) {
        return TypeIntrinsics.isMutableMapEntry(object0) ? this.contains(((Map.Entry)object0)) : false;
    }

    public boolean contains(Map.Entry map$Entry0) {
        Intrinsics.checkNotNullParameter(map$Entry0, "element");
        return Intrinsics.areEqual(this.getMap().get(map$Entry0.getKey()), map$Entry0.getValue());
    }

    @Override
    public boolean containsAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        if(!collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(!this.contains(((Map.Entry)object0))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Override
    public Iterator iterator() {
        return new StateMapMutableEntriesIterator(this.getMap(), ((ImmutableSet)this.getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }

    @Override
    public final boolean remove(Object object0) {
        return TypeIntrinsics.isMutableMapEntry(object0) ? this.remove(((Map.Entry)object0)) : false;
    }

    public boolean remove(Map.Entry map$Entry0) {
        Intrinsics.checkNotNullParameter(map$Entry0, "element");
        return this.getMap().remove(map$Entry0.getKey()) != null;
    }

    @Override
    public boolean removeAll(Collection collection0) {
        boolean z;
        Intrinsics.checkNotNullParameter(collection0, "elements");
        Iterator iterator0 = collection0.iterator();
    alab1:
        while(true) {
            for(z = false; true; z = true) {
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                if(this.getMap().remove(((Map.Entry)object0).getKey()) == null && !z) {
                    break;
                }
            }
        }
        return z;
    }

    @Override
    public boolean retainAll(Collection collection0) {
        Snapshot snapshot0;
        Intrinsics.checkNotNullParameter(collection0, "elements");
        Map map0 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(collection0, 10)), 16));
        for(Object object0: collection0) {
            Pair pair0 = TuplesKt.to(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        SnapshotStateMap snapshotStateMap0 = this.getMap();
        StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)snapshotStateMap0.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        Builder persistentMap$Builder0 = snapshotStateMap$StateMapStateRecord0.getMap$runtime_release().builder();
        boolean z = false;
        for(Object object1: snapshotStateMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            if(!map0.containsKey(map$Entry0.getKey()) || !Intrinsics.areEqual(map0.get(map$Entry0.getKey()), map$Entry0.getValue())) {
                persistentMap$Builder0.remove(map$Entry0.getKey());
                z = true;
            }
        }
        PersistentMap persistentMap0 = persistentMap$Builder0.build();
        if(persistentMap0 != snapshotStateMap$StateMapStateRecord0.getMap$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.writableRecord(((StateMapStateRecord)snapshotStateMap0.getFirstStateRecord()), snapshotStateMap0, snapshot0);
                snapshotStateMap$StateMapStateRecord1.setMap$runtime_release(persistentMap0);
                snapshotStateMap$StateMapStateRecord1.setModification$runtime_release(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, snapshotStateMap0);
            return z;
        }
        return z;
    }
}

