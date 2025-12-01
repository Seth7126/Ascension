package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001Ax\u0010\u0000\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u000328\u0010\u0004\u001A4\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\u00030\n0\u0005¢\u0006\u0002\b\f2 \u0010\r\u001A\u001C\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000E¨\u0006\u000F"}, d2 = {"mapSaver", "Landroidx/compose/runtime/saveable/Saver;", "T", "", "save", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "name", "value", "", "", "Lkotlin/ExtensionFunctionType;", "restore", "Lkotlin/Function1;", "runtime-saveable_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class MapSaverKt {
    public static final Saver mapSaver(Function2 function20, Function1 function10) {
        Intrinsics.checkNotNullParameter(function20, "save");
        Intrinsics.checkNotNullParameter(function10, "restore");
        return ListSaverKt.listSaver(new Function2(function20) {
            final Function2 $save;

            {
                this.$save = function20;
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((SaverScope)object0), object1);
            }

            public final List invoke(SaverScope saverScope0, Object object0) {
                Intrinsics.checkNotNullParameter(saverScope0, "$this$listSaver");
                Intrinsics.checkNotNullParameter(object0, "it");
                List list0 = new ArrayList();
                for(Object object1: ((Map)this.$save.invoke(saverScope0, object0)).entrySet()) {
                    list0.add(((Map.Entry)object1).getKey());
                    list0.add(((Map.Entry)object1).getValue());
                }
                return list0;
            }
        }, new Function1(function10) {
            final Function1 $restore;

            {
                this.$restore = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((List)object0));
            }

            public final Object invoke(List list0) {
                Intrinsics.checkNotNullParameter(list0, "list");
                Map map0 = new LinkedHashMap();
                if(list0.size() % 2 != 0) {
                    throw new IllegalStateException("Check failed.");
                }
                for(int v = 0; v < list0.size(); v += 2) {
                    map0.put(((String)list0.get(v)), list0.get(v + 1));
                }
                return this.$restore.invoke(map0);
            }
        });
    }
}

