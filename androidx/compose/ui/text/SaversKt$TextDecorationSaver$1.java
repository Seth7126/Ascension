package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001A\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\n"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/ui/text/style/TextDecoration;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.TextDecorationSaver.1 extends Lambda implements Function2 {
    public static final SaversKt.TextDecorationSaver.1 INSTANCE;

    static {
        SaversKt.TextDecorationSaver.1.INSTANCE = new SaversKt.TextDecorationSaver.1();
    }

    SaversKt.TextDecorationSaver.1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope0, TextDecoration textDecoration0) {
        Intrinsics.checkNotNullParameter(saverScope0, "$this$Saver");
        Intrinsics.checkNotNullParameter(textDecoration0, "it");
        return textDecoration0.getMask();
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((SaverScope)object0), ((TextDecoration)object1));
    }
}

