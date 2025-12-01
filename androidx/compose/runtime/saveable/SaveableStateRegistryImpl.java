package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u001C\u0010\u0002\u001A\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0007\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\u0006H\u0016J\u0012\u0010\u0010\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001A\u00020\u0004H\u0016J\u001C\u0010\u0012\u001A\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u0003H\u0016J \u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0011\u001A\u00020\u00042\u000E\u0010\u0015\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000EH\u0016R\u001A\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0002\u001A\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u000BX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\f\u001A\u001C\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000E0\r0\u000BX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistryImpl;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "restored", "", "", "", "", "canBeSaved", "Lkotlin/Function1;", "", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "", "valueProviders", "", "Lkotlin/Function0;", "value", "consumeRestored", "key", "performSave", "registerProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "valueProvider", "runtime-saveable_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class SaveableStateRegistryImpl implements SaveableStateRegistry {
    private final Function1 canBeSaved;
    private final Map restored;
    private final Map valueProviders;

    public SaveableStateRegistryImpl(Map map0, Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "canBeSaved");
        super();
        this.canBeSaved = function10;
        Map map1 = map0 == null ? null : MapsKt.toMutableMap(map0);
        if(map1 == null) {
            map1 = new LinkedHashMap();
        }
        this.restored = map1;
        this.valueProviders = new LinkedHashMap();
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "value");
        return ((Boolean)this.canBeSaved.invoke(object0)).booleanValue();
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        List list0 = (List)this.restored.remove(s);
        if(list0 != null && !list0.isEmpty() != 0) {
            if(list0.size() > 1) {
                List list1 = list0.subList(1, list0.size());
                this.restored.put(s, list1);
            }
            return list0.get(0);
        }
        return null;
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map performSave() {
        Map map0 = MapsKt.toMutableMap(this.restored);
        for(Object object0: this.valueProviders.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            List list0 = (List)((Map.Entry)object0).getValue();
            if(list0.size() == 1) {
                Object object1 = ((Function0)list0.get(0)).invoke();
                if(object1 == null) {
                    continue;
                }
                if(!this.canBeSaved(object1)) {
                    throw new IllegalStateException("Check failed.");
                }
                map0.put(s, CollectionsKt.arrayListOf(new Object[]{object1}));
            }
            else {
                int v1 = list0.size();
                ArrayList arrayList0 = new ArrayList(v1);
                for(int v = 0; v < v1; ++v) {
                    Object object2 = ((Function0)list0.get(v)).invoke();
                    if(object2 != null && !this.canBeSaved(object2)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    arrayList0.add(object2);
                }
                map0.put(s, arrayList0);
            }
        }
        return map0;
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Entry registerProvider(String s, Function0 function00) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(function00, "valueProvider");
        if(!StringsKt.isBlank(s) == 0) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        Map map0 = this.valueProviders;
        ArrayList arrayList0 = map0.get(s);
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            map0.put(s, arrayList0);
        }
        arrayList0.add(function00);
        return new Entry() {
            @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry$Entry
            public void unregister() {
                List list0 = (List)s.valueProviders.remove(function00);
                if(list0 != null) {
                    list0.remove(this.$valueProvider);
                }
                if(list0 != null && !list0.isEmpty() != 0) {
                    s.valueProviders.put(function00, list0);
                }
            }
        };
    }
}

