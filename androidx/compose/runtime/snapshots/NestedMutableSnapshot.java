package androidx.compose.runtime.snapshots;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0014\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\n\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\u000B\u001A\u00020\u0001¢\u0006\u0002\u0010\fJ\b\u0010\u0013\u001A\u00020\u0014H\u0016J\b\u0010\u0015\u001A\u00020\tH\u0016R\u0011\u0010\u000B\u001A\u00020\u0001¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0014\u0010\u000F\u001A\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "readObserver", "Lkotlin/Function1;", "", "", "writeObserver", "parent", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "getParent", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "root", "Landroidx/compose/runtime/snapshots/Snapshot;", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "dispose", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class NestedMutableSnapshot extends MutableSnapshot {
    private final MutableSnapshot parent;

    public NestedMutableSnapshot(int v, SnapshotIdSet snapshotIdSet0, Function1 function10, Function1 function11, MutableSnapshot mutableSnapshot0) {
        Intrinsics.checkNotNullParameter(snapshotIdSet0, "invalid");
        Intrinsics.checkNotNullParameter(mutableSnapshot0, "parent");
        super(v, snapshotIdSet0, function10, function11);
        this.parent = mutableSnapshot0;
        mutableSnapshot0.nestedActivated$runtime_release(this);
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() {
        Map map0;
        if(!this.parent.getApplied$runtime_release() && !this.parent.getDisposed$runtime_release()) {
            Set set0 = this.getModified$runtime_release();
            int v = this.getId();
            if(set0 == null) {
                map0 = null;
            }
            else {
                SnapshotIdSet snapshotIdSet0 = this.parent.getInvalid$runtime_release();
                map0 = SnapshotKt.optimisticMerges(this.parent, this, snapshotIdSet0);
            }
            synchronized(SnapshotKt.getLock()) {
                SnapshotKt.validateOpen(this);
                if(set0 == null || set0.size() == 0) {
                    this.close$runtime_release();
                }
                else {
                    SnapshotApplyResult snapshotApplyResult0 = this.innerApply$runtime_release(this.getParent().getId(), map0, this.getParent().getInvalid$runtime_release());
                    if(!Intrinsics.areEqual(snapshotApplyResult0, Success.INSTANCE)) {
                        return snapshotApplyResult0;
                    }
                    Set set1 = this.getParent().getModified$runtime_release();
                    if(set1 == null) {
                        HashSet hashSet0 = new HashSet();
                        this.getParent().setModified(hashSet0);
                        set1 = hashSet0;
                    }
                    set1.addAll(set0);
                }
                if(this.getParent().getId() < v) {
                    this.getParent().advance$runtime_release();
                }
                this.getParent().setInvalid$runtime_release(this.getParent().getInvalid$runtime_release().clear(v).andNot(this.getPreviousIds$runtime_release()));
                this.getParent().recordPrevious$runtime_release(v);
                this.getParent().recordPreviousList$runtime_release(this.getPreviousIds$runtime_release());
            }
            this.setApplied$runtime_release(true);
            return Success.INSTANCE;
        }
        return new Failure(this);
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void dispose() {
        if(!this.getDisposed$runtime_release()) {
            super.dispose();
            this.parent.nestedDeactivated$runtime_release(this);
        }
    }

    public final MutableSnapshot getParent() {
        return this.parent;
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public Snapshot getRoot() {
        return this.parent.getRoot();
    }
}

