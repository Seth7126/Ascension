package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0017\u0018\u00002\u00020\u0001BC\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0014\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\n\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u00A2\u0006\u0002\u0010\u000BJ\b\u0010(\u001A\u00020\tH\u0002J\r\u0010)\u001A\u00020\tH\u0000\u00A2\u0006\u0002\b*J\'\u0010)\u001A\u0002H+\"\u0004\b\u0000\u0010+2\f\u0010,\u001A\b\u0012\u0004\u0012\u0002H+0-H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010.J\b\u0010/\u001A\u000200H\u0016J\r\u00101\u001A\u00020\tH\u0010\u00A2\u0006\u0002\b2J\b\u00103\u001A\u00020\tH\u0016J\b\u00104\u001A\u00020\rH\u0016J3\u00105\u001A\u0002002\u0006\u00106\u001A\u00020\u00032\u0014\u00107\u001A\u0010\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u000209\u0018\u0001082\u0006\u0010:\u001A\u00020\u0005H\u0000\u00A2\u0006\u0002\b;J\u0015\u0010<\u001A\u00020\t2\u0006\u0010=\u001A\u00020\u0001H\u0010\u00A2\u0006\u0002\b>J\u0015\u0010?\u001A\u00020\t2\u0006\u0010=\u001A\u00020\u0001H\u0010\u00A2\u0006\u0002\b@J\r\u0010A\u001A\u00020\tH\u0010\u00A2\u0006\u0002\bBJ\u0015\u0010C\u001A\u00020\t2\u0006\u0010D\u001A\u00020\u0014H\u0010\u00A2\u0006\u0002\bEJ\u0015\u0010F\u001A\u00020\t2\u0006\u0010\u0002\u001A\u00020\u0003H\u0000\u00A2\u0006\u0002\bGJ\u0015\u0010H\u001A\u00020\t2\u0006\u0010&\u001A\u00020\u0005H\u0000\u00A2\u0006\u0002\bIJ8\u0010J\u001A\u00020\u00002\u0016\b\u0002\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016J\u001E\u0010K\u001A\u00020\u00012\u0014\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016J\r\u0010L\u001A\u00020\tH\u0000\u00A2\u0006\u0002\bMR\u001A\u0010\f\u001A\u00020\rX\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R4\u0010\u0015\u001A\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u000E\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013@VX\u0090\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001A\u0010\u001A\u001A\u00020\u0005X\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER\"\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0090\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001F\u0010 R\u0014\u0010!\u001A\u00020\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\"\u0010\u000FR\u0014\u0010#\u001A\u00020\u00018VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b$\u0010%R\u000E\u0010&\u001A\u00020\u0003X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\"\u0010\n\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0090\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\'\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006N"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "readObserver", "Lkotlin/Function1;", "", "", "writeObserver", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "applied", "", "getApplied$runtime_release", "()Z", "setApplied$runtime_release", "(Z)V", "<set-?>", "", "Landroidx/compose/runtime/snapshots/StateObject;", "modified", "getModified$runtime_release", "()Ljava/util/Set;", "setModified", "(Ljava/util/Set;)V", "previousIds", "getPreviousIds$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "readOnly", "getReadOnly", "root", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "snapshots", "getWriteObserver$runtime_release", "abandon", "advance", "advance$runtime_release", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "close", "close$runtime_release", "dispose", "hasPendingChanges", "innerApply", "snapshotId", "optimisticMerges", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "invalidSnapshots", "innerApply$runtime_release", "nestedActivated", "snapshot", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "recordModified", "state", "recordModified$runtime_release", "recordPrevious", "recordPrevious$runtime_release", "recordPreviousList", "recordPreviousList$runtime_release", "takeNestedMutableSnapshot", "takeNestedSnapshot", "validateNotApplied", "validateNotApplied$runtime_release", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public class MutableSnapshot extends Snapshot {
    public static final int $stable = 8;
    private boolean applied;
    private Set modified;
    private SnapshotIdSet previousIds;
    private final Function1 readObserver;
    private int snapshots;
    private final Function1 writeObserver;

    static {
    }

    public MutableSnapshot(int v, SnapshotIdSet snapshotIdSet0, Function1 function10, Function1 function11) {
        Intrinsics.checkNotNullParameter(snapshotIdSet0, "invalid");
        super(v, snapshotIdSet0, null);
        this.readObserver = function10;
        this.writeObserver = function11;
        this.previousIds = SnapshotIdSet.Companion.getEMPTY();
        this.snapshots = 1;
    }

    private final void abandon() {
        Set set0 = this.getModified$runtime_release();
        if(set0 != null) {
            this.validateNotApplied$runtime_release();
            this.setModified(null);
            int v = this.getId();
            for(Object object0: set0) {
                for(StateRecord stateRecord0 = ((StateObject)object0).getFirstStateRecord(); stateRecord0 != null; stateRecord0 = stateRecord0.getNext$runtime_release()) {
                    if(stateRecord0.getSnapshotId$runtime_release() == v || CollectionsKt.contains(this.previousIds, stateRecord0.getSnapshotId$runtime_release())) {
                        stateRecord0.setSnapshotId$runtime_release(0);
                    }
                }
            }
        }
        this.close$runtime_release();
    }

    public final Object advance$runtime_release(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        this.recordPrevious$runtime_release(this.getId());
        Object object0 = function00.invoke();
        int v = this.getId();
        synchronized(SnapshotKt.getLock()) {
            SnapshotKt.nextSnapshotId = 3;
            this.setId$runtime_release(2);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(this.getId());
        }
        SnapshotIdSet snapshotIdSet0 = this.getInvalid$runtime_release();
        int v2 = v + 1;
        int v3 = this.getId();
        if(v2 < v3) {
            while(true) {
                snapshotIdSet0 = snapshotIdSet0.set(v2);
                if(v2 + 1 >= v3) {
                    break;
                }
                ++v2;
            }
        }
        this.setInvalid$runtime_release(snapshotIdSet0);
        return object0;
    }

    public final void advance$runtime_release() {
        this.recordPrevious$runtime_release(this.getId());
        int v = this.getId();
        synchronized(SnapshotKt.getLock()) {
            SnapshotKt.nextSnapshotId = 3;
            this.setId$runtime_release(2);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(this.getId());
        }
        SnapshotIdSet snapshotIdSet0 = this.getInvalid$runtime_release();
        int v2 = v + 1;
        int v3 = this.getId();
        if(v2 < v3) {
            while(true) {
                snapshotIdSet0 = snapshotIdSet0.set(v2);
                if(v2 + 1 >= v3) {
                    break;
                }
                ++v2;
            }
        }
        this.setInvalid$runtime_release(snapshotIdSet0);
    }

    public SnapshotApplyResult apply() {
        Pair pair0;
        Map map0;
        Set set0 = this.getModified$runtime_release();
        if(set0 == null) {
            map0 = null;
        }
        else {
            Object object0 = SnapshotKt.currentGlobalSnapshot.get();
            Intrinsics.checkNotNullExpressionValue(object0, "currentGlobalSnapshot.get()");
            map0 = SnapshotKt.optimisticMerges(((MutableSnapshot)object0), this, SnapshotKt.openSnapshots.clear(((GlobalSnapshot)SnapshotKt.currentGlobalSnapshot.get()).getId()));
        }
        synchronized(SnapshotKt.getLock()) {
            SnapshotKt.validateOpen(this);
            if(set0 == null || set0.size() == 0) {
                this.close$runtime_release();
                GlobalSnapshot globalSnapshot1 = (GlobalSnapshot)SnapshotKt.currentGlobalSnapshot.get();
                Intrinsics.checkNotNullExpressionValue(globalSnapshot1, "previousGlobalSnapshot");
                SnapshotKt.takeNewGlobalSnapshot(globalSnapshot1, SnapshotKt.emptyLambda);
                Set set2 = globalSnapshot1.getModified$runtime_release();
                pair0 = set2 == null || !set2.isEmpty() == 0 ? TuplesKt.to(CollectionsKt.emptyList(), null) : TuplesKt.to(CollectionsKt.toMutableList(SnapshotKt.applyObservers), set2);
            }
            else {
                GlobalSnapshot globalSnapshot0 = (GlobalSnapshot)SnapshotKt.currentGlobalSnapshot.get();
                SnapshotApplyResult snapshotApplyResult0 = this.innerApply$runtime_release(2, map0, SnapshotKt.openSnapshots.clear(globalSnapshot0.getId()));
                if(!Intrinsics.areEqual(snapshotApplyResult0, Success.INSTANCE)) {
                    return snapshotApplyResult0;
                }
                this.close$runtime_release();
                Intrinsics.checkNotNullExpressionValue(globalSnapshot0, "previousGlobalSnapshot");
                SnapshotKt.takeNewGlobalSnapshot(globalSnapshot0, SnapshotKt.emptyLambda);
                Set set1 = globalSnapshot0.getModified$runtime_release();
                this.setModified(null);
                globalSnapshot0.setModified(null);
                pair0 = TuplesKt.to(CollectionsKt.toMutableList(SnapshotKt.applyObservers), set1);
            }
        }
        List list0 = (List)pair0.component1();
        Set set3 = (Set)pair0.component2();
        this.applied = true;
        if(set3 != null && !set3.isEmpty() != 0) {
            int v2 = list0.size();
            if(v2 - 1 >= 0) {
                for(int v3 = 0; true; ++v3) {
                    ((Function2)list0.get(v3)).invoke(set3, this);
                    if(v3 + 1 > v2 - 1) {
                        break;
                    }
                }
            }
        }
        if(set0 != null && !set0.isEmpty() != 0) {
            int v4 = list0.size();
            if(v4 - 1 >= 0) {
                for(int v1 = 0; true; ++v1) {
                    ((Function2)list0.get(v1)).invoke(set0, this);
                    if(v1 + 1 > v4 - 1) {
                        break;
                    }
                }
            }
        }
        return Success.INSTANCE;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void close$runtime_release() {
        synchronized(SnapshotKt.getLock()) {
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(this.getId()).andNot(this.getPreviousIds$runtime_release());
        }
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if(!this.getDisposed$runtime_release()) {
            super.dispose();
            this.nestedDeactivated$runtime_release(this);
        }
    }

    public final boolean getApplied$runtime_release() {
        return this.applied;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Set getModified$runtime_release() {
        return this.modified;
    }

    public final SnapshotIdSet getPreviousIds$runtime_release() {
        return this.previousIds;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Function1 getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Function1 getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        Set set0 = this.getModified$runtime_release();
        return set0 != null && !set0.isEmpty() == 1;
    }

    public final SnapshotApplyResult innerApply$runtime_release(int v, Map map0, SnapshotIdSet snapshotIdSet0) {
        Intrinsics.checkNotNullParameter(snapshotIdSet0, "invalidSnapshots");
        SnapshotIdSet snapshotIdSet1 = this.getInvalid$runtime_release().set(this.getId()).or(this.previousIds);
        Set set0 = this.getModified$runtime_release();
        Intrinsics.checkNotNull(set0);
        List list0 = null;
        List list1 = null;
        for(Object object0: set0) {
            StateObject stateObject0 = (StateObject)object0;
            StateRecord stateRecord0 = stateObject0.getFirstStateRecord();
            StateRecord stateRecord1 = SnapshotKt.readable(stateRecord0, v, snapshotIdSet0);
            if(stateRecord1 == null) {
                continue;
            }
            StateRecord stateRecord2 = SnapshotKt.readable(stateRecord0, this.getId(), snapshotIdSet1);
            if(stateRecord2 == null || Intrinsics.areEqual(stateRecord1, stateRecord2)) {
                continue;
            }
            StateRecord stateRecord3 = SnapshotKt.readable(stateRecord0, this.getId(), this.getInvalid$runtime_release());
            if(stateRecord3 != null) {
                StateRecord stateRecord4 = map0 == null ? null : ((StateRecord)map0.get(stateRecord1));
                if(stateRecord4 == null) {
                    stateRecord4 = stateObject0.mergeRecords(stateRecord2, stateRecord1, stateRecord3);
                }
                if(stateRecord4 == null) {
                    return new Failure(this);
                }
                if(Intrinsics.areEqual(stateRecord4, stateRecord3)) {
                    continue;
                }
                if(Intrinsics.areEqual(stateRecord4, stateRecord1)) {
                    if(list0 == null) {
                        list0 = new ArrayList();
                    }
                    list0.add(TuplesKt.to(stateObject0, stateRecord1.create()));
                    if(list1 == null) {
                        list1 = new ArrayList();
                    }
                    list1.add(stateObject0);
                    continue;
                }
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                list0.add((Intrinsics.areEqual(stateRecord4, stateRecord2) ? TuplesKt.to(stateObject0, stateRecord2.create()) : TuplesKt.to(stateObject0, stateRecord4)));
                continue;
            }
            SnapshotKt.readError();
            throw new KotlinNothingValueException();
        }
        if(list0 != null) {
            this.advance$runtime_release();
            int v1 = list0.size();
            if(v1 - 1 >= 0) {
                for(int v2 = 0; true; ++v2) {
                    Pair pair0 = (Pair)list0.get(v2);
                    StateObject stateObject1 = (StateObject)pair0.component1();
                    StateRecord stateRecord5 = (StateRecord)pair0.component2();
                    stateRecord5.setSnapshotId$runtime_release(this.getId());
                    Object object1 = SnapshotKt.getLock();
                    synchronized(object1) {
                        stateRecord5.setNext$runtime_release(stateObject1.getFirstStateRecord());
                        stateObject1.prependStateRecord(stateRecord5);
                    }
                    if(v2 + 1 > v1 - 1) {
                        break;
                    }
                }
            }
        }
        if(list1 != null) {
            set0.removeAll(list1);
        }
        return Success.INSTANCE;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void nestedActivated$runtime_release(Snapshot snapshot0) {
        Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
        ++this.snapshots;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void nestedDeactivated$runtime_release(Snapshot snapshot0) {
        Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
        int v = this.snapshots;
        if(v <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.snapshots = v - 1;
        if(v - 1 == 0 && !this.applied) {
            this.abandon();
        }
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        if(!this.applied && !this.getDisposed$runtime_release()) {
            this.advance$runtime_release();
        }
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void recordModified$runtime_release(StateObject stateObject0) {
        Intrinsics.checkNotNullParameter(stateObject0, "state");
        Set set0 = this.getModified$runtime_release();
        if(set0 == null) {
            set0 = new HashSet();
            this.setModified(set0);
        }
        set0.add(stateObject0);
    }

    public final void recordPrevious$runtime_release(int v) {
        synchronized(SnapshotKt.getLock()) {
            this.setPreviousIds$runtime_release(this.getPreviousIds$runtime_release().set(v));
        }
    }

    public final void recordPreviousList$runtime_release(SnapshotIdSet snapshotIdSet0) {
        Intrinsics.checkNotNullParameter(snapshotIdSet0, "snapshots");
        synchronized(SnapshotKt.getLock()) {
            this.setPreviousIds$runtime_release(this.getPreviousIds$runtime_release().or(snapshotIdSet0));
        }
    }

    public final void setApplied$runtime_release(boolean z) {
        this.applied = z;
    }

    public void setModified(Set set0) {
        this.modified = set0;
    }

    public final void setPreviousIds$runtime_release(SnapshotIdSet snapshotIdSet0) {
        Intrinsics.checkNotNullParameter(snapshotIdSet0, "<set-?>");
        this.previousIds = snapshotIdSet0;
    }

    public MutableSnapshot takeNestedMutableSnapshot(Function1 function10, Function1 function11) {
        NestedMutableSnapshot nestedMutableSnapshot0;
        this.validateNotDisposed$runtime_release();
        this.validateNotApplied$runtime_release();
        this.recordPrevious$runtime_release(this.getId());
        synchronized(SnapshotKt.getLock()) {
            SnapshotKt.nextSnapshotId = 3;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(2);
            SnapshotIdSet snapshotIdSet0 = this.getInvalid$runtime_release();
            this.setInvalid$runtime_release(snapshotIdSet0.set(2));
            nestedMutableSnapshot0 = new NestedMutableSnapshot(2, snapshotIdSet0, SnapshotKt.mergedReadObserver(function10, this.getReadObserver$runtime_release()), SnapshotKt.mergedWriteObserver(function11, this.getWriteObserver$runtime_release()), this);
        }
        int v1 = this.getId();
        synchronized(SnapshotKt.getLock()) {
            SnapshotKt.nextSnapshotId = 3;
            this.setId$runtime_release(2);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(this.getId());
        }
        SnapshotIdSet snapshotIdSet1 = this.getInvalid$runtime_release();
        int v3 = v1 + 1;
        int v4 = this.getId();
        if(v3 < v4) {
            while(true) {
                snapshotIdSet1 = snapshotIdSet1.set(v3);
                if(v3 + 1 >= v4) {
                    break;
                }
                ++v3;
            }
        }
        this.setInvalid$runtime_release(snapshotIdSet1);
        return nestedMutableSnapshot0;
    }

    public static MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot0, Function1 function10, Function1 function11, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if((v & 1) != 0) {
            function10 = null;
        }
        if((v & 2) != 0) {
            function11 = null;
        }
        return mutableSnapshot0.takeNestedMutableSnapshot(function10, function11);
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1 function10) {
        NestedReadonlySnapshot nestedReadonlySnapshot0;
        this.validateNotDisposed$runtime_release();
        this.validateNotApplied$runtime_release();
        int v = this.getId();
        this.recordPrevious$runtime_release(this.getId());
        synchronized(SnapshotKt.getLock()) {
            SnapshotKt.nextSnapshotId = 3;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(2);
            SnapshotIdSet snapshotIdSet0 = this.getInvalid$runtime_release();
            int v2 = v + 1;
            if(v2 < 2) {
                while(true) {
                    snapshotIdSet0 = snapshotIdSet0.set(v2);
                    if(v2 + 1 >= 2) {
                        break;
                    }
                    ++v2;
                }
            }
            nestedReadonlySnapshot0 = new NestedReadonlySnapshot(2, snapshotIdSet0, function10, this);
        }
        int v3 = this.getId();
        synchronized(SnapshotKt.getLock()) {
            SnapshotKt.nextSnapshotId = 3;
            this.setId$runtime_release(2);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(this.getId());
        }
        SnapshotIdSet snapshotIdSet1 = this.getInvalid$runtime_release();
        int v5 = v3 + 1;
        int v6 = this.getId();
        if(v5 < v6) {
            while(true) {
                snapshotIdSet1 = snapshotIdSet1.set(v5);
                if(v5 + 1 >= v6) {
                    break;
                }
                ++v5;
            }
        }
        this.setInvalid$runtime_release(snapshotIdSet1);
        return nestedReadonlySnapshot0;
    }

    public final void validateNotApplied$runtime_release() {
        if(!this.applied == 0) {
            throw new IllegalArgumentException("Unsupported operation on a snapshot that has been applied");
        }
    }
}

