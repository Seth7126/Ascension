package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapper;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001A\u00020\nJ\u0010\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u0004H\u0016R\u001A\u0010\u0003\u001A\u00020\u0004X\u0086.¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/layout/RelocationRequesterModifier;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "()V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "bringIntoView", "", "onGloballyPositioned", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class RelocationRequesterModifier implements OnGloballyPositionedModifier {
    public LayoutCoordinates coordinates;

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean all(Function1 function10) {
        return DefaultImpls.all(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean any(Function1 function10) {
        return DefaultImpls.any(this, function10);
    }

    public final void bringIntoView() {
        LayoutCoordinates layoutCoordinates0 = this.getCoordinates();
        if(!(layoutCoordinates0 instanceof LayoutNodeWrapper)) {
            throw new IllegalStateException("Check failed.");
        }
        NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper0 = ((LayoutNodeWrapper)layoutCoordinates0).findPreviousNestedScrollWrapper();
        if(nestedScrollDelegatingWrapper0 != null) {
            RelocationRequesterModifierKt.bringIntoView(nestedScrollDelegatingWrapper0, this.getCoordinates());
        }
        Owner owner0 = ((LayoutNodeWrapper)layoutCoordinates0).getLayoutNode$ui_release().getOwner$ui_release();
        if(owner0 != null) {
            owner0.requestRectangleOnScreen(LayoutCoordinatesKt.boundsInRoot(this.getCoordinates()));
        }
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldIn(Object object0, Function2 function20) {
        return DefaultImpls.foldIn(this, object0, function20);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldOut(Object object0, Function2 function20) {
        return DefaultImpls.foldOut(this, object0, function20);
    }

    public final LayoutCoordinates getCoordinates() {
        LayoutCoordinates layoutCoordinates0 = this.coordinates;
        if(layoutCoordinates0 != null) {
            return layoutCoordinates0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coordinates");
        throw null;
    }

    @Override  // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates0) {
        Intrinsics.checkNotNullParameter(layoutCoordinates0, "coordinates");
        this.setCoordinates(layoutCoordinates0);
    }

    public final void setCoordinates(LayoutCoordinates layoutCoordinates0) {
        Intrinsics.checkNotNullParameter(layoutCoordinates0, "<set-?>");
        this.coordinates = layoutCoordinates0;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }
}

