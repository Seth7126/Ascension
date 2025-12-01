package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001A\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "it", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.AnnotationRangeListSaver.2 extends Lambda implements Function1 {
    public static final SaversKt.AnnotationRangeListSaver.2 INSTANCE;

    static {
        SaversKt.AnnotationRangeListSaver.2.INSTANCE = new SaversKt.AnnotationRangeListSaver.2();
    }

    SaversKt.AnnotationRangeListSaver.2() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(object0);
    }

    public final List invoke(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "it");
        ArrayList arrayList0 = new ArrayList(((List)object0).size());
        int v = ((List)object0).size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                Object object1 = ((List)object0).get(v1);
                Saver saver0 = SaversKt.AnnotationRangeSaver;
                Range annotatedString$Range0 = null;
                if(!Intrinsics.areEqual(object1, Boolean.FALSE) && object1 != null) {
                    annotatedString$Range0 = (Range)saver0.restore(object1);
                }
                Intrinsics.checkNotNull(annotatedString$Range0);
                arrayList0.add(annotatedString$Range0);
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return arrayList0;
    }
}

