package androidx.compose.runtime.snapshots;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u0000H&J\b\u0010\u0011\u001A\u00020\u0000H&R\u001C\u0010\u0003\u001A\u0004\u0018\u00010\u0000X\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001A\u0010\b\u001A\u00020\tX\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/snapshots/StateRecord;", "", "()V", "next", "getNext$runtime_release", "()Landroidx/compose/runtime/snapshots/StateRecord;", "setNext$runtime_release", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "snapshotId", "", "getSnapshotId$runtime_release", "()I", "setSnapshotId$runtime_release", "(I)V", "assign", "", "value", "create", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class StateRecord {
    public static final int $stable = 8;
    private StateRecord next;
    private int snapshotId;

    static {
    }

    public StateRecord() {
        this.snapshotId = SnapshotKt.currentSnapshot().getId();
    }

    public abstract void assign(StateRecord arg1);

    public abstract StateRecord create();

    public final StateRecord getNext$runtime_release() {
        return this.next;
    }

    public final int getSnapshotId$runtime_release() {
        return this.snapshotId;
    }

    public final void setNext$runtime_release(StateRecord stateRecord0) {
        this.next = stateRecord0;
    }

    public final void setSnapshotId$runtime_release(int v) {
        this.snapshotId = v;
    }
}

