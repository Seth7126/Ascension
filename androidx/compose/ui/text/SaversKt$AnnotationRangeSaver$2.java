package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001A\f\u0012\u0006\b\u0001\u0012\u00020\u0000\u0018\u00010\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "it", "Landroidx/compose/ui/text/AnnotatedString$Range;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.AnnotationRangeSaver.2 extends Lambda implements Function1 {
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

    public static final SaversKt.AnnotationRangeSaver.2 INSTANCE;

    static {
        SaversKt.AnnotationRangeSaver.2.INSTANCE = new SaversKt.AnnotationRangeSaver.2();
    }

    SaversKt.AnnotationRangeSaver.2() {
        super(1);
    }

    public final Range invoke(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "it");
        Object object1 = ((List)object0).get(0);
        Object object2 = null;
        AnnotationType annotationType0 = object1 == null ? null : ((AnnotationType)object1);
        Intrinsics.checkNotNull(annotationType0);
        Object object3 = ((List)object0).get(2);
        Integer integer0 = object3 == null ? null : ((Integer)object3);
        Intrinsics.checkNotNull(integer0);
        int v = integer0.intValue();
        Object object4 = ((List)object0).get(3);
        Integer integer1 = object4 == null ? null : ((Integer)object4);
        Intrinsics.checkNotNull(integer1);
        int v1 = integer1.intValue();
        Object object5 = ((List)object0).get(4);
        String s = object5 == null ? null : ((String)object5);
        Intrinsics.checkNotNull(s);
        switch(annotationType0) {
            case 1: {
                Object object6 = ((List)object0).get(1);
                Saver saver0 = SaversKt.getParagraphStyleSaver();
                if(!Intrinsics.areEqual(object6, Boolean.FALSE) && object6 != null) {
                    object2 = (ParagraphStyle)saver0.restore(object6);
                }
                Intrinsics.checkNotNull(object2);
                return new Range(object2, v, v1, s);
            }
            case 2: {
                Object object7 = ((List)object0).get(1);
                Saver saver1 = SaversKt.getSpanStyleSaver();
                if(!Intrinsics.areEqual(object7, Boolean.FALSE) && object7 != null) {
                    object2 = (SpanStyle)saver1.restore(object7);
                }
                Intrinsics.checkNotNull(object2);
                return new Range(object2, v, v1, s);
            }
            case 3: {
                Object object8 = ((List)object0).get(1);
                Saver saver2 = SaversKt.VerbatimTtsAnnotationSaver;
                if(!Intrinsics.areEqual(object8, Boolean.FALSE) && object8 != null) {
                    object2 = (VerbatimTtsAnnotation)saver2.restore(object8);
                }
                Intrinsics.checkNotNull(object2);
                return new Range(object2, v, v1, s);
            }
            case 4: {
                Object object9 = ((List)object0).get(1);
                if(object9 != null) {
                    object2 = (String)object9;
                }
                Intrinsics.checkNotNull(object2);
                return new Range(object2, v, v1, s);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(object0);
    }
}

