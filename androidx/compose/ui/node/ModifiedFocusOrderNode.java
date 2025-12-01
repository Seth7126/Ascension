package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusOrder;
import androidx.compose.ui.focus.FocusOrderModifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/node/ModifiedFocusOrderNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/focus/FocusOrderModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/focus/FocusOrderModifier;)V", "populateFocusOrder", "", "focusOrder", "Landroidx/compose/ui/focus/FocusOrder;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ModifiedFocusOrderNode extends DelegatingLayoutNodeWrapper {
    public ModifiedFocusOrderNode(LayoutNodeWrapper layoutNodeWrapper0, FocusOrderModifier focusOrderModifier0) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "wrapped");
        Intrinsics.checkNotNullParameter(focusOrderModifier0, "modifier");
        super(layoutNodeWrapper0, focusOrderModifier0);
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void populateFocusOrder(FocusOrder focusOrder0) {
        Intrinsics.checkNotNullParameter(focusOrder0, "focusOrder");
        ((FocusOrderModifier)this.getModifier()).populateFocusOrder(focusOrder0);
        super.populateFocusOrder(focusOrder0);
    }
}

