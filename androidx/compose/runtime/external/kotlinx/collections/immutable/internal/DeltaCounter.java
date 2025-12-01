package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000F\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001A\u00020\u000B2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001A\u00020\u0003HÖ\u0001J\u0011\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u0003H\u0086\u0002J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001R\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "", "count", "", "(I)V", "getCount", "()I", "setCount", "component1", "copy", "equals", "", "other", "hashCode", "plusAssign", "", "that", "toString", "", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DeltaCounter {
    private int count;

    public DeltaCounter() {
        this(0, 1, null);
    }

    public DeltaCounter(int v) {
        this.count = v;
    }

    public DeltaCounter(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v);
    }

    public final int component1() {
        return this.count;
    }

    public final DeltaCounter copy(int v) {
        return new DeltaCounter(v);
    }

    public static DeltaCounter copy$default(DeltaCounter deltaCounter0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = deltaCounter0.count;
        }
        return deltaCounter0.copy(v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof DeltaCounter ? this.count == ((DeltaCounter)object0).count : false;
    }

    public final int getCount() {
        return this.count;
    }

    @Override
    public int hashCode() {
        return this.count;
    }

    public final void plusAssign(int v) {
        this.count += v;
    }

    public final void setCount(int v) {
        this.count = v;
    }

    @Override
    public String toString() {
        return "DeltaCounter(count=" + this.count + ')';
    }
}

