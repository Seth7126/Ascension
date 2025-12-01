package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001Aw\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00022.\u0010\u0006\u001A*\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u0007¢\u0006\u0002\b\f2#\u0010\r\u001A\u001F\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u0006\u0012\u0004\u0018\u0001H\u00040\u000E\u001A\u0018\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0010\"\u001C\u0010\u0000\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"AutoSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "Saver", "Original", "Saveable", "save", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/ExtensionFunctionType;", "restore", "Lkotlin/Function1;", "autoSaver", "T", "runtime-saveable_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SaverKt {
    private static final Saver AutoSaver;

    static {
        SaverKt.AutoSaver = SaverKt.Saver(SaverKt.AutoSaver.1.INSTANCE, SaverKt.AutoSaver.2.INSTANCE);
    }

    public static final Saver Saver(Function2 function20, Function1 function10) {
        Intrinsics.checkNotNullParameter(function20, "save");
        Intrinsics.checkNotNullParameter(function10, "restore");
        return new Saver() {
            @Override  // androidx.compose.runtime.saveable.Saver
            public Object restore(Object object0) {
                Intrinsics.checkNotNullParameter(object0, "value");
                return function10.invoke(object0);
            }

            @Override  // androidx.compose.runtime.saveable.Saver
            public Object save(SaverScope saverScope0, Object object0) {
                Intrinsics.checkNotNullParameter(saverScope0, "<this>");
                return function20.invoke(saverScope0, object0);
            }
        };
    }

    public static final Saver autoSaver() {
        return SaverKt.AutoSaver;
    }
}

