package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001!B\u001B\u0012\u0006\u0010\u0004\u001A\u00028\u0000\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u000E\u0010\u0016\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0013J\u0015\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u0018H\u0096\u0002J\"\u0010\u001A\u001A\u0004\u0018\u00010\t2\u0006\u0010\u001B\u001A\u00020\t2\u0006\u0010\u001C\u001A\u00020\t2\u0006\u0010\u001D\u001A\u00020\tH\u0016J\u0010\u0010\u001E\u001A\u00020\u00192\u0006\u0010\u0004\u001A\u00020\tH\u0016J\b\u0010\u001F\u001A\u00020 H\u0016R\u0014\u0010\b\u001A\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000BR\u0014\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u000E¢\u0006\u0002\n\u0000R\u001A\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR*\u0010\u0004\u001A\u00028\u00002\u0006\u0010\u0004\u001A\u00028\u00008V@VX\u0096\u000E¢\u0006\u0012\u0012\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Landroidx/compose/runtime/SnapshotMutableStateImpl;", "T", "Landroidx/compose/runtime/snapshots/StateObject;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "value", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "next", "Landroidx/compose/runtime/SnapshotMutableStateImpl$StateStateRecord;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "getValue$annotations", "()V", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "component1", "component2", "Lkotlin/Function1;", "", "mergeRecords", "previous", "current", "applied", "prependStateRecord", "toString", "", "StateStateRecord", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public class SnapshotMutableStateImpl implements SnapshotMutableState, StateObject {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001A\u00028\u0001¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u0002H\u0016J\b\u0010\f\u001A\u00020\u0002H\u0016R\u001C\u0010\u0005\u001A\u00028\u0001X\u0086\u000E¢\u0006\u0010\n\u0002\u0010\t\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableStateImpl$StateStateRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "myValue", "(Ljava/lang/Object;)V", "value", "getValue", "()Ljava/lang/Object;", "setValue", "Ljava/lang/Object;", "assign", "", "create", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class StateStateRecord extends StateRecord {
        private Object value;

        public StateStateRecord(Object object0) {
            this.value = object0;
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord0) {
            Intrinsics.checkNotNullParameter(stateRecord0, "value");
            this.value = ((StateStateRecord)stateRecord0).value;
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new StateStateRecord(this.value);
        }

        public final Object getValue() {
            return this.value;
        }

        public final void setValue(Object object0) {
            this.value = object0;
        }
    }

    private StateStateRecord next;
    private final SnapshotMutationPolicy policy;

    public SnapshotMutableStateImpl(Object object0, SnapshotMutationPolicy snapshotMutationPolicy0) {
        Intrinsics.checkNotNullParameter(snapshotMutationPolicy0, "policy");
        super();
        this.policy = snapshotMutationPolicy0;
        this.next = new StateStateRecord(object0);
    }

    @Override  // androidx.compose.runtime.MutableState
    public Object component1() {
        return this.getValue();
    }

    @Override  // androidx.compose.runtime.MutableState
    public Function1 component2() {
        return new Function1() {
            {
                SnapshotMutableStateImpl.this = snapshotMutableStateImpl0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(object0);
                return Unit.INSTANCE;
            }

            public final void invoke(Object object0) {
                SnapshotMutableStateImpl.this.setValue(object0);
            }
        };
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override  // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy getPolicy() {
        return this.policy;
    }

    @Override  // androidx.compose.runtime.MutableState
    public Object getValue() {
        return ((StateStateRecord)SnapshotKt.readable(this.next, this)).getValue();
    }

    public static void getValue$annotations() {
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord0, StateRecord stateRecord1, StateRecord stateRecord2) {
        Intrinsics.checkNotNullParameter(stateRecord0, "previous");
        Intrinsics.checkNotNullParameter(stateRecord1, "current");
        Intrinsics.checkNotNullParameter(stateRecord2, "applied");
        if(!this.getPolicy().equivalent(((StateStateRecord)stateRecord1).getValue(), ((StateStateRecord)stateRecord2).getValue())) {
            Object object0 = this.getPolicy().merge(((StateStateRecord)stateRecord0).getValue(), ((StateStateRecord)stateRecord1).getValue(), ((StateStateRecord)stateRecord2).getValue());
            if(object0 != null) {
                stateRecord1 = ((StateStateRecord)stateRecord2).create();
                ((StateStateRecord)stateRecord1).setValue(object0);
                return stateRecord1;
            }
            return null;
        }
        return stateRecord1;
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord0) {
        Intrinsics.checkNotNullParameter(stateRecord0, "value");
        this.next = (StateStateRecord)stateRecord0;
    }

    @Override  // androidx.compose.runtime.MutableState
    public void setValue(Object object0) {
        Snapshot snapshot0;
        StateStateRecord snapshotMutableStateImpl$StateStateRecord0 = (StateStateRecord)SnapshotKt.current(this.next, Snapshot.Companion.getCurrent());
        if(!this.getPolicy().equivalent(snapshotMutableStateImpl$StateStateRecord0.getValue(), object0)) {
            StateRecord stateRecord0 = this.next;
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                ((StateStateRecord)SnapshotKt.overwritableRecord(stateRecord0, this, snapshot0, snapshotMutableStateImpl$StateStateRecord0)).setValue(object0);
            }
            SnapshotKt.notifyWrite(snapshot0, this);
        }
    }

    @Override
    public String toString() {
        return "MutableState(value=" + ((StateStateRecord)SnapshotKt.current(this.next, Snapshot.Companion.getCurrent())).getValue() + ")@" + this.hashCode();
    }
}

