package androidx.compose.ui.autofill;

import androidx.compose.ui.ExperimentalComposeUiApi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001D\u0010\t\u001A\u0004\u0018\u00010\n2\u0006\u0010\u000B\u001A\u00020\u00052\u0006\u0010\f\u001A\u00020\r¢\u0006\u0002\u0010\u000EJ\u0011\u0010\u000F\u001A\u00020\n2\u0006\u0010\u0010\u001A\u00020\u0006H\u0086\u0002R\u001D\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/autofill/AutofillTree;", "", "()V", "children", "", "", "Landroidx/compose/ui/autofill/AutofillNode;", "getChildren", "()Ljava/util/Map;", "performAutofill", "", "id", "value", "", "(ILjava/lang/String;)Lkotlin/Unit;", "plusAssign", "autofillNode", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AutofillTree {
    public static final int $stable = 8;
    private final Map children;

    static {
    }

    public AutofillTree() {
        this.children = new LinkedHashMap();
    }

    public final Map getChildren() {
        return this.children;
    }

    public final Unit performAutofill(int v, String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        AutofillNode autofillNode0 = (AutofillNode)this.children.get(v);
        if(autofillNode0 != null) {
            Function1 function10 = autofillNode0.getOnFill();
            if(function10 != null) {
                function10.invoke(s);
                return Unit.INSTANCE;
            }
        }
        return null;
    }

    public final void plusAssign(AutofillNode autofillNode0) {
        Intrinsics.checkNotNullParameter(autofillNode0, "autofillNode");
        this.children.put(autofillNode0.getId(), autofillNode0);
    }
}

