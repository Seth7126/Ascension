package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "it", "Landroidx/compose/ui/text/ParagraphStyle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.ParagraphStyleSaver.2 extends Lambda implements Function1 {
    public static final SaversKt.ParagraphStyleSaver.2 INSTANCE;

    static {
        SaversKt.ParagraphStyleSaver.2.INSTANCE = new SaversKt.ParagraphStyleSaver.2();
    }

    SaversKt.ParagraphStyleSaver.2() {
        super(1);
    }

    public final ParagraphStyle invoke(Object object0) {
        TextUnit textUnit0;
        Intrinsics.checkNotNullParameter(object0, "it");
        Object object1 = ((List)object0).get(0);
        TextAlign textAlign0 = object1 == null ? null : ((TextAlign)object1);
        Object object2 = ((List)object0).get(1);
        TextDirection textDirection0 = object2 == null ? null : ((TextDirection)object2);
        Object object3 = ((List)object0).get(2);
        Saver saver0 = SaversKt.getSaver(TextUnit.Companion);
        if(Intrinsics.areEqual(object3, Boolean.FALSE)) {
            textUnit0 = null;
        }
        else if(object3 != null) {
            textUnit0 = (TextUnit)saver0.restore(object3);
        }
        else {
            textUnit0 = null;
        }
        Intrinsics.checkNotNull(textUnit0);
        long v = textUnit0.unbox-impl();
        Object object4 = ((List)object0).get(3);
        Saver saver1 = SaversKt.getSaver(TextIndent.Companion);
        if(Intrinsics.areEqual(object4, Boolean.FALSE)) {
            return new ParagraphStyle(textAlign0, textDirection0, v, null, null);
        }
        return object4 == null ? new ParagraphStyle(textAlign0, textDirection0, v, null, null) : new ParagraphStyle(textAlign0, textDirection0, v, ((TextIndent)saver1.restore(object4)), null);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(object0);
    }
}

