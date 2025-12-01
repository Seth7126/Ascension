package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bR\u0017\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0017\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\n¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/semantics/ScrollAxisRange;", "", "value", "Lkotlin/Function0;", "", "maxValue", "reverseScrolling", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "getMaxValue", "()Lkotlin/jvm/functions/Function0;", "getReverseScrolling", "()Z", "getValue", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ScrollAxisRange {
    public static final int $stable;
    private final Function0 maxValue;
    private final boolean reverseScrolling;
    private final Function0 value;

    static {
    }

    public ScrollAxisRange(Function0 function00, Function0 function01, boolean z) {
        Intrinsics.checkNotNullParameter(function00, "value");
        Intrinsics.checkNotNullParameter(function01, "maxValue");
        super();
        this.value = function00;
        this.maxValue = function01;
        this.reverseScrolling = z;
    }

    public ScrollAxisRange(Function0 function00, Function0 function01, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            z = false;
        }
        this(function00, function01, z);
    }

    public final Function0 getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final Function0 getValue() {
        return this.value;
    }
}

