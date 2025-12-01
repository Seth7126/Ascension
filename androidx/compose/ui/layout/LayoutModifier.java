package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001C\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0003H\u0016J\u001C\u0010\b\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0003H\u0016J)\u0010\n\u001A\u00020\u000B*\u00020\f2\u0006\u0010\u0005\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001C\u0010\u0012\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0003H\u0016J\u001C\u0010\u0013\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0003H\u0016\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/Modifier$Element;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface LayoutModifier extends Element {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static boolean all(LayoutModifier layoutModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(layoutModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.all(layoutModifier0, function10);
        }

        public static boolean any(LayoutModifier layoutModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(layoutModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.any(layoutModifier0, function10);
        }

        public static Object foldIn(LayoutModifier layoutModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(layoutModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldIn(layoutModifier0, object0, function20);
        }

        public static Object foldOut(LayoutModifier layoutModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(layoutModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldOut(layoutModifier0, object0, function20);
        }

        public static int maxIntrinsicHeight(LayoutModifier layoutModifier0, IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
            Intrinsics.checkNotNullParameter(layoutModifier0, "this");
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "receiver");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable0, "measurable");
            return MeasuringIntrinsics.INSTANCE.maxHeight$ui_release(layoutModifier0, intrinsicMeasureScope0, intrinsicMeasurable0, v);
        }

        public static int maxIntrinsicWidth(LayoutModifier layoutModifier0, IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
            Intrinsics.checkNotNullParameter(layoutModifier0, "this");
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "receiver");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable0, "measurable");
            return MeasuringIntrinsics.INSTANCE.maxWidth$ui_release(layoutModifier0, intrinsicMeasureScope0, intrinsicMeasurable0, v);
        }

        public static int minIntrinsicHeight(LayoutModifier layoutModifier0, IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
            Intrinsics.checkNotNullParameter(layoutModifier0, "this");
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "receiver");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable0, "measurable");
            return MeasuringIntrinsics.INSTANCE.minHeight$ui_release(layoutModifier0, intrinsicMeasureScope0, intrinsicMeasurable0, v);
        }

        public static int minIntrinsicWidth(LayoutModifier layoutModifier0, IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
            Intrinsics.checkNotNullParameter(layoutModifier0, "this");
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "receiver");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable0, "measurable");
            return MeasuringIntrinsics.INSTANCE.minWidth$ui_release(layoutModifier0, intrinsicMeasureScope0, intrinsicMeasurable0, v);
        }

        public static Modifier then(LayoutModifier layoutModifier0, Modifier modifier0) {
            Intrinsics.checkNotNullParameter(layoutModifier0, "this");
            Intrinsics.checkNotNullParameter(modifier0, "other");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.then(layoutModifier0, modifier0);
        }
    }

    int maxIntrinsicHeight(IntrinsicMeasureScope arg1, IntrinsicMeasurable arg2, int arg3);

    int maxIntrinsicWidth(IntrinsicMeasureScope arg1, IntrinsicMeasurable arg2, int arg3);

    MeasureResult measure-3p2s80s(MeasureScope arg1, Measurable arg2, long arg3);

    int minIntrinsicHeight(IntrinsicMeasureScope arg1, IntrinsicMeasurable arg2, int arg3);

    int minIntrinsicWidth(IntrinsicMeasureScope arg1, IntrinsicMeasurable arg2, int arg3);
}

