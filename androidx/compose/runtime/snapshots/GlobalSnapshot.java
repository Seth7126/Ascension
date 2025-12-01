package androidx.compose.runtime.snapshots;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001A\u00020\bH\u0016J\b\u0010\t\u001A\u00020\nH\u0016J\u0015\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000EH\u0010¢\u0006\u0002\b\u000FJ\u0015\u0010\u0010\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000EH\u0010¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001A\u00020\nH\u0010¢\u0006\u0002\b\u0013J4\u0010\u0014\u001A\u00020\u00012\u0014\u0010\u0015\u001A\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u00162\u0014\u0010\u0018\u001A\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016H\u0016J\u001E\u0010\u0019\u001A\u00020\u000E2\u0014\u0010\u0015\u001A\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016H\u0016¨\u0006\u001A"}, d2 = {"Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "dispose", "", "nestedActivated", "", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "takeNestedMutableSnapshot", "readObserver", "Lkotlin/Function1;", "", "writeObserver", "takeNestedSnapshot", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class GlobalSnapshot extends MutableSnapshot {
    public GlobalSnapshot(int v, SnapshotIdSet snapshotIdSet0) {
        Intrinsics.checkNotNullParameter(snapshotIdSet0, "invalid");
        Function1 function10;
        synchronized(SnapshotKt.getLock()) {
            List list0 = !SnapshotKt.globalWriteObservers.isEmpty() == 0 ? null : CollectionsKt.toMutableList(SnapshotKt.globalWriteObservers);
            if(list0 == null) {
                function10 = null;
            }
            else {
                function10 = (Function1)CollectionsKt.firstOrNull(list0);
                if(function10 == null) {
                    function10 = new Function1() {
                        final List $it;

                        {
                            this.$it = list0;
                            super(1);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.invoke(object0);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Object object0) {
                            Intrinsics.checkNotNullParameter(object0, "state");
                            List list0 = this.$it;
                            int v = list0.size();
                            if(v - 1 >= 0) {
                                for(int v1 = 0; true; ++v1) {
                                    ((Function1)list0.get(v1)).invoke(object0);
                                    if(v1 + 1 > v - 1) {
                                        break;
                                    }
                                }
                            }
                        }
                    };
                }
            }
        }
        super(v, snapshotIdSet0, null, function10);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void dispose() {
    }

    public Void nestedActivated$runtime_release(Snapshot snapshot0) {
        Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void nestedActivated$runtime_release(Snapshot snapshot0) {
        this.nestedActivated$runtime_release(snapshot0);
    }

    public Void nestedDeactivated$runtime_release(Snapshot snapshot0) {
        Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void nestedDeactivated$runtime_release(Snapshot snapshot0) {
        this.nestedDeactivated$runtime_release(snapshot0);
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void notifyObjectsInitialized$runtime_release() {
        SnapshotKt.advanceGlobalSnapshot();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public MutableSnapshot takeNestedMutableSnapshot(Function1 function10, Function1 function11) {
        return (MutableSnapshot)SnapshotKt.takeNewSnapshot(new Function1(function11) {
            final Function1 $readObserver;
            final Function1 $writeObserver;

            {
                this.$readObserver = function10;
                this.$writeObserver = function11;
                super(1);
            }

            public final MutableSnapshot invoke(SnapshotIdSet snapshotIdSet0) {
                Intrinsics.checkNotNullParameter(snapshotIdSet0, "invalid");
                synchronized(SnapshotKt.getLock()) {
                    SnapshotKt.nextSnapshotId = 3;
                }
                return new MutableSnapshot(2, snapshotIdSet0, this.$readObserver, this.$writeObserver);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((SnapshotIdSet)object0));
            }
        });
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public Snapshot takeNestedSnapshot(Function1 function10) {
        return SnapshotKt.takeNewSnapshot(new Function1() {
            final Function1 $readObserver;

            {
                this.$readObserver = function10;
                super(1);
            }

            public final ReadonlySnapshot invoke(SnapshotIdSet snapshotIdSet0) {
                Intrinsics.checkNotNullParameter(snapshotIdSet0, "invalid");
                synchronized(SnapshotKt.getLock()) {
                    SnapshotKt.nextSnapshotId = 3;
                }
                return new ReadonlySnapshot(2, snapshotIdSet0, this.$readObserver);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((SnapshotIdSet)object0));
            }
        });
    }
}

