package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u0004\u0018\u00010\u0003*\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003H&¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/Modifier$Element;", "modifyParentData", "", "Landroidx/compose/ui/unit/Density;", "parentData", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface ParentDataModifier extends Element {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static boolean all(ParentDataModifier parentDataModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(parentDataModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.all(parentDataModifier0, function10);
        }

        public static boolean any(ParentDataModifier parentDataModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(parentDataModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.any(parentDataModifier0, function10);
        }

        public static Object foldIn(ParentDataModifier parentDataModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(parentDataModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldIn(parentDataModifier0, object0, function20);
        }

        public static Object foldOut(ParentDataModifier parentDataModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(parentDataModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldOut(parentDataModifier0, object0, function20);
        }

        public static Modifier then(ParentDataModifier parentDataModifier0, Modifier modifier0) {
            Intrinsics.checkNotNullParameter(parentDataModifier0, "this");
            Intrinsics.checkNotNullParameter(modifier0, "other");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.then(parentDataModifier0, modifier0);
        }
    }

    Object modifyParentData(Density arg1, Object arg2);
}

