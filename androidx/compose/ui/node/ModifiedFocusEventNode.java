package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusNodeUtilsKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusStateImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001A\u00020\bH\u0016J\u0010\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u000BH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/ModifiedFocusEventNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/focus/FocusEventModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/focus/FocusEventModifier;)V", "onModifierChanged", "", "propagateFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ModifiedFocusEventNode extends DelegatingLayoutNodeWrapper {
    public ModifiedFocusEventNode(LayoutNodeWrapper layoutNodeWrapper0, FocusEventModifier focusEventModifier0) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "wrapped");
        Intrinsics.checkNotNullParameter(focusEventModifier0, "modifier");
        super(layoutNodeWrapper0, focusEventModifier0);
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        super.onModifierChanged();
        ModifiedFocusNode modifiedFocusNode0 = this.getWrapped$ui_release().findNextFocusWrapper();
        FocusStateImpl focusStateImpl0 = null;
        if(modifiedFocusNode0 == null) {
            modifiedFocusNode0 = FocusNodeUtilsKt.searchChildrenForFocusNode$default(this.getLayoutNode$ui_release(), null, 1, null);
        }
        FocusEventModifier focusEventModifier0 = (FocusEventModifier)this.getModifier();
        if(modifiedFocusNode0 != null) {
            FocusModifier focusModifier0 = (FocusModifier)modifiedFocusNode0.getModifier();
            if(focusModifier0 != null) {
                focusStateImpl0 = focusModifier0.getFocusState();
            }
        }
        if(focusStateImpl0 == null) {
            focusStateImpl0 = FocusStateImpl.Inactive;
        }
        focusEventModifier0.onFocusEvent(focusStateImpl0);
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void propagateFocusEvent(FocusState focusState0) {
        Intrinsics.checkNotNullParameter(focusState0, "focusState");
        ((FocusEventModifier)this.getModifier()).onFocusEvent(focusState0);
        super.propagateFocusEvent(focusState0);
    }
}

