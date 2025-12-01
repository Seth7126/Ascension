package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001A\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\n"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/ui/text/style/TextIndent;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.TextIndentSaver.1 extends Lambda implements Function2 {
    public static final SaversKt.TextIndentSaver.1 INSTANCE;

    static {
        SaversKt.TextIndentSaver.1.INSTANCE = new SaversKt.TextIndentSaver.1();
    }

    SaversKt.TextIndentSaver.1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope0, TextIndent textIndent0) {
        Intrinsics.checkNotNullParameter(saverScope0, "$this$Saver");
        Intrinsics.checkNotNullParameter(textIndent0, "it");
        return CollectionsKt.arrayListOf(new Object[]{SaversKt.save(TextUnit.box-impl(textIndent0.getFirstLine-XSAIIZE()), SaversKt.getSaver(TextUnit.Companion), saverScope0), SaversKt.save(TextUnit.box-impl(textIndent0.getRestLine-XSAIIZE()), SaversKt.getSaver(TextUnit.Companion), saverScope0)});
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((SaverScope)object0), ((TextIndent)object1));
    }
}

