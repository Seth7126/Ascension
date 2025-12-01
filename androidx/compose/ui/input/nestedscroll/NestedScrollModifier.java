package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;", "Landroidx/compose/ui/Modifier$Element;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface NestedScrollModifier extends Element {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static boolean all(NestedScrollModifier nestedScrollModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(nestedScrollModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.all(nestedScrollModifier0, function10);
        }

        public static boolean any(NestedScrollModifier nestedScrollModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(nestedScrollModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.any(nestedScrollModifier0, function10);
        }

        public static Object foldIn(NestedScrollModifier nestedScrollModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(nestedScrollModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldIn(nestedScrollModifier0, object0, function20);
        }

        public static Object foldOut(NestedScrollModifier nestedScrollModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(nestedScrollModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldOut(nestedScrollModifier0, object0, function20);
        }

        public static Modifier then(NestedScrollModifier nestedScrollModifier0, Modifier modifier0) {
            Intrinsics.checkNotNullParameter(nestedScrollModifier0, "this");
            Intrinsics.checkNotNullParameter(modifier0, "other");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.then(nestedScrollModifier0, modifier0);
        }
    }

    NestedScrollConnection getConnection();

    NestedScrollDispatcher getDispatcher();
}

