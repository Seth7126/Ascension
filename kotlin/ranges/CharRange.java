package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u0015\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u0003H\u0096\u0002J\u0013\u0010\r\u001A\u00020\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FH\u0096\u0002J\b\u0010\u0010\u001A\u00020\u0011H\u0016J\b\u0010\u0012\u001A\u00020\u000BH\u0016J\b\u0010\u0013\u001A\u00020\u0014H\u0016R\u0014\u0010\u0005\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lkotlin/ranges/CharRange;", "Lkotlin/ranges/CharProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(CC)V", "getEndInclusive", "()Ljava/lang/Character;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class CharRange extends CharProgression implements ClosedRange {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/CharRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/CharRange;", "getEMPTY", "()Lkotlin/ranges/CharRange;", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final CharRange getEMPTY() {
            return CharRange.EMPTY;
        }
    }

    public static final Companion Companion;
    private static final CharRange EMPTY;

    static {
        CharRange.Companion = new Companion(null);
        CharRange.EMPTY = new CharRange('\u0001', '\u0000');
    }

    public CharRange(char c, char c1) {
        super(c, c1, 1);
    }

    public boolean contains(char c) {
        return Intrinsics.compare(this.getFirst(), c) <= 0 && Intrinsics.compare(c, this.getLast()) <= 0;
    }

    @Override  // kotlin.ranges.ClosedRange
    public boolean contains(Comparable comparable0) {
        return this.contains(((Character)comparable0).charValue());
    }

    // 去混淆评级： 低(30)
    @Override  // kotlin.ranges.CharProgression
    public boolean equals(Object object0) {
        return object0 instanceof CharRange && (this.isEmpty() && ((CharRange)object0).isEmpty() || this.getFirst() == ((CharRange)object0).getFirst() && this.getLast() == ((CharRange)object0).getLast());
    }

    public Character getEndInclusive() {
        return Character.valueOf(this.getLast());
    }

    @Override  // kotlin.ranges.ClosedRange
    public Comparable getEndInclusive() {
        return this.getEndInclusive();
    }

    public Character getStart() {
        return Character.valueOf(this.getFirst());
    }

    @Override  // kotlin.ranges.ClosedRange
    public Comparable getStart() {
        return this.getStart();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.ranges.CharProgression
    public int hashCode() {
        return this.isEmpty() ? -1 : this.getFirst() * 0x1F + this.getLast();
    }

    @Override  // kotlin.ranges.CharProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return Intrinsics.compare(this.getFirst(), this.getLast()) > 0;
    }

    @Override  // kotlin.ranges.CharProgression
    public String toString() {
        return this.getFirst() + ".." + this.getLast();
    }
}

