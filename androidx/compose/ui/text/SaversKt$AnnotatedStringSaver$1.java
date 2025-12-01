package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001A\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\n"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/ui/text/AnnotatedString;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.AnnotatedStringSaver.1 extends Lambda implements Function2 {
    public static final SaversKt.AnnotatedStringSaver.1 INSTANCE;

    static {
        SaversKt.AnnotatedStringSaver.1.INSTANCE = new SaversKt.AnnotatedStringSaver.1();
    }

    SaversKt.AnnotatedStringSaver.1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope0, AnnotatedString annotatedString0) {
        Intrinsics.checkNotNullParameter(saverScope0, "$this$Saver");
        Intrinsics.checkNotNullParameter(annotatedString0, "it");
        return CollectionsKt.arrayListOf(new Object[]{SaversKt.save(annotatedString0.getText()), SaversKt.save(annotatedString0.getSpanStyles(), SaversKt.AnnotationRangeListSaver, saverScope0), SaversKt.save(annotatedString0.getParagraphStyles(), SaversKt.AnnotationRangeListSaver, saverScope0), SaversKt.save(annotatedString0.getAnnotations$ui_text_release(), SaversKt.AnnotationRangeListSaver, saverScope0)});
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((SaverScope)object0), ((AnnotatedString)object1));
    }
}

