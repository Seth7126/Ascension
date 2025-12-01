package androidx.compose.runtime.tooling;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\"*\u0010\u0000\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00018\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LocalInspectionTables", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "Landroidx/compose/runtime/tooling/CompositionData;", "getLocalInspectionTables$annotations", "()V", "getLocalInspectionTables", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class InspectionTablesKt {
    private static final ProvidableCompositionLocal LocalInspectionTables;

    static {
        InspectionTablesKt.LocalInspectionTables = CompositionLocalKt.staticCompositionLocalOf(InspectionTablesKt.LocalInspectionTables.1.INSTANCE);
    }

    public static final ProvidableCompositionLocal getLocalInspectionTables() {
        return InspectionTablesKt.LocalInspectionTables;
    }

    @InternalComposeApi
    public static void getLocalInspectionTables$annotations() {
    }
}

