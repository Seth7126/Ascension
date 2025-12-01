package androidx.compose.ui.semantics;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0003\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000E\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "", "parentValue", "childValue", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SemanticsProperties.ContentDescription.1 extends Lambda implements Function2 {
    public static final SemanticsProperties.ContentDescription.1 INSTANCE;

    static {
        SemanticsProperties.ContentDescription.1.INSTANCE = new SemanticsProperties.ContentDescription.1();
    }

    SemanticsProperties.ContentDescription.1() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((List)object0), ((List)object1));
    }

    public final List invoke(List list0, List list1) {
        Intrinsics.checkNotNullParameter(list1, "childValue");
        if(list0 != null) {
            List list2 = CollectionsKt.toMutableList(list0);
            if(list2 != null) {
                list2.addAll(list1);
                return list2;
            }
        }
        return list1;
    }
}

