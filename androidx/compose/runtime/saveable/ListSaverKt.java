package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0085\u0001\u0010\u0000\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u000322\u0010\u0005\u001A.\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000B0\u0006¢\u0006\u0002\b\f2)\u0010\r\u001A%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00040\u000B¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000F\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000E¨\u0006\u0010"}, d2 = {"listSaver", "Landroidx/compose/runtime/saveable/Saver;", "Original", "", "Saveable", "save", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "name", "value", "", "Lkotlin/ExtensionFunctionType;", "restore", "Lkotlin/Function1;", "list", "runtime-saveable_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ListSaverKt {
    public static final Saver listSaver(Function2 function20, Function1 function10) {
        Intrinsics.checkNotNullParameter(function20, "save");
        Intrinsics.checkNotNullParameter(function10, "restore");
        return SaverKt.Saver(new Function2(function20) {
            final Function2 $save;

            {
                this.$save = function20;
                super(2);
            }

            public final Object invoke(SaverScope saverScope0, Object object0) {
                Intrinsics.checkNotNullParameter(saverScope0, "$this$Saver");
                Intrinsics.checkNotNullParameter(object0, "it");
                List list0 = (List)this.$save.invoke(saverScope0, object0);
                int v = list0.size();
                if(v - 1 >= 0) {
                    for(int v1 = 0; saverScope0.canBeSaved(list0.get(v1)); ++v1) {
                        if(v1 + 1 > v - 1) {
                            return !list0.isEmpty() != 0 ? new ArrayList(list0) : null;
                        }
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                return !list0.isEmpty() != 0 ? new ArrayList(list0) : null;
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((SaverScope)object0), object1);
            }
        }, function10);
    }
}

