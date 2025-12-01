package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaverKt.AutoSaver.2 extends Lambda implements Function1 {
    public static final SaverKt.AutoSaver.2 INSTANCE;

    static {
        SaverKt.AutoSaver.2.INSTANCE = new SaverKt.AutoSaver.2();
    }

    SaverKt.AutoSaver.2() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "it");
        return object0;
    }
}

