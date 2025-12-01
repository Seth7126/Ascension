package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "it", "Landroidx/compose/ui/text/intl/Locale;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.LocaleSaver.2 extends Lambda implements Function1 {
    public static final SaversKt.LocaleSaver.2 INSTANCE;

    static {
        SaversKt.LocaleSaver.2.INSTANCE = new SaversKt.LocaleSaver.2();
    }

    SaversKt.LocaleSaver.2() {
        super(1);
    }

    public final Locale invoke(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "it");
        return new Locale(((String)object0));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(object0);
    }
}

