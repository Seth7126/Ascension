package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001A\u0004\u0018\u00010\u00002\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/semantics/Role;", "parentValue", "<anonymous parameter 1>", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SemanticsProperties.Role.1 extends Lambda implements Function2 {
    public static final SemanticsProperties.Role.1 INSTANCE;

    static {
        SemanticsProperties.Role.1.INSTANCE = new SemanticsProperties.Role.1();
    }

    SemanticsProperties.Role.1() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke-qtA-w6s(((Role)object0), ((Role)object1).unbox-impl());
    }

    public final Role invoke-qtA-w6s(Role role0, int v) {
        return role0;
    }
}

