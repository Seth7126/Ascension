package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "it", "Landroidx/compose/ui/text/style/TextIndent;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.TextIndentSaver.2 extends Lambda implements Function1 {
    public static final SaversKt.TextIndentSaver.2 INSTANCE;

    static {
        SaversKt.TextIndentSaver.2.INSTANCE = new SaversKt.TextIndentSaver.2();
    }

    SaversKt.TextIndentSaver.2() {
        super(1);
    }

    public final TextIndent invoke(Object object0) {
        TextUnit textUnit1;
        Intrinsics.checkNotNullParameter(object0, "it");
        Object object1 = ((List)object0).get(0);
        Saver saver0 = SaversKt.getSaver(TextUnit.Companion);
        TextUnit textUnit0 = null;
        if(Intrinsics.areEqual(object1, Boolean.FALSE)) {
            textUnit1 = null;
        }
        else if(object1 != null) {
            textUnit1 = (TextUnit)saver0.restore(object1);
        }
        else {
            textUnit1 = null;
        }
        Intrinsics.checkNotNull(textUnit1);
        long v = textUnit1.unbox-impl();
        Object object2 = ((List)object0).get(1);
        Saver saver1 = SaversKt.getSaver(TextUnit.Companion);
        if(!Intrinsics.areEqual(object2, Boolean.FALSE) && object2 != null) {
            textUnit0 = (TextUnit)saver1.restore(object2);
        }
        Intrinsics.checkNotNull(textUnit0);
        return new TextIndent(v, textUnit0.unbox-impl(), null);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(object0);
    }
}

