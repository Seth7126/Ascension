package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\bÂ\u0002\u0018\u00002\u00020\u0001:\u0004\u0014\u0015\u0016\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u0004H\u0000¢\u0006\u0002\b\fJ-\u0010\r\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\u0004H\u0000¢\u0006\u0002\b\u000FJ-\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u0004H\u0000¢\u0006\u0002\b\u0011J-\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\u0004H\u0000¢\u0006\u0002\b\u0013¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics;", "", "()V", "maxHeight", "", "modifier", "Landroidx/compose/ui/layout/LayoutModifier;", "instrinsicMeasureScope", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "intrinsicMeasurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "w", "maxHeight$ui_release", "maxWidth", "h", "maxWidth$ui_release", "minHeight", "minHeight$ui_release", "minWidth", "minWidth$ui_release", "DefaultIntrinsicMeasurable", "EmptyPlaceable", "IntrinsicMinMax", "IntrinsicWidthHeight", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class MeasuringIntrinsics {
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u0014H\u0016J\u0010\u0010\u0016\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u0014H\u0016J\u001D\u0010\u0018\u001A\u00020\u00192\u0006\u0010\u001A\u001A\u00020\u001BH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u0014H\u0016J\u0010\u0010\u001F\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u0014H\u0016R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0016\u0010\r\u001A\u0004\u0018\u00010\u000E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$DefaultIntrinsicMeasurable;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "minMax", "Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax;", "widthHeight", "Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight;", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax;Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight;)V", "getMeasurable", "()Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getMinMax", "()Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax;", "parentData", "", "getParentData", "()Ljava/lang/Object;", "getWidthHeight", "()Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight;", "maxIntrinsicHeight", "", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class DefaultIntrinsicMeasurable implements Measurable {
        private final IntrinsicMeasurable measurable;
        private final IntrinsicMinMax minMax;
        private final IntrinsicWidthHeight widthHeight;

        public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable0, IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax0, IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight0) {
            Intrinsics.checkNotNullParameter(intrinsicMeasurable0, "measurable");
            Intrinsics.checkNotNullParameter(measuringIntrinsics$IntrinsicMinMax0, "minMax");
            Intrinsics.checkNotNullParameter(measuringIntrinsics$IntrinsicWidthHeight0, "widthHeight");
            super();
            this.measurable = intrinsicMeasurable0;
            this.minMax = measuringIntrinsics$IntrinsicMinMax0;
            this.widthHeight = measuringIntrinsics$IntrinsicWidthHeight0;
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
                    return new EmptyPlaceable(this.measurable.maxIntrinsicWidth(v1), Constraints.getMaxHeight-impl(v));
                }
                int v2 = Constraints.getMaxHeight-impl(v);
                return new EmptyPlaceable(this.measurable.minIntrinsicWidth(v2), Constraints.getMaxHeight-impl(v));
            }
            if(this.minMax == IntrinsicMinMax.Max) {
                int v3 = Constraints.getMaxWidth-impl(v);
                return new EmptyPlaceable(Constraints.getMaxWidth-impl(v), this.measurable.maxIntrinsicHeight(v3));
            }
            int v4 = Constraints.getMaxWidth-impl(v);
            return new EmptyPlaceable(Constraints.getMaxWidth-impl(v), this.measurable.minIntrinsicHeight(v4));
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

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\bH\u0096\u0002J@\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000E2\u0019\u0010\u000F\u001A\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010¢\u0006\u0002\b\u0012H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$EmptyPlaceable;", "Landroidx/compose/ui/layout/Placeable;", "width", "", "height", "(II)V", "get", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "placeAt", "", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class EmptyPlaceable extends Placeable {
        public EmptyPlaceable(int v, int v1) {
            this.setMeasuredSize-ozmzZPI(IntSizeKt.IntSize(v, v1));
        }

        @Override  // androidx.compose.ui.layout.Measured
        public int get(AlignmentLine alignmentLine0) {
            Intrinsics.checkNotNullParameter(alignmentLine0, "alignmentLine");
            return 0x80000000;
        }

        @Override  // androidx.compose.ui.layout.Placeable
        protected void placeAt-f8xVGno(long v, float f, Function1 function10) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax;", "", "(Ljava/lang/String;I)V", "Min", "Max", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static enum IntrinsicMinMax {
        Min,
        Max;

        private static final IntrinsicMinMax[] $values() [...] // Inlined contents
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight;", "", "(Ljava/lang/String;I)V", "Width", "Height", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static enum IntrinsicWidthHeight {
        Width,
        Height;

        private static final IntrinsicWidthHeight[] $values() [...] // Inlined contents
    }

    public static final MeasuringIntrinsics INSTANCE;

    static {
        MeasuringIntrinsics.INSTANCE = new MeasuringIntrinsics();
    }

    public final int maxHeight$ui_release(LayoutModifier layoutModifier0, IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        Intrinsics.checkNotNullParameter(layoutModifier0, "modifier");
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "instrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable0, "intrinsicMeasurable");
        DefaultIntrinsicMeasurable measuringIntrinsics$DefaultIntrinsicMeasurable0 = new DefaultIntrinsicMeasurable(intrinsicMeasurable0, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height);
        long v1 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
        return layoutModifier0.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), measuringIntrinsics$DefaultIntrinsicMeasurable0, v1).getHeight();
    }

    public final int maxWidth$ui_release(LayoutModifier layoutModifier0, IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        Intrinsics.checkNotNullParameter(layoutModifier0, "modifier");
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "instrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable0, "intrinsicMeasurable");
        DefaultIntrinsicMeasurable measuringIntrinsics$DefaultIntrinsicMeasurable0 = new DefaultIntrinsicMeasurable(intrinsicMeasurable0, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width);
        long v1 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
        return layoutModifier0.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), measuringIntrinsics$DefaultIntrinsicMeasurable0, v1).getWidth();
    }

    public final int minHeight$ui_release(LayoutModifier layoutModifier0, IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        Intrinsics.checkNotNullParameter(layoutModifier0, "modifier");
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "instrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable0, "intrinsicMeasurable");
        DefaultIntrinsicMeasurable measuringIntrinsics$DefaultIntrinsicMeasurable0 = new DefaultIntrinsicMeasurable(intrinsicMeasurable0, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height);
        long v1 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
        return layoutModifier0.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), measuringIntrinsics$DefaultIntrinsicMeasurable0, v1).getHeight();
    }

    public final int minWidth$ui_release(LayoutModifier layoutModifier0, IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        Intrinsics.checkNotNullParameter(layoutModifier0, "modifier");
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "instrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable0, "intrinsicMeasurable");
        DefaultIntrinsicMeasurable measuringIntrinsics$DefaultIntrinsicMeasurable0 = new DefaultIntrinsicMeasurable(intrinsicMeasurable0, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width);
        long v1 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
        return layoutModifier0.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), measuringIntrinsics$DefaultIntrinsicMeasurable0, v1).getWidth();
    }
}

