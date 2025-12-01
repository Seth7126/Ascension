package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0002*\u00020\u00002\u000E\u0010\u0003\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001H\n"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/ui/text/AnnotatedString$Range;", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.AnnotationRangeSaver.1 extends Lambda implements Function2 {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[AnnotationType.values().length];
            arr_v[AnnotationType.Paragraph.ordinal()] = 1;
            arr_v[AnnotationType.Span.ordinal()] = 2;
            arr_v[AnnotationType.VerbatimTts.ordinal()] = 3;
            arr_v[AnnotationType.String.ordinal()] = 4;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final SaversKt.AnnotationRangeSaver.1 INSTANCE;

    static {
        SaversKt.AnnotationRangeSaver.1.INSTANCE = new SaversKt.AnnotationRangeSaver.1();
    }

    SaversKt.AnnotationRangeSaver.1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope0, Range annotatedString$Range0) {
        AnnotationType annotationType0;
        Intrinsics.checkNotNullParameter(saverScope0, "$this$Saver");
        Intrinsics.checkNotNullParameter(annotatedString$Range0, "it");
        Object object0 = annotatedString$Range0.getItem();
        if(object0 instanceof ParagraphStyle) {
            annotationType0 = AnnotationType.Paragraph;
        }
        else if(object0 instanceof SpanStyle) {
            annotationType0 = AnnotationType.Span;
        }
        else {
            annotationType0 = object0 instanceof VerbatimTtsAnnotation ? AnnotationType.VerbatimTts : AnnotationType.String;
        }
        switch(annotationType0) {
            case 1: {
                return CollectionsKt.arrayListOf(new Object[]{annotationType0, SaversKt.save(((ParagraphStyle)annotatedString$Range0.getItem()), SaversKt.getParagraphStyleSaver(), saverScope0), annotatedString$Range0.getStart(), annotatedString$Range0.getEnd(), annotatedString$Range0.getTag()});
            }
            case 2: {
                return CollectionsKt.arrayListOf(new Object[]{annotationType0, SaversKt.save(((SpanStyle)annotatedString$Range0.getItem()), SaversKt.getSpanStyleSaver(), saverScope0), annotatedString$Range0.getStart(), annotatedString$Range0.getEnd(), annotatedString$Range0.getTag()});
            }
            case 3: {
                return CollectionsKt.arrayListOf(new Object[]{annotationType0, SaversKt.save(((VerbatimTtsAnnotation)annotatedString$Range0.getItem()), SaversKt.VerbatimTtsAnnotationSaver, saverScope0), annotatedString$Range0.getStart(), annotatedString$Range0.getEnd(), annotatedString$Range0.getTag()});
            }
            case 4: {
                return CollectionsKt.arrayListOf(new Object[]{annotationType0, annotatedString$Range0.getItem(), annotatedString$Range0.getStart(), annotatedString$Range0.getEnd(), annotatedString$Range0.getTag()});
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((SaverScope)object0), ((Range)object1));
    }
}

