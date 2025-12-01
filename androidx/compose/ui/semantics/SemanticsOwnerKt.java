package androidx.compose.ui.semantics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\u001A\u0018\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005\u001A\"\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007*\u00020\u00032\b\b\u0002\u0010\t\u001A\u00020\u0005H\u0000¨\u0006\n"}, d2 = {"getAllSemanticsNodes", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "mergingEnabled", "", "getAllSemanticsNodesToMap", "", "", "useUnmergedTree", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SemanticsOwnerKt {
    public static final List getAllSemanticsNodes(SemanticsOwner semanticsOwner0, boolean z) {
        Intrinsics.checkNotNullParameter(semanticsOwner0, "<this>");
        return CollectionsKt.toList(SemanticsOwnerKt.getAllSemanticsNodesToMap(semanticsOwner0, !z).values());
    }

    public static final Map getAllSemanticsNodesToMap(SemanticsOwner semanticsOwner0, boolean z) {
        Intrinsics.checkNotNullParameter(semanticsOwner0, "<this>");
        Map map0 = new LinkedHashMap();
        SemanticsOwnerKt.getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(map0, (z ? semanticsOwner0.getUnmergedRootSemanticsNode() : semanticsOwner0.getRootSemanticsNode()));
        return map0;
    }

    public static Map getAllSemanticsNodesToMap$default(SemanticsOwner semanticsOwner0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return SemanticsOwnerKt.getAllSemanticsNodesToMap(semanticsOwner0, z);
    }

    private static final void getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(Map map0, SemanticsNode semanticsNode0) {
        map0.put(semanticsNode0.getId(), semanticsNode0);
        List list0 = semanticsNode0.getChildren();
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                SemanticsOwnerKt.getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(map0, ((SemanticsNode)list0.get(v1)));
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
    }
}

