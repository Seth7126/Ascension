package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u0003H\u0016J\u0010\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u0003H&R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/snapshots/StateObject;", "", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "mergeRecords", "previous", "current", "applied", "prependStateRecord", "", "value", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface StateObject {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static StateRecord mergeRecords(StateObject stateObject0, StateRecord stateRecord0, StateRecord stateRecord1, StateRecord stateRecord2) {
            Intrinsics.checkNotNullParameter(stateObject0, "this");
            Intrinsics.checkNotNullParameter(stateRecord0, "previous");
            Intrinsics.checkNotNullParameter(stateRecord1, "current");
            Intrinsics.checkNotNullParameter(stateRecord2, "applied");
            return null;
        }
    }

    StateRecord getFirstStateRecord();

    StateRecord mergeRecords(StateRecord arg1, StateRecord arg2, StateRecord arg3);

    void prependStateRecord(StateRecord arg1);
}

