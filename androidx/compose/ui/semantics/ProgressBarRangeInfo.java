package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001A\u00020\u0007H\u0016J\b\u0010\u0013\u001A\u00020\u0014H\u0016R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "", "current", "", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "steps", "", "(FLkotlin/ranges/ClosedFloatingPointRange;I)V", "getCurrent", "()F", "getRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "getSteps", "()I", "equals", "", "other", "hashCode", "toString", "", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ProgressBarRangeInfo {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/semantics/ProgressBarRangeInfo$Companion;", "", "()V", "Indeterminate", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "getIndeterminate", "()Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final ProgressBarRangeInfo getIndeterminate() {
            return ProgressBarRangeInfo.Indeterminate;
        }
    }

    public static final int $stable;
    public static final Companion Companion;
    private static final ProgressBarRangeInfo Indeterminate;
    private final float current;
    private final ClosedFloatingPointRange range;
    private final int steps;

    static {
        ProgressBarRangeInfo.Companion = new Companion(null);
        ProgressBarRangeInfo.Indeterminate = new ProgressBarRangeInfo(0.0f, RangesKt.rangeTo(0.0f, 0.0f), 0, 4, null);
    }

    public ProgressBarRangeInfo(float f, ClosedFloatingPointRange closedFloatingPointRange0, int v) {
        Intrinsics.checkNotNullParameter(closedFloatingPointRange0, "range");
        super();
        this.current = f;
        this.range = closedFloatingPointRange0;
        this.steps = v;
    }

    public ProgressBarRangeInfo(float f, ClosedFloatingPointRange closedFloatingPointRange0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(f, closedFloatingPointRange0, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ProgressBarRangeInfo)) {
            return false;
        }
        if(this.current != ((ProgressBarRangeInfo)object0).current) {
            return false;
        }
        return Intrinsics.areEqual(this.range, ((ProgressBarRangeInfo)object0).range) ? this.steps == ((ProgressBarRangeInfo)object0).steps : false;
    }

    public final float getCurrent() {
        return this.current;
    }

    public final ClosedFloatingPointRange getRange() {
        return this.range;
    }

    public final int getSteps() {
        return this.steps;
    }

    @Override
    public int hashCode() {
        return (Float.floatToIntBits(this.current) * 0x1F + this.range.hashCode()) * 0x1F + this.steps;
    }

    @Override
    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.current + ", range=" + this.range + ", steps=" + this.steps + ')';
    }
}

