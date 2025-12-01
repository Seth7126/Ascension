package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001CB\u0005\u00A2\u0006\u0002\u0010\u0004J\u0015\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0018J\u001D\u0010\u0015\u001A\u00020\u00192\u0006\u0010\u001A\u001A\u00020\u000B2\u0006\u0010\u0017\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u001BJ\u001E\u0010\u001C\u001A\u00020\u00162\u0006\u0010\u001A\u001A\u00020\u000B2\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00000\u001EH\u0016J\u0016\u0010\u001C\u001A\u00020\u00162\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00000\u001EH\u0016J\b\u0010\u001F\u001A\u00020\u0019H\u0016J)\u0010 \u001A\u00020\u00162\u001E\u0010!\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#0\"H\u0082\bJ\u0016\u0010$\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0002\u0010\u0018J\u0016\u0010%\u001A\u00020\u00162\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00000\u001EH\u0016J\u0016\u0010&\u001A\u00028\u00002\u0006\u0010\u001A\u001A\u00020\u000BH\u0096\u0002\u00A2\u0006\u0002\u0010\'J\u0015\u0010(\u001A\u00020\u000B2\u0006\u0010\u0017\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010)J\b\u0010*\u001A\u00020\u0016H\u0016J\u000F\u0010+\u001A\b\u0012\u0004\u0012\u00028\u00000,H\u0096\u0002J\u0015\u0010-\u001A\u00020\u000B2\u0006\u0010\u0017\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010)J\u000E\u0010.\u001A\b\u0012\u0004\u0012\u00028\u00000/H\u0016J\u0016\u0010.\u001A\b\u0012\u0004\u0012\u00028\u00000/2\u0006\u0010\u001A\u001A\u00020\u000BH\u0016J.\u00100\u001A\u0002H1\"\u0004\b\u0001\u001012\u0018\u0010!\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u0002H10\"H\u0082\b\u00A2\u0006\u0002\u00102J\u0010\u00103\u001A\u00020\u00192\u0006\u00104\u001A\u00020\u0006H\u0016J\u0015\u00105\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0018J\u0016\u00106\u001A\u00020\u00162\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00000\u001EH\u0016J\u0015\u00107\u001A\u00028\u00002\u0006\u0010\u001A\u001A\u00020\u000BH\u0016\u00A2\u0006\u0002\u0010\'J\u0016\u00108\u001A\u00020\u00192\u0006\u00109\u001A\u00020\u000B2\u0006\u0010:\u001A\u00020\u000BJ\u0016\u0010;\u001A\u00020\u00162\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00000\u001EH\u0016J\u001E\u0010<\u001A\u00028\u00002\u0006\u0010\u001A\u001A\u00020\u000B2\u0006\u0010\u0017\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0002\u0010=J\u001E\u0010>\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00109\u001A\u00020\u000B2\u0006\u0010:\u001A\u00020\u000BH\u0016J)\u0010?\u001A\u00020\u00192\u001E\u0010!\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#0\"H\u0082\bJ3\u0010@\u001A\u0002H1\"\u0004\b\u0001\u001012\u001D\u0010!\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000F\u0012\u0004\u0012\u0002H10\"\u00A2\u0006\u0002\bAH\u0082\b\u00A2\u0006\u0002\u00102J3\u0010B\u001A\u0002H1\"\u0004\b\u0001\u001012\u001D\u0010!\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000F\u0012\u0004\u0012\u0002H10\"\u00A2\u0006\u0002\bAH\u0082\b\u00A2\u0006\u0002\u00102R\u001E\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0006@RX\u0096\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0014\u0010\n\u001A\u00020\u000B8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b\f\u0010\rR \u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F8@X\u0080\u0004\u00A2\u0006\f\u0012\u0004\b\u0010\u0010\u0004\u001A\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001A\u00020\u000B8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0014\u0010\r\u00A8\u0006D"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "", "Landroidx/compose/runtime/snapshots/StateObject;", "()V", "<set-?>", "Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "modification", "", "getModification$runtime_release", "()I", "readable", "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "getReadable$runtime_release$annotations", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "size", "getSize", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "conditionalUpdate", "block", "Lkotlin/Function1;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "mutate", "R", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "prependStateRecord", "value", "remove", "removeAll", "removeAt", "removeRange", "fromIndex", "toIndex", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "update", "withCurrent", "Lkotlin/ExtensionFunctionType;", "writable", "StateListStateRecord", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SnapshotStateList implements StateObject, List, KMutableList {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0015\b\u0000\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u0002H\u0016J\b\u0010\u0012\u001A\u00020\u0002H\u0016R \u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001A\u0010\t\u001A\u00020\nX\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000E¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "list", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "getList$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "setList$runtime_release", "modification", "", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "assign", "", "value", "create", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class StateListStateRecord extends StateRecord {
        private PersistentList list;
        private int modification;

        public StateListStateRecord(PersistentList persistentList0) {
            Intrinsics.checkNotNullParameter(persistentList0, "list");
            super();
            this.list = persistentList0;
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord0) {
            Intrinsics.checkNotNullParameter(stateRecord0, "value");
            this.list = ((StateListStateRecord)stateRecord0).list;
            this.modification = ((StateListStateRecord)stateRecord0).modification;
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new StateListStateRecord(this.list);
        }

        public final PersistentList getList$runtime_release() {
            return this.list;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final void setList$runtime_release(PersistentList persistentList0) {
            Intrinsics.checkNotNullParameter(persistentList0, "<set-?>");
            this.list = persistentList0;
        }

        public final void setModification$runtime_release(int v) {
            this.modification = v;
        }
    }

    private StateRecord firstStateRecord;

    public SnapshotStateList() {
        this.firstStateRecord = new StateListStateRecord(ExtensionsKt.persistentListOf());
    }

    @Override
    public void add(int v, Object object0) {
        Snapshot snapshot0;
        StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        PersistentList persistentList0 = snapshotStateList$StateListStateRecord0.getList$runtime_release().add(v, object0);
        if(persistentList0 != snapshotStateList$StateListStateRecord0.getList$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList0);
                snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
        }
    }

    @Override
    public boolean add(Object object0) {
        Snapshot snapshot0;
        StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        PersistentList persistentList0 = snapshotStateList$StateListStateRecord0.getList$runtime_release().add(object0);
        if(persistentList0 != snapshotStateList$StateListStateRecord0.getList$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList0);
                snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        Snapshot snapshot0;
        Intrinsics.checkNotNullParameter(collection0, "elements");
        StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        Builder persistentList$Builder0 = snapshotStateList$StateListStateRecord0.getList$runtime_release().builder();
        boolean z = persistentList$Builder0.addAll(v, collection0);
        PersistentList persistentList0 = persistentList$Builder0.build();
        if(persistentList0 != snapshotStateList$StateListStateRecord0.getList$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList0);
                snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            return z;
        }
        return z;
    }

    @Override
    public boolean addAll(Collection collection0) {
        Snapshot snapshot0;
        Intrinsics.checkNotNullParameter(collection0, "elements");
        StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        PersistentList persistentList0 = snapshotStateList$StateListStateRecord0.getList$runtime_release().addAll(collection0);
        if(persistentList0 != snapshotStateList$StateListStateRecord0.getList$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList0);
                snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        Snapshot snapshot0;
        synchronized(SnapshotKt.getLock()) {
            snapshot0 = Snapshot.Companion.getCurrent();
            ((StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)this.getFirstStateRecord()), this, snapshot0)).setList$runtime_release(ExtensionsKt.persistentListOf());
        }
        SnapshotKt.notifyWrite(snapshot0, this);
    }

    private final boolean conditionalUpdate(Function1 function10) {
        Snapshot snapshot0;
        StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        PersistentList persistentList0 = (PersistentList)function10.invoke(snapshotStateList$StateListStateRecord0.getList$runtime_release());
        if(persistentList0 != snapshotStateList$StateListStateRecord0.getList$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList0);
                snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object object0) {
        return this.getReadable$runtime_release().getList$runtime_release().contains(object0);
    }

    @Override
    public boolean containsAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return this.getReadable$runtime_release().getList$runtime_release().containsAll(collection0);
    }

    @Override
    public Object get(int v) {
        return this.getReadable$runtime_release().getList$runtime_release().get(v);
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public final int getModification$runtime_release() {
        return ((StateListStateRecord)SnapshotKt.current(((StateListStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent())).getModification$runtime_release();
    }

    public final StateListStateRecord getReadable$runtime_release() {
        return (StateListStateRecord)SnapshotKt.readable(((StateListStateRecord)this.getFirstStateRecord()), this);
    }

    public static void getReadable$runtime_release$annotations() {
    }

    public int getSize() {
        return this.getReadable$runtime_release().getList$runtime_release().size();
    }

    @Override
    public int indexOf(Object object0) {
        return this.getReadable$runtime_release().getList$runtime_release().indexOf(object0);
    }

    @Override
    public boolean isEmpty() {
        return this.getReadable$runtime_release().getList$runtime_release().isEmpty();
    }

    @Override
    public Iterator iterator() {
        return this.listIterator();
    }

    @Override
    public int lastIndexOf(Object object0) {
        return this.getReadable$runtime_release().getList$runtime_release().lastIndexOf(object0);
    }

    @Override
    public ListIterator listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override
    public ListIterator listIterator(int v) {
        return new StateListIterator(this, v);
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord0, StateRecord stateRecord1, StateRecord stateRecord2) {
        return DefaultImpls.mergeRecords(this, stateRecord0, stateRecord1, stateRecord2);
    }

    private final Object mutate(Function1 function10) {
        Snapshot snapshot0;
        StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        Builder persistentList$Builder0 = snapshotStateList$StateListStateRecord0.getList$runtime_release().builder();
        Object object0 = function10.invoke(persistentList$Builder0);
        PersistentList persistentList0 = persistentList$Builder0.build();
        if(persistentList0 != snapshotStateList$StateListStateRecord0.getList$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList0);
                snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            return object0;
        }
        return object0;
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord0) {
        Intrinsics.checkNotNullParameter(stateRecord0, "value");
        stateRecord0.setNext$runtime_release(this.getFirstStateRecord());
        this.firstStateRecord = (StateListStateRecord)stateRecord0;
    }

    @Override
    public final Object remove(int v) {
        return this.removeAt(v);
    }

    @Override
    public boolean remove(Object object0) {
        Snapshot snapshot0;
        StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        PersistentList persistentList0 = snapshotStateList$StateListStateRecord0.getList$runtime_release().remove(object0);
        if(persistentList0 != snapshotStateList$StateListStateRecord0.getList$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList0);
                snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection collection0) {
        Snapshot snapshot0;
        Intrinsics.checkNotNullParameter(collection0, "elements");
        StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        PersistentList persistentList0 = snapshotStateList$StateListStateRecord0.getList$runtime_release().removeAll(collection0);
        if(persistentList0 != snapshotStateList$StateListStateRecord0.getList$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList0);
                snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            return true;
        }
        return false;
    }

    public Object removeAt(int v) {
        Snapshot snapshot0;
        Object object0 = this.get(v);
        StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        PersistentList persistentList0 = snapshotStateList$StateListStateRecord0.getList$runtime_release().removeAt(v);
        if(persistentList0 != snapshotStateList$StateListStateRecord0.getList$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList0);
                snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            return object0;
        }
        return object0;
    }

    public final void removeRange(int v, int v1) {
        Snapshot snapshot0;
        StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        Builder persistentList$Builder0 = snapshotStateList$StateListStateRecord0.getList$runtime_release().builder();
        persistentList$Builder0.subList(v, v1).clear();
        PersistentList persistentList0 = persistentList$Builder0.build();
        if(persistentList0 != snapshotStateList$StateListStateRecord0.getList$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList0);
                snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
        }
    }

    @Override
    public boolean retainAll(Collection collection0) {
        Snapshot snapshot0;
        Intrinsics.checkNotNullParameter(collection0, "elements");
        StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        Builder persistentList$Builder0 = snapshotStateList$StateListStateRecord0.getList$runtime_release().builder();
        boolean z = persistentList$Builder0.retainAll(collection0);
        PersistentList persistentList0 = persistentList$Builder0.build();
        if(persistentList0 != snapshotStateList$StateListStateRecord0.getList$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList0);
                snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            return z;
        }
        return z;
    }

    @Override
    public Object set(int v, Object object0) {
        Snapshot snapshot0;
        Object object1 = this.get(v);
        StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        PersistentList persistentList0 = snapshotStateList$StateListStateRecord0.getList$runtime_release().set(v, object0);
        if(persistentList0 != snapshotStateList$StateListStateRecord0.getList$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList0);
                snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            return object1;
        }
        return object1;
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    public List subList(int v, int v1) {
        if(v < 0 || v > v1 || v1 > this.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return new SubList(this, v, v1);
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "array");
        return CollectionToArray.toArray(this, arr_object);
    }

    private final void update(Function1 function10) {
        Snapshot snapshot0;
        StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent());
        PersistentList persistentList0 = (PersistentList)function10.invoke(snapshotStateList$StateListStateRecord0.getList$runtime_release());
        if(persistentList0 != snapshotStateList$StateListStateRecord0.getList$runtime_release()) {
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)this.getFirstStateRecord()), this, snapshot0);
                snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList0);
                snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
        }
    }

    private final Object withCurrent(Function1 function10) {
        return function10.invoke(SnapshotKt.current(((StateListStateRecord)this.getFirstStateRecord()), Snapshot.Companion.getCurrent()));
    }

    private final Object writable(Function1 function10) {
        Object object1;
        Snapshot snapshot0;
        synchronized(SnapshotKt.getLock()) {
            snapshot0 = Snapshot.Companion.getCurrent();
            object1 = function10.invoke(SnapshotKt.writableRecord(((StateListStateRecord)this.getFirstStateRecord()), this, snapshot0));
        }
        SnapshotKt.notifyWrite(snapshot0, this);
        return object1;
    }
}

