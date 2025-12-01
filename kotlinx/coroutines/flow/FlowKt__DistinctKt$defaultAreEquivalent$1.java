package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\u0010\u0004\u001A\u00020\u00032\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "old", "new", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class FlowKt__DistinctKt.defaultAreEquivalent.1 extends Lambda implements Function2 {
    public static final FlowKt__DistinctKt.defaultAreEquivalent.1 INSTANCE;

    static {
        FlowKt__DistinctKt.defaultAreEquivalent.1.INSTANCE = new FlowKt__DistinctKt.defaultAreEquivalent.1();
    }

    FlowKt__DistinctKt.defaultAreEquivalent.1() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return Boolean.valueOf(this.invoke(object0, object1));
    }

    public final boolean invoke(Object object0, Object object1) {
        return Intrinsics.areEqual(object0, object1);
    }
}

