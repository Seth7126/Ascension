package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.InternalComposeApi;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u000E\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\u0002\u0010\u0006J\r\u0010\'\u001A\u00020\u001DH\u0010\u00A2\u0006\u0002\b(J\b\u0010)\u001A\u00020\u001DH\u0016J%\u0010*\u001A\u0002H+\"\u0004\b\u0000\u0010+2\f\u0010,\u001A\b\u0012\u0004\u0012\u0002H+0-H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010.J\b\u0010/\u001A\u00020\bH&J\n\u00100\u001A\u0004\u0018\u00010\u0000H\u0011J\u0015\u00101\u001A\u00020\u001D2\u0006\u00102\u001A\u00020\u0000H \u00A2\u0006\u0002\b3J\u0015\u00104\u001A\u00020\u001D2\u0006\u00102\u001A\u00020\u0000H \u00A2\u0006\u0002\b5J\r\u00106\u001A\u00020\u001DH \u00A2\u0006\u0002\b7J\u0015\u00108\u001A\u00020\u001D2\u0006\u00109\u001A\u00020\u0018H \u00A2\u0006\u0002\b:J\u0012\u0010;\u001A\u00020\u001D2\b\u00102\u001A\u0004\u0018\u00010\u0000H\u0011J \u0010<\u001A\u00020\u00002\u0016\b\u0002\u0010\u001B\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001D\u0018\u00010\u001CH&J\r\u0010=\u001A\u00020\u001DH\u0000\u00A2\u0006\u0002\b>R\u001A\u0010\u0007\u001A\u00020\bX\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR$\u0010\u0002\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\u0003@PX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0004\u001A\u00020\u0005X\u0090\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001A\u0010\u0016\u001A\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u00A0\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0019\u0010\u001AR \u0010\u001B\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001D\u0018\u00010\u001CX\u00A0\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001E\u0010\u001FR\u0012\u0010 \u001A\u00020\bX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b!\u0010\nR\u0012\u0010\"\u001A\u00020\u0000X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010$R \u0010%\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001D\u0018\u00010\u001CX\u00A0\u0004\u00A2\u0006\u0006\u001A\u0004\b&\u0010\u001F\u0082\u0001\u0003@AB\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006C"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot;", "", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "disposed", "", "getDisposed$runtime_release", "()Z", "setDisposed$runtime_release", "(Z)V", "<set-?>", "getId", "()I", "setId$runtime_release", "(I)V", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "modified", "", "Landroidx/compose/runtime/snapshots/StateObject;", "getModified$runtime_release", "()Ljava/util/Set;", "readObserver", "Lkotlin/Function1;", "", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "readOnly", "getReadOnly", "root", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "writeObserver", "getWriteObserver$runtime_release", "close", "close$runtime_release", "dispose", "enter", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hasPendingChanges", "makeCurrent", "nestedActivated", "snapshot", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "recordModified", "state", "recordModified$runtime_release", "restoreCurrent", "takeNestedSnapshot", "validateNotDisposed", "validateNotDisposed$runtime_release", "Companion", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class Snapshot {
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00A2\u0006\u0002\u0010\u0002J%\u0010\u0007\u001A\u0002H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\b0\nH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u000BJ\u0006\u0010\f\u001A\u00020\rJO\u0010\u000E\u001A\u0002H\b\"\u0004\b\u0000\u0010\b2\u0016\b\u0002\u0010\u000F\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r\u0018\u00010\u00102\f\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\b0\n\u00A2\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001A\u00020\u0014H\u0007J&\u0010\u0015\u001A\u00020\u00162\u001E\u0010\u0017\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0018J\u001A\u0010\u001A\u001A\u00020\u00162\u0012\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0010J\n\u0010\u001B\u001A\u0004\u0018\u00010\u0004H\u0001J\u0012\u0010\u001C\u001A\u00020\r2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0004H\u0001J\u0006\u0010\u001E\u001A\u00020\rJ6\u0010\u001F\u001A\u00020 2\u0016\b\u0002\u0010\u000F\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010J\u001E\u0010!\u001A\u00020\u00042\u0016\b\u0002\u0010\u000F\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010J%\u0010\"\u001A\u0002H#\"\u0004\b\u0000\u0010#2\f\u0010\t\u001A\b\u0012\u0004\u0012\u0002H#0\nH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u000BR\u0011\u0010\u0003\u001A\u00020\u00048F\u00A2\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006$"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "", "()V", "current", "Landroidx/compose/runtime/snapshots/Snapshot;", "getCurrent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "global", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "notifyObjectsInitialized", "", "observe", "readObserver", "Lkotlin/Function1;", "writeObserver", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "openSnapshotCount", "", "registerApplyObserver", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "observer", "Lkotlin/Function2;", "", "registerGlobalWriteObserver", "removeCurrent", "restoreCurrent", "previous", "sendApplyNotifications", "takeMutableSnapshot", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "takeSnapshot", "withMutableSnapshot", "R", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        public final Object global(Function0 function00) {
            Intrinsics.checkNotNullParameter(function00, "block");
            Snapshot snapshot0 = this.removeCurrent();
            Object object0 = function00.invoke();
            Snapshot.Companion.restoreCurrent(snapshot0);
            return object0;
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final Object observe(Function1 function10, Function1 function11, Function0 function00) {
            Snapshot snapshot1;
            Intrinsics.checkNotNullParameter(function00, "block");
            if(function10 == null && function11 == null) {
                return function00.invoke();
            }
            Snapshot snapshot0 = (Snapshot)SnapshotKt.threadSnapshot.get();
            if(snapshot0 == null || snapshot0 instanceof MutableSnapshot) {
                snapshot1 = new TransparentObserverMutableSnapshot((snapshot0 instanceof MutableSnapshot ? ((MutableSnapshot)snapshot0) : null), function10, function11);
            }
            else {
                if(function10 == null) {
                    return function00.invoke();
                }
                snapshot1 = snapshot0.takeNestedSnapshot(function10);
            }
            try {
                Snapshot snapshot2 = snapshot1.makeCurrent();
                try {
                    return function00.invoke();
                }
                finally {
                    snapshot1.restoreCurrent(snapshot2);
                }
            }
            finally {
                snapshot1.dispose();
            }
        }

        public static Object observe$default(Companion snapshot$Companion0, Function1 function10, Function1 function11, Function0 function00, int v, Object object0) {
            if((v & 1) != 0) {
                function10 = null;
            }
            if((v & 2) != 0) {
                function11 = null;
            }
            return snapshot$Companion0.observe(function10, function11, function00);
        }

        @InternalComposeApi
        public final int openSnapshotCount() {
            return CollectionsKt.toList(SnapshotKt.openSnapshots).size();
        }

        public final ObserverHandle registerApplyObserver(Function2 function20) {
            Intrinsics.checkNotNullParameter(function20, "observer");
            SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
            synchronized(SnapshotKt.getLock()) {
                SnapshotKt.applyObservers.add(function20);
            }
            return new ObserverHandle() {
                @Override  // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    synchronized(SnapshotKt.getLock()) {
                        SnapshotKt.applyObservers.remove(this.$observer);
                    }
                }
            };
        }

        public final ObserverHandle registerGlobalWriteObserver(Function1 function10) {
            Intrinsics.checkNotNullParameter(function10, "observer");
            synchronized(SnapshotKt.getLock()) {
                SnapshotKt.globalWriteObservers.add(function10);
            }
            SnapshotKt.advanceGlobalSnapshot();
            return new ObserverHandle() {
                @Override  // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    synchronized(SnapshotKt.getLock()) {
                        SnapshotKt.globalWriteObservers.remove(this.$observer);
                    }
                    SnapshotKt.advanceGlobalSnapshot();
                }
            };
        }

        public final Snapshot removeCurrent() {
            Snapshot snapshot0 = (Snapshot)SnapshotKt.threadSnapshot.get();
            if(snapshot0 != null) {
                SnapshotKt.threadSnapshot.set(null);
            }
            return snapshot0;
        }

        public final void restoreCurrent(Snapshot snapshot0) {
            if(snapshot0 != null) {
                SnapshotKt.threadSnapshot.set(snapshot0);
            }
        }

        public final void sendApplyNotifications() {
            synchronized(SnapshotKt.getLock()) {
                Set set0 = ((GlobalSnapshot)SnapshotKt.currentGlobalSnapshot.get()).getModified$runtime_release();
            }
            if(set0 != null && !set0.isEmpty() == 1) {
                SnapshotKt.advanceGlobalSnapshot();
            }
        }

        public final MutableSnapshot takeMutableSnapshot(Function1 function10, Function1 function11) {
            Snapshot snapshot0 = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot0 = snapshot0 instanceof MutableSnapshot ? ((MutableSnapshot)snapshot0) : null;
            if(mutableSnapshot0 == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return mutableSnapshot0.takeNestedMutableSnapshot(function10, function11);
        }

        public static MutableSnapshot takeMutableSnapshot$default(Companion snapshot$Companion0, Function1 function10, Function1 function11, int v, Object object0) {
            if((v & 1) != 0) {
                function10 = null;
            }
            if((v & 2) != 0) {
                function11 = null;
            }
            return snapshot$Companion0.takeMutableSnapshot(function10, function11);
        }

        public final Snapshot takeSnapshot(Function1 function10) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(function10);
        }

        public static Snapshot takeSnapshot$default(Companion snapshot$Companion0, Function1 function10, int v, Object object0) {
            if((v & 1) != 0) {
                function10 = null;
            }
            return snapshot$Companion0.takeSnapshot(function10);
        }

        public final Object withMutableSnapshot(Function0 function00) {
            Object object0;
            Intrinsics.checkNotNullParameter(function00, "block");
            MutableSnapshot mutableSnapshot0 = Companion.takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                Snapshot snapshot0 = mutableSnapshot0.makeCurrent();
                try {
                    object0 = function00.invoke();
                }
                finally {
                    mutableSnapshot0.restoreCurrent(snapshot0);
                }
                mutableSnapshot0.apply().check();
                return object0;
            }
            catch(Throwable throwable0) {
                mutableSnapshot0.dispose();
                throw throwable0;
            }
        }
    }

    public static final int $stable;
    public static final Companion Companion;
    private boolean disposed;
    private int id;
    private SnapshotIdSet invalid;

    static {
        Snapshot.Companion = new Companion(null);
        Snapshot.$stable = 8;
    }

    private Snapshot(int v, SnapshotIdSet snapshotIdSet0) {
        this.invalid = snapshotIdSet0;
        this.id = v;
    }

    public Snapshot(int v, SnapshotIdSet snapshotIdSet0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, snapshotIdSet0);
    }

    public void close$runtime_release() {
        synchronized(SnapshotKt.getLock()) {
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(this.getId());
        }
    }

    public void dispose() {
        this.disposed = true;
    }

    public final Object enter(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        Snapshot snapshot0 = this.makeCurrent();
        try {
            return function00.invoke();
        }
        finally {
            this.restoreCurrent(snapshot0);
        }
    }

    public final boolean getDisposed$runtime_release() {
        return this.disposed;
    }

    public int getId() {
        return this.id;
    }

    public SnapshotIdSet getInvalid$runtime_release() {
        return this.invalid;
    }

    public abstract Set getModified$runtime_release();

    public abstract Function1 getReadObserver$runtime_release();

    public abstract boolean getReadOnly();

    public abstract Snapshot getRoot();

    public abstract Function1 getWriteObserver$runtime_release();

    public abstract boolean hasPendingChanges();

    public Snapshot makeCurrent() {
        Snapshot snapshot0 = (Snapshot)SnapshotKt.threadSnapshot.get();
        SnapshotKt.threadSnapshot.set(this);
        return snapshot0;
    }

    public abstract void nestedActivated$runtime_release(Snapshot arg1);

    public abstract void nestedDeactivated$runtime_release(Snapshot arg1);

    public abstract void notifyObjectsInitialized$runtime_release();

    public abstract void recordModified$runtime_release(StateObject arg1);

    public void restoreCurrent(Snapshot snapshot0) {
        SnapshotKt.threadSnapshot.set(snapshot0);
    }

    public final void setDisposed$runtime_release(boolean z) {
        this.disposed = z;
    }

    public void setId$runtime_release(int v) {
        this.id = v;
    }

    public void setInvalid$runtime_release(SnapshotIdSet snapshotIdSet0) {
        Intrinsics.checkNotNullParameter(snapshotIdSet0, "<set-?>");
        this.invalid = snapshotIdSet0;
    }

    public abstract Snapshot takeNestedSnapshot(Function1 arg1);

    public static Snapshot takeNestedSnapshot$default(Snapshot snapshot0, Function1 function10, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if((v & 1) != 0) {
            function10 = null;
        }
        return snapshot0.takeNestedSnapshot(function10);
    }

    public final void validateNotDisposed$runtime_release() {
        if(!this.disposed == 0) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot");
        }
    }
}

