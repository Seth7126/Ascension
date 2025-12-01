package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00028\u0001H\u0016¢\u0006\u0002\u0010\nJ\u0016\u0010\u000B\u001A\u00020\b2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00010\rH\u0016J\u0016\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\t\u001A\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001A\u00020\u000F2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00010\rH\u0016J\u0015\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0096\u0002J\u0015\u0010\u0014\u001A\u00020\u000F2\u0006\u0010\t\u001A\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0015\u001A\u00020\u000F2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00010\rH\u0016J\u0016\u0010\u0016\u001A\u00020\u000F2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapValueSet;", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "add", "", "element", "(Ljava/lang/Object;)Ljava/lang/Void;", "addAll", "elements", "", "contains", "", "(Ljava/lang/Object;)Z", "containsAll", "iterator", "Landroidx/compose/runtime/snapshots/StateMapMutableValuesIterator;", "remove", "removeAll", "retainAll", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class SnapshotMapValueSet extends SnapshotMapSet {
    public SnapshotMapValueSet(SnapshotStateMap snapshotStateMap0) {
        Intrinsics.checkNotNullParameter(snapshotStateMap0, "map");
        super(snapshotStateMap0);
    }

    public Void add(Object object0) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override
    public boolean add(Object object0) {
        return ((Boolean)this.add(object0)).booleanValue();
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
    public boolean contains(Object object0) {
        return this.getMap().containsValue(object0);
    }

    @Override
    public boolean containsAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        if(!collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(!this.getMap().containsValue(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    public StateMapMutableValuesIterator iterator() {
        return new StateMapMutableValuesIterator(this.getMap(), ((ImmutableSet)this.getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }

    @Override
    public Iterator iterator() {
        return this.iterator();
    }

    @Override
    public boolean remove(Object object0) {
        return this.getMap().removeValue$runtime_release(object0);
    }

    @Override
    public boolean removeAll(Collection collection0) {
        Snapshot snapshot0;
        Intrinsics.checkNotNullParameter(collection0, "elements");
        Set set0 = CollectionsKt.toSet(collection0);
        SnapshotStateMap snapshotStateMap0 = this.getMap();
        StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)snapshotStateMap0.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        Builder persistentMap$Builder0 = snapshotStateMap$StateMapStateRecord0.getMap$runtime_release().builder();
        boolean z = false;
        for(Object object0: snapshotStateMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(set0.contains(map$Entry0.getValue())) {
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

    @Override
    public boolean retainAll(Collection collection0) {
        Snapshot snapshot0;
        Intrinsics.checkNotNullParameter(collection0, "elements");
        Set set0 = CollectionsKt.toSet(collection0);
        SnapshotStateMap snapshotStateMap0 = this.getMap();
        StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)snapshotStateMap0.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        Builder persistentMap$Builder0 = snapshotStateMap$StateMapStateRecord0.getMap$runtime_release().builder();
        boolean z = false;
        for(Object object0: snapshotStateMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(!set0.contains(map$Entry0.getValue()) != 0) {
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

