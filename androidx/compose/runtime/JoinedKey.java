package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0004J\u000B\u0010\b\u001A\u0004\u0018\u00010\u0001HÆ\u0003J\u000B\u0010\t\u001A\u0004\u0018\u00010\u0001HÆ\u0003J!\u0010\n\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u000E\u001A\u00020\u000FH\u0016J\u0012\u0010\u0010\u001A\u00020\u000F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001H\u0002J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0003\u001A\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\u0006¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/JoinedKey;", "", "left", "right", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getLeft", "()Ljava/lang/Object;", "getRight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "hashCodeOf", "value", "toString", "", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class JoinedKey {
    private final Object left;
    private final Object right;

    public JoinedKey(Object object0, Object object1) {
        this.left = object0;
        this.right = object1;
    }

    public final Object component1() {
        return this.left;
    }

    public final Object component2() {
        return this.right;
    }

    public final JoinedKey copy(Object object0, Object object1) {
        return new JoinedKey(object0, object1);
    }

    public static JoinedKey copy$default(JoinedKey joinedKey0, Object object0, Object object1, int v, Object object2) {
        if((v & 1) != 0) {
            object0 = joinedKey0.left;
        }
        if((v & 2) != 0) {
            object1 = joinedKey0.right;
        }
        return joinedKey0.copy(object0, object1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof JoinedKey)) {
            return false;
        }
        return Intrinsics.areEqual(this.left, ((JoinedKey)object0).left) ? Intrinsics.areEqual(this.right, ((JoinedKey)object0).right) : false;
    }

    public final Object getLeft() {
        return this.left;
    }

    public final Object getRight() {
        return this.right;
    }

    @Override
    public int hashCode() {
        return this.hashCodeOf(this.left) * 0x1F + this.hashCodeOf(this.right);
    }

    private final int hashCodeOf(Object object0) {
        if(object0 instanceof Enum) {
            return ((Enum)object0).ordinal();
        }
        return object0 == null ? 0 : object0.hashCode();
    }

    @Override
    public String toString() {
        return "JoinedKey(left=" + this.left + ", right=" + this.right + ')';
    }
}

