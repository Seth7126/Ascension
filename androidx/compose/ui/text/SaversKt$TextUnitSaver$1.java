package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001A\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\n"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/ui/unit/TextUnit;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.TextUnitSaver.1 extends Lambda implements Function2 {
    public static final SaversKt.TextUnitSaver.1 INSTANCE;

    static {
        SaversKt.TextUnitSaver.1.INSTANCE = new SaversKt.TextUnitSaver.1();
    }

    SaversKt.TextUnitSaver.1() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke-mpE4wyQ(((SaverScope)object0), ((TextUnit)object1).unbox-impl());
    }

    public final Object invoke-mpE4wyQ(SaverScope saverScope0, long v) {
        Intrinsics.checkNotNullParameter(saverScope0, "$this$Saver");
        return CollectionsKt.arrayListOf(new Object[]{TextUnit.getValue-impl(v), SaversKt.save(TextUnitType.box-impl(TextUnit.getType-UIouoOA(v)))});
    }
}

