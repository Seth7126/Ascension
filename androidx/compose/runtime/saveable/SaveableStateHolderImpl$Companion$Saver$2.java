package androidx.compose.runtime.saveable;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001A\u0004\u0018\u00010\u00062&\u0010\u0005\u001A\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00020\u0000H\n"}, d2 = {"", "", "", "", "", "it", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaveableStateHolderImpl.Companion.Saver.2 extends Lambda implements Function1 {
    public static final SaveableStateHolderImpl.Companion.Saver.2 INSTANCE;

    static {
        SaveableStateHolderImpl.Companion.Saver.2.INSTANCE = new SaveableStateHolderImpl.Companion.Saver.2();
    }

    SaveableStateHolderImpl.Companion.Saver.2() {
        super(1);
    }

    public final SaveableStateHolderImpl invoke(Map map0) {
        Intrinsics.checkNotNullParameter(map0, "it");
        return new SaveableStateHolderImpl(map0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(((Map)object0));
    }
}

