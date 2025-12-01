package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001A\u0004\u0018\u00010\u00002\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001A\u00020\u0000H\n"}, d2 = {"", "parentValue", "<anonymous parameter 1>", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SemanticsProperties.InvisibleToUser.1 extends Lambda implements Function2 {
    public static final SemanticsProperties.InvisibleToUser.1 INSTANCE;

    static {
        SemanticsProperties.InvisibleToUser.1.INSTANCE = new SemanticsProperties.InvisibleToUser.1();
    }

    SemanticsProperties.InvisibleToUser.1() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((Unit)object0), ((Unit)object1));
    }

    public final Unit invoke(Unit unit0, Unit unit1) {
        Intrinsics.checkNotNullParameter(unit1, "$noName_1");
        return unit0;
    }
}

