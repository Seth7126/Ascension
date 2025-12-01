package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.ui.R.id;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\u001A\u0018\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0000\u001A\u0018\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\nH\u0000\u001A\u0010\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u0003H\u0002\u001A \u0010\u0011\u001A\u00020\u0012*\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00140\u0013H\u0002\u001A\"\u0010\u0015\u001A\u0018\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0014\u0018\u00010\u0013*\u00020\u0012H\u0002\"\u001E\u0010\u0000\u001A\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u0016"}, d2 = {"AcceptableClasses", "", "Ljava/lang/Class;", "", "[Ljava/lang/Class;", "DisposableSaveableStateRegistry", "Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "view", "Landroid/view/View;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "id", "", "savedStateRegistryOwner", "canBeSavedToBundle", "", "value", "toBundle", "Landroid/os/Bundle;", "", "", "toMap", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class DisposableSaveableStateRegistry_androidKt {
    private static final Class[] AcceptableClasses;

    static {
        DisposableSaveableStateRegistry_androidKt.AcceptableClasses = new Class[]{Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    }

    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(View view0, SavedStateRegistryOwner savedStateRegistryOwner0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner0, "owner");
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        Object object0 = ((View)viewParent0).getTag(id.compose_view_saveable_id_tag);
        String s = object0 instanceof String ? ((String)object0) : null;
        if(s == null) {
            s = String.valueOf(((View)viewParent0).getId());
        }
        return DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry(s, savedStateRegistryOwner0);
    }

    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(String s, SavedStateRegistryOwner savedStateRegistryOwner0) {
        Intrinsics.checkNotNullParameter(s, "id");
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner0, "savedStateRegistryOwner");
        SavedStateRegistry savedStateRegistry0 = savedStateRegistryOwner0.getSavedStateRegistry();
        Intrinsics.checkNotNullExpressionValue(savedStateRegistry0, "savedStateRegistryOwner.savedStateRegistry");
        Bundle bundle0 = savedStateRegistry0.consumeRestoredStateForKey("SaveableStateRegistry:" + s);
        SaveableStateRegistry saveableStateRegistry0 = SaveableStateRegistryKt.SaveableStateRegistry((bundle0 == null ? null : DisposableSaveableStateRegistry_androidKt.toMap(bundle0)), androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.saveableStateRegistry.1.INSTANCE);
        try {
            savedStateRegistry0.registerSavedStateProvider("SaveableStateRegistry:" + s, () -> {
                Bundle bundle0 = new Bundle();
                for(Object object0: this.$saveableStateRegistry.performSave().entrySet()) {
                    String s = (String)((Map.Entry)object0).getKey();
                    List list0 = (List)((Map.Entry)object0).getValue();
                    bundle0.putParcelableArrayList(s, (list0 instanceof ArrayList ? ((ArrayList)list0) : new ArrayList(list0)));
                }
                return bundle0;
            });
            return new DisposableSaveableStateRegistry(saveableStateRegistry0, new Function0(true, savedStateRegistry0, "SaveableStateRegistry:" + s) {
                final SavedStateRegistry $androidxRegistry;
                final String $key;
                final boolean $registered;

                {
                    this.$registered = z;
                    this.$androidxRegistry = savedStateRegistry0;
                    this.$key = s;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    if(this.$registered) {
                        this.$androidxRegistry.unregisterSavedStateProvider(this.$key);
                    }
                }
            });
        }
        catch(IllegalArgumentException unused_ex) {
            return new DisposableSaveableStateRegistry(saveableStateRegistry0, new Function0(false, savedStateRegistry0, "SaveableStateRegistry:" + s) {
                final SavedStateRegistry $androidxRegistry;
                final String $key;
                final boolean $registered;

                {
                    this.$registered = z;
                    this.$androidxRegistry = savedStateRegistry0;
                    this.$key = s;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    if(this.$registered) {
                        this.$androidxRegistry.unregisterSavedStateProvider(this.$key);
                    }
                }
            });
        }

        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroid/os/Bundle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.registered.1 implements SavedStateProvider {
            androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.registered.1(SaveableStateRegistry saveableStateRegistry0) {
            }

            @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
            public final Bundle saveState() {
                return DisposableSaveableStateRegistry_androidKt.toBundle(this.$saveableStateRegistry.performSave());
            }
        }


        @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.saveableStateRegistry.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.saveableStateRegistry.1 INSTANCE;

            static {
                androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.saveableStateRegistry.1.INSTANCE = new androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.saveableStateRegistry.1();
            }

            androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.saveableStateRegistry.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(object0));
            }

            public final boolean invoke(Object object0) {
                Intrinsics.checkNotNullParameter(object0, "it");
                return DisposableSaveableStateRegistry_androidKt.canBeSavedToBundle(object0);
            }
        }

    }

    private static final boolean canBeSavedToBundle(Object object0) {
        if(object0 instanceof SnapshotMutableState) {
            if(((SnapshotMutableState)object0).getPolicy() != SnapshotStateKt.neverEqualPolicy() && ((SnapshotMutableState)object0).getPolicy() != SnapshotStateKt.structuralEqualityPolicy() && ((SnapshotMutableState)object0).getPolicy() != SnapshotStateKt.referentialEqualityPolicy()) {
                return false;
            }
            Object object1 = ((SnapshotMutableState)object0).getValue();
            return object1 == null ? true : DisposableSaveableStateRegistry_androidKt.canBeSavedToBundle(object1);
        }
        Class[] arr_class = DisposableSaveableStateRegistry_androidKt.AcceptableClasses;
        int v = 0;
        while(v < arr_class.length) {
            Class class0 = arr_class[v];
            ++v;
            if(class0.isInstance(object0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    // 检测为 Lambda 实现
    private static final Bundle toBundle(Map map0) [...]

    private static final Map toMap(Bundle bundle0) {
        Map map0 = new LinkedHashMap();
        Set set0 = bundle0.keySet();
        Intrinsics.checkNotNullExpressionValue(set0, "this.keySet()");
        for(Object object0: set0) {
            ArrayList arrayList0 = bundle0.getParcelableArrayList(((String)object0));
            if(arrayList0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            }
            Intrinsics.checkNotNullExpressionValue(((String)object0), "key");
            map0.put(((String)object0), arrayList0);
        }
        return map0;
    }
}

