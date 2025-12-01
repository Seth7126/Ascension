package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001D\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\b"}, d2 = {"Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/Modifier$Element;", "onRemeasured", "", "size", "Landroidx/compose/ui/unit/IntSize;", "onRemeasured-ozmzZPI", "(J)V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface OnRemeasuredModifier extends Element {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static boolean all(OnRemeasuredModifier onRemeasuredModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(onRemeasuredModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.all(onRemeasuredModifier0, function10);
        }

        public static boolean any(OnRemeasuredModifier onRemeasuredModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(onRemeasuredModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.any(onRemeasuredModifier0, function10);
        }

        public static Object foldIn(OnRemeasuredModifier onRemeasuredModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(onRemeasuredModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldIn(onRemeasuredModifier0, object0, function20);
        }

        public static Object foldOut(OnRemeasuredModifier onRemeasuredModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(onRemeasuredModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldOut(onRemeasuredModifier0, object0, function20);
        }

        public static Modifier then(OnRemeasuredModifier onRemeasuredModifier0, Modifier modifier0) {
            Intrinsics.checkNotNullParameter(onRemeasuredModifier0, "this");
            Intrinsics.checkNotNullParameter(modifier0, "other");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.then(onRemeasuredModifier0, modifier0);
        }
    }

    void onRemeasured-ozmzZPI(long arg1);
}

