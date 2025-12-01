package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u0014H\u0016J\u0010\u0010\u0016\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u0014H\u0016J\u001D\u0010\u0018\u001A\u00020\u00192\u0006\u0010\u001A\u001A\u00020\u001BH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u0014H\u0016J\u0010\u0010\u001F\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u0014H\u0016R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0016\u0010\r\u001A\u0004\u0018\u00010\u000E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "minMax", "Landroidx/compose/ui/layout/IntrinsicMinMax;", "widthHeight", "Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMinMax;Landroidx/compose/ui/layout/IntrinsicWidthHeight;)V", "getMeasurable", "()Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getMinMax", "()Landroidx/compose/ui/layout/IntrinsicMinMax;", "parentData", "", "getParentData", "()Ljava/lang/Object;", "getWidthHeight", "()Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "maxIntrinsicHeight", "", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DefaultIntrinsicMeasurable implements Measurable {
    private final IntrinsicMeasurable measurable;
    private final IntrinsicMinMax minMax;
    private final IntrinsicWidthHeight widthHeight;

    public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable0, IntrinsicMinMax intrinsicMinMax0, IntrinsicWidthHeight intrinsicWidthHeight0) {
        Intrinsics.checkNotNullParameter(intrinsicMeasurable0, "measurable");
        Intrinsics.checkNotNullParameter(intrinsicMinMax0, "minMax");
        Intrinsics.checkNotNullParameter(intrinsicWidthHeight0, "widthHeight");
        super();
        this.measurable = intrinsicMeasurable0;
        this.minMax = intrinsicMinMax0;
        this.widthHeight = intrinsicWidthHeight0;
    }

    public final IntrinsicMeasurable getMeasurable() {
        return this.measurable;
    }

    public final IntrinsicMinMax getMinMax() {
        return this.minMax;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.measurable.getParentData();
    }

    public final IntrinsicWidthHeight getWidthHeight() {
        return this.widthHeight;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int v) {
        return this.measurable.maxIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int v) {
        return this.measurable.maxIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.layout.Measurable
    public Placeable measure-BRTryo0(long v) {
        if(this.widthHeight == IntrinsicWidthHeight.Width) {
            if(this.minMax == IntrinsicMinMax.Max) {
                int v1 = Constraints.getMaxHeight-impl(v);
                return new FixedSizeIntrinsicsPlaceable(this.measurable.maxIntrinsicWidth(v1), Constraints.getMaxHeight-impl(v));
            }
            int v2 = Constraints.getMaxHeight-impl(v);
            return new FixedSizeIntrinsicsPlaceable(this.measurable.minIntrinsicWidth(v2), Constraints.getMaxHeight-impl(v));
        }
        if(this.minMax == IntrinsicMinMax.Max) {
            int v3 = Constraints.getMaxWidth-impl(v);
            return new FixedSizeIntrinsicsPlaceable(Constraints.getMaxWidth-impl(v), this.measurable.maxIntrinsicHeight(v3));
        }
        int v4 = Constraints.getMaxWidth-impl(v);
        return new FixedSizeIntrinsicsPlaceable(Constraints.getMaxWidth-impl(v), this.measurable.minIntrinsicHeight(v4));
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int v) {
        return this.measurable.minIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int v) {
        return this.measurable.minIntrinsicWidth(v);
    }
}

