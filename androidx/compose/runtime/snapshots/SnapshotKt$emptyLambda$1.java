package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SnapshotKt.emptyLambda.1 extends Lambda implements Function1 {
    public static final SnapshotKt.emptyLambda.1 INSTANCE;

    static {
        SnapshotKt.emptyLambda.1.INSTANCE = new SnapshotKt.emptyLambda.1();
    }

    SnapshotKt.emptyLambda.1() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.invoke(((SnapshotIdSet)object0));
        return Unit.INSTANCE;
    }

    public final void invoke(SnapshotIdSet snapshotIdSet0) {
        Intrinsics.checkNotNullParameter(snapshotIdSet0, "it");
    }
}

