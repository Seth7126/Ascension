package androidx.compose.runtime.saveable;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\u001A8\u0010\u0005\u001A\u00020\u00022\u001C\u0010\u0006\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0018\u00010\u00072\u0012\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f\"\u0019\u0010\u0000\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u000E"}, d2 = {"LocalSaveableStateRegistry", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getLocalSaveableStateRegistry", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "SaveableStateRegistry", "restoredValues", "", "", "", "", "canBeSaved", "Lkotlin/Function1;", "", "runtime-saveable_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SaveableStateRegistryKt {
    private static final ProvidableCompositionLocal LocalSaveableStateRegistry;

    static {
        SaveableStateRegistryKt.LocalSaveableStateRegistry = CompositionLocalKt.staticCompositionLocalOf(SaveableStateRegistryKt.LocalSaveableStateRegistry.1.INSTANCE);
    }

    public static final SaveableStateRegistry SaveableStateRegistry(Map map0, Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "canBeSaved");
        return new SaveableStateRegistryImpl(map0, function10);
    }

    public static final ProvidableCompositionLocal getLocalSaveableStateRegistry() {
        return SaveableStateRegistryKt.LocalSaveableStateRegistry;
    }
}

