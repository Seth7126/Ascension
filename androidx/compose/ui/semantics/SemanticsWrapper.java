package androidx.compose.ui.semantics;

import androidx.compose.ui.node.DelegatingLayoutNodeWrapper;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001A\u00020\bJ\b\u0010\t\u001A\u00020\nH\u0016J+\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\r2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00000\u000FH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001A\u00020\nH\u0016J\b\u0010\u0013\u001A\u00020\u0014H\u0016\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsWrapper;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "semanticsModifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/semantics/SemanticsModifier;)V", "collapsedSemanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "detach", "", "hitTestSemantics", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitSemanticsWrappers", "", "hitTestSemantics-3MmeM6k", "(JLjava/util/List;)V", "onModifierChanged", "toString", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SemanticsWrapper extends DelegatingLayoutNodeWrapper {
    public SemanticsWrapper(LayoutNodeWrapper layoutNodeWrapper0, SemanticsModifier semanticsModifier0) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "wrapped");
        Intrinsics.checkNotNullParameter(semanticsModifier0, "semanticsModifier");
        super(layoutNodeWrapper0, semanticsModifier0);
    }

    public final SemanticsConfiguration collapsedSemanticsConfiguration() {
        SemanticsWrapper semanticsWrapper0;
        for(LayoutNodeWrapper layoutNodeWrapper0 = this.getWrapped$ui_release(); true; layoutNodeWrapper0 = layoutNodeWrapper0.getWrapped$ui_release()) {
            semanticsWrapper0 = null;
            if(layoutNodeWrapper0 == null) {
                break;
            }
            if(layoutNodeWrapper0 instanceof SemanticsWrapper) {
                semanticsWrapper0 = (SemanticsWrapper)layoutNodeWrapper0;
                break;
            }
        }
        if(semanticsWrapper0 != null && !((SemanticsModifier)this.getModifier()).getSemanticsConfiguration().isClearingSemantics()) {
            SemanticsConfiguration semanticsConfiguration0 = ((SemanticsModifier)this.getModifier()).getSemanticsConfiguration().copy();
            semanticsConfiguration0.collapsePeer$ui_release(semanticsWrapper0.collapsedSemanticsConfiguration());
            return semanticsConfiguration0;
        }
        return ((SemanticsModifier)this.getModifier()).getSemanticsConfiguration();
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void detach() {
        super.detach();
        Owner owner0 = this.getLayoutNode$ui_release().getOwner$ui_release();
        if(owner0 != null) {
            owner0.onSemanticsChange();
        }
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public void hitTestSemantics-3MmeM6k(long v, List list0) {
        Intrinsics.checkNotNullParameter(list0, "hitSemanticsWrappers");
        if(this.isPointerInBounds-k-4lQ0M(v) && this.withinLayerBounds-k-4lQ0M(v)) {
            list0.add(this);
            long v1 = this.getWrapped$ui_release().fromParentPosition-MK-Hz9U(v);
            this.getWrapped$ui_release().hitTestSemantics-3MmeM6k(v1, list0);
        }
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        super.onModifierChanged();
        Owner owner0 = this.getLayoutNode$ui_release().getOwner$ui_release();
        if(owner0 != null) {
            owner0.onSemanticsChange();
        }
    }

    @Override
    public String toString() {
        return super.toString() + " id: " + ((SemanticsModifier)this.getModifier()).getId() + " config: " + ((SemanticsModifier)this.getModifier()).getSemanticsConfiguration();
    }
}

