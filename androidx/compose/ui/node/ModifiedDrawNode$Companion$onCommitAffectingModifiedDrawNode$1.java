package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/node/ModifiedDrawNode;", "modifiedDrawNode", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class ModifiedDrawNode.Companion.onCommitAffectingModifiedDrawNode.1 extends Lambda implements Function1 {
    public static final ModifiedDrawNode.Companion.onCommitAffectingModifiedDrawNode.1 INSTANCE;

    static {
        ModifiedDrawNode.Companion.onCommitAffectingModifiedDrawNode.1.INSTANCE = new ModifiedDrawNode.Companion.onCommitAffectingModifiedDrawNode.1();
    }

    ModifiedDrawNode.Companion.onCommitAffectingModifiedDrawNode.1() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.invoke(((ModifiedDrawNode)object0));
        return Unit.INSTANCE;
    }

    public final void invoke(ModifiedDrawNode modifiedDrawNode0) {
        Intrinsics.checkNotNullParameter(modifiedDrawNode0, "modifiedDrawNode");
        if(modifiedDrawNode0.isValid()) {
            modifiedDrawNode0.invalidateCache = true;
            modifiedDrawNode0.invalidateLayer();
        }
    }
}

