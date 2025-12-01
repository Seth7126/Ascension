package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "Landroidx/compose/ui/Modifier$Element;", "onGloballyPositioned", "", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface OnGloballyPositionedModifier extends Element {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static boolean all(OnGloballyPositionedModifier onGloballyPositionedModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(onGloballyPositionedModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.all(onGloballyPositionedModifier0, function10);
        }

        public static boolean any(OnGloballyPositionedModifier onGloballyPositionedModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(onGloballyPositionedModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.any(onGloballyPositionedModifier0, function10);
        }

        public static Object foldIn(OnGloballyPositionedModifier onGloballyPositionedModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(onGloballyPositionedModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldIn(onGloballyPositionedModifier0, object0, function20);
        }

        public static Object foldOut(OnGloballyPositionedModifier onGloballyPositionedModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(onGloballyPositionedModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldOut(onGloballyPositionedModifier0, object0, function20);
        }

        public static Modifier then(OnGloballyPositionedModifier onGloballyPositionedModifier0, Modifier modifier0) {
            Intrinsics.checkNotNullParameter(onGloballyPositionedModifier0, "this");
            Intrinsics.checkNotNullParameter(modifier0, "other");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.then(onGloballyPositionedModifier0, modifier0);
        }
    }

    void onGloballyPositioned(LayoutCoordinates arg1);
}

