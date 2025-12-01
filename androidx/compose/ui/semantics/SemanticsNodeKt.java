package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\f\u0010\f\u001A\u00020\r*\u00020\tH\u0002\u001A\"\u0010\u000E\u001A\u0004\u0018\u00010\u0002*\u00020\u00022\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010H\u0002\u001A\"\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00010\u0013*\u00020\u00022\u000E\b\u0002\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0002\u001A&\u0010\u0016\u001A\u0004\u0018\u00010\u0001*\u00020\u00172\u0012\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0001\u001A\f\u0010\u0019\u001A\u00020\r*\u00020\tH\u0002\"\u001A\u0010\u0000\u001A\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004\"\u001A\u0010\u0005\u001A\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0004\"\u001D\u0010\u0007\u001A\u0004\u0018\u00010\b*\u00020\t8BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001A\u0004\b\n\u0010\u000B\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u001A"}, d2 = {"outerMergingSemantics", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "Landroidx/compose/ui/node/LayoutNode;", "getOuterMergingSemantics", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/semantics/SemanticsWrapper;", "outerSemantics", "getOuterSemantics", "role", "Landroidx/compose/ui/semantics/Role;", "Landroidx/compose/ui/semantics/SemanticsNode;", "getRole", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/Role;", "contentDescriptionFakeNodeId", "", "findClosestParentNode", "selector", "Lkotlin/Function1;", "", "findOneLayerOfSemanticsWrappers", "", "list", "", "nearestSemantics", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "predicate", "roleFakeNodeId", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SemanticsNodeKt {
    private static final int contentDescriptionFakeNodeId(SemanticsNode semanticsNode0) {
        return semanticsNode0.getId() + 2000000000;
    }

    private static final LayoutNode findClosestParentNode(LayoutNode layoutNode0, Function1 function10) {
        for(LayoutNode layoutNode1 = layoutNode0.getParent$ui_release(); layoutNode1 != null; layoutNode1 = layoutNode1.getParent$ui_release()) {
            if(((Boolean)function10.invoke(layoutNode1)).booleanValue()) {
                return layoutNode1;
            }
        }
        return null;
    }

    private static final List findOneLayerOfSemanticsWrappers(LayoutNode layoutNode0, List list0) {
        MutableVector mutableVector0 = layoutNode0.getZSortedChildren();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode1 = (LayoutNode)arr_object[v1];
                SemanticsWrapper semanticsWrapper0 = SemanticsNodeKt.getOuterSemantics(layoutNode1);
                if(semanticsWrapper0 == null) {
                    SemanticsNodeKt.findOneLayerOfSemanticsWrappers(layoutNode1, list0);
                }
                else {
                    list0.add(semanticsWrapper0);
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return list0;
    }

    static List findOneLayerOfSemanticsWrappers$default(LayoutNode layoutNode0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = new ArrayList();
        }
        return SemanticsNodeKt.findOneLayerOfSemanticsWrappers(layoutNode0, list0);
    }

    public static final SemanticsWrapper getOuterMergingSemantics(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "<this>");
        LayoutNodeWrapper layoutNodeWrapper0 = layoutNode0.getOuterLayoutNodeWrapper$ui_release();
        while(layoutNodeWrapper0 != null) {
            if(!(layoutNodeWrapper0 instanceof SemanticsWrapper) || !((SemanticsModifier)((SemanticsWrapper)layoutNodeWrapper0).getModifier()).getSemanticsConfiguration().isMergingSemanticsOfDescendants()) {
                layoutNodeWrapper0 = layoutNodeWrapper0.getWrapped$ui_release();
                continue;
            }
            return (SemanticsWrapper)layoutNodeWrapper0;
        }
        return null;
    }

    public static final SemanticsWrapper getOuterSemantics(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "<this>");
        for(LayoutNodeWrapper layoutNodeWrapper0 = layoutNode0.getOuterLayoutNodeWrapper$ui_release(); layoutNodeWrapper0 != null; layoutNodeWrapper0 = layoutNodeWrapper0.getWrapped$ui_release()) {
            if(layoutNodeWrapper0 instanceof SemanticsWrapper) {
                return (SemanticsWrapper)layoutNodeWrapper0;
            }
        }
        return null;
    }

    private static final Role getRole(SemanticsNode semanticsNode0) {
        return (Role)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
    }

    public static final SemanticsWrapper nearestSemantics(LayoutNodeWrapper layoutNodeWrapper0, Function1 function10) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        while(layoutNodeWrapper0 != null) {
            if(layoutNodeWrapper0 instanceof SemanticsWrapper && ((Boolean)function10.invoke(layoutNodeWrapper0)).booleanValue()) {
                return (SemanticsWrapper)layoutNodeWrapper0;
            }
            layoutNodeWrapper0 = layoutNodeWrapper0.getWrapped$ui_release();
        }
        return null;
    }

    private static final int roleFakeNodeId(SemanticsNode semanticsNode0) {
        return semanticsNode0.getId() + 1000000000;
    }
}

