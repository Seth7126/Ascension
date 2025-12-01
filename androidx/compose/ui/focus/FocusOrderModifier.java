package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/focus/FocusOrderModifier;", "Landroidx/compose/ui/Modifier$Element;", "populateFocusOrder", "", "focusOrder", "Landroidx/compose/ui/focus/FocusOrder;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface FocusOrderModifier extends Element {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static boolean all(FocusOrderModifier focusOrderModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(focusOrderModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.all(focusOrderModifier0, function10);
        }

        public static boolean any(FocusOrderModifier focusOrderModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(focusOrderModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.any(focusOrderModifier0, function10);
        }

        public static Object foldIn(FocusOrderModifier focusOrderModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(focusOrderModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldIn(focusOrderModifier0, object0, function20);
        }

        public static Object foldOut(FocusOrderModifier focusOrderModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(focusOrderModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldOut(focusOrderModifier0, object0, function20);
        }

        public static Modifier then(FocusOrderModifier focusOrderModifier0, Modifier modifier0) {
            Intrinsics.checkNotNullParameter(focusOrderModifier0, "this");
            Intrinsics.checkNotNullParameter(modifier0, "other");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.then(focusOrderModifier0, modifier0);
        }
    }

    void populateFocusOrder(FocusOrder arg1);
}

