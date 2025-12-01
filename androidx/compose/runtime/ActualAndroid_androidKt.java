package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A/\u0010\n\u001A\b\u0012\u0004\u0012\u0002H\f0\u000B\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001A\u0002H\f2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u0002H\f0\u000FH\u0000¢\u0006\u0002\u0010\u0010\"!\u0010\u0000\u001A\u00020\u00018FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005\"\u000E\u0010\b\u001A\u00020\tX\u0082T¢\u0006\u0002\n\u0000*\f\b\u0000\u0010\u0011\"\u00020\u00122\u00020\u0012¨\u0006\u0013"}, d2 = {"DefaultMonotonicFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;", "getDefaultMonotonicFrameClock$annotations", "()V", "getDefaultMonotonicFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "DefaultMonotonicFrameClock$delegate", "Lkotlin/Lazy;", "DisallowDefaultMonotonicFrameClock", "", "createSnapshotMutableState", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "T", "value", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "CheckResult", "Landroidx/annotation/CheckResult;", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ActualAndroid_androidKt {
    private static final Lazy DefaultMonotonicFrameClock$delegate;
    private static final boolean DisallowDefaultMonotonicFrameClock;

    static {
        ActualAndroid_androidKt.DefaultMonotonicFrameClock$delegate = LazyKt.lazy(ActualAndroid_androidKt.DefaultMonotonicFrameClock.2.INSTANCE);
    }

    public static final SnapshotMutableState createSnapshotMutableState(Object object0, SnapshotMutationPolicy snapshotMutationPolicy0) {
        Intrinsics.checkNotNullParameter(snapshotMutationPolicy0, "policy");
        return new ParcelableSnapshotMutableState(object0, snapshotMutationPolicy0);
    }

    public static final MonotonicFrameClock getDefaultMonotonicFrameClock() {
        return (MonotonicFrameClock)ActualAndroid_androidKt.DefaultMonotonicFrameClock$delegate.getValue();
    }

    @Deprecated(message = "MonotonicFrameClocks are not globally applicable across platforms. Use an appropriate local clock.")
    public static void getDefaultMonotonicFrameClock$annotations() {
    }
}

