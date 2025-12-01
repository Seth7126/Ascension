package kotlin.ranges;

import kotlin.Metadata;
import kotlin.UInt;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0018\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001B\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u0003H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u0013\u0010\u000F\u001A\u00020\u000B2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001A\u00020\u0013H\u0016J\b\u0010\u0014\u001A\u00020\u000BH\u0016J\b\u0010\u0015\u001A\u00020\u0016H\u0016R\u001A\u0010\u0005\u001A\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u001A\u0010\u0004\u001A\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\t\u0010\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/UIntRange;", "Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/UInt;", "start", "endInclusive", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEndInclusive-pVg5ArA", "()I", "getStart-pVg5ArA", "contains", "", "value", "contains-WZ4Q5Ns", "(I)Z", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class UIntRange extends UIntProgression implements ClosedRange {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/UIntRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/UIntRange;", "getEMPTY", "()Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final UIntRange getEMPTY() {
            return UIntRange.EMPTY;
        }
    }

    public static final Companion Companion;
    private static final UIntRange EMPTY;

    static {
        UIntRange.Companion = new Companion(null);
        UIntRange.EMPTY = new UIntRange(-1, 0);
    }

    private UIntRange(int v, int v1) {
        super(v, v1, 1, null);
    }

    public UIntRange(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1);
    }

    @Override  // kotlin.ranges.ClosedRange
    public boolean contains(Comparable comparable0) {
        return this.contains-WZ4Q5Ns(((UInt)comparable0).unbox-impl());
    }

    public boolean contains-WZ4Q5Ns(int v) {
        return UnsignedKt.uintCompare(this.getFirst-pVg5ArA(), v) <= 0 && UnsignedKt.uintCompare(v, this.getLast-pVg5ArA()) <= 0;
    }

    // 去混淆评级： 低(30)
    @Override  // kotlin.ranges.UIntProgression
    public boolean equals(Object object0) {
        return object0 instanceof UIntRange && (this.isEmpty() && ((UIntRange)object0).isEmpty() || this.getFirst-pVg5ArA() == ((UIntRange)object0).getFirst-pVg5ArA() && this.getLast-pVg5ArA() == ((UIntRange)object0).getLast-pVg5ArA());
    }

    @Override  // kotlin.ranges.ClosedRange
    public Comparable getEndInclusive() {
        return UInt.box-impl(this.getEndInclusive-pVg5ArA());
    }

    public int getEndInclusive-pVg5ArA() {
        return this.getLast-pVg5ArA();
    }

    @Override  // kotlin.ranges.ClosedRange
    public Comparable getStart() {
        return UInt.box-impl(this.getStart-pVg5ArA());
    }

    public int getStart-pVg5ArA() {
        return this.getFirst-pVg5ArA();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.ranges.UIntProgression
    public int hashCode() {
        return this.isEmpty() ? -1 : this.getFirst-pVg5ArA() * 0x1F + this.getLast-pVg5ArA();
    }

    @Override  // kotlin.ranges.UIntProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return UnsignedKt.uintCompare(this.getFirst-pVg5ArA(), this.getLast-pVg5ArA()) > 0;
    }

    @Override  // kotlin.ranges.UIntProgression
    public String toString() {
        return UInt.toString-impl(this.getFirst-pVg5ArA()) + ".." + UInt.toString-impl(this.getLast-pVg5ArA());
    }
}

