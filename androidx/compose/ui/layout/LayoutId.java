package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B&\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0017\u0010\u0006\u001A\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\u0010\u000BJ\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\u0011\u001A\u00020\u0012H\u0016J\b\u0010\u0013\u001A\u00020\u0014H\u0016J\u0018\u0010\u0015\u001A\u0004\u0018\u00010\u0005*\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0005H\u0016R\u0014\u0010\u0004\u001A\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/layout/LayoutId;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/layout/LayoutIdParentData;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "layoutId", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "getLayoutId", "()Ljava/lang/Object;", "equals", "", "other", "hashCode", "", "toString", "", "modifyParentData", "Landroidx/compose/ui/unit/Density;", "parentData", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class LayoutId extends InspectorValueInfo implements LayoutIdParentData, ParentDataModifier {
    private final Object layoutId;

    public LayoutId(Object object0, Function1 function10) {
        Intrinsics.checkNotNullParameter(object0, "layoutId");
        Intrinsics.checkNotNullParameter(function10, "inspectorInfo");
        super(function10);
        this.layoutId = object0;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean all(Function1 function10) {
        return DefaultImpls.all(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean any(Function1 function10) {
        return DefaultImpls.any(this, function10);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        LayoutId layoutId0 = object0 instanceof LayoutId ? ((LayoutId)object0) : null;
        return layoutId0 == null ? false : Intrinsics.areEqual(this.getLayoutId(), layoutId0.getLayoutId());
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldIn(Object object0, Function2 function20) {
        return DefaultImpls.foldIn(this, object0, function20);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldOut(Object object0, Function2 function20) {
        return DefaultImpls.foldOut(this, object0, function20);
    }

    @Override  // androidx.compose.ui.layout.LayoutIdParentData
    public Object getLayoutId() {
        return this.layoutId;
    }

    @Override
    public int hashCode() {
        return this.getLayoutId().hashCode();
    }

    @Override  // androidx.compose.ui.layout.ParentDataModifier
    public Object modifyParentData(Density density0, Object object0) {
        Intrinsics.checkNotNullParameter(density0, "<this>");
        return this;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }

    @Override
    public String toString() {
        return "LayoutId(id=" + this.getLayoutId() + ')';
    }
}

