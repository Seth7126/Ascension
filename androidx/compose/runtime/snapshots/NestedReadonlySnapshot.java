package androidx.compose.runtime.snapshots;

import java.util.HashSet;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\u0001\n\u0002\b\u000B\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0014\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\n\u001A\u00020\u0001¢\u0006\u0002\u0010\u000BJ\b\u0010\u001E\u001A\u00020\tH\u0016J\b\u0010\u001F\u001A\u00020\u0017H\u0016J\u0015\u0010 \u001A\u00020!2\u0006\u0010\"\u001A\u00020\u0001H\u0010¢\u0006\u0002\b#J\u0015\u0010$\u001A\u00020!2\u0006\u0010\"\u001A\u00020\u0001H\u0010¢\u0006\u0002\b%J\r\u0010&\u001A\u00020\tH\u0010¢\u0006\u0002\b\'J\u0015\u0010(\u001A\u00020\t2\u0006\u0010)\u001A\u00020\u000EH\u0010¢\u0006\u0002\b*J\u001E\u0010+\u001A\u00020\u00002\u0014\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016R(\u0010\f\u001A\u0016\u0012\u0004\u0012\u00020\u000E\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000E\u0018\u0001`\u000F8PX\u0090\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001A\u00020\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001A\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001A\u001A\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u0013R\"\u0010\u001C\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078PX\u0090\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u0015¨\u0006,"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "readObserver", "Lkotlin/Function1;", "", "", "parent", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/Snapshot;)V", "modified", "Ljava/util/HashSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "Lkotlin/collections/HashSet;", "getModified$runtime_release", "()Ljava/util/HashSet;", "getParent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "readOnly", "", "getReadOnly", "()Z", "root", "getRoot", "writeObserver", "getWriteObserver$runtime_release", "dispose", "hasPendingChanges", "nestedActivated", "", "snapshot", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "recordModified", "state", "recordModified$runtime_release", "takeNestedSnapshot", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class NestedReadonlySnapshot extends Snapshot {
    private final Snapshot parent;
    private final Function1 readObserver;

    public NestedReadonlySnapshot(int v, SnapshotIdSet snapshotIdSet0, Function1 function10, Snapshot snapshot0) {
        Intrinsics.checkNotNullParameter(snapshotIdSet0, "invalid");
        Intrinsics.checkNotNullParameter(snapshot0, "parent");
        Function1 function11 = null;
        super(v, snapshotIdSet0, null);
        this.parent = snapshot0;
        snapshot0.nestedActivated$runtime_release(this);
        if(function10 != null) {
            Function1 function12 = this.getParent().getReadObserver$runtime_release();
            if(function12 != null) {
                function10 = new Function1(function12) {
                    final Function1 $it;
                    final Function1 $readObserver;

                    {
                        this.$readObserver = function10;
                        this.$it = function11;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(object0);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Object object0) {
                        Intrinsics.checkNotNullParameter(object0, "state");
                        this.$readObserver.invoke(object0);
                        this.$it.invoke(object0);
                    }
                };
            }
            function11 = function10;
        }
        if(function11 == null) {
            function11 = snapshot0.getReadObserver$runtime_release();
        }
        this.readObserver = function11;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if(!this.getDisposed$runtime_release()) {
            if(this.getId() != this.parent.getId()) {
                this.close$runtime_release();
            }
            this.parent.nestedDeactivated$runtime_release(this);
            super.dispose();
        }
    }

    public HashSet getModified$runtime_release() [...] // Inlined contents

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Set getModified$runtime_release() {
        return null;
    }

    public final Snapshot getParent() {
        return this.parent;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Function1 getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return true;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this.parent.getRoot();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Function1 getWriteObserver$runtime_release() {
        return null;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return false;
    }

    public Void nestedActivated$runtime_release(Snapshot snapshot0) {
        Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void nestedActivated$runtime_release(Snapshot snapshot0) {
        this.nestedActivated$runtime_release(snapshot0);
    }

    public Void nestedDeactivated$runtime_release(Snapshot snapshot0) {
        Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void nestedDeactivated$runtime_release(Snapshot snapshot0) {
        this.nestedDeactivated$runtime_release(snapshot0);
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void recordModified$runtime_release(StateObject stateObject0) {
        Intrinsics.checkNotNullParameter(stateObject0, "state");
        this.parent.recordModified$runtime_release(stateObject0);
    }

    public NestedReadonlySnapshot takeNestedSnapshot(Function1 function10) {
        return new NestedReadonlySnapshot(this.getId(), this.getInvalid$runtime_release(), function10, this.parent);
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1 function10) {
        return this.takeNestedSnapshot(function10);
    }
}

