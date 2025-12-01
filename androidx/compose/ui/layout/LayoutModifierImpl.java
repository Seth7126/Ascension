package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BF\u0012#\u0010\u0003\u001A\u001F\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\t\u0012\u0017\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000B¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0002\u0010\u000EJ\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001A\u00020\u0016H\u0016J\b\u0010\u0017\u001A\u00020\u0018H\u0016J)\u0010\u0019\u001A\u00020\b*\u00020\u00052\u0006\u0010\u001A\u001A\u00020\u00062\u0006\u0010\u001B\u001A\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001C\u0010\u001DR1\u0010\u0003\u001A\u001F\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/layout/LayoutModifierImpl;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "measureBlock", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "getMeasureBlock", "()Lkotlin/jvm/functions/Function3;", "equals", "", "other", "", "hashCode", "", "toString", "", "measure", "measurable", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class LayoutModifierImpl extends InspectorValueInfo implements LayoutModifier {
    private final Function3 measureBlock;

    public LayoutModifierImpl(Function3 function30, Function1 function10) {
        Intrinsics.checkNotNullParameter(function30, "measureBlock");
        Intrinsics.checkNotNullParameter(function10, "inspectorInfo");
        super(function10);
        this.measureBlock = function30;
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
        LayoutModifierImpl layoutModifierImpl0 = object0 instanceof LayoutModifierImpl ? ((LayoutModifierImpl)object0) : null;
        return layoutModifierImpl0 == null ? false : Intrinsics.areEqual(this.measureBlock, layoutModifierImpl0.measureBlock);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldIn(Object object0, Function2 function20) {
        return DefaultImpls.foldIn(this, object0, function20);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldOut(Object object0, Function2 function20) {
        return DefaultImpls.foldOut(this, object0, function20);
    }

    public final Function3 getMeasureBlock() {
        return this.measureBlock;
    }

    @Override
    public int hashCode() {
        return this.measureBlock.hashCode();
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        Intrinsics.checkNotNullParameter(measureScope0, "$receiver");
        Intrinsics.checkNotNullParameter(measurable0, "measurable");
        Constraints constraints0 = Constraints.box-impl(v);
        return (MeasureResult)this.measureBlock.invoke(measureScope0, measurable0, constraints0);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }

    @Override
    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
    }
}

