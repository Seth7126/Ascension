package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001H\n"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaverKt.AutoSaver.1 extends Lambda implements Function2 {
    public static final SaverKt.AutoSaver.1 INSTANCE;

    static {
        SaverKt.AutoSaver.1.INSTANCE = new SaverKt.AutoSaver.1();
    }

    SaverKt.AutoSaver.1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope0, Object object0) {
        Intrinsics.checkNotNullParameter(saverScope0, "$this$Saver");
        return object0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((SaverScope)object0), object1);
    }
}

