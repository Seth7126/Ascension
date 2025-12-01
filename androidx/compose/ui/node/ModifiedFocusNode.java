package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusNodeUtilsKt;
import androidx.compose.ui.focus.FocusOrder;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001A\u00020\u0014H\u0016J\b\u0010\u0015\u001A\u00020\u0014H\u0016J\b\u0010\u0016\u001A\u00020\u0000H\u0016J\b\u0010\u0017\u001A\u00020\u0000H\u0016J\u0006\u0010\u0018\u001A\u00020\u0019J\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00000\u001BJ\b\u0010\u001C\u001A\u00020\u0014H\u0016J\u0010\u0010\u001D\u001A\u00020\u00142\u0006\u0010\u001E\u001A\u00020\u001FH\u0016J\u0010\u0010 \u001A\u00020\u00142\u0006\u0010\t\u001A\u00020!H\u0016J\u000E\u0010\"\u001A\u00020\u00142\u0006\u0010\t\u001A\u00020!R$\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\b8F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR(\u0010\u000E\u001A\u0004\u0018\u00010\u00002\b\u0010\u0007\u001A\u0004\u0018\u00010\u00008F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006#"}, d2 = {"Landroidx/compose/ui/node/ModifiedFocusNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/focus/FocusModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/focus/FocusModifier;)V", "value", "Landroidx/compose/ui/focus/FocusStateImpl;", "focusState", "getFocusState", "()Landroidx/compose/ui/focus/FocusStateImpl;", "setFocusState", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "focusedChild", "getFocusedChild", "()Landroidx/compose/ui/node/ModifiedFocusNode;", "setFocusedChild", "(Landroidx/compose/ui/node/ModifiedFocusNode;)V", "attach", "", "detach", "findNextFocusWrapper", "findPreviousFocusWrapper", "focusRect", "Landroidx/compose/ui/geometry/Rect;", "focusableChildren", "", "onModifierChanged", "populateFocusOrder", "focusOrder", "Landroidx/compose/ui/focus/FocusOrder;", "propagateFocusEvent", "Landroidx/compose/ui/focus/FocusState;", "sendOnFocusEvent", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ModifiedFocusNode extends DelegatingLayoutNodeWrapper {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[FocusStateImpl.values().length];
            arr_v[FocusStateImpl.Active.ordinal()] = 1;
            arr_v[FocusStateImpl.Captured.ordinal()] = 2;
            arr_v[FocusStateImpl.ActiveParent.ordinal()] = 3;
            arr_v[FocusStateImpl.Disabled.ordinal()] = 4;
            arr_v[FocusStateImpl.Inactive.ordinal()] = 5;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public ModifiedFocusNode(LayoutNodeWrapper layoutNodeWrapper0, FocusModifier focusModifier0) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "wrapped");
        Intrinsics.checkNotNullParameter(focusModifier0, "modifier");
        super(layoutNodeWrapper0, focusModifier0);
        focusModifier0.setFocusNode(this);
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void attach() {
        super.attach();
        this.sendOnFocusEvent(this.getFocusState());
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void detach() {
        switch(this.getFocusState()) {
            case 1: 
            case 2: {
                Owner owner0 = this.getLayoutNode$ui_release().getOwner$ui_release();
                if(owner0 != null) {
                    FocusManager focusManager0 = owner0.getFocusManager();
                    if(focusManager0 != null) {
                        focusManager0.clearFocus(true);
                    }
                }
                break;
            }
            case 3: {
                ModifiedFocusNode modifiedFocusNode0 = this.getWrapped$ui_release().findNextFocusWrapper();
                if(modifiedFocusNode0 == null) {
                    modifiedFocusNode0 = FocusNodeUtilsKt.searchChildrenForFocusNode$default(this.getLayoutNode$ui_release(), null, 1, null);
                }
                if(modifiedFocusNode0 == null) {
                    this.sendOnFocusEvent(FocusStateImpl.Inactive);
                }
                else {
                    ModifiedFocusNode modifiedFocusNode1 = this.findParentFocusNode$ui_release();
                    if(modifiedFocusNode1 != null) {
                        ((FocusModifier)modifiedFocusNode1.getModifier()).setFocusedChild(modifiedFocusNode0);
                    }
                    this.sendOnFocusEvent(modifiedFocusNode0.getFocusState());
                }
            }
        }
        super.detach();
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public ModifiedFocusNode findNextFocusWrapper() {
        return this;
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public ModifiedFocusNode findPreviousFocusWrapper() {
        return this;
    }

    public final Rect focusRect() {
        return LayoutCoordinatesKt.boundsInRoot(this);
    }

    public final List focusableChildren() {
        ModifiedFocusNode modifiedFocusNode0 = this.getWrapped$ui_release().findNextFocusWrapper();
        if(modifiedFocusNode0 != null) {
            return CollectionsKt.listOf(modifiedFocusNode0);
        }
        List list0 = new ArrayList();
        List list1 = this.getLayoutNode$ui_release().getChildren$ui_release();
        int v = list1.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                FocusNodeUtilsKt.findFocusableChildren(((LayoutNode)list1.get(v1)), list0);
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return list0;
    }

    public final FocusStateImpl getFocusState() {
        return ((FocusModifier)this.getModifier()).getFocusState();
    }

    public final ModifiedFocusNode getFocusedChild() {
        return ((FocusModifier)this.getModifier()).getFocusedChild();
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        super.onModifierChanged();
        this.sendOnFocusEvent(this.getFocusState());
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void populateFocusOrder(FocusOrder focusOrder0) {
        Intrinsics.checkNotNullParameter(focusOrder0, "focusOrder");
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void propagateFocusEvent(FocusState focusState0) {
        Intrinsics.checkNotNullParameter(focusState0, "focusState");
    }

    public final void sendOnFocusEvent(FocusState focusState0) {
        Intrinsics.checkNotNullParameter(focusState0, "focusState");
        LayoutNodeWrapper layoutNodeWrapper0 = this.getWrappedBy$ui_release();
        if(layoutNodeWrapper0 != null) {
            layoutNodeWrapper0.propagateFocusEvent(focusState0);
        }
    }

    public final void setFocusState(FocusStateImpl focusStateImpl0) {
        Intrinsics.checkNotNullParameter(focusStateImpl0, "value");
        ((FocusModifier)this.getModifier()).setFocusState(focusStateImpl0);
        this.sendOnFocusEvent(focusStateImpl0);
    }

    public final void setFocusedChild(ModifiedFocusNode modifiedFocusNode0) {
        ((FocusModifier)this.getModifier()).setFocusedChild(modifiedFocusNode0);
    }
}

