package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001A\u00020\bH&R\u0012\u0010\u0003\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u000B\f¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "", "()V", "succeeded", "", "getSucceeded", "()Z", "check", "", "Failure", "Success", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Success;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Failure;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class SnapshotApplyResult {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000B\u001A\u00020\fH\u0016R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Failure;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "getSnapshot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "succeeded", "", "getSucceeded", "()Z", "check", "", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Failure extends SnapshotApplyResult {
        public static final int $stable = 8;
        private final Snapshot snapshot;

        static {
        }

        public Failure(Snapshot snapshot0) {
            Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
            super(null);
            this.snapshot = snapshot0;
        }

        @Override  // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public void check() {
            this.snapshot.dispose();
            throw new SnapshotApplyConflictException(this.snapshot);
        }

        public final Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override  // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public boolean getSucceeded() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001A\u00020\bH\u0016R\u0014\u0010\u0003\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Success;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "()V", "succeeded", "", "getSucceeded", "()Z", "check", "", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Success extends SnapshotApplyResult {
        public static final int $stable;
        public static final Success INSTANCE;

        static {
            Success.INSTANCE = new Success();
        }

        private Success() {
            super(null);
        }

        @Override  // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public void check() {
        }

        @Override  // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public boolean getSucceeded() {
            return true;
        }
    }

    public static final int $stable;

    static {
    }

    private SnapshotApplyResult() {
    }

    public SnapshotApplyResult(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    public abstract void check();

    public abstract boolean getSucceeded();
}

