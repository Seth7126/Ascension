package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.focus.FocusNodeUtilsKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001A\u00020\rH\u0016J\b\u0010\u000E\u001A\u00020\rH\u0016J\u000F\u0010\u000F\u001A\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b\u0011J\b\u0010\u0012\u001A\u00020\rH\u0016R\"\u0010\t\u001A\u0004\u0018\u00010\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\b@BX\u0082\u000E¢\u0006\b\n\u0000\"\u0004\b\n\u0010\u000B¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/ModifiedFocusRequesterNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/focus/FocusRequesterModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/focus/FocusRequesterModifier;)V", "value", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "attach", "", "detach", "findFocusNode", "Landroidx/compose/ui/node/ModifiedFocusNode;", "findFocusNode$ui_release", "onModifierChanged", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ModifiedFocusRequesterNode extends DelegatingLayoutNodeWrapper {
    private FocusRequester focusRequester;

    public ModifiedFocusRequesterNode(LayoutNodeWrapper layoutNodeWrapper0, FocusRequesterModifier focusRequesterModifier0) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "wrapped");
        Intrinsics.checkNotNullParameter(focusRequesterModifier0, "modifier");
        super(layoutNodeWrapper0, focusRequesterModifier0);
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void attach() {
        super.attach();
        this.setFocusRequester(((FocusRequesterModifier)this.getModifier()).getFocusRequester());
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void detach() {
        this.setFocusRequester(null);
        super.detach();
    }

    public final ModifiedFocusNode findFocusNode$ui_release() {
        ModifiedFocusNode modifiedFocusNode0 = this.findNextFocusWrapper();
        return modifiedFocusNode0 == null ? FocusNodeUtilsKt.searchChildrenForFocusNode$default(this.getLayoutNode$ui_release(), null, 1, null) : modifiedFocusNode0;
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        super.onModifierChanged();
        this.setFocusRequester(((FocusRequesterModifier)this.getModifier()).getFocusRequester());
    }

    private final void setFocusRequester(FocusRequester focusRequester0) {
        FocusRequester focusRequester1 = this.focusRequester;
        if(focusRequester1 != null) {
            MutableVector mutableVector0 = focusRequester1.getFocusRequesterNodes$ui_release();
            if(mutableVector0 != null) {
                mutableVector0.remove(this);
            }
        }
        this.focusRequester = focusRequester0;
        if(focusRequester0 != null) {
            MutableVector mutableVector1 = focusRequester0.getFocusRequesterNodes$ui_release();
            if(mutableVector1 != null) {
                mutableVector1.add(this);
            }
        }
    }
}

