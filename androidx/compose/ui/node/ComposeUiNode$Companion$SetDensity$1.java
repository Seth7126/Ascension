package androidx.compose.ui.node;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\n"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/unit/Density;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class ComposeUiNode.Companion.SetDensity.1 extends Lambda implements Function2 {
    public static final ComposeUiNode.Companion.SetDensity.1 INSTANCE;

    static {
        ComposeUiNode.Companion.SetDensity.1.INSTANCE = new ComposeUiNode.Companion.SetDensity.1();
    }

    ComposeUiNode.Companion.SetDensity.1() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        this.invoke(((ComposeUiNode)object0), ((Density)object1));
        return Unit.INSTANCE;
    }

    public final void invoke(ComposeUiNode composeUiNode0, Density density0) {
        Intrinsics.checkNotNullParameter(composeUiNode0, "$this$null");
        Intrinsics.checkNotNullParameter(density0, "it");
        composeUiNode0.setDensity(density0);
    }
}

