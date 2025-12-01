package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/focus/FocusEventModifier;", "Landroidx/compose/ui/Modifier$Element;", "onFocusEvent", "", "focusState", "Landroidx/compose/ui/focus/FocusState;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface FocusEventModifier extends Element {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static boolean all(FocusEventModifier focusEventModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(focusEventModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.all(focusEventModifier0, function10);
        }

        public static boolean any(FocusEventModifier focusEventModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(focusEventModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.any(focusEventModifier0, function10);
        }

        public static Object foldIn(FocusEventModifier focusEventModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(focusEventModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldIn(focusEventModifier0, object0, function20);
        }

        public static Object foldOut(FocusEventModifier focusEventModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(focusEventModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldOut(focusEventModifier0, object0, function20);
        }

        public static Modifier then(FocusEventModifier focusEventModifier0, Modifier modifier0) {
            Intrinsics.checkNotNullParameter(focusEventModifier0, "this");
            Intrinsics.checkNotNullParameter(modifier0, "other");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.then(focusEventModifier0, modifier0);
        }
    }

    void onFocusEvent(FocusState arg1);
}

