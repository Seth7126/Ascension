package androidx.compose.ui;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier.DefaultImpls;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B&\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0017\u0010\u0005\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u000EH\u0096\u0002J\b\u0010\u000F\u001A\u00020\u0010H\u0016J\b\u0010\u0011\u001A\u00020\u0012H\u0016J)\u0010\u0013\u001A\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u0019H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001A\u0010\u001BR\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/ZIndexModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "zIndex", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FLkotlin/jvm/functions/Function1;)V", "equals", "", "other", "", "hashCode", "", "toString", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class ZIndexModifier extends InspectorValueInfo implements LayoutModifier {
    private final float zIndex;

    public ZIndexModifier(float f, Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "inspectorInfo");
        super(function10);
        this.zIndex = f;
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
        ZIndexModifier zIndexModifier0 = object0 instanceof ZIndexModifier ? ((ZIndexModifier)object0) : null;
        return zIndexModifier0 == null ? false : this.zIndex == zIndexModifier0.zIndex;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldIn(Object object0, Function2 function20) {
        return DefaultImpls.foldIn(this, object0, function20);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldOut(Object object0, Function2 function20) {
        return DefaultImpls.foldOut(this, object0, function20);
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.zIndex);
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
        Placeable placeable0 = measurable0.measure-BRTryo0(v);
        return androidx.compose.ui.layout.MeasureScope.DefaultImpls.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new Function1(this) {
            final Placeable $placeable;

            {
                this.$placeable = placeable0;
                ZIndexModifier.this = zIndexModifier0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((PlacementScope)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(PlacementScope placeable$PlacementScope0) {
                Intrinsics.checkNotNullParameter(placeable$PlacementScope0, "$this$layout");
                float f = ZIndexModifier.this.zIndex;
                placeable$PlacementScope0.place(this.$placeable, 0, 0, f);
            }
        }, 4, null);
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
        return "ZIndexModifier(zIndex=" + this.zIndex + ')';
    }
}

