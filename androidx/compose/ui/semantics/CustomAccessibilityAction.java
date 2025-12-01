package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001B\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\f\u001A\u00020\u00062\b\u0010\r\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000E\u001A\u00020\u000FH\u0016J\b\u0010\u0010\u001A\u00020\u0003H\u0016R\u0017\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000B¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "", "label", "", "action", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "getLabel", "()Ljava/lang/String;", "equals", "other", "hashCode", "", "toString", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class CustomAccessibilityAction {
    public static final int $stable;
    private final Function0 action;
    private final String label;

    static {
    }

    public CustomAccessibilityAction(String s, Function0 function00) {
        Intrinsics.checkNotNullParameter(s, "label");
        Intrinsics.checkNotNullParameter(function00, "action");
        super();
        this.label = s;
        this.action = function00;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CustomAccessibilityAction)) {
            return false;
        }
        return Intrinsics.areEqual(this.label, ((CustomAccessibilityAction)object0).label) ? Intrinsics.areEqual(this.action, ((CustomAccessibilityAction)object0).action) : false;
    }

    public final Function0 getAction() {
        return this.action;
    }

    public final String getLabel() {
        return this.label;
    }

    @Override
    public int hashCode() {
        return this.label.hashCode() * 0x1F + this.action.hashCode();
    }

    @Override
    public String toString() {
        return "CustomAccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}

