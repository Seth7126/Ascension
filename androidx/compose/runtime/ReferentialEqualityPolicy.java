package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001C\u0010\u0004\u001A\u00020\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u00022\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002H\u0016J\b\u0010\b\u001A\u00020\tH\u0016¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/ReferentialEqualityPolicy;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "", "()V", "equivalent", "", "a", "b", "toString", "", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class ReferentialEqualityPolicy implements SnapshotMutationPolicy {
    public static final ReferentialEqualityPolicy INSTANCE;

    static {
        ReferentialEqualityPolicy.INSTANCE = new ReferentialEqualityPolicy();
    }

    @Override  // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object object0, Object object1) {
        return object0 == object1;
    }

    @Override  // androidx.compose.runtime.SnapshotMutationPolicy
    public Object merge(Object object0, Object object1, Object object2) {
        return DefaultImpls.merge(this, object0, object1, object2);
    }

    @Override
    public String toString() {
        return "ReferentialEqualityPolicy";
    }
}

