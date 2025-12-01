package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapper", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class LayoutNodeWrapper.Companion.onCommitAffectingLayerParams.1 extends Lambda implements Function1 {
    public static final LayoutNodeWrapper.Companion.onCommitAffectingLayerParams.1 INSTANCE;

    static {
        LayoutNodeWrapper.Companion.onCommitAffectingLayerParams.1.INSTANCE = new LayoutNodeWrapper.Companion.onCommitAffectingLayerParams.1();
    }

    LayoutNodeWrapper.Companion.onCommitAffectingLayerParams.1() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.invoke(((LayoutNodeWrapper)object0));
        return Unit.INSTANCE;
    }

    public final void invoke(LayoutNodeWrapper layoutNodeWrapper0) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "wrapper");
        if(layoutNodeWrapper0.isValid()) {
            layoutNodeWrapper0.updateLayerParameters();
        }
    }
}

