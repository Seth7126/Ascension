package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003*\u00020\u00002\u0014\u0010\u0004\u001A\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.AnnotationRangeListSaver.1 extends Lambda implements Function2 {
    public static final SaversKt.AnnotationRangeListSaver.1 INSTANCE;

    static {
        SaversKt.AnnotationRangeListSaver.1.INSTANCE = new SaversKt.AnnotationRangeListSaver.1();
    }

    SaversKt.AnnotationRangeListSaver.1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope0, List list0) {
        Intrinsics.checkNotNullParameter(saverScope0, "$this$Saver");
        Intrinsics.checkNotNullParameter(list0, "it");
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                arrayList0.add(SaversKt.save(((Range)list0.get(v1)), SaversKt.AnnotationRangeSaver, saverScope0));
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return arrayList0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((SaverScope)object0), ((List)object1));
    }
}

