package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0014B\u0015\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u0003H\u0096\u0002J\u0013\u0010\r\u001A\u00020\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FH\u0096\u0002J\b\u0010\u0010\u001A\u00020\u0003H\u0016J\b\u0010\u0011\u001A\u00020\u000BH\u0016J\b\u0010\u0012\u001A\u00020\u0013H\u0016R\u0014\u0010\u0005\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(II)V", "getEndInclusive", "()Ljava/lang/Integer;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class IntRange extends IntProgression implements ClosedRange {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/IntRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/IntRange;", "getEMPTY", "()Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final IntRange getEMPTY() {
            return IntRange.EMPTY;
        }
    }

    public static final Companion Companion;
    private static final IntRange EMPTY;

    static {
        IntRange.Companion = new Companion(null);
        IntRange.EMPTY = new IntRange(1, 0);
    }

    public IntRange(int v, int v1) {
        super(v, v1, 1);
    }

    public boolean contains(int v) {
        return this.getFirst() <= v && v <= this.getLast();
    }

    @Override  // kotlin.ranges.ClosedRange
    public boolean contains(Comparable comparable0) {
        return this.contains(((Number)comparable0).intValue());
    }

    // 去混淆评级： 低(30)
    @Override  // kotlin.ranges.IntProgression
    public boolean equals(Object object0) {
        return object0 instanceof IntRange && (this.isEmpty() && ((IntRange)object0).isEmpty() || this.getFirst() == ((IntRange)object0).getFirst() && this.getLast() == ((IntRange)object0).getLast());
    }

    @Override  // kotlin.ranges.ClosedRange
    public Comparable getEndInclusive() {
        return this.getEndInclusive();
    }

    public Integer getEndInclusive() {
        return this.getLast();
    }

    @Override  // kotlin.ranges.ClosedRange
    public Comparable getStart() {
        return this.getStart();
    }

    public Integer getStart() {
        return this.getFirst();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.ranges.IntProgression
    public int hashCode() {
        return this.isEmpty() ? -1 : this.getFirst() * 0x1F + this.getLast();
    }

    @Override  // kotlin.ranges.IntProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return this.getFirst() > this.getLast();
    }

    @Override  // kotlin.ranges.IntProgression
    public String toString() {
        return this.getFirst() + ".." + this.getLast();
    }
}

