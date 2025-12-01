package androidx.compose.ui.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "it", "Landroidx/compose/ui/text/TextRange;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.TextRangeSaver.2 extends Lambda implements Function1 {
    public static final SaversKt.TextRangeSaver.2 INSTANCE;

    static {
        SaversKt.TextRangeSaver.2.INSTANCE = new SaversKt.TextRangeSaver.2();
    }

    SaversKt.TextRangeSaver.2() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke-VqIyPBM(object0);
    }

    public final TextRange invoke-VqIyPBM(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "it");
        Object object1 = ((List)object0).get(0);
        Integer integer0 = null;
        Integer integer1 = object1 == null ? null : ((Integer)object1);
        Intrinsics.checkNotNull(integer1);
        int v = integer1.intValue();
        Object object2 = ((List)object0).get(1);
        if(object2 != null) {
            integer0 = (Integer)object2;
        }
        Intrinsics.checkNotNull(integer0);
        return TextRange.box-impl(TextRangeKt.TextRange(v, integer0.intValue()));
    }
}

