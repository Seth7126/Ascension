package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/draw/DrawCacheModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "onBuildCache", "", "params", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface DrawCacheModifier extends DrawModifier {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static boolean all(DrawCacheModifier drawCacheModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(drawCacheModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.draw.DrawModifier.DefaultImpls.all(drawCacheModifier0, function10);
        }

        public static boolean any(DrawCacheModifier drawCacheModifier0, Function1 function10) {
            Intrinsics.checkNotNullParameter(drawCacheModifier0, "this");
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return androidx.compose.ui.draw.DrawModifier.DefaultImpls.any(drawCacheModifier0, function10);
        }

        public static Object foldIn(DrawCacheModifier drawCacheModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(drawCacheModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.draw.DrawModifier.DefaultImpls.foldIn(drawCacheModifier0, object0, function20);
        }

        public static Object foldOut(DrawCacheModifier drawCacheModifier0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(drawCacheModifier0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return androidx.compose.ui.draw.DrawModifier.DefaultImpls.foldOut(drawCacheModifier0, object0, function20);
        }

        public static Modifier then(DrawCacheModifier drawCacheModifier0, Modifier modifier0) {
            Intrinsics.checkNotNullParameter(drawCacheModifier0, "this");
            Intrinsics.checkNotNullParameter(modifier0, "other");
            return androidx.compose.ui.draw.DrawModifier.DefaultImpls.then(drawCacheModifier0, modifier0);
        }
    }

    void onBuildCache(BuildDrawCacheParams arg1);
}

