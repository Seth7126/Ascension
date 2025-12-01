package androidx.compose.runtime.saveable;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010 \n\u0000\u0010\b\u001A$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u0005\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\n"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "it", "", "", "", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaveableStateHolderImpl.Companion.Saver.1 extends Lambda implements Function2 {
    public static final SaveableStateHolderImpl.Companion.Saver.1 INSTANCE;

    static {
        SaveableStateHolderImpl.Companion.Saver.1.INSTANCE = new SaveableStateHolderImpl.Companion.Saver.1();
    }

    SaveableStateHolderImpl.Companion.Saver.1() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((SaverScope)object0), ((SaveableStateHolderImpl)object1));
    }

    public final Map invoke(SaverScope saverScope0, SaveableStateHolderImpl saveableStateHolderImpl0) {
        Intrinsics.checkNotNullParameter(saverScope0, "$this$Saver");
        Intrinsics.checkNotNullParameter(saveableStateHolderImpl0, "it");
        return saveableStateHolderImpl0.saveAll();
    }
}

