package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.BaselineShift;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001A\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\n"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/ui/text/style/BaselineShift;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.BaselineShiftSaver.1 extends Lambda implements Function2 {
    public static final SaversKt.BaselineShiftSaver.1 INSTANCE;

    static {
        SaversKt.BaselineShiftSaver.1.INSTANCE = new SaversKt.BaselineShiftSaver.1();
    }

    SaversKt.BaselineShiftSaver.1() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke-8a2Sb4w(((SaverScope)object0), ((BaselineShift)object1).unbox-impl());
    }

    public final Object invoke-8a2Sb4w(SaverScope saverScope0, float f) {
        Intrinsics.checkNotNullParameter(saverScope0, "$this$Saver");
        return f;
    }
}

