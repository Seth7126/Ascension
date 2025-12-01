package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputModifier;", "Landroidx/compose/ui/Modifier$Element;", "pointerInputFilter", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface PointerInputModifier extends Element {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static boolean all(PointerInputModifier pointerInputModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(pointerInputModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.all(pointerInputModifier0, function10);
        }

        public static boolean any(PointerInputModifier pointerInputModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(pointerInputModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.any(pointerInputModifier0, function10);
        }

        public static Object foldIn(PointerInputModifier pointerInputModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(pointerInputModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldIn(pointerInputModifier0, object0, function20);
        }

        public static Object foldOut(PointerInputModifier pointerInputModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(pointerInputModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldOut(pointerInputModifier0, object0, function20);
        }

        public static Modifier then(PointerInputModifier pointerInputModifier0, Modifier modifier0) {
            Intrinsics.checkNotNullParameter(pointerInputModifier0, "this");
            Intrinsics.checkNotNullParameter(modifier0, "other");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.then(pointerInputModifier0, modifier0);
        }
    }

    PointerInputFilter getPointerInputFilter();
}

