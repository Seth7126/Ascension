package androidx.compose.ui.node;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0002\u0010\u0006J+\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u00102\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\b\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00028V@VX\u0096\u000E¢\u0006\f\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\f\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/node/PointerInputDelegatingWrapper;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "pointerInputModifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/input/pointer/PointerInputModifier;)V", "value", "modifier", "getModifier", "()Landroidx/compose/ui/input/pointer/PointerInputModifier;", "setModifier", "(Landroidx/compose/ui/input/pointer/PointerInputModifier;)V", "hitTest", "", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitPointerInputFilters", "", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "hitTest-3MmeM6k", "(JLjava/util/List;)V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PointerInputDelegatingWrapper extends DelegatingLayoutNodeWrapper {
    public PointerInputDelegatingWrapper(LayoutNodeWrapper layoutNodeWrapper0, PointerInputModifier pointerInputModifier0) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "wrapped");
        Intrinsics.checkNotNullParameter(pointerInputModifier0, "pointerInputModifier");
        super(layoutNodeWrapper0, pointerInputModifier0);
        pointerInputModifier0.getPointerInputFilter().setLayoutCoordinates$ui_release(this);
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public Element getModifier() {
        return this.getModifier();
    }

    public PointerInputModifier getModifier() {
        return (PointerInputModifier)super.getModifier();
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public void hitTest-3MmeM6k(long v, List list0) {
        Intrinsics.checkNotNullParameter(list0, "hitPointerInputFilters");
        if(this.isPointerInBounds-k-4lQ0M(v) && this.withinLayerBounds-k-4lQ0M(v)) {
            list0.add(this.getModifier().getPointerInputFilter());
            long v1 = this.getWrapped$ui_release().fromParentPosition-MK-Hz9U(v);
            this.getWrapped$ui_release().hitTest-3MmeM6k(v1, list0);
        }
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public void setModifier(Element modifier$Element0) {
        this.setModifier(((PointerInputModifier)modifier$Element0));
    }

    public void setModifier(PointerInputModifier pointerInputModifier0) {
        Intrinsics.checkNotNullParameter(pointerInputModifier0, "value");
        super.setModifier(pointerInputModifier0);
        pointerInputModifier0.getPointerInputFilter().setLayoutCoordinates$ui_release(this);
    }
}

