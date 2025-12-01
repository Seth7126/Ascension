package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterModifier;", "Landroidx/compose/ui/Modifier$Element;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface FocusRequesterModifier extends Element {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static boolean all(FocusRequesterModifier focusRequesterModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(focusRequesterModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.all(focusRequesterModifier0, function10);
        }

        public static boolean any(FocusRequesterModifier focusRequesterModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(focusRequesterModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.any(focusRequesterModifier0, function10);
        }

        public static Object foldIn(FocusRequesterModifier focusRequesterModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(focusRequesterModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldIn(focusRequesterModifier0, object0, function20);
        }

        public static Object foldOut(FocusRequesterModifier focusRequesterModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(focusRequesterModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldOut(focusRequesterModifier0, object0, function20);
        }

        public static Modifier then(FocusRequesterModifier focusRequesterModifier0, Modifier modifier0) {
            Intrinsics.checkNotNullParameter(focusRequesterModifier0, "this");
            Intrinsics.checkNotNullParameter(modifier0, "other");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.then(focusRequesterModifier0, modifier0);
        }
    }

    FocusRequester getFocusRequester();
}

