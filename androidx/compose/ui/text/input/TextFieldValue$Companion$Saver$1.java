package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001A\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\n"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/ui/text/input/TextFieldValue;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class TextFieldValue.Companion.Saver.1 extends Lambda implements Function2 {
    public static final TextFieldValue.Companion.Saver.1 INSTANCE;

    static {
        TextFieldValue.Companion.Saver.1.INSTANCE = new TextFieldValue.Companion.Saver.1();
    }

    TextFieldValue.Companion.Saver.1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope0, TextFieldValue textFieldValue0) {
        Intrinsics.checkNotNullParameter(saverScope0, "$this$Saver");
        Intrinsics.checkNotNullParameter(textFieldValue0, "it");
        return CollectionsKt.arrayListOf(new Object[]{SaversKt.save(textFieldValue0.getAnnotatedString(), SaversKt.getAnnotatedStringSaver(), saverScope0), SaversKt.save(TextRange.box-impl(textFieldValue0.getSelection-d9O1mEE()), SaversKt.getSaver(TextRange.Companion), saverScope0)});
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((SaverScope)object0), ((TextFieldValue)object1));
    }
}

