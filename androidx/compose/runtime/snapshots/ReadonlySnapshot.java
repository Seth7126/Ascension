package androidx.compose.runtime.snapshots;

import java.util.HashSet;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0014\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\b\u0010 \u001A\u00020\tH\u0016J\b\u0010!\u001A\u00020\u0017H\u0016J\u0015\u0010\"\u001A\u00020\t2\u0006\u0010#\u001A\u00020\u0001H\u0010¢\u0006\u0002\b$J\u0015\u0010%\u001A\u00020\t2\u0006\u0010#\u001A\u00020\u0001H\u0010¢\u0006\u0002\b&J\r\u0010\'\u001A\u00020\tH\u0010¢\u0006\u0002\b(J\u0015\u0010)\u001A\u00020\t2\u0006\u0010*\u001A\u00020\rH\u0010¢\u0006\u0002\b+J\u001E\u0010,\u001A\u00020\u00012\u0014\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016RL\u0010\u000F\u001A\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000E2\u001A\u0010\u000B\u001A\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000E8P@VX\u0090\u000E¢\u0006\f\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001A\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001A\u001A\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001CR\u000E\u0010\u001D\u001A\u00020\u0003X\u0082\u000E¢\u0006\u0002\n\u0000R\"\u0010\u001E\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078PX\u0090\u0004¢\u0006\u0006\u001A\u0004\b\u001F\u0010\u0015¨\u0006-"}, d2 = {"Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "readObserver", "Lkotlin/Function1;", "", "", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;)V", "value", "Ljava/util/HashSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "Lkotlin/collections/HashSet;", "modified", "getModified$runtime_release", "()Ljava/util/HashSet;", "setModified", "(Ljava/util/HashSet;)V", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "readOnly", "", "getReadOnly", "()Z", "root", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "snapshots", "writeObserver", "getWriteObserver$runtime_release", "dispose", "hasPendingChanges", "nestedActivated", "snapshot", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "recordModified", "state", "recordModified$runtime_release", "takeNestedSnapshot", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ReadonlySnapshot extends Snapshot {
    private final Function1 readObserver;
    private int snapshots;

    public ReadonlySnapshot(int v, SnapshotIdSet snapshotIdSet0, Function1 function10) {
        Intrinsics.checkNotNullParameter(snapshotIdSet0, "invalid");
        super(v, snapshotIdSet0, null);
        this.readObserver = function10;
        this.snapshots = 1;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if(!this.getDisposed$runtime_release()) {
            this.nestedDeactivated$runtime_release(this);
            super.dispose();
        }
    }

    public HashSet getModified$runtime_release() [...] // Inlined contents

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Set getModified$runtime_release() {
        return null;
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
        return this;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Function1 getWriteObserver$runtime_release() {
        return null;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return false;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void nestedActivated$runtime_release(Snapshot snapshot0) {
        Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
        ++this.snapshots;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void nestedDeactivated$runtime_release(Snapshot snapshot0) {
        Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
        int v = this.snapshots - 1;
        this.snapshots = v;
        if(v == 0) {
            this.close$runtime_release();
        }
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void recordModified$runtime_release(StateObject stateObject0) {
        Intrinsics.checkNotNullParameter(stateObject0, "state");
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public void setModified(HashSet hashSet0) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1 function10) {
        SnapshotKt.validateOpen(this);
        return new NestedReadonlySnapshot(this.getId(), this.getInvalid$runtime_release(), function10, this);
    }
}

