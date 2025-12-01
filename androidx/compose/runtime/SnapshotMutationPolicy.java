package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001D\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0006\u001A\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\'\u0010\b\u001A\u0004\u0018\u00018\u00002\u0006\u0010\t\u001A\u00028\u00002\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/SnapshotMutationPolicy;", "T", "", "equivalent", "", "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "merge", "previous", "current", "applied", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface SnapshotMutationPolicy {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object merge(SnapshotMutationPolicy snapshotMutationPolicy0, Object object0, Object object1, Object object2) {
            Intrinsics.checkNotNullParameter(snapshotMutationPolicy0, "this");
            return null;
        }
    }

    boolean equivalent(Object arg1, Object arg2);

    Object merge(Object arg1, Object arg2, Object arg3);
}

