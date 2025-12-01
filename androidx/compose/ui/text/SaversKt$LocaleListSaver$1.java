package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001A\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\n"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/ui/text/intl/LocaleList;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.LocaleListSaver.1 extends Lambda implements Function2 {
    public static final SaversKt.LocaleListSaver.1 INSTANCE;

    static {
        SaversKt.LocaleListSaver.1.INSTANCE = new SaversKt.LocaleListSaver.1();
    }

    SaversKt.LocaleListSaver.1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope0, LocaleList localeList0) {
        Intrinsics.checkNotNullParameter(saverScope0, "$this$Saver");
        Intrinsics.checkNotNullParameter(localeList0, "it");
        List list0 = localeList0.getLocaleList();
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                arrayList0.add(SaversKt.save(((Locale)list0.get(v1)), SaversKt.getSaver(Locale.Companion), saverScope0));
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return arrayList0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((SaverScope)object0), ((LocaleList)object1));
    }
}

