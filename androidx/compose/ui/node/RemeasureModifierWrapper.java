package androidx.compose.ui.node;

import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0002\u0010\u0006J\u001D\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\f\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/RemeasureModifierWrapper;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/OnRemeasuredModifier;)V", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class RemeasureModifierWrapper extends DelegatingLayoutNodeWrapper {
    public RemeasureModifierWrapper(LayoutNodeWrapper layoutNodeWrapper0, OnRemeasuredModifier onRemeasuredModifier0) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "wrapped");
        Intrinsics.checkNotNullParameter(onRemeasuredModifier0, "modifier");
        super(layoutNodeWrapper0, onRemeasuredModifier0);
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public Placeable measure-BRTryo0(long v) {
        Placeable placeable0 = super.measure-BRTryo0(v);
        Function0 function00 = new Function0() {
            {
                RemeasureModifierWrapper.this = remeasureModifierWrapper0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                ((OnRemeasuredModifier)RemeasureModifierWrapper.this.getModifier()).onRemeasured-ozmzZPI(RemeasureModifierWrapper.this.getMeasuredSize-YbymL2g());
            }
        };
        Owner owner0 = this.getLayoutNode$ui_release().getOwner$ui_release();
        Unit unit0 = null;
        if(owner0 != null) {
            OwnerSnapshotObserver ownerSnapshotObserver0 = owner0.getSnapshotObserver();
            if(ownerSnapshotObserver0 != null) {
                ownerSnapshotObserver0.withNoSnapshotReadObservation$ui_release(function00);
                unit0 = Unit.INSTANCE;
            }
        }
        if(unit0 == null) {
            function00.invoke();
        }
        return placeable0;
    }
}

