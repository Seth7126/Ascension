package androidx.compose.ui.layout;

import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bç\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001A\u00020\u0003H\u0016J\"\u0010\t\u001A\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001A\u00020\u0003H\u0016J/\u0010\u000B\u001A\u00020\f*\u00020\r2\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u000E0\u00062\u0006\u0010\u000F\u001A\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001A\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001A\u00020\u0003H\u0016J\"\u0010\u0014\u001A\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001A\u00020\u0003H\u0016\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/layout/MeasurePolicy;", "", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface MeasurePolicy {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static int maxIntrinsicHeight(MeasurePolicy measurePolicy0, IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            Intrinsics.checkNotNullParameter(measurePolicy0, "this");
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "receiver");
            Intrinsics.checkNotNullParameter(list0, "measurables");
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v1 = list0.size();
            if(v1 - 1 >= 0) {
                for(int v2 = 0; true; ++v2) {
                    arrayList0.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list0.get(v2)), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
                    if(v2 + 1 > v1 - 1) {
                        break;
                    }
                }
            }
            long v3 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
            return measurePolicy0.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v3).getHeight();
        }

        public static int maxIntrinsicWidth(MeasurePolicy measurePolicy0, IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            Intrinsics.checkNotNullParameter(measurePolicy0, "this");
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "receiver");
            Intrinsics.checkNotNullParameter(list0, "measurables");
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v1 = list0.size();
            if(v1 - 1 >= 0) {
                for(int v2 = 0; true; ++v2) {
                    arrayList0.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list0.get(v2)), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
                    if(v2 + 1 > v1 - 1) {
                        break;
                    }
                }
            }
            long v3 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
            return measurePolicy0.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v3).getWidth();
        }

        public static int minIntrinsicHeight(MeasurePolicy measurePolicy0, IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            Intrinsics.checkNotNullParameter(measurePolicy0, "this");
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "receiver");
            Intrinsics.checkNotNullParameter(list0, "measurables");
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v1 = list0.size();
            if(v1 - 1 >= 0) {
                for(int v2 = 0; true; ++v2) {
                    arrayList0.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list0.get(v2)), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
                    if(v2 + 1 > v1 - 1) {
                        break;
                    }
                }
            }
            long v3 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
            return measurePolicy0.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v3).getHeight();
        }

        public static int minIntrinsicWidth(MeasurePolicy measurePolicy0, IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
            Intrinsics.checkNotNullParameter(measurePolicy0, "this");
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "receiver");
            Intrinsics.checkNotNullParameter(list0, "measurables");
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v1 = list0.size();
            if(v1 - 1 >= 0) {
                for(int v2 = 0; true; ++v2) {
                    arrayList0.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list0.get(v2)), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
                    if(v2 + 1 > v1 - 1) {
                        break;
                    }
                }
            }
            long v3 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
            return measurePolicy0.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v3).getWidth();
        }
    }

    int maxIntrinsicHeight(IntrinsicMeasureScope arg1, List arg2, int arg3);

    int maxIntrinsicWidth(IntrinsicMeasureScope arg1, List arg2, int arg3);

    MeasureResult measure-3p2s80s(MeasureScope arg1, List arg2, long arg3);

    int minIntrinsicHeight(IntrinsicMeasureScope arg1, List arg2, int arg3);

    int minIntrinsicWidth(IntrinsicMeasureScope arg1, List arg2, int arg3);
}

