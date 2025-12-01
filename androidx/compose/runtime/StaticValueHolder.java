package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001A\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000E\u0010\b\u001A\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001E\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001A\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u000EHÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001R\u0016\u0010\u0003\u001A\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/StaticValueHolder;", "T", "Landroidx/compose/runtime/State;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Landroidx/compose/runtime/StaticValueHolder;", "equals", "", "other", "", "hashCode", "", "toString", "", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class StaticValueHolder implements State {
    private final Object value;

    public StaticValueHolder(Object object0) {
        this.value = object0;
    }

    public final Object component1() {
        return this.getValue();
    }

    public final StaticValueHolder copy(Object object0) {
        return new StaticValueHolder(object0);
    }

    public static StaticValueHolder copy$default(StaticValueHolder staticValueHolder0, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            object0 = staticValueHolder0.getValue();
        }
        return staticValueHolder0.copy(object0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof StaticValueHolder ? Intrinsics.areEqual(this.getValue(), ((StaticValueHolder)object0).getValue()) : false;
    }

    @Override  // androidx.compose.runtime.State
    public Object getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        return this.getValue() == null ? 0 : this.getValue().hashCode();
    }

    @Override
    public String toString() {
        return "StaticValueHolder(value=" + this.getValue() + ')';
    }
}

