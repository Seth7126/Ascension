package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "it", "Landroidx/compose/ui/text/AnnotatedString;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.AnnotatedStringSaver.2 extends Lambda implements Function1 {
    public static final SaversKt.AnnotatedStringSaver.2 INSTANCE;

    static {
        SaversKt.AnnotatedStringSaver.2.INSTANCE = new SaversKt.AnnotatedStringSaver.2();
    }

    SaversKt.AnnotatedStringSaver.2() {
        super(1);
    }

    public final AnnotatedString invoke(Object object0) {
        List list2;
        List list1;
        Intrinsics.checkNotNullParameter(object0, "it");
        Object object1 = ((List)object0).get(0);
        List list0 = null;
        String s = object1 == null ? null : ((String)object1);
        Intrinsics.checkNotNull(s);
        Object object2 = ((List)object0).get(1);
        Saver saver0 = SaversKt.AnnotationRangeListSaver;
        if(Intrinsics.areEqual(object2, Boolean.FALSE)) {
            list1 = null;
        }
        else if(object2 != null) {
            list1 = (List)saver0.restore(object2);
        }
        else {
            list1 = null;
        }
        Intrinsics.checkNotNull(list1);
        Object object3 = ((List)object0).get(2);
        Saver saver1 = SaversKt.AnnotationRangeListSaver;
        if(Intrinsics.areEqual(object3, Boolean.FALSE)) {
            list2 = null;
        }
        else if(object3 != null) {
            list2 = (List)saver1.restore(object3);
        }
        else {
            list2 = null;
        }
        Intrinsics.checkNotNull(list2);
        Object object4 = ((List)object0).get(3);
        Saver saver2 = SaversKt.AnnotationRangeListSaver;
        if(!Intrinsics.areEqual(object4, Boolean.FALSE) && object4 != null) {
            list0 = (List)saver2.restore(object4);
        }
        Intrinsics.checkNotNull(list0);
        return new AnnotatedString(s, list1, list2, list0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(object0);
    }
}

