package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\'\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001F\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00020\u0004:\u0001GB\u0005\u00A2\u0006\u0002\u0010\u0005J1\u0010!\u001A\u00020\"2\u001E\u0010#\u001A\u001A\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%\u0012\u0004\u0012\u00020\"0$H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0002\b&J1\u0010\'\u001A\u00020\"2\u001E\u0010#\u001A\u001A\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%\u0012\u0004\u0012\u00020\"0$H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0002\b(J\b\u0010)\u001A\u00020*H\u0016J\u0015\u0010+\u001A\u00020\"2\u0006\u0010,\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010-J\u0015\u0010.\u001A\u00020\"2\u0006\u0010/\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u0010-J\u0018\u00100\u001A\u0004\u0018\u00018\u00012\u0006\u0010,\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0002\u00101J\b\u00102\u001A\u00020\"H\u0016J4\u00103\u001A\u0002H4\"\u0004\b\u0002\u001042\u001E\u00105\u001A\u001A\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u0002H40$H\u0082\b\u00A2\u0006\u0002\u00106J\u0010\u00107\u001A\u00020*2\u0006\u0010/\u001A\u00020\fH\u0016J\u001F\u00108\u001A\u0004\u0018\u00018\u00012\u0006\u0010,\u001A\u00028\u00002\u0006\u0010/\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u00109J\u001E\u0010:\u001A\u00020*2\u0014\u0010;\u001A\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<H\u0016J\u0017\u0010=\u001A\u0004\u0018\u00018\u00012\u0006\u0010,\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u00101J1\u0010>\u001A\u00020\"2\u001E\u0010#\u001A\u001A\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00020\"0$H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0002\b?J\u0017\u0010@\u001A\u00020\"2\u0006\u0010/\u001A\u00028\u0001H\u0000\u00A2\u0006\u0004\bA\u0010-J5\u0010B\u001A\u00020*2*\u00105\u001A&\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010C\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010C0$H\u0082\bJ9\u0010D\u001A\u0002H4\"\u0004\b\u0002\u001042#\u00105\u001A\u001F\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\u0012\u0004\u0012\u0002H40$\u00A2\u0006\u0002\bEH\u0082\b\u00A2\u0006\u0002\u00106J9\u0010F\u001A\u0002H4\"\u0004\b\u0002\u001042#\u00105\u001A\u001F\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\u0012\u0004\u0012\u0002H40$\u00A2\u0006\u0002\bEH\u0082\b\u00A2\u0006\u0002\u00106R&\u0010\u0006\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u001E\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\f@RX\u0096\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001A\u00020\u00138@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178@X\u0080\u0004\u00A2\u0006\f\u0012\u0004\b\u0018\u0010\u0005\u001A\u0004\b\u0019\u0010\u001AR\u0014\u0010\u001B\u001A\u00020\u00138VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001C\u0010\u0015R\u001A\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00010\u001EX\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001F\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006H"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "K", "V", "", "Landroidx/compose/runtime/snapshots/StateObject;", "()V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "<set-?>", "Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "keys", "getKeys", "modification", "", "getModification$runtime_release", "()I", "readable", "Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "getReadable$runtime_release$annotations", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "size", "getSize", "values", "", "getValues", "()Ljava/util/Collection;", "all", "", "predicate", "Lkotlin/Function1;", "", "all$runtime_release", "any", "any$runtime_release", "clear", "", "containsKey", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "mutate", "R", "block", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "prependStateRecord", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "", "remove", "removeIf", "removeIf$runtime_release", "removeValue", "removeValue$runtime_release", "update", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "withCurrent", "Lkotlin/ExtensionFunctionType;", "writable", "StateMapStateRecord", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SnapshotStateMap implements StateObject, Map, KMutableMap {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001B\b\u0000\u0012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0003H\u0016J\b\u0010\u0013\u001A\u00020\u0003H\u0016R&\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u001A\u0010\n\u001A\u00020\u000BX\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000F¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "K", "V", "Landroidx/compose/runtime/snapshots/StateRecord;", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "getMap$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "setMap$runtime_release", "modification", "", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "assign", "", "value", "create", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class StateMapStateRecord extends StateRecord {
        private PersistentMap map;
        private int modification;

        public StateMapStateRecord(PersistentMap persistentMap0) {
            Intrinsics.checkNotNullParameter(persistentMap0, "map");
            super();
            this.map = persistentMap0;
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord0) {
            Intrinsics.checkNotNullParameter(stateRecord0, "value");
            this.map = ((StateMapStateRecord)stateRecord0).map;
            this.modification = ((StateMapStateRecord)stateRecord0).modification;
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new StateMapStateRecord(this.map);
        }

        public final PersistentMap getMap$runtime_release() {
            return this.map;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final void setMap$runtime_release(PersistentMap persistentMap0) {
            Intrinsics.checkNotNullParameter(persistentMap0, "<set-?>");
            this.map = persistentMap0;
        }

        public final void setModification$runtime_release(int v) {
            this.modification = v;
        }
    }

    private final Set entries;
    private StateRecord firstStateRecord;
    private final Set keys;
    private final Collection values;

    public SnapshotStateMap() {
        this.firstStateRecord = new StateMapStateRecord(ExtensionsKt.persistentHashMapOf());
        this.entries = new SnapshotMapEntrySet(this);
        this.keys = new SnapshotMapKeySet(this);
        this.values = new SnapshotMapValueSet(this);
    }

    public final boolean all$runtime_release(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(Object object0: ((ImmutableSet)this.getReadable$runtime_release().getMap$runtime_release().entrySet())) {
            if(!((Boolean)function10.invoke(((Map.Entry)object0))).booleanValue()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public final boolean any$runtime_release(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        for(Object object0: ((ImmutableSet)this.getReadable$runtime_release().getMap$runtime_release().entrySet())) {
            if(((Boolean)function10.invoke(((Map.Entry)object0))).booleanValue()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        Snapshot snapshot0;
        StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        PersistentMap persistentMap0 = ExtensionsKt.persistentHashMapOf();
        if(persistentMap0 != snapshotStateMap$StateMapStateRecord0.getMap$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.writableRecord(((StateMapStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateMap$StateMapStateRecord1.setMap$runtime_release(persistentMap0);
                snapshotStateMap$StateMapStateRecord1.setModification$runtime_release(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
        }
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.getReadable$runtime_release().getMap$runtime_release().containsKey(object0);
    }

    @Override
    public boolean containsValue(Object object0) {
        return this.getReadable$runtime_release().getMap$runtime_release().containsValue(object0);
    }

    @Override
    public final Set entrySet() {
        return this.getEntries();
    }

    @Override
    public Object get(Object object0) {
        return this.getReadable$runtime_release().getMap$runtime_release().get(object0);
    }

    public Set getEntries() {
        return this.entries;
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public Set getKeys() {
        return this.keys;
    }

    public final int getModification$runtime_release() {
        return this.getReadable$runtime_release().getModification$runtime_release();
    }

    public final StateMapStateRecord getReadable$runtime_release() {
        return (StateMapStateRecord)SnapshotKt.readable(((StateMapStateRecord)this.getFirstStateRecord()), this);
    }

    public static void getReadable$runtime_release$annotations() {
    }

    public int getSize() {
        return this.getReadable$runtime_release().getMap$runtime_release().size();
    }

    public Collection getValues() {
        return this.values;
    }

    @Override
    public boolean isEmpty() {
        return this.getReadable$runtime_release().getMap$runtime_release().isEmpty();
    }

    @Override
    public final Set keySet() {
        return this.getKeys();
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord0, StateRecord stateRecord1, StateRecord stateRecord2) {
        return DefaultImpls.mergeRecords(this, stateRecord0, stateRecord1, stateRecord2);
    }

    private final Object mutate(Function1 function10) {
        Snapshot snapshot0;
        StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        Builder persistentMap$Builder0 = snapshotStateMap$StateMapStateRecord0.getMap$runtime_release().builder();
        Object object0 = function10.invoke(persistentMap$Builder0);
        PersistentMap persistentMap0 = persistentMap$Builder0.build();
        if(persistentMap0 != snapshotStateMap$StateMapStateRecord0.getMap$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.writableRecord(((StateMapStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateMap$StateMapStateRecord1.setMap$runtime_release(persistentMap0);
                snapshotStateMap$StateMapStateRecord1.setModification$runtime_release(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            return object0;
        }
        return object0;
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord0) {
        Intrinsics.checkNotNullParameter(stateRecord0, "value");
        this.firstStateRecord = (StateMapStateRecord)stateRecord0;
    }

    @Override
    public Object put(Object object0, Object object1) {
        Snapshot snapshot0;
        StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        Builder persistentMap$Builder0 = snapshotStateMap$StateMapStateRecord0.getMap$runtime_release().builder();
        Object object2 = persistentMap$Builder0.put(object0, object1);
        PersistentMap persistentMap0 = persistentMap$Builder0.build();
        if(persistentMap0 != snapshotStateMap$StateMapStateRecord0.getMap$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.writableRecord(((StateMapStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateMap$StateMapStateRecord1.setMap$runtime_release(persistentMap0);
                snapshotStateMap$StateMapStateRecord1.setModification$runtime_release(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            return object2;
        }
        return object2;
    }

    @Override
    public void putAll(Map map0) {
        Snapshot snapshot0;
        Intrinsics.checkNotNullParameter(map0, "from");
        StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        Builder persistentMap$Builder0 = snapshotStateMap$StateMapStateRecord0.getMap$runtime_release().builder();
        persistentMap$Builder0.putAll(map0);
        PersistentMap persistentMap0 = persistentMap$Builder0.build();
        if(persistentMap0 != snapshotStateMap$StateMapStateRecord0.getMap$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.writableRecord(((StateMapStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateMap$StateMapStateRecord1.setMap$runtime_release(persistentMap0);
                snapshotStateMap$StateMapStateRecord1.setModification$runtime_release(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
        }
    }

    @Override
    public Object remove(Object object0) {
        Snapshot snapshot0;
        StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        Builder persistentMap$Builder0 = snapshotStateMap$StateMapStateRecord0.getMap$runtime_release().builder();
        Object object1 = persistentMap$Builder0.remove(object0);
        PersistentMap persistentMap0 = persistentMap$Builder0.build();
        if(persistentMap0 != snapshotStateMap$StateMapStateRecord0.getMap$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.writableRecord(((StateMapStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateMap$StateMapStateRecord1.setMap$runtime_release(persistentMap0);
                snapshotStateMap$StateMapStateRecord1.setModification$runtime_release(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            return object1;
        }
        return object1;
    }

    public final boolean removeIf$runtime_release(Function1 function10) {
        Snapshot snapshot0;
        Intrinsics.checkNotNullParameter(function10, "predicate");
        StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        Builder persistentMap$Builder0 = snapshotStateMap$StateMapStateRecord0.getMap$runtime_release().builder();
        boolean z = false;
        for(Object object0: this.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((Boolean)function10.invoke(map$Entry0)).booleanValue()) {
                persistentMap$Builder0.remove(map$Entry0.getKey());
                z = true;
            }
        }
        PersistentMap persistentMap0 = persistentMap$Builder0.build();
        if(persistentMap0 != snapshotStateMap$StateMapStateRecord0.getMap$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.writableRecord(((StateMapStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateMap$StateMapStateRecord1.setMap$runtime_release(persistentMap0);
                snapshotStateMap$StateMapStateRecord1.setModification$runtime_release(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            return z;
        }
        return z;
    }

    public final boolean removeValue$runtime_release(Object object0) {
        Object object1 = null;
        for(Object object2: this.entrySet()) {
            if(Intrinsics.areEqual(((Map.Entry)object2).getValue(), object0)) {
                object1 = object2;
                break;
            }
        }
        if(((Map.Entry)object1) == null) {
            return false;
        }
        this.remove(((Map.Entry)object1).getKey());
        return true;
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    private final void update(Function1 function10) {
        Snapshot snapshot0;
        StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        PersistentMap persistentMap0 = (PersistentMap)function10.invoke(snapshotStateMap$StateMapStateRecord0.getMap$runtime_release());
        if(persistentMap0 != snapshotStateMap$StateMapStateRecord0.getMap$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.writableRecord(((StateMapStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateMap$StateMapStateRecord1.setMap$runtime_release(persistentMap0);
                snapshotStateMap$StateMapStateRecord1.setModification$runtime_release(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
        }
    }

    @Override
    public final Collection values() {
        return this.getValues();
    }

    private final Object withCurrent(Function1 function10) {
        return function10.invoke(SnapshotKt.current(((StateMapStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent()));
    }

    private final Object writable(Function1 function10) {
        Object object1;
        Snapshot snapshot0;
        synchronized(SnapshotKt.getLock()) {
            snapshot0 = Snapshot.Companion.getCurrent();
            object1 = function10.invoke(SnapshotKt.writableRecord(((StateMapStateRecord)this.getFirstStateRecord()), this, snapshot0));
        }
        SnapshotKt.notifyWrite(snapshot0, this);
        return object1;
    }
}

