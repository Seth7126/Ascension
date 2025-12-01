package kotlin.ranges;

import kotlin.Metadata;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0018\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001B\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u0003H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u0013\u0010\u000F\u001A\u00020\u000B2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001A\u00020\u0013H\u0016J\b\u0010\u0014\u001A\u00020\u000BH\u0016J\b\u0010\u0015\u001A\u00020\u0016H\u0016R\u001A\u0010\u0005\u001A\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u001A\u0010\u0004\u001A\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\t\u0010\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/ULongRange;", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/ULong;", "start", "endInclusive", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEndInclusive-s-VKNKU", "()J", "getStart-s-VKNKU", "contains", "", "value", "contains-VKZWuLQ", "(J)Z", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class ULongRange extends ULongProgression implements ClosedRange {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/ULongRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/ULongRange;", "getEMPTY", "()Lkotlin/ranges/ULongRange;", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final ULongRange getEMPTY() {
            return ULongRange.EMPTY;
        }
    }

    public static final Companion Companion;
    private static final ULongRange EMPTY;

    static {
        ULongRange.Companion = new Companion(null);
        ULongRange.EMPTY = new ULongRange(-1L, 0L);
    }

    private ULongRange(long v, long v1) {
        super(v, v1, 1L, null);
    }

    public ULongRange(long v, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1);
    }

    @Override  // kotlin.ranges.ClosedRange
    public boolean contains(Comparable comparable0) {
        return this.contains-VKZWuLQ(((ULong)comparable0).unbox-impl());
    }

    public boolean contains-VKZWuLQ(long v) {
        return UnsignedKt.ulongCompare(this.getFirst-s-VKNKU(), v) <= 0 && UnsignedKt.ulongCompare(v, this.getLast-s-VKNKU()) <= 0;
    }

    // 去混淆评级： 低(30)
    @Override  // kotlin.ranges.ULongProgression
    public boolean equals(Object object0) {
        return object0 instanceof ULongRange && (this.isEmpty() && ((ULongRange)object0).isEmpty() || this.getFirst-s-VKNKU() == ((ULongRange)object0).getFirst-s-VKNKU() && this.getLast-s-VKNKU() == ((ULongRange)object0).getLast-s-VKNKU());
    }

    @Override  // kotlin.ranges.ClosedRange
    public Comparable getEndInclusive() {
        return ULong.box-impl(this.getEndInclusive-s-VKNKU());
    }

    public long getEndInclusive-s-VKNKU() {
        return this.getLast-s-VKNKU();
    }

    @Override  // kotlin.ranges.ClosedRange
    public Comparable getStart() {
        return ULong.box-impl(this.getStart-s-VKNKU());
    }

    public long getStart-s-VKNKU() {
        return this.getFirst-s-VKNKU();
    }

    @Override  // kotlin.ranges.ULongProgression
    public int hashCode() {
        if(this.isEmpty()) {
            return -1;
        }
        long v = this.getFirst-s-VKNKU();
        long v1 = ULong.constructor-impl(this.getFirst-s-VKNKU() >>> 0x20);
        return ((int)ULong.constructor-impl(this.getLast-s-VKNKU() ^ ULong.constructor-impl(this.getLast-s-VKNKU() >>> 0x20))) + ((int)(v ^ v1)) * 0x1F;
    }

    @Override  // kotlin.ranges.ULongProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return UnsignedKt.ulongCompare(this.getFirst-s-VKNKU(), this.getLast-s-VKNKU()) > 0;
    }

    @Override  // kotlin.ranges.ULongProgression
    public String toString() {
        return ULong.toString-impl(this.getFirst-s-VKNKU()) + ".." + ULong.toString-impl(this.getLast-s-VKNKU());
    }
}

