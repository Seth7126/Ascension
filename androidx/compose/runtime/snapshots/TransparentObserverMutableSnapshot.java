package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0003\u001A\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001A\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u00A2\u0006\u0002\u0010\bJ\b\u0010\'\u001A\u00020(H\u0016J\b\u0010)\u001A\u00020\u0006H\u0016J\b\u0010*\u001A\u00020!H\u0016J\u0015\u0010+\u001A\u00020,2\u0006\u0010-\u001A\u00020.H\u0010\u00A2\u0006\u0002\b/J\u0015\u00100\u001A\u00020,2\u0006\u0010-\u001A\u00020.H\u0010\u00A2\u0006\u0002\b1J\r\u00102\u001A\u00020\u0006H\u0010\u00A2\u0006\u0002\b3J\u0015\u00104\u001A\u00020\u00062\u0006\u00105\u001A\u00020\u001AH\u0010\u00A2\u0006\u0002\b6J4\u00107\u001A\u00020\u00012\u0014\u00108\u001A\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0014\u00109\u001A\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016J\u001E\u0010:\u001A\u00020.2\u0014\u00108\u001A\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016R\u0014\u0010\t\u001A\u00020\u00018BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\n\u0010\u000BR$\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\r8V@PX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001A\u00020\u00132\u0006\u0010\f\u001A\u00020\u00138P@PX\u0090\u000E\u00A2\u0006\f\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R4\u0010\u001B\u001A\n\u0012\u0004\u0012\u00020\u001A\u0018\u00010\u00192\u000E\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u001A\u0018\u00010\u00198P@VX\u0090\u000E\u00A2\u0006\f\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR\u0010\u0010\u0002\u001A\u0004\u0018\u00010\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010 \u001A\u00020!8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\"\u0010#R\"\u0010\u0003\u001A\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b$\u0010%R\"\u0010\u0007\u001A\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b&\u0010%\u00A8\u0006;"}, d2 = {"Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "previousSnapshot", "specifiedReadObserver", "Lkotlin/Function1;", "", "", "specifiedWriteObserver", "(Landroidx/compose/runtime/snapshots/MutableSnapshot;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "currentSnapshot", "getCurrentSnapshot", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "value", "", "id", "getId", "()I", "setId$runtime_release", "(I)V", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "", "Landroidx/compose/runtime/snapshots/StateObject;", "modified", "getModified$runtime_release", "()Ljava/util/Set;", "setModified", "(Ljava/util/Set;)V", "readOnly", "", "getReadOnly", "()Z", "getSpecifiedReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "getSpecifiedWriteObserver$runtime_release", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "dispose", "hasPendingChanges", "nestedActivated", "", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "recordModified", "state", "recordModified$runtime_release", "takeNestedMutableSnapshot", "readObserver", "writeObserver", "takeNestedSnapshot", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TransparentObserverMutableSnapshot extends MutableSnapshot {
    private final MutableSnapshot previousSnapshot;
    private final Function1 specifiedReadObserver;
    private final Function1 specifiedWriteObserver;

    public TransparentObserverMutableSnapshot(MutableSnapshot mutableSnapshot0, Function1 function10, Function1 function11) {
        SnapshotIdSet snapshotIdSet0 = SnapshotIdSet.Companion.getEMPTY();
        Function1 function12 = null;
        Function1 function13 = mutableSnapshot0 == null ? null : mutableSnapshot0.getReadObserver$runtime_release();
        if(function13 == null) {
            function13 = ((GlobalSnapshot)SnapshotKt.currentGlobalSnapshot.get()).getReadObserver$runtime_release();
        }
        Function1 function14 = SnapshotKt.mergedReadObserver(function10, function13);
        if(mutableSnapshot0 != null) {
            function12 = mutableSnapshot0.getWriteObserver$runtime_release();
        }
        if(function12 == null) {
            function12 = ((GlobalSnapshot)SnapshotKt.currentGlobalSnapshot.get()).getWriteObserver$runtime_release();
        }
        super(0, snapshotIdSet0, function14, SnapshotKt.mergedWriteObserver(function11, function12));
        this.previousSnapshot = mutableSnapshot0;
        this.specifiedReadObserver = function10;
        this.specifiedWriteObserver = function11;
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() {
        return this.getCurrentSnapshot().apply();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void dispose() {
        this.setDisposed$runtime_release(true);
    }

    private final MutableSnapshot getCurrentSnapshot() {
        MutableSnapshot mutableSnapshot0 = this.previousSnapshot;
        if(mutableSnapshot0 == null) {
            Object object0 = SnapshotKt.currentGlobalSnapshot.get();
            Intrinsics.checkNotNullExpressionValue(object0, "currentGlobalSnapshot.get()");
            return (MutableSnapshot)object0;
        }
        return mutableSnapshot0;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public int getId() {
        return this.getCurrentSnapshot().getId();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public SnapshotIdSet getInvalid$runtime_release() {
        return this.getCurrentSnapshot().getInvalid$runtime_release();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public Set getModified$runtime_release() {
        return this.getCurrentSnapshot().getModified$runtime_release();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public boolean getReadOnly() {
        return this.getCurrentSnapshot().getReadOnly();
    }

    public final Function1 getSpecifiedReadObserver$runtime_release() {
        return this.specifiedReadObserver;
    }

    public final Function1 getSpecifiedWriteObserver$runtime_release() {
        return this.specifiedWriteObserver;
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public boolean hasPendingChanges() {
        return this.getCurrentSnapshot().hasPendingChanges();
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
        this.getCurrentSnapshot().notifyObjectsInitialized$runtime_release();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void recordModified$runtime_release(StateObject stateObject0) {
        Intrinsics.checkNotNullParameter(stateObject0, "state");
        this.getCurrentSnapshot().recordModified$runtime_release(stateObject0);
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void setId$runtime_release(int v) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void setInvalid$runtime_release(SnapshotIdSet snapshotIdSet0) {
        Intrinsics.checkNotNullParameter(snapshotIdSet0, "value");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void setModified(Set set0) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public MutableSnapshot takeNestedMutableSnapshot(Function1 function10, Function1 function11) {
        return this.getCurrentSnapshot().takeNestedMutableSnapshot(SnapshotKt.mergedReadObserver(function10, this.getReadObserver$runtime_release()), SnapshotKt.mergedWriteObserver(function11, this.getWriteObserver$runtime_release()));
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public Snapshot takeNestedSnapshot(Function1 function10) {
        return this.getCurrentSnapshot().takeNestedSnapshot(SnapshotKt.mergedReadObserver(function10, this.getReadObserver$runtime_release()));
    }
}

