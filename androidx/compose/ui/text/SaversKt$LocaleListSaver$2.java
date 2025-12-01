package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "it", "Landroidx/compose/ui/text/intl/LocaleList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.LocaleListSaver.2 extends Lambda implements Function1 {
    public static final SaversKt.LocaleListSaver.2 INSTANCE;

    static {
        SaversKt.LocaleListSaver.2.INSTANCE = new SaversKt.LocaleListSaver.2();
    }

    SaversKt.LocaleListSaver.2() {
        super(1);
    }

    public final LocaleList invoke(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "it");
        ArrayList arrayList0 = new ArrayList(((List)object0).size());
        int v = ((List)object0).size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                Object object1 = ((List)object0).get(v1);
                Saver saver0 = SaversKt.getSaver(Locale.Companion);
                Locale locale0 = null;
                if(!Intrinsics.areEqual(object1, Boolean.FALSE) && object1 != null) {
                    locale0 = (Locale)saver0.restore(object1);
                }
                Intrinsics.checkNotNull(locale0);
                arrayList0.add(locale0);
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return new LocaleList(arrayList0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(object0);
    }
}

