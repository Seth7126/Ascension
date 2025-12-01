package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "it", "Landroidx/compose/ui/text/input/TextFieldValue;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class TextFieldValue.Companion.Saver.2 extends Lambda implements Function1 {
    public static final TextFieldValue.Companion.Saver.2 INSTANCE;

    static {
        TextFieldValue.Companion.Saver.2.INSTANCE = new TextFieldValue.Companion.Saver.2();
    }

    TextFieldValue.Companion.Saver.2() {
        super(1);
    }

    public final TextFieldValue invoke(Object object0) {
        AnnotatedString annotatedString0;
        Intrinsics.checkNotNullParameter(object0, "it");
        Object object1 = ((List)object0).get(0);
        Saver saver0 = SaversKt.getAnnotatedStringSaver();
        TextRange textRange0 = null;
        if(Intrinsics.areEqual(object1, Boolean.FALSE)) {
            annotatedString0 = null;
        }
        else {
            annotatedString0 = object1 == null ? null : ((AnnotatedString)saver0.restore(object1));
        }
        Intrinsics.checkNotNull(annotatedString0);
        Object object2 = ((List)object0).get(1);
        Saver saver1 = SaversKt.getSaver(TextRange.Companion);
        if(!Intrinsics.areEqual(object2, Boolean.FALSE) && object2 != null) {
            textRange0 = (TextRange)saver1.restore(object2);
        }
        Intrinsics.checkNotNull(textRange0);
        return new TextFieldValue(annotatedString0, textRange0.unbox-impl(), null, 4, null);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(object0);
    }
}

