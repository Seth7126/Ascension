package androidx.compose.ui.node;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001A\u00020\nJ\u0010\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u0003H\u0002J\b\u0010\u000E\u001A\u00020\u000FH\u0002J\u0010\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\r\u001A\u00020\u0003H\u0002J\f\u0010\u0011\u001A\u00020\f*\u00020\u0003H\u0002R\u0014\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0004\u001A\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSet;", "postponedMeasureRequests", "", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/DepthSortedSet;Ljava/util/List;)V", "assertConsistent", "", "isTreeConsistent", "", "node", "logTree", "", "nodeToString", "consistentLayoutState", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LayoutTreeConsistencyChecker {
    private final List postponedMeasureRequests;
    private final DepthSortedSet relayoutNodes;
    private final LayoutNode root;

    public LayoutTreeConsistencyChecker(LayoutNode layoutNode0, DepthSortedSet depthSortedSet0, List list0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "root");
        Intrinsics.checkNotNullParameter(depthSortedSet0, "relayoutNodes");
        Intrinsics.checkNotNullParameter(list0, "postponedMeasureRequests");
        super();
        this.root = layoutNode0;
        this.relayoutNodes = depthSortedSet0;
        this.postponedMeasureRequests = list0;
    }

    public final void assertConsistent() {
        if(!this.isTreeConsistent(this.root) == 0) {
            return;
        }
        String s = this.logTree();
        System.out.println(s);
        throw new IllegalStateException("Inconsistency found!");
    }

    private final boolean consistentLayoutState(LayoutNode layoutNode0) {
        boolean z;
        LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
        if(!layoutNode0.isPlaced()) {
            if(layoutNode0.getPlaceOrder$ui_release() == 0x7FFFFFFF) {
                return true;
            }
            if(layoutNode1 == null) {
                z = false;
            }
            else if(layoutNode1.isPlaced()) {
                z = true;
            }
            else {
                z = false;
            }
            if(!z) {
                return true;
            }
        }
        if(layoutNode0.getLayoutState$ui_release() == LayoutState.NeedsRemeasure && this.postponedMeasureRequests.contains(layoutNode0)) {
            return true;
        }
        LayoutState layoutNode$LayoutState0 = layoutNode1 == null ? null : layoutNode1.getLayoutState$ui_release();
        return layoutNode0.getLayoutState$ui_release() == LayoutState.NeedsRemeasure ? this.relayoutNodes.contains(layoutNode0) || layoutNode$LayoutState0 == LayoutState.NeedsRemeasure || layoutNode$LayoutState0 == LayoutState.Measuring : layoutNode0.getLayoutState$ui_release() != LayoutState.NeedsRelayout || (this.relayoutNodes.contains(layoutNode0) || layoutNode$LayoutState0 == LayoutState.NeedsRemeasure || layoutNode$LayoutState0 == LayoutState.NeedsRelayout || layoutNode$LayoutState0 == LayoutState.Measuring || layoutNode$LayoutState0 == LayoutState.LayingOut);
    }

    private final boolean isTreeConsistent(LayoutNode layoutNode0) {
        if(!this.consistentLayoutState(layoutNode0)) {
            return false;
        }
        List list0 = layoutNode0.getChildren$ui_release();
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                if(!this.isTreeConsistent(((LayoutNode)list0.get(v1)))) {
                    return false;
                }
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return true;
    }

    private final String logTree() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Tree state:");
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
        stringBuilder0.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
        LayoutTreeConsistencyChecker.logTree$printSubTree(this, stringBuilder0, this.root, 0);
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "stringBuilder.toString()");
        return s;
    }

    private static final void logTree$printSubTree(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0, StringBuilder stringBuilder0, LayoutNode layoutNode0, int v) {
        String s = layoutTreeConsistencyChecker0.nodeToString(layoutNode0);
        if(s.length() > 0) {
            if(v > 0) {
                int v2 = 0;
                while(true) {
                    ++v2;
                    stringBuilder0.append("..");
                    if(v2 >= v) {
                        break;
                    }
                }
            }
            stringBuilder0.append(s);
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
            stringBuilder0.append('\n');
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
            ++v;
        }
        List list0 = layoutNode0.getChildren$ui_release();
        int v3 = list0.size();
        if(v3 - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                LayoutTreeConsistencyChecker.logTree$printSubTree(layoutTreeConsistencyChecker0, stringBuilder0, ((LayoutNode)list0.get(v1)), v);
                if(v1 + 1 > v3 - 1) {
                    break;
                }
            }
        }
    }

    private final String nodeToString(LayoutNode layoutNode0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(layoutNode0);
        stringBuilder0.append("[" + layoutNode0.getLayoutState$ui_release() + ']');
        if(!layoutNode0.isPlaced()) {
            stringBuilder0.append("[!isPlaced]");
        }
        stringBuilder0.append("[measuredByParent=" + layoutNode0.getMeasuredByParent$ui_release() + ']');
        if(!this.consistentLayoutState(layoutNode0)) {
            stringBuilder0.append("[INCONSISTENT]");
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "with(StringBuilder()) {\n            append(node)\n            append(\"[${node.layoutState}]\")\n            if (!node.isPlaced) append(\"[!isPlaced]\")\n            append(\"[measuredByParent=${node.measuredByParent}]\")\n            if (!node.consistentLayoutState()) {\n                append(\"[INCONSISTENT]\")\n            }\n            toString()\n        }");
        return s;
    }
}

