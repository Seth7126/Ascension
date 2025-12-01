package androidx.compose.ui.node;

import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0002\u0010\u0006R\u001A\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/OnGloballyPositionedModifierWrapper;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/OnGloballyPositionedModifier;)V", "providedAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getProvidedAlignmentLines", "()Ljava/util/Set;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class OnGloballyPositionedModifierWrapper extends DelegatingLayoutNodeWrapper {
    public OnGloballyPositionedModifierWrapper(LayoutNodeWrapper layoutNodeWrapper0, OnGloballyPositionedModifier onGloballyPositionedModifier0) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "wrapped");
        Intrinsics.checkNotNullParameter(onGloballyPositionedModifier0, "modifier");
        super(layoutNodeWrapper0, onGloballyPositionedModifier0);
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public Set getProvidedAlignmentLines() {
        Set set0 = new LinkedHashSet();
        for(LayoutNodeWrapper layoutNodeWrapper0 = this.getWrapped$ui_release(); layoutNodeWrapper0 != null; layoutNodeWrapper0 = layoutNodeWrapper0.getWrapped$ui_release()) {
            CollectionsKt.addAll(set0, layoutNodeWrapper0.getProvidedAlignmentLines());
            if(Intrinsics.areEqual(layoutNodeWrapper0, this.getLayoutNode$ui_release().getInnerLayoutNodeWrapper$ui_release())) {
                break;
            }
        }
        return set0;
    }
}

