package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\f\u0010\u0002\u001A\u00020\u0003*\u00020\u0004H&¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/Modifier$Element;", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface DrawModifier extends Element {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static boolean all(DrawModifier drawModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(drawModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.all(drawModifier0, function10);
        }

        public static boolean any(DrawModifier drawModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(drawModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.any(drawModifier0, function10);
        }

        public static Object foldIn(DrawModifier drawModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(drawModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldIn(drawModifier0, object0, function20);
        }

        public static Object foldOut(DrawModifier drawModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(drawModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.foldOut(drawModifier0, object0, function20);
        }

        public static Modifier then(DrawModifier drawModifier0, Modifier modifier0) {
            Intrinsics.checkNotNullParameter(drawModifier0, "this");
            Intrinsics.checkNotNullParameter(modifier0, "other");
            return androidx.compose.ui.Modifier.Element.DefaultImpls.then(drawModifier0, modifier0);
        }
    }

    void draw(ContentDrawScope arg1);
}

