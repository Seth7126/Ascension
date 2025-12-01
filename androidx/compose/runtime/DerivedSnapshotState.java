package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject.DefaultImpls;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001FB\u0013\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J2\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F2\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F2\u0006\u0010\u0018\u001A\u00020\u00192\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J\b\u0010\u001A\u001A\u00020\u001BH\u0002J\u0010\u0010\u001C\u001A\u00020\u001D2\u0006\u0010\u0014\u001A\u00020\u0011H\u0016J\b\u0010\u001E\u001A\u00020\u001BH\u0016R\u0014\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001A\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u001A\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00020\u000B8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u0014\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u000FX\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001A\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001A\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\t¨\u0006 "}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", "T", "Landroidx/compose/runtime/snapshots/StateObject;", "Landroidx/compose/runtime/DerivedState;", "calculation", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "dependencies", "", "getDependencies", "()Ljava/util/Set;", "first", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "value", "getValue", "currentRecord", "readable", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "displayValue", "", "prependStateRecord", "", "toString", "ResultRecord", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class DerivedSnapshotState implements DerivedState, StateObject {
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0018\u001A\u00020\u00192\u0006\u0010\u001A\u001A\u00020\u0002H\u0016J\b\u0010\u001B\u001A\u00020\u0002H\u0016J\u001A\u0010\u001C\u001A\u00020\u001D2\n\u0010\u001E\u001A\u0006\u0012\u0002\b\u00030\u001F2\u0006\u0010 \u001A\u00020!J\u001A\u0010\"\u001A\u00020\u00132\n\u0010\u001E\u001A\u0006\u0012\u0002\b\u00030\u001F2\u0006\u0010 \u001A\u00020!R.\u0010\u0004\u001A\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR\u001E\u0010\f\u001A\u0004\u0018\u00018\u0001X\u0086\u000E¢\u0006\u0010\n\u0002\u0010\u0011\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u001A\u0010\u0012\u001A\u00020\u0013X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "()V", "dependencies", "Ljava/util/HashSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "Lkotlin/collections/HashSet;", "getDependencies", "()Ljava/util/HashSet;", "setDependencies", "(Ljava/util/HashSet;)V", "result", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "resultHash", "", "getResultHash", "()I", "setResultHash", "(I)V", "assign", "", "value", "create", "isValid", "", "derivedState", "Landroidx/compose/runtime/DerivedState;", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "readableHash", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class ResultRecord extends StateRecord {
        private HashSet dependencies;
        private Object result;
        private int resultHash;

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord0) {
            Intrinsics.checkNotNullParameter(stateRecord0, "value");
            this.dependencies = ((ResultRecord)stateRecord0).dependencies;
            this.result = ((ResultRecord)stateRecord0).result;
            this.resultHash = ((ResultRecord)stateRecord0).resultHash;
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new ResultRecord();
        }

        public final HashSet getDependencies() {
            return this.dependencies;
        }

        public final Object getResult() {
            return this.result;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final boolean isValid(DerivedState derivedState0, Snapshot snapshot0) {
            Intrinsics.checkNotNullParameter(derivedState0, "derivedState");
            Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
            return this.result != null && this.resultHash == this.readableHash(derivedState0, snapshot0);
        }

        public final int readableHash(DerivedState derivedState0, Snapshot snapshot0) {
            Intrinsics.checkNotNullParameter(derivedState0, "derivedState");
            Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
            Object object0 = SnapshotKt.getLock();
            __monitor_enter(object0);
            HashSet hashSet0 = this.getDependencies();
            __monitor_exit(object0);
            int v = 7;
            if(hashSet0 != null) {
                PersistentList persistentList0 = (PersistentList)SnapshotStateKt.derivedStateObservers.get();
                if(persistentList0 == null) {
                    persistentList0 = ExtensionsKt.persistentListOf();
                }
                int v1 = persistentList0.size();
                int v2 = 0;
                if(v1 - 1 >= 0) {
                    for(int v3 = 0; true; ++v3) {
                        ((Function1)((Pair)persistentList0.get(v3)).component1()).invoke(derivedState0);
                        if(v3 + 1 > v1 - 1) {
                            break;
                        }
                    }
                }
                try {
                    for(Object object1: hashSet0) {
                        StateRecord stateRecord0 = ((StateObject)object1).getFirstStateRecord();
                        Intrinsics.checkNotNullExpressionValue(((StateObject)object1), "stateObject");
                        StateRecord stateRecord1 = SnapshotKt.readable(stateRecord0, ((StateObject)object1), snapshot0);
                        v = (v * 0x1F + ActualJvm_jvmKt.identityHashCode(stateRecord1)) * 0x1F + stateRecord1.getSnapshotId$runtime_release();
                    }
                }
                catch(Throwable throwable0) {
                    int v4 = persistentList0.size();
                    if(v4 - 1 >= 0) {
                        while(true) {
                            ((Function1)((Pair)persistentList0.get(v2)).component2()).invoke(derivedState0);
                            if(v2 + 1 > v4 - 1) {
                                break;
                            }
                            ++v2;
                        }
                    }
                    throw throwable0;
                }
                int v5 = persistentList0.size();
                if(v5 - 1 >= 0) {
                    while(true) {
                        ((Function1)((Pair)persistentList0.get(v2)).component2()).invoke(derivedState0);
                        if(v2 + 1 > v5 - 1) {
                            break;
                        }
                        ++v2;
                    }
                }
            }
            return v;
        }

        public final void setDependencies(HashSet hashSet0) {
            this.dependencies = hashSet0;
        }

        public final void setResult(Object object0) {
            this.result = object0;
        }

        public final void setResultHash(int v) {
            this.resultHash = v;
        }
    }

    private final Function0 calculation;
    private ResultRecord first;

    public DerivedSnapshotState(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "calculation");
        super();
        this.calculation = function00;
        this.first = new ResultRecord();
    }

    private final ResultRecord currentRecord(ResultRecord derivedSnapshotState$ResultRecord0, Snapshot snapshot0, Function0 function00) {
        ResultRecord derivedSnapshotState$ResultRecord1;
        Object object0;
        if(derivedSnapshotState$ResultRecord0.isValid(this, snapshot0)) {
            return derivedSnapshotState$ResultRecord0;
        }
        HashSet hashSet0 = new HashSet();
        PersistentList persistentList0 = (PersistentList)SnapshotStateKt.derivedStateObservers.get();
        if(persistentList0 == null) {
            persistentList0 = ExtensionsKt.persistentListOf();
        }
        int v = persistentList0.size();
        int v1 = 0;
        if(v - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                ((Function1)((Pair)persistentList0.get(v2)).component1()).invoke(this);
                if(v2 + 1 > v - 1) {
                    break;
                }
            }
        }
        try {
            Function1 function10 = new Function1(hashSet0) {
                final HashSet $newDependencies;

                {
                    DerivedSnapshotState.this = derivedSnapshotState0;
                    this.$newDependencies = hashSet0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(object0);
                    return Unit.INSTANCE;
                }

                public final void invoke(Object object0) {
                    Intrinsics.checkNotNullParameter(object0, "it");
                    if(object0 == DerivedSnapshotState.this) {
                        throw new IllegalStateException("A derived state cannot calculation cannot read itself");
                    }
                    if(object0 instanceof StateObject) {
                        this.$newDependencies.add(object0);
                    }
                }
            };
            object0 = Snapshot.Companion.observe(function10, null, function00);
            int v3 = persistentList0.size();
        }
        catch(Throwable throwable0) {
            int v4 = persistentList0.size();
            if(v4 - 1 >= 0) {
                while(true) {
                    ((Function1)((Pair)persistentList0.get(v1)).component2()).invoke(this);
                    if(v1 + 1 > v4 - 1) {
                        break;
                    }
                    ++v1;
                }
            }
            throw throwable0;
        }
        if(v3 - 1 >= 0) {
            while(true) {
                ((Function1)((Pair)persistentList0.get(v1)).component2()).invoke(this);
                if(v1 + 1 > v3 - 1) {
                    break;
                }
                ++v1;
            }
        }
        synchronized(SnapshotKt.getLock()) {
            Snapshot snapshot1 = Snapshot.Companion.getCurrent();
            derivedSnapshotState$ResultRecord1 = (ResultRecord)SnapshotKt.newWritableRecord(this.first, this, snapshot1);
            derivedSnapshotState$ResultRecord1.setDependencies(hashSet0);
            derivedSnapshotState$ResultRecord1.setResultHash(derivedSnapshotState$ResultRecord1.readableHash(this, snapshot1));
            derivedSnapshotState$ResultRecord1.setResult(object0);
        }
        Snapshot.Companion.notifyObjectsInitialized();
        return derivedSnapshotState$ResultRecord1;
    }

    private final String displayValue() {
        ResultRecord derivedSnapshotState$ResultRecord0 = (ResultRecord)SnapshotKt.current(this.first, Snapshot.Companion.getCurrent());
        return derivedSnapshotState$ResultRecord0.isValid(this, Snapshot.Companion.getCurrent()) ? String.valueOf(derivedSnapshotState$ResultRecord0.getResult()) : "<Not calculated>";
    }

    @Override  // androidx.compose.runtime.DerivedState
    public Object getCurrentValue() {
        return this.currentRecord(((ResultRecord)SnapshotKt.current(this.first, Snapshot.Companion.getCurrent())), Snapshot.Companion.getCurrent(), this.calculation).getResult();
    }

    @Override  // androidx.compose.runtime.DerivedState
    public Set getDependencies() {
        HashSet hashSet0 = this.currentRecord(((ResultRecord)SnapshotKt.current(this.first, Snapshot.Companion.getCurrent())), Snapshot.Companion.getCurrent(), this.calculation).getDependencies();
        return hashSet0 == null ? SetsKt.emptySet() : hashSet0;
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override  // androidx.compose.runtime.State
    public Object getValue() {
        Function1 function10 = Snapshot.Companion.getCurrent().getReadObserver$runtime_release();
        if(function10 != null) {
            function10.invoke(this);
        }
        return this.getCurrentValue();
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord0, StateRecord stateRecord1, StateRecord stateRecord2) {
        return DefaultImpls.mergeRecords(this, stateRecord0, stateRecord1, stateRecord2);
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord0) {
        Intrinsics.checkNotNullParameter(stateRecord0, "value");
        this.first = (ResultRecord)stateRecord0;
    }

    @Override
    public String toString() {
        ResultRecord derivedSnapshotState$ResultRecord0 = (ResultRecord)SnapshotKt.current(this.first, Snapshot.Companion.getCurrent());
        return "DerivedState(value=" + this.displayValue() + ")@" + this.hashCode();
    }
}

